/*******************************************************************************
 * Copyright (c) 2013, 2015 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.world.lib.oscar.item;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.scada.configuration.lib.Properties;
import org.eclipse.scada.configuration.world.PropertyEntry;
import org.eclipse.scada.configuration.world.lib.oscar.Factories;
import org.eclipse.scada.configuration.world.lib.oscar.Helper;
import org.eclipse.scada.configuration.world.lib.oscar.MasterHandlerPriorities;
import org.eclipse.scada.configuration.world.lib.oscar.OscarContext;
import org.eclipse.scada.configuration.world.osgi.CodeFragment;
import org.eclipse.scada.configuration.world.osgi.FormulaItem;
import org.eclipse.scada.configuration.world.osgi.FormulaItemInbound;
import org.eclipse.scada.configuration.world.osgi.FormulaItemOutbound;
import org.eclipse.scada.configuration.world.osgi.TypedItemReference;
import org.eclipse.scada.core.VariantType;

public class FormulaItemGenerator extends ItemGenerator
{
    private final FormulaItem item;

    public FormulaItemGenerator ( final FormulaItem item, final OscarContext ctx, final MasterHandlerPriorities priorities )
    {
        super ( item, ctx, priorities );
        this.item = item;
    }

    @Override
    public void generate ()
    {
        super.generate ();
        addFormulaSource ();
    }

    @Override
    protected String makeSourceId ()
    {
        return makeId ( "formula" ); //$NON-NLS-1$
    }

    private void addFormulaSource ()
    {
        final Map<String, String> data = new HashMap<String, String> ();

        final String id = makeSourceId ();

        Helper.addOptional ( data, "engine", this.item.getScriptEngine () ); //$NON-NLS-1$

        if ( this.item.getInbound () != null )
        {
            final FormulaItemInbound inbound = this.item.getInbound ();
            data.put ( "inputFormula", inbound.getInputFormula () ); //$NON-NLS-1$
            for ( final TypedItemReference input : inbound.getInputs () )
            {
                if ( input.getItem () == null )
                {
                    throw new IllegalArgumentException ( String.format ( "Input variable '%s' references to no item", input.getName () ) );
                }
                data.put ( "datasource." + input.getName (), Items.makeMasterId ( input.getItem () ) ); //$NON-NLS-1$
                final VariantType type = Helper.convert ( input.getType () );
                if ( type != null )
                {
                    data.put ( "datasourceType." + input.getName (), type.name () ); //$NON-NLS-1$
                }
            }
        }
        if ( this.item.getOutbound () != null )
        {
            final FormulaItemOutbound outbound = this.item.getOutbound ();
            data.put ( "outputFormula", outbound.getOutputFormula () ); //$NON-NLS-1$
            Helper.addOptional ( data, "writeValueName", outbound.getWriteValueVariableName () ); //$NON-NLS-1$

            data.put ( "outputDatasource.id", Items.makeMasterId ( outbound.getOutput ().getItem () ) ); //$NON-NLS-1$

            final VariantType type = Helper.convert ( outbound.getOutput ().getType () );
            if ( type != null )
            {
                data.put ( "outputDatasource.type", type.name () ); //$NON-NLS-1$
            }
        }

        int i = 0;
        for ( final CodeFragment init : this.item.getInitScripts () )
        {
            data.put ( "init." + i, init.getCode () ); //$NON-NLS-1$
            i++;
        }

        for ( final PropertyEntry entry : this.item.getInitProperties () )
        {
            if ( !Properties.isEmpty ( entry ) )
            {
                data.put ( "initProperty." + entry.getKey (), entry.getValue () ); //$NON-NLS-1$
            }
        }

        addData ( Factories.FACTORY_DA_FORMULA_SOURCE, id, data );
    }
}
