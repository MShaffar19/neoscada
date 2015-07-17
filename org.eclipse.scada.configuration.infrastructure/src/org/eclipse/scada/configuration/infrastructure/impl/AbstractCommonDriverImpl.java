/**
 * Copyright (c) 2014, 2015 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 *
 */
package org.eclipse.scada.configuration.infrastructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.scada.configuration.infrastructure.AbstractCommonDriver;
import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.world.PasswordCredentials;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Common Driver</b></em>
 * '.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.eclipse.scada.configuration.infrastructure.impl.AbstractCommonDriverImpl#getPortNumber
 * <em>Port Number</em>}</li>
 * <li>
 * {@link org.eclipse.scada.configuration.infrastructure.impl.AbstractCommonDriverImpl#getPassword
 * <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractCommonDriverImpl extends DriverImpl implements AbstractCommonDriver
{
    /**
     * The default value of the '{@link #getPortNumber() <em>Port Number</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getPortNumber()
     * @generated
     * @ordered
     */
    protected static final short PORT_NUMBER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getPortNumber()
     * @generated
     * @ordered
     */
    protected short portNumber = PORT_NUMBER_EDEFAULT;

    /**
     * The cached value of the '{@link #getPassword() <em>Password</em>}'
     * containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getPassword()
     * @generated
     * @ordered
     */
    protected PasswordCredentials password;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected AbstractCommonDriverImpl ()
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
        return InfrastructurePackage.Literals.ABSTRACT_COMMON_DRIVER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public short getPortNumber ()
    {
        return this.portNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPortNumber ( final short newPortNumber )
    {
        final short oldPortNumber = this.portNumber;
        this.portNumber = newPortNumber;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PORT_NUMBER, oldPortNumber, this.portNumber ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public PasswordCredentials getPassword ()
    {
        if ( this.password != null && this.password.eIsProxy () )
        {
            final InternalEObject oldPassword = (InternalEObject)this.password;
            this.password = (PasswordCredentials)eResolveProxy ( oldPassword );
            if ( this.password != oldPassword )
            {
                final InternalEObject newPassword = (InternalEObject)this.password;
                NotificationChain msgs = oldPassword.eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD, null, null );
                if ( newPassword.eInternalContainer () == null )
                {
                    msgs = newPassword.eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD, null, msgs );
                }
                if ( msgs != null )
                {
                    msgs.dispatch ();
                }
                if ( eNotificationRequired () )
                {
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD, oldPassword, this.password ) );
                }
            }
        }
        return this.password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public PasswordCredentials basicGetPassword ()
    {
        return this.password;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetPassword ( final PasswordCredentials newPassword, NotificationChain msgs )
    {
        final PasswordCredentials oldPassword = this.password;
        this.password = newPassword;
        if ( eNotificationRequired () )
        {
            final ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD, oldPassword, newPassword );
            if ( msgs == null )
            {
                msgs = notification;
            }
            else
            {
                msgs.add ( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setPassword ( final PasswordCredentials newPassword )
    {
        if ( newPassword != this.password )
        {
            NotificationChain msgs = null;
            if ( this.password != null )
            {
                msgs = ( (InternalEObject)this.password ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD, null, msgs );
            }
            if ( newPassword != null )
            {
                msgs = ( (InternalEObject)newPassword ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD, null, msgs );
            }
            msgs = basicSetPassword ( newPassword, msgs );
            if ( msgs != null )
            {
                msgs.dispatch ();
            }
        }
        else if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD, newPassword, newPassword ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove ( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
    {
        switch ( featureID )
        {
            case InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD:
                return basicSetPassword ( null, msgs );
        }
        return super.eInverseRemove ( otherEnd, featureID, msgs );
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
            case InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PORT_NUMBER:
                return getPortNumber ();
            case InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD:
                if ( resolve )
                {
                    return getPassword ();
                }
                return basicGetPassword ();
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
            case InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PORT_NUMBER:
                setPortNumber ( (Short)newValue );
                return;
            case InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD:
                setPassword ( (PasswordCredentials)newValue );
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
            case InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PORT_NUMBER:
                setPortNumber ( PORT_NUMBER_EDEFAULT );
                return;
            case InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD:
                setPassword ( (PasswordCredentials)null );
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
            case InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PORT_NUMBER:
                return this.portNumber != PORT_NUMBER_EDEFAULT;
            case InfrastructurePackage.ABSTRACT_COMMON_DRIVER__PASSWORD:
                return this.password != null;
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
        result.append ( " (portNumber: " ); //$NON-NLS-1$
        result.append ( this.portNumber );
        result.append ( ')' );
        return result.toString ();
    }

} //AbstractCommonDriverImpl
