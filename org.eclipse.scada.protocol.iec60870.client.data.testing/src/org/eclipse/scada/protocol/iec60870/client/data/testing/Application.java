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
package org.eclipse.scada.protocol.iec60870.client.data.testing;

import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.scada.protocol.iec60870.ProtocolOptions;
import org.eclipse.scada.protocol.iec60870.ProtocolOptions.Builder;
import org.eclipse.scada.protocol.iec60870.asdu.types.ASDUAddress;
import org.eclipse.scada.protocol.iec60870.asdu.types.InformationObjectAddress;
import org.eclipse.scada.protocol.iec60870.asdu.types.Value;
import org.eclipse.scada.protocol.iec60870.client.Client;
import org.eclipse.scada.protocol.iec60870.client.ClientModule;
import org.eclipse.scada.protocol.iec60870.client.ConnectionStateListener;
import org.eclipse.scada.protocol.iec60870.client.data.DataHandler;
import org.eclipse.scada.protocol.iec60870.client.data.DataListener;
import org.eclipse.scada.protocol.iec60870.client.data.DataModule;
import org.eclipse.scada.protocol.iec60870.client.data.DataProcessor;

public class Application
{
    public static void main ( final String[] args ) throws Exception
    {
        final short port = 2404;

        final Builder options = new ProtocolOptions.Builder ();

        final ExecutorService dataExecutor = Executors.newSingleThreadExecutor ();
        final DataHandler handler = new DataProcessor ( dataExecutor, new DataListener () {

            @Override
            public void update ( final ASDUAddress commonAddress, final InformationObjectAddress objectAddress, final Value<?> value )
            {
                System.out.format ( "DATA: %s-%s: %s", commonAddress, objectAddress, value );
            }

            @Override
            public void disconnected ()
            {
                System.out.println ( "DATA: Disconnected" );
            }
        } );
        final DataModule dataModule = new DataModule ( handler );

        final List<ClientModule> modules = Collections.singletonList ( (ClientModule)dataModule );

        final ConnectionStateListener listener = new ConnectionStateListener () {

            @Override
            public void connected ()
            {
                System.out.println ( "Connected..." );
            }

            @Override
            public void disconnected ( final Throwable error )
            {
                System.out.println ( "Disconnected..." );
                if ( error != null )
                {
                    error.printStackTrace ();
                    System.exit ( -1 );
                }
                else
                {
                    System.exit ( 0 );
                }
            }
        };
        try ( final Client client = new Client ( new InetSocketAddress ( args[0], port ), listener, options.build (), modules ) )
        {
            client.connect ();

            while ( true )
            {
                Thread.sleep ( 1_000 );
            }
        }
        finally
        {
            System.out.println ( "Exiting..." );
            System.out.flush ();
        }
    }
}
