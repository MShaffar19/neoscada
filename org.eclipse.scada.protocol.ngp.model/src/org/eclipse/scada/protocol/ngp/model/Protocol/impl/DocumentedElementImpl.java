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
/**
 */
package org.eclipse.scada.protocol.ngp.model.Protocol.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.scada.protocol.ngp.model.Protocol.DocumentedElement;
import org.eclipse.scada.protocol.ngp.model.Protocol.ProtocolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documented Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.scada.protocol.ngp.model.Protocol.impl.DocumentedElementImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link org.eclipse.scada.protocol.ngp.model.Protocol.impl.DocumentedElementImpl#getShortDescription
 * <em>Short Description</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class DocumentedElementImpl extends EObjectImpl implements DocumentedElement
{
    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getShortDescription()
     * <em>Short Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getShortDescription()
     * @generated
     * @ordered
     */
    protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShortDescription()
     * <em>Short Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getShortDescription()
     * @generated
     * @ordered
     */
    protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DocumentedElementImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return ProtocolPackage.Literals.DOCUMENTED_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getDescription ()
    {
        return this.description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDescription ( final String newDescription )
    {
        final String oldDescription = this.description;
        this.description = newDescription;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, ProtocolPackage.DOCUMENTED_ELEMENT__DESCRIPTION, oldDescription, this.description ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getShortDescription ()
    {
        return this.shortDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setShortDescription ( final String newShortDescription )
    {
        final String oldShortDescription = this.shortDescription;
        this.shortDescription = newShortDescription;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, ProtocolPackage.DOCUMENTED_ELEMENT__SHORT_DESCRIPTION, oldShortDescription, this.shortDescription ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet ( final int featureID, final boolean resolve, final boolean coreType )
    {
        switch ( featureID )
        {
            case ProtocolPackage.DOCUMENTED_ELEMENT__DESCRIPTION:
                return getDescription ();
            case ProtocolPackage.DOCUMENTED_ELEMENT__SHORT_DESCRIPTION:
                return getShortDescription ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet ( final int featureID, final Object newValue )
    {
        switch ( featureID )
        {
            case ProtocolPackage.DOCUMENTED_ELEMENT__DESCRIPTION:
                setDescription ( (String)newValue );
                return;
            case ProtocolPackage.DOCUMENTED_ELEMENT__SHORT_DESCRIPTION:
                setShortDescription ( (String)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset ( final int featureID )
    {
        switch ( featureID )
        {
            case ProtocolPackage.DOCUMENTED_ELEMENT__DESCRIPTION:
                setDescription ( DESCRIPTION_EDEFAULT );
                return;
            case ProtocolPackage.DOCUMENTED_ELEMENT__SHORT_DESCRIPTION:
                setShortDescription ( SHORT_DESCRIPTION_EDEFAULT );
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet ( final int featureID )
    {
        switch ( featureID )
        {
            case ProtocolPackage.DOCUMENTED_ELEMENT__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? this.description != null : !DESCRIPTION_EDEFAULT.equals ( this.description );
            case ProtocolPackage.DOCUMENTED_ELEMENT__SHORT_DESCRIPTION:
                return SHORT_DESCRIPTION_EDEFAULT == null ? this.shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals ( this.shortDescription );
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
        {
            return super.toString ();
        }

        final StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (description: " );
        result.append ( this.description );
        result.append ( ", shortDescription: " );
        result.append ( this.shortDescription );
        result.append ( ')' );
        return result.toString ();
    }

} //DocumentedElementImpl
