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
package org.eclipse.scada.configuration.world.osgi.tests;

import junit.textui.TestRunner;

import org.eclipse.scada.configuration.world.osgi.OsgiFactory;
import org.eclipse.scada.configuration.world.osgi.TypedItemReference;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Typed Item Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypedItemReferenceTest extends ItemReferenceTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( TypedItemReferenceTest.class );
    }

    /**
     * Constructs a new Typed Item Reference test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypedItemReferenceTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Typed Item Reference test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected TypedItemReference getFixture ()
    {
        return (TypedItemReference)fixture;
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
        setFixture ( OsgiFactory.eINSTANCE.createTypedItemReference () );
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

} //TypedItemReferenceTest
