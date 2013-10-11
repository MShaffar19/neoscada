/*******************************************************************************
 * Copyright (c) 2011, 2012 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.vi.model.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.scada.vi.model.VisualInterfacePackage;
import org.eclipse.scada.vi.model.util.VisualInterfaceAdapterFactory;
import org.eclipse.scada.vi.model.visualInterface.provider.VisualInterfaceEditPlugin;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualInterfaceItemProviderAdapterFactory extends VisualInterfaceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
{
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier ();

    /**
     * This helps manage the child creation extenders.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager ( VisualInterfaceEditPlugin.INSTANCE, VisualInterfacePackage.eNS_URI );

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object> ();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisualInterfaceItemProviderAdapterFactory ()
    {
        supportedTypes.add ( IEditingDomainItemProvider.class );
        supportedTypes.add ( IStructuredItemContentProvider.class );
        supportedTypes.add ( ITreeItemContentProvider.class );
        supportedTypes.add ( IItemLabelProvider.class );
        supportedTypes.add ( IItemPropertySource.class );
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.Symbol} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SymbolItemProvider symbolItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.Symbol}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSymbolAdapter ()
    {
        if ( symbolItemProvider == null )
        {
            symbolItemProvider = new SymbolItemProvider ( this );
        }

        return symbolItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.Rectangle} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RectangleItemProvider rectangleItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.Rectangle}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRectangleAdapter ()
    {
        if ( rectangleItemProvider == null )
        {
            rectangleItemProvider = new RectangleItemProvider ( this );
        }

        return rectangleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.Text} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TextItemProvider textItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.Text}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTextAdapter ()
    {
        if ( textItemProvider == null )
        {
            textItemProvider = new TextItemProvider ( this );
        }

        return textItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.Child} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChildItemProvider childItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.Child}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChildAdapter ()
    {
        if ( childItemProvider == null )
        {
            childItemProvider = new ChildItemProvider ( this );
        }

        return childItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.XYChild} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XYChildItemProvider xyChildItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.XYChild}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createXYChildAdapter ()
    {
        if ( xyChildItemProvider == null )
        {
            xyChildItemProvider = new XYChildItemProvider ( this );
        }

        return xyChildItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.XYContainer} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XYContainerItemProvider xyContainerItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.XYContainer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createXYContainerAdapter ()
    {
        if ( xyContainerItemProvider == null )
        {
            xyContainerItemProvider = new XYContainerItemProvider ( this );
        }

        return xyContainerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.Position} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PositionItemProvider positionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.Position}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPositionAdapter ()
    {
        if ( positionItemProvider == null )
        {
            positionItemProvider = new PositionItemProvider ( this );
        }

        return positionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.Line} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LineItemProvider lineItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.Line}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createLineAdapter ()
    {
        if ( lineItemProvider == null )
        {
            lineItemProvider = new LineItemProvider ( this );
        }

        return lineItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.SymbolReference} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SymbolReferenceItemProvider symbolReferenceItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.SymbolReference}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSymbolReferenceAdapter ()
    {
        if ( symbolReferenceItemProvider == null )
        {
            symbolReferenceItemProvider = new SymbolReferenceItemProvider ( this );
        }

        return symbolReferenceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringToStringMapItemProvider stringToStringMapItemProvider;

    /**
     * This creates an adapter for a {@link java.util.Map.Entry}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createStringToStringMapAdapter ()
    {
        if ( stringToStringMapItemProvider == null )
        {
            stringToStringMapItemProvider = new StringToStringMapItemProvider ( this );
        }

        return stringToStringMapItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.Dimension} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DimensionItemProvider dimensionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.Dimension}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDimensionAdapter ()
    {
        if ( dimensionItemProvider == null )
        {
            dimensionItemProvider = new DimensionItemProvider ( this );
        }

        return dimensionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.SystemCursor} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SystemCursorItemProvider systemCursorItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.SystemCursor}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSystemCursorAdapter ()
    {
        if ( systemCursorItemProvider == null )
        {
            systemCursorItemProvider = new SystemCursorItemProvider ( this );
        }

        return systemCursorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.GridContainer} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GridContainerItemProvider gridContainerItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.GridContainer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createGridContainerAdapter ()
    {
        if ( gridContainerItemProvider == null )
        {
            gridContainerItemProvider = new GridContainerItemProvider ( this );
        }

        return gridContainerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.BorderContainer} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BorderContainerItemProvider borderContainerItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.BorderContainer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createBorderContainerAdapter ()
    {
        if ( borderContainerItemProvider == null )
        {
            borderContainerItemProvider = new BorderContainerItemProvider ( this );
        }

        return borderContainerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.BorderChild} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BorderChildItemProvider borderChildItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.BorderChild}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createBorderChildAdapter ()
    {
        if ( borderChildItemProvider == null )
        {
            borderChildItemProvider = new BorderChildItemProvider ( this );
        }

        return borderChildItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.GridChild} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GridChildItemProvider gridChildItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.GridChild}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createGridChildAdapter ()
    {
        if ( gridChildItemProvider == null )
        {
            gridChildItemProvider = new GridChildItemProvider ( this );
        }

        return gridChildItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.FigureContainer} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FigureContainerItemProvider figureContainerItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.FigureContainer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createFigureContainerAdapter ()
    {
        if ( figureContainerItemProvider == null )
        {
            figureContainerItemProvider = new FigureContainerItemProvider ( this );
        }

        return figureContainerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.Image} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImageItemProvider imageItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.Image}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createImageAdapter ()
    {
        if ( imageItemProvider == null )
        {
            imageItemProvider = new ImageItemProvider ( this );
        }

        return imageItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.Ellipse} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EllipseItemProvider ellipseItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.Ellipse}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEllipseAdapter ()
    {
        if ( ellipseItemProvider == null )
        {
            ellipseItemProvider = new EllipseItemProvider ( this );
        }

        return ellipseItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.Arc} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArcItemProvider arcItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.Arc}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createArcAdapter ()
    {
        if ( arcItemProvider == null )
        {
            arcItemProvider = new ArcItemProvider ( this );
        }

        return arcItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.Connection} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectionItemProvider connectionItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.Connection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createConnectionAdapter ()
    {
        if ( connectionItemProvider == null )
        {
            connectionItemProvider = new ConnectionItemProvider ( this );
        }

        return connectionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.vi.model.StackContainer} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StackContainerItemProvider stackContainerItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.vi.model.StackContainer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createStackContainerAdapter ()
    {
        if ( stackContainerItemProvider == null )
        {
            stackContainerItemProvider = new StackContainerItemProvider ( this );
        }

        return stackContainerItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory ()
    {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory ();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAdapterFactory ( ComposedAdapterFactory parentAdapterFactory )
    {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType ( Object type )
    {
        return supportedTypes.contains ( type ) || super.isFactoryForType ( type );
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt ( Notifier notifier, Object type )
    {
        return super.adapt ( notifier, this );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt ( Object object, Object type )
    {
        if ( isFactoryForType ( type ) )
        {
            Object adapter = super.adapt ( object, type );
            if ( ! ( type instanceof Class<?> ) || ( ( (Class<?>)type ).isInstance ( adapter ) ) )
            {
                return adapter;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders ()
    {
        return childCreationExtenderManager.getChildCreationExtenders ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<?> getNewChildDescriptors ( Object object, EditingDomain editingDomain )
    {
        return childCreationExtenderManager.getNewChildDescriptors ( object, editingDomain );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator ()
    {
        return childCreationExtenderManager;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addListener ( INotifyChangedListener notifyChangedListener )
    {
        changeNotifier.addListener ( notifyChangedListener );
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void removeListener ( INotifyChangedListener notifyChangedListener )
    {
        changeNotifier.removeListener ( notifyChangedListener );
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void fireNotifyChanged ( Notification notification )
    {
        changeNotifier.fireNotifyChanged ( notification );

        if ( parentAdapterFactory != null )
        {
            parentAdapterFactory.fireNotifyChanged ( notification );
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void dispose ()
    {
        if ( symbolItemProvider != null )
            symbolItemProvider.dispose ();
        if ( rectangleItemProvider != null )
            rectangleItemProvider.dispose ();
        if ( textItemProvider != null )
            textItemProvider.dispose ();
        if ( childItemProvider != null )
            childItemProvider.dispose ();
        if ( xyChildItemProvider != null )
            xyChildItemProvider.dispose ();
        if ( xyContainerItemProvider != null )
            xyContainerItemProvider.dispose ();
        if ( positionItemProvider != null )
            positionItemProvider.dispose ();
        if ( lineItemProvider != null )
            lineItemProvider.dispose ();
        if ( symbolReferenceItemProvider != null )
            symbolReferenceItemProvider.dispose ();
        if ( stringToStringMapItemProvider != null )
            stringToStringMapItemProvider.dispose ();
        if ( dimensionItemProvider != null )
            dimensionItemProvider.dispose ();
        if ( systemCursorItemProvider != null )
            systemCursorItemProvider.dispose ();
        if ( gridContainerItemProvider != null )
            gridContainerItemProvider.dispose ();
        if ( borderContainerItemProvider != null )
            borderContainerItemProvider.dispose ();
        if ( borderChildItemProvider != null )
            borderChildItemProvider.dispose ();
        if ( gridChildItemProvider != null )
            gridChildItemProvider.dispose ();
        if ( figureContainerItemProvider != null )
            figureContainerItemProvider.dispose ();
        if ( imageItemProvider != null )
            imageItemProvider.dispose ();
        if ( ellipseItemProvider != null )
            ellipseItemProvider.dispose ();
        if ( arcItemProvider != null )
            arcItemProvider.dispose ();
        if ( connectionItemProvider != null )
            connectionItemProvider.dispose ();
        if ( stackContainerItemProvider != null )
            stackContainerItemProvider.dispose ();
    }

}
