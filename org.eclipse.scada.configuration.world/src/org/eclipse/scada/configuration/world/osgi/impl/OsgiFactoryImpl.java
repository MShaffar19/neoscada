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
package org.eclipse.scada.configuration.world.osgi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.scada.ae.data.Severity;
import org.eclipse.scada.configuration.world.osgi.*;
import org.eclipse.scada.core.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsgiFactoryImpl extends EFactoryImpl implements OsgiFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static OsgiFactory init ()
    {
        try
        {
            OsgiFactory theOsgiFactory = (OsgiFactory)EPackage.Registry.INSTANCE.getEFactory ( OsgiPackage.eNS_URI );
            if ( theOsgiFactory != null )
            {
                return theOsgiFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new OsgiFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OsgiFactoryImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create ( EClass eClass )
    {
        switch ( eClass.getClassifierID () )
        {
            case OsgiPackage.DATA_ACCESS_CONNECTION:
                return createDataAccessConnection ();
            case OsgiPackage.DATA_ACCESS_EXPORTER:
                return createDataAccessExporter ();
            case OsgiPackage.SOURCE_ITEM:
                return createSourceItem ();
            case OsgiPackage.ITEM_EXPORT:
                return createItemExport ();
            case OsgiPackage.ITEM_INFORMATION:
                return createItemInformation ();
            case OsgiPackage.LEVEL_MONITOR:
                return createLevelMonitor ();
            case OsgiPackage.SCRIPT_ITEM:
                return createScriptItem ();
            case OsgiPackage.IMPORT_ITEM:
                return createImportItem ();
            case OsgiPackage.SUMMARY_GROUP:
                return createSummaryGroup ();
            case OsgiPackage.MARKER_GROUP:
                return createMarkerGroup ();
            case OsgiPackage.MARKERS:
                return createMarkers ();
            case OsgiPackage.CONSTANT_ITEM:
                return createConstantItem ();
            case OsgiPackage.SUMMARY_ITEM:
                return createSummaryItem ();
            case OsgiPackage.MARKER_ENTRY:
                return createMarkerEntry ();
            case OsgiPackage.MANUAL_OVERRIDE:
                return createManualOverride ();
            case OsgiPackage.DEFAULT_MASTER_SERVER:
                return createDefaultMasterServer ();
            case OsgiPackage.CUSTOM_MASTER_SERVER:
                return createCustomMasterServer ();
            case OsgiPackage.ATTRIBUTES_SUMMARY:
                return createAttributesSummary ();
            case OsgiPackage.EVENT_LOGGER:
                return createEventLogger ();
            case OsgiPackage.MONITOR_POOL:
                return createMonitorPool ();
            case OsgiPackage.EVENT_POOL:
                return createEventPool ();
            case OsgiPackage.SIMPLE_DATA_MAPPER:
                return createSimpleDataMapper ();
            case OsgiPackage.JDBC_DATA_MAPPER:
                return createJdbcDataMapper ();
            case OsgiPackage.DATA_MAPPER_ENTRY:
                return createDataMapperEntry ();
            case OsgiPackage.VALUE_MAPPER:
                return createValueMapper ();
            case OsgiPackage.PERSISTENT_ITEM:
                return createPersistentItem ();
            case OsgiPackage.PROXY_ITEM:
                return createProxyItem ();
            case OsgiPackage.SCALE:
                return createScale ();
            case OsgiPackage.NEGATE:
                return createNegate ();
            case OsgiPackage.ROUNDING:
                return createRounding ();
            case OsgiPackage.EXTERNAL_EVENT_MONITOR:
                return createExternalEventMonitor ();
            case OsgiPackage.PROPERTY_ENTRY:
                return createPropertyEntry ();
            case OsgiPackage.STATIC_EXTERNAL_EVENT_FILTER:
                return createStaticExternalEventFilter ();
            case OsgiPackage.SIMPLE_EXTERNAL_EVENT_FILTER:
                return createSimpleExternalEventFilter ();
            case OsgiPackage.TYPED_ITEM_REFERENCE:
                return createTypedItemReference ();
            case OsgiPackage.CODE_FRAGMENT:
                return createCodeFragment ();
            case OsgiPackage.SCRIPT_TIMER:
                return createScriptTimer ();
            case OsgiPackage.ITEM_REFERENCE:
                return createItemReference ();
            case OsgiPackage.FORMULA_ITEM:
                return createFormulaItem ();
            case OsgiPackage.FORMULA_ITEM_OUTBOUND:
                return createFormulaItemOutbound ();
            case OsgiPackage.FORMULA_ITEM_INBOUND:
                return createFormulaItemInbound ();
            case OsgiPackage.BOOLEAN_MONITOR:
                return createBooleanMonitor ();
            case OsgiPackage.LIST_MONITOR:
                return createListMonitor ();
            case OsgiPackage.LIST_MONITOR_ENTRY:
                return createListMonitorEntry ();
            case OsgiPackage.AVERAGE:
                return createAverage ();
            case OsgiPackage.MOVING_AVERAGE:
                return createMovingAverage ();
            case OsgiPackage.AVERAGE_ITEM:
                return createAverageItem ();
            case OsgiPackage.MOVING_AVERAGE_ITEM:
                return createMovingAverageItem ();
            case OsgiPackage.BLOCKINGS:
                return createBlockings ();
            case OsgiPackage.BLOCK_GROUP:
                return createBlockGroup ();
            case OsgiPackage.BLOCK_HANDLER:
                return createBlockHandler ();
            case OsgiPackage.BLOCK:
                return createBlock ();
            case OsgiPackage.GLOBAL_SUMMARY_ITEM:
                return createGlobalSummaryItem ();
            case OsgiPackage.WEAK_REFERENCE_DATA_SOURCE_ITEM:
                return createWeakReferenceDataSourceItem ();
            case OsgiPackage.ALARMS_EVENTS_EXPORTER:
                return createAlarmsEventsExporter ();
            case OsgiPackage.ALARMS_EVENTS_CONNECTION:
                return createAlarmsEventsConnection ();
            case OsgiPackage.MONITOR_POOL_PROXY:
                return createMonitorPoolProxy ();
            case OsgiPackage.EVENT_POOL_PROXY:
                return createEventPoolProxy ();
            case OsgiPackage.ALARMS_EVENTS_MODULE:
                return createAlarmsEventsModule ();
            case OsgiPackage.AKN_PROXY:
                return createAknProxy ();
            case OsgiPackage.PULL_EVENTS:
                return createPullEvents ();
            case OsgiPackage.JDBC_USER_SERVICE_MODULE:
                return createJdbcUserServiceModule ();
            case OsgiPackage.JDBC_USER_SERVICE:
                return createJdbcUserService ();
            case OsgiPackage.DEFAULT_VALUE_ARCHIVE_SERVER:
                return createDefaultValueArchiveServer ();
            case OsgiPackage.HISTORICAL_DATA_EXPORTER:
                return createHistoricalDataExporter ();
            case OsgiPackage.VALUE_ARCHIVE:
                return createValueArchive ();
            case OsgiPackage.CONFIGURATION_ADMINISTRATOR_EXPORTER:
                return createConfigurationAdministratorExporter ();
            case OsgiPackage.REFERENCE_ITEM:
                return createReferenceItem ();
            case OsgiPackage.EVENT_STORAGE_JDBC:
                return createEventStorageJdbc ();
            case OsgiPackage.EVENT_STORAGE_POSTGRES:
                return createEventStoragePostgres ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString ( EDataType eDataType, String initialValue )
    {
        switch ( eDataType.getClassifierID () )
        {
            case OsgiPackage.AVERAGE_REFERENCE_TYPE:
                return createAverageReferenceTypeFromString ( eDataType, initialValue );
            case OsgiPackage.MOVING_AVERAGE_REFERENCE_TYPE:
                return createMovingAverageReferenceTypeFromString ( eDataType, initialValue );
            case OsgiPackage.ROUNDING_TYPE:
                return createRoundingTypeFromString ( eDataType, initialValue );
            case OsgiPackage.DATA_TYPE:
                return createDataTypeFromString ( eDataType, initialValue );
            case OsgiPackage.PASSWORD_TYPE:
                return createPasswordTypeFromString ( eDataType, initialValue );
            case OsgiPackage.SEVERITY:
                return createSeverityFromString ( eDataType, initialValue );
            case OsgiPackage.VARIANT:
                return createVariantFromString ( eDataType, initialValue );
            default:
                throw new IllegalArgumentException ( "The datatype '" + eDataType.getName () + "' is not a valid classifier" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString ( EDataType eDataType, Object instanceValue )
    {
        switch ( eDataType.getClassifierID () )
        {
            case OsgiPackage.AVERAGE_REFERENCE_TYPE:
                return convertAverageReferenceTypeToString ( eDataType, instanceValue );
            case OsgiPackage.MOVING_AVERAGE_REFERENCE_TYPE:
                return convertMovingAverageReferenceTypeToString ( eDataType, instanceValue );
            case OsgiPackage.ROUNDING_TYPE:
                return convertRoundingTypeToString ( eDataType, instanceValue );
            case OsgiPackage.DATA_TYPE:
                return convertDataTypeToString ( eDataType, instanceValue );
            case OsgiPackage.PASSWORD_TYPE:
                return convertPasswordTypeToString ( eDataType, instanceValue );
            case OsgiPackage.SEVERITY:
                return convertSeverityToString ( eDataType, instanceValue );
            case OsgiPackage.VARIANT:
                return convertVariantToString ( eDataType, instanceValue );
            default:
                throw new IllegalArgumentException ( "The datatype '" + eDataType.getName () + "' is not a valid classifier" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataAccessConnection createDataAccessConnection ()
    {
        DataAccessConnectionImpl dataAccessConnection = new DataAccessConnectionImpl ();
        return dataAccessConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataAccessExporter createDataAccessExporter ()
    {
        DataAccessExporterImpl dataAccessExporter = new DataAccessExporterImpl ();
        return dataAccessExporter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceItem createSourceItem ()
    {
        SourceItemImpl sourceItem = new SourceItemImpl ();
        return sourceItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemExport createItemExport ()
    {
        ItemExportImpl itemExport = new ItemExportImpl ();
        return itemExport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemInformation createItemInformation ()
    {
        ItemInformationImpl itemInformation = new ItemInformationImpl ();
        return itemInformation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LevelMonitor createLevelMonitor ()
    {
        LevelMonitorImpl levelMonitor = new LevelMonitorImpl ();
        return levelMonitor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptItem createScriptItem ()
    {
        ScriptItemImpl scriptItem = new ScriptItemImpl ();
        return scriptItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportItem createImportItem ()
    {
        ImportItemImpl importItem = new ImportItemImpl ();
        return importItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SummaryGroup createSummaryGroup ()
    {
        SummaryGroupImpl summaryGroup = new SummaryGroupImpl ();
        return summaryGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MarkerGroup createMarkerGroup ()
    {
        MarkerGroupImpl markerGroup = new MarkerGroupImpl ();
        return markerGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Markers createMarkers ()
    {
        MarkersImpl markers = new MarkersImpl ();
        return markers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstantItem createConstantItem ()
    {
        ConstantItemImpl constantItem = new ConstantItemImpl ();
        return constantItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SummaryItem createSummaryItem ()
    {
        SummaryItemImpl summaryItem = new SummaryItemImpl ();
        return summaryItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MarkerEntry createMarkerEntry ()
    {
        MarkerEntryImpl markerEntry = new MarkerEntryImpl ();
        return markerEntry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManualOverride createManualOverride ()
    {
        ManualOverrideImpl manualOverride = new ManualOverrideImpl ();
        return manualOverride;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultMasterServer createDefaultMasterServer ()
    {
        DefaultMasterServerImpl defaultMasterServer = new DefaultMasterServerImpl ();
        return defaultMasterServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomMasterServer createCustomMasterServer ()
    {
        CustomMasterServerImpl customMasterServer = new CustomMasterServerImpl ();
        return customMasterServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributesSummary createAttributesSummary ()
    {
        AttributesSummaryImpl attributesSummary = new AttributesSummaryImpl ();
        return attributesSummary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventLogger createEventLogger ()
    {
        EventLoggerImpl eventLogger = new EventLoggerImpl ();
        return eventLogger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonitorPool createMonitorPool ()
    {
        MonitorPoolImpl monitorPool = new MonitorPoolImpl ();
        return monitorPool;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPool createEventPool ()
    {
        EventPoolImpl eventPool = new EventPoolImpl ();
        return eventPool;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleDataMapper createSimpleDataMapper ()
    {
        SimpleDataMapperImpl simpleDataMapper = new SimpleDataMapperImpl ();
        return simpleDataMapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JdbcDataMapper createJdbcDataMapper ()
    {
        JdbcDataMapperImpl jdbcDataMapper = new JdbcDataMapperImpl ();
        return jdbcDataMapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataMapperEntry createDataMapperEntry ()
    {
        DataMapperEntryImpl dataMapperEntry = new DataMapperEntryImpl ();
        return dataMapperEntry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueMapper createValueMapper ()
    {
        ValueMapperImpl valueMapper = new ValueMapperImpl ();
        return valueMapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersistentItem createPersistentItem ()
    {
        PersistentItemImpl persistentItem = new PersistentItemImpl ();
        return persistentItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProxyItem createProxyItem ()
    {
        ProxyItemImpl proxyItem = new ProxyItemImpl ();
        return proxyItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scale createScale ()
    {
        ScaleImpl scale = new ScaleImpl ();
        return scale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Negate createNegate ()
    {
        NegateImpl negate = new NegateImpl ();
        return negate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rounding createRounding ()
    {
        RoundingImpl rounding = new RoundingImpl ();
        return rounding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExternalEventMonitor createExternalEventMonitor ()
    {
        ExternalEventMonitorImpl externalEventMonitor = new ExternalEventMonitorImpl ();
        return externalEventMonitor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyEntry createPropertyEntry ()
    {
        PropertyEntryImpl propertyEntry = new PropertyEntryImpl ();
        return propertyEntry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StaticExternalEventFilter createStaticExternalEventFilter ()
    {
        StaticExternalEventFilterImpl staticExternalEventFilter = new StaticExternalEventFilterImpl ();
        return staticExternalEventFilter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleExternalEventFilter createSimpleExternalEventFilter ()
    {
        SimpleExternalEventFilterImpl simpleExternalEventFilter = new SimpleExternalEventFilterImpl ();
        return simpleExternalEventFilter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypedItemReference createTypedItemReference ()
    {
        TypedItemReferenceImpl typedItemReference = new TypedItemReferenceImpl ();
        return typedItemReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CodeFragment createCodeFragment ()
    {
        CodeFragmentImpl codeFragment = new CodeFragmentImpl ();
        return codeFragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptTimer createScriptTimer ()
    {
        ScriptTimerImpl scriptTimer = new ScriptTimerImpl ();
        return scriptTimer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemReference createItemReference ()
    {
        ItemReferenceImpl itemReference = new ItemReferenceImpl ();
        return itemReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaItem createFormulaItem ()
    {
        FormulaItemImpl formulaItem = new FormulaItemImpl ();
        return formulaItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaItemOutbound createFormulaItemOutbound ()
    {
        FormulaItemOutboundImpl formulaItemOutbound = new FormulaItemOutboundImpl ();
        return formulaItemOutbound;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaItemInbound createFormulaItemInbound ()
    {
        FormulaItemInboundImpl formulaItemInbound = new FormulaItemInboundImpl ();
        return formulaItemInbound;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BooleanMonitor createBooleanMonitor ()
    {
        BooleanMonitorImpl booleanMonitor = new BooleanMonitorImpl ();
        return booleanMonitor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListMonitor createListMonitor ()
    {
        ListMonitorImpl listMonitor = new ListMonitorImpl ();
        return listMonitor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListMonitorEntry createListMonitorEntry ()
    {
        ListMonitorEntryImpl listMonitorEntry = new ListMonitorEntryImpl ();
        return listMonitorEntry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Average createAverage ()
    {
        AverageImpl average = new AverageImpl ();
        return average;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MovingAverage createMovingAverage ()
    {
        MovingAverageImpl movingAverage = new MovingAverageImpl ();
        return movingAverage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AverageItem createAverageItem ()
    {
        AverageItemImpl averageItem = new AverageItemImpl ();
        return averageItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MovingAverageItem createMovingAverageItem ()
    {
        MovingAverageItemImpl movingAverageItem = new MovingAverageItemImpl ();
        return movingAverageItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Blockings createBlockings ()
    {
        BlockingsImpl blockings = new BlockingsImpl ();
        return blockings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BlockGroup createBlockGroup ()
    {
        BlockGroupImpl blockGroup = new BlockGroupImpl ();
        return blockGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BlockHandler createBlockHandler ()
    {
        BlockHandlerImpl blockHandler = new BlockHandlerImpl ();
        return blockHandler;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Block createBlock ()
    {
        BlockImpl block = new BlockImpl ();
        return block;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalSummaryItem createGlobalSummaryItem ()
    {
        GlobalSummaryItemImpl globalSummaryItem = new GlobalSummaryItemImpl ();
        return globalSummaryItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WeakReferenceDataSourceItem createWeakReferenceDataSourceItem ()
    {
        WeakReferenceDataSourceItemImpl weakReferenceDataSourceItem = new WeakReferenceDataSourceItemImpl ();
        return weakReferenceDataSourceItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlarmsEventsExporter createAlarmsEventsExporter ()
    {
        AlarmsEventsExporterImpl alarmsEventsExporter = new AlarmsEventsExporterImpl ();
        return alarmsEventsExporter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlarmsEventsConnection createAlarmsEventsConnection ()
    {
        AlarmsEventsConnectionImpl alarmsEventsConnection = new AlarmsEventsConnectionImpl ();
        return alarmsEventsConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonitorPoolProxy createMonitorPoolProxy ()
    {
        MonitorPoolProxyImpl monitorPoolProxy = new MonitorPoolProxyImpl ();
        return monitorPoolProxy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPoolProxy createEventPoolProxy ()
    {
        EventPoolProxyImpl eventPoolProxy = new EventPoolProxyImpl ();
        return eventPoolProxy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlarmsEventsModule createAlarmsEventsModule ()
    {
        AlarmsEventsModuleImpl alarmsEventsModule = new AlarmsEventsModuleImpl ();
        return alarmsEventsModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AknProxy createAknProxy ()
    {
        AknProxyImpl aknProxy = new AknProxyImpl ();
        return aknProxy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PullEvents createPullEvents ()
    {
        PullEventsImpl pullEvents = new PullEventsImpl ();
        return pullEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JdbcUserServiceModule createJdbcUserServiceModule ()
    {
        JdbcUserServiceModuleImpl jdbcUserServiceModule = new JdbcUserServiceModuleImpl ();
        return jdbcUserServiceModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JdbcUserService createJdbcUserService ()
    {
        JdbcUserServiceImpl jdbcUserService = new JdbcUserServiceImpl ();
        return jdbcUserService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultValueArchiveServer createDefaultValueArchiveServer ()
    {
        DefaultValueArchiveServerImpl defaultValueArchiveServer = new DefaultValueArchiveServerImpl ();
        return defaultValueArchiveServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HistoricalDataExporter createHistoricalDataExporter ()
    {
        HistoricalDataExporterImpl historicalDataExporter = new HistoricalDataExporterImpl ();
        return historicalDataExporter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueArchive createValueArchive ()
    {
        ValueArchiveImpl valueArchive = new ValueArchiveImpl ();
        return valueArchive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigurationAdministratorExporter createConfigurationAdministratorExporter ()
    {
        ConfigurationAdministratorExporterImpl configurationAdministratorExporter = new ConfigurationAdministratorExporterImpl ();
        return configurationAdministratorExporter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceItem createReferenceItem ()
    {
        ReferenceItemImpl referenceItem = new ReferenceItemImpl ();
        return referenceItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventStorageJdbc createEventStorageJdbc ()
    {
        EventStorageJdbcImpl eventStorageJdbc = new EventStorageJdbcImpl ();
        return eventStorageJdbc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventStoragePostgres createEventStoragePostgres ()
    {
        EventStoragePostgresImpl eventStoragePostgres = new EventStoragePostgresImpl ();
        return eventStoragePostgres;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AverageReferenceType createAverageReferenceTypeFromString ( EDataType eDataType, String initialValue )
    {
        AverageReferenceType result = AverageReferenceType.get ( initialValue );
        if ( result == null )
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAverageReferenceTypeToString ( EDataType eDataType, Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MovingAverageReferenceType createMovingAverageReferenceTypeFromString ( EDataType eDataType, String initialValue )
    {
        MovingAverageReferenceType result = MovingAverageReferenceType.get ( initialValue );
        if ( result == null )
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMovingAverageReferenceTypeToString ( EDataType eDataType, Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoundingType createRoundingTypeFromString ( EDataType eDataType, String initialValue )
    {
        RoundingType result = RoundingType.get ( initialValue );
        if ( result == null )
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRoundingTypeToString ( EDataType eDataType, Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType createDataTypeFromString ( EDataType eDataType, String initialValue )
    {
        DataType result = DataType.get ( initialValue );
        if ( result == null )
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDataTypeToString ( EDataType eDataType, Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PasswordType createPasswordTypeFromString ( EDataType eDataType, String initialValue )
    {
        PasswordType result = PasswordType.get ( initialValue );
        if ( result == null )
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPasswordTypeToString ( EDataType eDataType, Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Severity createSeverityFromString ( EDataType eDataType, String initialValue )
    {
        return (Severity)super.createFromString ( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSeverityToString ( EDataType eDataType, Object instanceValue )
    {
        return super.convertToString ( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Variant createVariantFromString ( EDataType eDataType, String initialValue )
    {
        return (Variant)super.createFromString ( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVariantToString ( EDataType eDataType, Object instanceValue )
    {
        return super.convertToString ( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OsgiPackage getOsgiPackage ()
    {
        return (OsgiPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static OsgiPackage getPackage ()
    {
        return OsgiPackage.eINSTANCE;
    }

} //OsgiFactoryImpl
