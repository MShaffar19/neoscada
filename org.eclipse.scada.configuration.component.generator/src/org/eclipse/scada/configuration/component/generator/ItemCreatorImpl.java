/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.component.generator;

import static org.eclipse.scada.configuration.component.lib.Items.registerMappedItem;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.scada.configuration.component.Component;
import org.eclipse.scada.configuration.component.generator.util.Components;
import org.eclipse.scada.configuration.component.lib.create.CreationRequest;
import org.eclipse.scada.configuration.component.lib.create.Helper;
import org.eclipse.scada.configuration.component.lib.create.MasterItemCreatorImpl;
import org.eclipse.scada.configuration.component.lib.create.MasterListener;
import org.eclipse.scada.configuration.generator.GeneratorContext;
import org.eclipse.scada.configuration.generator.GeneratorContext.GlobalContext;
import org.eclipse.scada.configuration.generator.GeneratorContext.MasterContext;
import org.eclipse.scada.configuration.globalization.GlobalizeFactory;
import org.eclipse.scada.configuration.globalization.ItemNameFilter;
import org.eclipse.scada.configuration.infrastructure.Driver;
import org.eclipse.scada.configuration.item.CustomizationRequest;
import org.eclipse.scada.configuration.item.Selector;
import org.eclipse.scada.configuration.item.SelectorRunner;
import org.eclipse.scada.configuration.lib.Items;
import org.eclipse.scada.configuration.world.Endpoint;
import org.eclipse.scada.configuration.world.osgi.Item;
import org.eclipse.scada.configuration.world.osgi.MasterServer;
import org.eclipse.scada.configuration.world.osgi.SourceItem;
import org.eclipse.scada.configuration.world.osgi.ValueArchiveServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ItemCreatorImpl extends MasterItemCreatorImpl
{

    private final static Logger logger = LoggerFactory.getLogger ( ItemCreatorImpl.class );

    private final Component component;

    private final GeneratorContext ctx;

    private final MasterContext masterContext;

    public ItemCreatorImpl ( final GeneratorContext ctx, final MasterContext master, final Component component )
    {
        super ( master.getImplementation (), component );
        this.masterContext = master;
        this.ctx = ctx;
        this.component = component;
    }

    @Override
    public CreationRequest<SourceItem> createSourceItem ( final Driver source, final String sourceName )
    {
        final CreationRequest<SourceItem> req = super.createSourceItem ( source, sourceName );

        if ( source != null )
        {
            req.addMasterListener ( new MasterListener<SourceItem> () {

                @Override
                public void setMaster ( final SourceItem item, final MasterServer master )
                {
                    final org.eclipse.scada.configuration.world.Driver driver = ItemCreatorImpl.this.ctx.getDriverMap ().get ( source );
                    if ( driver == null )
                    {
                        throw new IllegalStateException ( String.format ( "Driver '%s' cannot be resolved.", source ) );
                    }
                    final Collection<Endpoint> endpoints = driver.getEndpoints ();
                    Helper.setSourceConnectionFromEndpoints ( item, master, endpoints );
                }
            } );
        }

        return req;
    }

    @Override
    protected <T extends Item> void itemAdded ( final T item, final CustomizationRequest customizationRequest, final List<String> originalLocalTags, final Set<MasterListener<T>> masterListeners )
    {
        super.itemAdded ( item, customizationRequest, originalLocalTags, masterListeners );

        registerMappedItem ( this.ctx, this.component, originalLocalTags, item );

        if ( isArchive ( item, customizationRequest ) )
        {
            logger.debug ( "Archive item: {}", item );
            final ValueArchiveServer archive = this.ctx.getArchiveServer ( this.master );
            if ( archive == null )
            {
                throw new IllegalStateException ( String.format ( "Item %s should be archive but no archive server is configured on %s", item, this.master ) );
            }
            Items.addArchive ( archive, item );
        }

        for ( final GlobalContext globalContext : this.masterContext.getGlobalContext () )
        {
            final List<Selector> selectors = new LinkedList<> ();
            selectors.add ( globalContext.getMasterImport ().getImportSelector () );
            if ( new SelectorRunner ( selectors ).run ( item, customizationRequest, false ) )
            {
                final ItemNameFilter filter = GlobalizeFactory.eINSTANCE.createItemNameFilter ();
                filter.setItemName ( item.getName () );
                globalContext.getLocal ().getFilters ().add ( filter );
            }
        }
    }

    @Override
    protected void customizeItem ( final Item item, final CustomizationRequest customizationRequest )
    {
        Components.customizeItem ( this.component, item, customizationRequest );
    }

    protected boolean isArchive ( final Item item, final CustomizationRequest customizationRequest )
    {
        return Components.isArchived ( this.component, item, customizationRequest );
    }
}
