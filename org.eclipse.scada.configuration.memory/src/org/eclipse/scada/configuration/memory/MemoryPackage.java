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
package org.eclipse.scada.configuration.memory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.scada.configuration.memory.MemoryFactory
 * @model kind="package"
 * @generated
 */
public interface MemoryPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "memory"; //$NON-NLS-1$

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://eclipse.org/SCADA/Configuration/Memory"; //$NON-NLS-1$

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "memory"; //$NON-NLS-1$

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MemoryPackage eINSTANCE = org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.impl.TypeDefinitionImpl
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getTypeDefinition()
     * @generated
     */
    int TYPE_DEFINITION = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DEFINITION__NAME = 0;

    /**
     * The feature id for the '<em><b>Variables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DEFINITION__VARIABLES = 1;

    /**
     * The number of structural features of the '<em>Type Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DEFINITION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Type Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DEFINITION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.Type <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.Type
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getType()
     * @generated
     */
    int TYPE = 2;

    /**
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_FEATURE_COUNT = 0;

    /**
     * The operation id for the '<em>Encode</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE___ENCODE = 0;

    /**
     * The number of operations of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.ScalarType <em>Scalar Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.ScalarType
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getScalarType()
     * @generated
     */
    int SCALAR_TYPE = 9;

    /**
     * The number of structural features of the '<em>Scalar Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALAR_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Encode</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALAR_TYPE___ENCODE = TYPE___ENCODE;

    /**
     * The number of operations of the '<em>Scalar Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALAR_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.impl.BaseScalarTypeImpl <em>Base Scalar Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.impl.BaseScalarTypeImpl
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getBaseScalarType()
     * @generated
     */
    int BASE_SCALAR_TYPE = 6;

    /**
     * The feature id for the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_SCALAR_TYPE__INDEX = SCALAR_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Base Scalar Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_SCALAR_TYPE_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Encode</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_SCALAR_TYPE___ENCODE = SCALAR_TYPE___ENCODE;

    /**
     * The number of operations of the '<em>Base Scalar Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_SCALAR_TYPE_OPERATION_COUNT = SCALAR_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.impl.UserDefinedTypeImpl
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getUserDefinedType()
     * @generated
     */
    int USER_DEFINED_TYPE = 7;

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.TypeDefinition <em>Type Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Definition</em>'.
     * @see org.eclipse.scada.configuration.memory.TypeDefinition
     * @generated
     */
    EClass getTypeDefinition ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.configuration.memory.TypeDefinition#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.scada.configuration.memory.TypeDefinition#getName()
     * @see #getTypeDefinition()
     * @generated
     */
    EAttribute getTypeDefinition_Name ();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.scada.configuration.memory.TypeDefinition#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variables</em>'.
     * @see org.eclipse.scada.configuration.memory.TypeDefinition#getVariables()
     * @see #getTypeDefinition()
     * @generated
     */
    EReference getTypeDefinition_Variables ();

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.impl.BitTypeImpl <em>Bit Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.impl.BitTypeImpl
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getBitType()
     * @generated
     */
    int BIT_TYPE = 1;

    /**
     * The feature id for the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_TYPE__INDEX = BASE_SCALAR_TYPE__INDEX;

    /**
     * The feature id for the '<em><b>Sub Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_TYPE__SUB_INDEX = BASE_SCALAR_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Bit Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_TYPE_FEATURE_COUNT = BASE_SCALAR_TYPE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Encode</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_TYPE___ENCODE = BASE_SCALAR_TYPE___ENCODE;

    /**
     * The number of operations of the '<em>Bit Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_TYPE_OPERATION_COUNT = BASE_SCALAR_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.impl.VariableImpl
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getVariable()
     * @generated
     */
    int VARIABLE = 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__TYPE = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__NAME = 1;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__ATTRIBUTES = 2;

    /**
     * The number of structural features of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.impl.AttributeImpl
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__NAME = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TYPE = 1;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.impl.Float32TypeImpl <em>Float32 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.impl.Float32TypeImpl
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getFloat32Type()
     * @generated
     */
    int FLOAT32_TYPE = 5;

    /**
     * The feature id for the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT32_TYPE__INDEX = BASE_SCALAR_TYPE__INDEX;

    /**
     * The number of structural features of the '<em>Float32 Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT32_TYPE_FEATURE_COUNT = BASE_SCALAR_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Encode</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT32_TYPE___ENCODE = BASE_SCALAR_TYPE___ENCODE;

    /**
     * The number of operations of the '<em>Float32 Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FLOAT32_TYPE_OPERATION_COUNT = BASE_SCALAR_TYPE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEFINED_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEFINED_TYPE__INDEX = TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>User Defined Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEFINED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Encode</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEFINED_TYPE___ENCODE = TYPE___ENCODE;

    /**
     * The number of operations of the '<em>User Defined Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_DEFINED_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.impl.UnsignedInteger16TypeImpl <em>Unsigned Integer16 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.impl.UnsignedInteger16TypeImpl
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getUnsignedInteger16Type()
     * @generated
     */
    int UNSIGNED_INTEGER16_TYPE = 8;

    /**
     * The feature id for the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER16_TYPE__INDEX = BASE_SCALAR_TYPE__INDEX;

    /**
     * The number of structural features of the '<em>Unsigned Integer16 Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER16_TYPE_FEATURE_COUNT = BASE_SCALAR_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Encode</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER16_TYPE___ENCODE = BASE_SCALAR_TYPE___ENCODE;

    /**
     * The number of operations of the '<em>Unsigned Integer16 Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER16_TYPE_OPERATION_COUNT = BASE_SCALAR_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.impl.UnsignedInteger32TypeImpl <em>Unsigned Integer32 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.impl.UnsignedInteger32TypeImpl
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getUnsignedInteger32Type()
     * @generated
     */
    int UNSIGNED_INTEGER32_TYPE = 10;

    /**
     * The feature id for the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER32_TYPE__INDEX = BASE_SCALAR_TYPE__INDEX;

    /**
     * The number of structural features of the '<em>Unsigned Integer32 Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER32_TYPE_FEATURE_COUNT = BASE_SCALAR_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Encode</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER32_TYPE___ENCODE = BASE_SCALAR_TYPE___ENCODE;

    /**
     * The number of operations of the '<em>Unsigned Integer32 Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER32_TYPE_OPERATION_COUNT = BASE_SCALAR_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.impl.UnsignedInteger8TypeImpl <em>Unsigned Integer8 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.impl.UnsignedInteger8TypeImpl
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getUnsignedInteger8Type()
     * @generated
     */
    int UNSIGNED_INTEGER8_TYPE = 11;

    /**
     * The feature id for the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER8_TYPE__INDEX = BASE_SCALAR_TYPE__INDEX;

    /**
     * The number of structural features of the '<em>Unsigned Integer8 Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER8_TYPE_FEATURE_COUNT = BASE_SCALAR_TYPE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Encode</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER8_TYPE___ENCODE = BASE_SCALAR_TYPE___ENCODE;

    /**
     * The number of operations of the '<em>Unsigned Integer8 Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNSIGNED_INTEGER8_TYPE_OPERATION_COUNT = BASE_SCALAR_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipse.scada.configuration.memory.impl.TypeSystemImpl <em>Type System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scada.configuration.memory.impl.TypeSystemImpl
     * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getTypeSystem()
     * @generated
     */
    int TYPE_SYSTEM = 12;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_SYSTEM__TYPES = 0;

    /**
     * The feature id for the '<em><b>Includes</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_SYSTEM__INCLUDES = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_SYSTEM__NAME = 2;

    /**
     * The number of structural features of the '<em>Type System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_SYSTEM_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Type System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_SYSTEM_OPERATION_COUNT = 0;

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.UserDefinedType <em>User Defined Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>User Defined Type</em>'.
     * @see org.eclipse.scada.configuration.memory.UserDefinedType
     * @generated
     */
    EClass getUserDefinedType ();

    /**
     * Returns the meta object for the reference '{@link org.eclipse.scada.configuration.memory.UserDefinedType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see org.eclipse.scada.configuration.memory.UserDefinedType#getType()
     * @see #getUserDefinedType()
     * @generated
     */
    EReference getUserDefinedType_Type ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.configuration.memory.UserDefinedType#getIndex <em>Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Index</em>'.
     * @see org.eclipse.scada.configuration.memory.UserDefinedType#getIndex()
     * @see #getUserDefinedType()
     * @generated
     */
    EAttribute getUserDefinedType_Index ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.UnsignedInteger16Type <em>Unsigned Integer16 Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unsigned Integer16 Type</em>'.
     * @see org.eclipse.scada.configuration.memory.UnsignedInteger16Type
     * @generated
     */
    EClass getUnsignedInteger16Type ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.ScalarType <em>Scalar Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scalar Type</em>'.
     * @see org.eclipse.scada.configuration.memory.ScalarType
     * @generated
     */
    EClass getScalarType ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.UnsignedInteger32Type <em>Unsigned Integer32 Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unsigned Integer32 Type</em>'.
     * @see org.eclipse.scada.configuration.memory.UnsignedInteger32Type
     * @generated
     */
    EClass getUnsignedInteger32Type ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.UnsignedInteger8Type <em>Unsigned Integer8 Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unsigned Integer8 Type</em>'.
     * @see org.eclipse.scada.configuration.memory.UnsignedInteger8Type
     * @generated
     */
    EClass getUnsignedInteger8Type ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.TypeSystem <em>Type System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type System</em>'.
     * @see org.eclipse.scada.configuration.memory.TypeSystem
     * @generated
     */
    EClass getTypeSystem ();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.scada.configuration.memory.TypeSystem#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see org.eclipse.scada.configuration.memory.TypeSystem#getTypes()
     * @see #getTypeSystem()
     * @generated
     */
    EReference getTypeSystem_Types ();

    /**
     * Returns the meta object for the reference list '{@link org.eclipse.scada.configuration.memory.TypeSystem#getIncludes <em>Includes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Includes</em>'.
     * @see org.eclipse.scada.configuration.memory.TypeSystem#getIncludes()
     * @see #getTypeSystem()
     * @generated
     */
    EReference getTypeSystem_Includes ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.configuration.memory.TypeSystem#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.scada.configuration.memory.TypeSystem#getName()
     * @see #getTypeSystem()
     * @generated
     */
    EAttribute getTypeSystem_Name ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.BitType <em>Bit Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bit Type</em>'.
     * @see org.eclipse.scada.configuration.memory.BitType
     * @generated
     */
    EClass getBitType ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.configuration.memory.BitType#getSubIndex <em>Sub Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sub Index</em>'.
     * @see org.eclipse.scada.configuration.memory.BitType#getSubIndex()
     * @see #getBitType()
     * @generated
     */
    EAttribute getBitType_SubIndex ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.Type <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type</em>'.
     * @see org.eclipse.scada.configuration.memory.Type
     * @generated
     */
    EClass getType ();

    /**
     * Returns the meta object for the '{@link org.eclipse.scada.configuration.memory.Type#encode() <em>Encode</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Encode</em>' operation.
     * @see org.eclipse.scada.configuration.memory.Type#encode()
     * @generated
     */
    EOperation getType__Encode ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable</em>'.
     * @see org.eclipse.scada.configuration.memory.Variable
     * @generated
     */
    EClass getVariable ();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.scada.configuration.memory.Variable#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see org.eclipse.scada.configuration.memory.Variable#getType()
     * @see #getVariable()
     * @generated
     */
    EReference getVariable_Type ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.configuration.memory.Variable#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.scada.configuration.memory.Variable#getName()
     * @see #getVariable()
     * @generated
     */
    EAttribute getVariable_Name ();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipse.scada.configuration.memory.Variable#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see org.eclipse.scada.configuration.memory.Variable#getAttributes()
     * @see #getVariable()
     * @generated
     */
    EReference getVariable_Attributes ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see org.eclipse.scada.configuration.memory.Attribute
     * @generated
     */
    EClass getAttribute ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.configuration.memory.Attribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.scada.configuration.memory.Attribute#getName()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Name ();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.scada.configuration.memory.Attribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see org.eclipse.scada.configuration.memory.Attribute#getType()
     * @see #getAttribute()
     * @generated
     */
    EReference getAttribute_Type ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.Float32Type <em>Float32 Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Float32 Type</em>'.
     * @see org.eclipse.scada.configuration.memory.Float32Type
     * @generated
     */
    EClass getFloat32Type ();

    /**
     * Returns the meta object for class '{@link org.eclipse.scada.configuration.memory.BaseScalarType <em>Base Scalar Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Scalar Type</em>'.
     * @see org.eclipse.scada.configuration.memory.BaseScalarType
     * @generated
     */
    EClass getBaseScalarType ();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.scada.configuration.memory.BaseScalarType#getIndex <em>Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Index</em>'.
     * @see org.eclipse.scada.configuration.memory.BaseScalarType#getIndex()
     * @see #getBaseScalarType()
     * @generated
     */
    EAttribute getBaseScalarType_Index ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MemoryFactory getMemoryFactory ();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.impl.TypeDefinitionImpl
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getTypeDefinition()
         * @generated
         */
        EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition ();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_DEFINITION__NAME = eINSTANCE.getTypeDefinition_Name ();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_DEFINITION__VARIABLES = eINSTANCE.getTypeDefinition_Variables ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.impl.UserDefinedTypeImpl
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getUserDefinedType()
         * @generated
         */
        EClass USER_DEFINED_TYPE = eINSTANCE.getUserDefinedType ();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference USER_DEFINED_TYPE__TYPE = eINSTANCE.getUserDefinedType_Type ();

        /**
         * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER_DEFINED_TYPE__INDEX = eINSTANCE.getUserDefinedType_Index ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.impl.UnsignedInteger16TypeImpl <em>Unsigned Integer16 Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.impl.UnsignedInteger16TypeImpl
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getUnsignedInteger16Type()
         * @generated
         */
        EClass UNSIGNED_INTEGER16_TYPE = eINSTANCE.getUnsignedInteger16Type ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.ScalarType <em>Scalar Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.ScalarType
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getScalarType()
         * @generated
         */
        EClass SCALAR_TYPE = eINSTANCE.getScalarType ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.impl.UnsignedInteger32TypeImpl <em>Unsigned Integer32 Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.impl.UnsignedInteger32TypeImpl
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getUnsignedInteger32Type()
         * @generated
         */
        EClass UNSIGNED_INTEGER32_TYPE = eINSTANCE.getUnsignedInteger32Type ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.impl.UnsignedInteger8TypeImpl <em>Unsigned Integer8 Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.impl.UnsignedInteger8TypeImpl
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getUnsignedInteger8Type()
         * @generated
         */
        EClass UNSIGNED_INTEGER8_TYPE = eINSTANCE.getUnsignedInteger8Type ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.impl.TypeSystemImpl <em>Type System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.impl.TypeSystemImpl
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getTypeSystem()
         * @generated
         */
        EClass TYPE_SYSTEM = eINSTANCE.getTypeSystem ();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_SYSTEM__TYPES = eINSTANCE.getTypeSystem_Types ();

        /**
         * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_SYSTEM__INCLUDES = eINSTANCE.getTypeSystem_Includes ();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_SYSTEM__NAME = eINSTANCE.getTypeSystem_Name ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.impl.BitTypeImpl <em>Bit Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.impl.BitTypeImpl
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getBitType()
         * @generated
         */
        EClass BIT_TYPE = eINSTANCE.getBitType ();

        /**
         * The meta object literal for the '<em><b>Sub Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BIT_TYPE__SUB_INDEX = eINSTANCE.getBitType_SubIndex ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.Type <em>Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.Type
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getType()
         * @generated
         */
        EClass TYPE = eINSTANCE.getType ();

        /**
         * The meta object literal for the '<em><b>Encode</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation TYPE___ENCODE = eINSTANCE.getType__Encode ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.impl.VariableImpl <em>Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.impl.VariableImpl
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getVariable()
         * @generated
         */
        EClass VARIABLE = eINSTANCE.getVariable ();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type ();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name ();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VARIABLE__ATTRIBUTES = eINSTANCE.getVariable_Attributes ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.impl.AttributeImpl
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute ();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name ();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.impl.Float32TypeImpl <em>Float32 Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.impl.Float32TypeImpl
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getFloat32Type()
         * @generated
         */
        EClass FLOAT32_TYPE = eINSTANCE.getFloat32Type ();

        /**
         * The meta object literal for the '{@link org.eclipse.scada.configuration.memory.impl.BaseScalarTypeImpl <em>Base Scalar Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.scada.configuration.memory.impl.BaseScalarTypeImpl
         * @see org.eclipse.scada.configuration.memory.impl.MemoryPackageImpl#getBaseScalarType()
         * @generated
         */
        EClass BASE_SCALAR_TYPE = eINSTANCE.getBaseScalarType ();

        /**
         * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BASE_SCALAR_TYPE__INDEX = eINSTANCE.getBaseScalarType_Index ();

    }

} //MemoryPackage
