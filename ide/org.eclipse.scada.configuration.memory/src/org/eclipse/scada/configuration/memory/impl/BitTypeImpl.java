/*******************************************************************************
 * Copyright (c) 2013, 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.memory.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.scada.configuration.memory.BitType;
import org.eclipse.scada.configuration.memory.MemoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.memory.impl.BitTypeImpl#getSubIndex <em>Sub Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BitTypeImpl extends BaseScalarTypeImpl implements BitType
{
    /**
     * The default value of the '{@link #getSubIndex() <em>Sub Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubIndex()
     * @generated
     * @ordered
     */
    protected static final int SUB_INDEX_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSubIndex() <em>Sub Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubIndex()
     * @generated
     * @ordered
     */
    protected int subIndex = SUB_INDEX_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BitTypeImpl ()
    {
        super ();
    }

    @Override
    public String encode ()
    {
        return String.format ( "BIT:%s:%s:0", this.index, this.subIndex );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return MemoryPackage.Literals.BIT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getSubIndex ()
    {
        return subIndex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubIndex ( int newSubIndex )
    {
        int oldSubIndex = subIndex;
        subIndex = newSubIndex;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, MemoryPackage.BIT_TYPE__SUB_INDEX, oldSubIndex, subIndex ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet ( int featureID, boolean resolve, boolean coreType )
    {
        switch ( featureID )
        {
            case MemoryPackage.BIT_TYPE__SUB_INDEX:
                return getSubIndex ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case MemoryPackage.BIT_TYPE__SUB_INDEX:
                setSubIndex ( (Integer)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset ( int featureID )
    {
        switch ( featureID )
        {
            case MemoryPackage.BIT_TYPE__SUB_INDEX:
                setSubIndex ( SUB_INDEX_EDEFAULT );
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet ( int featureID )
    {
        switch ( featureID )
        {
            case MemoryPackage.BIT_TYPE__SUB_INDEX:
                return subIndex != SUB_INDEX_EDEFAULT;
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
            return super.toString ();

        StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (subIndex: " );
        result.append ( subIndex );
        result.append ( ')' );
        return result.toString ();
    }

    /**
     * @generated NOT
     */
    @Override
    public int getLength ()
    {
        return 1; // takes at least one byte
    }

} //BitTypeImpl
