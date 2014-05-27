/*******************************************************************************
 * Copyright (c) 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.infrastructure.lib.internal;

import java.util.Collection;

import org.eclipse.scada.configuration.generator.Profiles;
import org.eclipse.scada.configuration.infrastructure.EquinoxApplication;
import org.eclipse.scada.configuration.infrastructure.GenericVMSettings;
import org.eclipse.scada.configuration.infrastructure.Module;
import org.eclipse.scada.configuration.infrastructure.lib.ModuleHandler;
import org.eclipse.scada.configuration.world.osgi.ApplicationModule;
import org.eclipse.scada.configuration.world.osgi.profile.Profile;

public class GenericVMSettingsModuleHandler implements ModuleHandler
{

    @Override
    public void process ( final Module module, final Collection<ApplicationModule> modules, final EquinoxApplication app, final org.eclipse.scada.configuration.world.osgi.EquinoxApplication implApp )
    {
        final GenericVMSettings s = (GenericVMSettings)module;

        final Profile p = Profiles.createOrGetCustomizationProfile ( implApp );
        p.getJvmArguments ().addAll ( s.getArguments () );
    }

}
