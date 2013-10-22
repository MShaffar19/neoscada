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
package org.eclipse.scada.configuration.infrastructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.scada.configuration.infrastructure.InfrastructurePackage
 * @generated
 */
public interface InfrastructureFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InfrastructureFactory eINSTANCE = org.eclipse.scada.configuration.infrastructure.impl.InfrastructureFactoryImpl.init ();

    /**
     * Returns a new object of class '<em>World</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>World</em>'.
     * @generated
     */
    World createWorld ();

    /**
     * Returns a new object of class '<em>Master Server</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Master Server</em>'.
     * @generated
     */
    MasterServer createMasterServer ();

    /**
     * Returns a new object of class '<em>Master Import</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Master Import</em>'.
     * @generated
     */
    MasterImport createMasterImport ();

    /**
     * Returns a new object of class '<em>Options</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Options</em>'.
     * @generated
     */
    Options createOptions ();

    /**
     * Returns a new object of class '<em>Common Driver</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Common Driver</em>'.
     * @generated
     */
    CommonDriver createCommonDriver ();

    /**
     * Returns a new object of class '<em>External Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>External Node</em>'.
     * @generated
     */
    ExternalNode createExternalNode ();

    /**
     * Returns a new object of class '<em>System Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System Node</em>'.
     * @generated
     */
    SystemNode createSystemNode ();

    /**
     * Returns a new object of class '<em>System Property User Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>System Property User Service</em>'.
     * @generated
     */
    SystemPropertyUserService createSystemPropertyUserService ();

    /**
     * Returns a new object of class '<em>User Entry</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>User Entry</em>'.
     * @generated
     */
    UserEntry createUserEntry ();

    /**
     * Returns a new object of class '<em>Jdbc User Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Jdbc User Service</em>'.
     * @generated
     */
    JdbcUserService createJdbcUserService ();

    /**
     * Returns a new object of class '<em>Value Archive Server</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Archive Server</em>'.
     * @generated
     */
    ValueArchiveServer createValueArchiveServer ();

    /**
     * Returns a new object of class '<em>Equinox Driver</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equinox Driver</em>'.
     * @generated
     */
    EquinoxDriver createEquinoxDriver ();

    /**
     * Returns a new object of class '<em>External Driver</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>External Driver</em>'.
     * @generated
     */
    ExternalDriver createExternalDriver ();

    /**
     * Returns a new object of class '<em>External Driver Placeholder</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>External Driver Placeholder</em>'.
     * @generated
     */
    ExternalDriverPlaceholder createExternalDriverPlaceholder ();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InfrastructurePackage getInfrastructurePackage ();

} //InfrastructureFactory
