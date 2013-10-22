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
package org.eclipse.scada.configuration.memory.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.scada.configuration.memory.MemoryFactory;
import org.eclipse.scada.configuration.memory.Variable;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableTest extends TestCase
{

    /**
     * The fixture for this Variable test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Variable fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( VariableTest.class );
    }

    /**
     * Constructs a new Variable test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Variable test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( Variable fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Variable test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Variable getFixture ()
    {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp () throws Exception
    {
        setFixture ( MemoryFactory.eINSTANCE.createVariable () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown () throws Exception
    {
        setFixture ( null );
    }

} //VariableTest
