/*******************************************************************************
 * Copyright (c) 2010, 2013 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *     Jens Reimann - refactoring for a generic memory driver system
 *******************************************************************************/

package org.eclipse.scada.protocol.dave;

public class DaveConnectionEstablishedMessage extends DaveMessage
{

    private final int maxPdu;

    public DaveConnectionEstablishedMessage ( final int maxPDU )
    {
        this.maxPdu = maxPDU;
    }

    public int getMaxPdu ()
    {
        return this.maxPdu;
    }

}
