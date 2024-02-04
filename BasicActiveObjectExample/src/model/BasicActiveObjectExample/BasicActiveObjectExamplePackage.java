/**
 */
package model.BasicActiveObjectExample;

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
 * @see model.BasicActiveObjectExample.BasicActiveObjectExampleFactory
 * @model kind="package"
 * @generated
 */
public interface BasicActiveObjectExamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BasicActiveObjectExample";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model/BasicActiveObjectExample.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model.BasicActiveObjectExample";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicActiveObjectExamplePackage eINSTANCE = model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link model.BasicActiveObjectExample.impl.IncrementImpl <em>Increment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BasicActiveObjectExample.impl.IncrementImpl
	 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getIncrement()
	 * @generated
	 */
	int INCREMENT = 0;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__COUNTER = 0;

	/**
	 * The number of structural features of the '<em>Increment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Increment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT___INCREMENT = 0;

	/**
	 * The number of operations of the '<em>Increment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.BasicActiveObjectExample.impl.Increment_IncrementClassifierBehaviorImpl <em>Increment Increment Classifier Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BasicActiveObjectExample.impl.Increment_IncrementClassifierBehaviorImpl
	 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getIncrement_IncrementClassifierBehavior()
	 * @generated
	 */
	int INCREMENT_INCREMENT_CLASSIFIER_BEHAVIOR = 1;

	/**
	 * The number of structural features of the '<em>Increment Increment Classifier Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_INCREMENT_CLASSIFIER_BEHAVIOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Increment Increment Classifier Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_INCREMENT_CLASSIFIER_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.BasicActiveObjectExample.impl.Increment_incrementMethodImpl <em>Increment increment Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BasicActiveObjectExample.impl.Increment_incrementMethodImpl
	 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getIncrement_incrementMethod()
	 * @generated
	 */
	int INCREMENT_INCREMENT_METHOD = 2;

	/**
	 * The number of structural features of the '<em>Increment increment Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_INCREMENT_METHOD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Increment increment Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_INCREMENT_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.BasicActiveObjectExample.impl.AIM_TmTc_StructImpl <em>AIM Tm Tc Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BasicActiveObjectExample.impl.AIM_TmTc_StructImpl
	 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getAIM_TmTc_Struct()
	 * @generated
	 */
	int AIM_TM_TC_STRUCT = 3;

	/**
	 * The number of structural features of the '<em>AIM Tm Tc Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Set Mtq speed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT___SET_MTQ_SPEED = 0;

	/**
	 * The operation id for the '<em>Set Mtm value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT___SET_MTM_VALUE = 1;

	/**
	 * The operation id for the '<em>Set Wheel 1speed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT___SET_WHEEL_1SPEED = 2;

	/**
	 * The operation id for the '<em>Set Wheel 2speed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT___SET_WHEEL_2SPEED = 3;

	/**
	 * The operation id for the '<em>Get Mtq speed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT___GET_MTQ_SPEED = 4;

	/**
	 * The operation id for the '<em>Get Mtm value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT___GET_MTM_VALUE = 5;

	/**
	 * The operation id for the '<em>Get Wheel 1speed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT___GET_WHEEL_1SPEED = 6;

	/**
	 * The operation id for the '<em>Get Wheel 2speed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT___GET_WHEEL_2SPEED = 7;

	/**
	 * The number of operations of the '<em>AIM Tm Tc Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link model.BasicActiveObjectExample.impl.AIM_TmTc_Struct_Activity6Impl <em>AIM Tm Tc Struct Activity6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BasicActiveObjectExample.impl.AIM_TmTc_Struct_Activity6Impl
	 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getAIM_TmTc_Struct_Activity6()
	 * @generated
	 */
	int AIM_TM_TC_STRUCT_ACTIVITY6 = 4;

	/**
	 * The number of structural features of the '<em>AIM Tm Tc Struct Activity6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT_ACTIVITY6_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>AIM Tm Tc Struct Activity6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIM_TM_TC_STRUCT_ACTIVITY6_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.BasicActiveObjectExample.impl.StateThreadImpl <em>State Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BasicActiveObjectExample.impl.StateThreadImpl
	 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getStateThread()
	 * @generated
	 */
	int STATE_THREAD = 5;

	/**
	 * The feature id for the '<em><b>Pipe Input Stream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_THREAD__PIPE_INPUT_STREAM = 0;

	/**
	 * The number of structural features of the '<em>State Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_THREAD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_THREAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.BasicActiveObjectExample.impl.PowerThreadImpl <em>Power Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BasicActiveObjectExample.impl.PowerThreadImpl
	 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getPowerThread()
	 * @generated
	 */
	int POWER_THREAD = 6;

	/**
	 * The feature id for the '<em><b>Lock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_THREAD__LOCK = 0;

	/**
	 * The number of structural features of the '<em>Power Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_THREAD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Power Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_THREAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.BasicActiveObjectExample.impl.State_Machine_AOCSImpl <em>State Machine AOCS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BasicActiveObjectExample.impl.State_Machine_AOCSImpl
	 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getState_Machine_AOCS()
	 * @generated
	 */
	int STATE_MACHINE_AOCS = 7;

	/**
	 * The feature id for the '<em><b>Powerthread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_AOCS__POWERTHREAD = 0;

	/**
	 * The feature id for the '<em><b>Statethread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_AOCS__STATETHREAD = 1;

	/**
	 * The number of structural features of the '<em>State Machine AOCS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_AOCS_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Set AOCS Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_AOCS___SET_AOCS_MODE = 0;

	/**
	 * The number of operations of the '<em>State Machine AOCS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_AOCS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.BasicActiveObjectExample.impl.AOCS_ModuleImpl <em>AOCS Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BasicActiveObjectExample.impl.AOCS_ModuleImpl
	 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getAOCS_Module()
	 * @generated
	 */
	int AOCS_MODULE = 8;

	/**
	 * The feature id for the '<em><b>Aim tmtc struct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOCS_MODULE__AIM_TMTC_STRUCT = 0;

	/**
	 * The number of structural features of the '<em>AOCS Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOCS_MODULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>AOCS Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOCS_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.BasicActiveObjectExample.CAN_TmTc_Struct <em>CAN Tm Tc Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BasicActiveObjectExample.CAN_TmTc_Struct
	 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getCAN_TmTc_Struct()
	 * @generated
	 */
	int CAN_TM_TC_STRUCT = 9;

	/**
	 * The number of structural features of the '<em>CAN Tm Tc Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_TM_TC_STRUCT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Destination Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_TM_TC_STRUCT___GET_DESTINATION_ADDRESS = 0;

	/**
	 * The operation id for the '<em>Get Source Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_TM_TC_STRUCT___GET_SOURCE_ADDRESS = 1;

	/**
	 * The operation id for the '<em>Set Destination Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_TM_TC_STRUCT___SET_DESTINATION_ADDRESS__INT = 2;

	/**
	 * The operation id for the '<em>Set Source Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_TM_TC_STRUCT___SET_SOURCE_ADDRESS__INT = 3;

	/**
	 * The number of operations of the '<em>CAN Tm Tc Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_TM_TC_STRUCT_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link model.BasicActiveObjectExample.Increment <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment</em>'.
	 * @see model.BasicActiveObjectExample.Increment
	 * @generated
	 */
	EClass getIncrement();

	/**
	 * Returns the meta object for the attribute '{@link model.BasicActiveObjectExample.Increment#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see model.BasicActiveObjectExample.Increment#getCounter()
	 * @see #getIncrement()
	 * @generated
	 */
	EAttribute getIncrement_Counter();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.Increment#increment() <em>Increment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Increment</em>' operation.
	 * @see model.BasicActiveObjectExample.Increment#increment()
	 * @generated
	 */
	EOperation getIncrement__Increment();

	/**
	 * Returns the meta object for class '{@link model.BasicActiveObjectExample.Increment_IncrementClassifierBehavior <em>Increment Increment Classifier Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment Increment Classifier Behavior</em>'.
	 * @see model.BasicActiveObjectExample.Increment_IncrementClassifierBehavior
	 * @generated
	 */
	EClass getIncrement_IncrementClassifierBehavior();

	/**
	 * Returns the meta object for class '{@link model.BasicActiveObjectExample.Increment_incrementMethod <em>Increment increment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment increment Method</em>'.
	 * @see model.BasicActiveObjectExample.Increment_incrementMethod
	 * @generated
	 */
	EClass getIncrement_incrementMethod();

	/**
	 * Returns the meta object for class '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct <em>AIM Tm Tc Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AIM Tm Tc Struct</em>'.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct
	 * @generated
	 */
	EClass getAIM_TmTc_Struct();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct#setMtq_speed() <em>Set Mtq speed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Mtq speed</em>' operation.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct#setMtq_speed()
	 * @generated
	 */
	EOperation getAIM_TmTc_Struct__SetMtq_speed();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct#setMtm_value() <em>Set Mtm value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Mtm value</em>' operation.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct#setMtm_value()
	 * @generated
	 */
	EOperation getAIM_TmTc_Struct__SetMtm_value();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct#setWheel_1_speed() <em>Set Wheel 1speed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Wheel 1speed</em>' operation.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct#setWheel_1_speed()
	 * @generated
	 */
	EOperation getAIM_TmTc_Struct__SetWheel_1_speed();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct#setWheel_2_speed() <em>Set Wheel 2speed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Wheel 2speed</em>' operation.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct#setWheel_2_speed()
	 * @generated
	 */
	EOperation getAIM_TmTc_Struct__SetWheel_2_speed();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct#getMtq_speed() <em>Get Mtq speed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mtq speed</em>' operation.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct#getMtq_speed()
	 * @generated
	 */
	EOperation getAIM_TmTc_Struct__GetMtq_speed();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct#getMtm_value() <em>Get Mtm value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mtm value</em>' operation.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct#getMtm_value()
	 * @generated
	 */
	EOperation getAIM_TmTc_Struct__GetMtm_value();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct#getWheel_1_speed() <em>Get Wheel 1speed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Wheel 1speed</em>' operation.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct#getWheel_1_speed()
	 * @generated
	 */
	EOperation getAIM_TmTc_Struct__GetWheel_1_speed();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct#getWheel_2_speed() <em>Get Wheel 2speed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Wheel 2speed</em>' operation.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct#getWheel_2_speed()
	 * @generated
	 */
	EOperation getAIM_TmTc_Struct__GetWheel_2_speed();

	/**
	 * Returns the meta object for class '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct_Activity6 <em>AIM Tm Tc Struct Activity6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AIM Tm Tc Struct Activity6</em>'.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct_Activity6
	 * @generated
	 */
	EClass getAIM_TmTc_Struct_Activity6();

	/**
	 * Returns the meta object for class '{@link model.BasicActiveObjectExample.StateThread <em>State Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Thread</em>'.
	 * @see model.BasicActiveObjectExample.StateThread
	 * @generated
	 */
	EClass getStateThread();

	/**
	 * Returns the meta object for the reference '{@link model.BasicActiveObjectExample.StateThread#getPipeInputStream <em>Pipe Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pipe Input Stream</em>'.
	 * @see model.BasicActiveObjectExample.StateThread#getPipeInputStream()
	 * @see #getStateThread()
	 * @generated
	 */
	EReference getStateThread_PipeInputStream();

	/**
	 * Returns the meta object for class '{@link model.BasicActiveObjectExample.PowerThread <em>Power Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Thread</em>'.
	 * @see model.BasicActiveObjectExample.PowerThread
	 * @generated
	 */
	EClass getPowerThread();

	/**
	 * Returns the meta object for the reference '{@link model.BasicActiveObjectExample.PowerThread#getLock <em>Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lock</em>'.
	 * @see model.BasicActiveObjectExample.PowerThread#getLock()
	 * @see #getPowerThread()
	 * @generated
	 */
	EReference getPowerThread_Lock();

	/**
	 * Returns the meta object for class '{@link model.BasicActiveObjectExample.State_Machine_AOCS <em>State Machine AOCS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine AOCS</em>'.
	 * @see model.BasicActiveObjectExample.State_Machine_AOCS
	 * @generated
	 */
	EClass getState_Machine_AOCS();

	/**
	 * Returns the meta object for the reference '{@link model.BasicActiveObjectExample.State_Machine_AOCS#getPowerthread <em>Powerthread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powerthread</em>'.
	 * @see model.BasicActiveObjectExample.State_Machine_AOCS#getPowerthread()
	 * @see #getState_Machine_AOCS()
	 * @generated
	 */
	EReference getState_Machine_AOCS_Powerthread();

	/**
	 * Returns the meta object for the reference '{@link model.BasicActiveObjectExample.State_Machine_AOCS#getStatethread <em>Statethread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statethread</em>'.
	 * @see model.BasicActiveObjectExample.State_Machine_AOCS#getStatethread()
	 * @see #getState_Machine_AOCS()
	 * @generated
	 */
	EReference getState_Machine_AOCS_Statethread();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.State_Machine_AOCS#setAOCSMode() <em>Set AOCS Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set AOCS Mode</em>' operation.
	 * @see model.BasicActiveObjectExample.State_Machine_AOCS#setAOCSMode()
	 * @generated
	 */
	EOperation getState_Machine_AOCS__SetAOCSMode();

	/**
	 * Returns the meta object for class '{@link model.BasicActiveObjectExample.AOCS_Module <em>AOCS Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AOCS Module</em>'.
	 * @see model.BasicActiveObjectExample.AOCS_Module
	 * @generated
	 */
	EClass getAOCS_Module();

	/**
	 * Returns the meta object for the reference list '{@link model.BasicActiveObjectExample.AOCS_Module#getAim_tmtc_struct <em>Aim tmtc struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aim tmtc struct</em>'.
	 * @see model.BasicActiveObjectExample.AOCS_Module#getAim_tmtc_struct()
	 * @see #getAOCS_Module()
	 * @generated
	 */
	EReference getAOCS_Module_Aim_tmtc_struct();

	/**
	 * Returns the meta object for class '{@link model.BasicActiveObjectExample.CAN_TmTc_Struct <em>CAN Tm Tc Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAN Tm Tc Struct</em>'.
	 * @see model.BasicActiveObjectExample.CAN_TmTc_Struct
	 * @generated
	 */
	EClass getCAN_TmTc_Struct();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.CAN_TmTc_Struct#getDestinationAddress() <em>Get Destination Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Destination Address</em>' operation.
	 * @see model.BasicActiveObjectExample.CAN_TmTc_Struct#getDestinationAddress()
	 * @generated
	 */
	EOperation getCAN_TmTc_Struct__GetDestinationAddress();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.CAN_TmTc_Struct#getSourceAddress() <em>Get Source Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Address</em>' operation.
	 * @see model.BasicActiveObjectExample.CAN_TmTc_Struct#getSourceAddress()
	 * @generated
	 */
	EOperation getCAN_TmTc_Struct__GetSourceAddress();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.CAN_TmTc_Struct#setDestinationAddress(int) <em>Set Destination Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Destination Address</em>' operation.
	 * @see model.BasicActiveObjectExample.CAN_TmTc_Struct#setDestinationAddress(int)
	 * @generated
	 */
	EOperation getCAN_TmTc_Struct__SetDestinationAddress__int();

	/**
	 * Returns the meta object for the '{@link model.BasicActiveObjectExample.CAN_TmTc_Struct#setSourceAddress(int) <em>Set Source Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Source Address</em>' operation.
	 * @see model.BasicActiveObjectExample.CAN_TmTc_Struct#setSourceAddress(int)
	 * @generated
	 */
	EOperation getCAN_TmTc_Struct__SetSourceAddress__int();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicActiveObjectExampleFactory getBasicActiveObjectExampleFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.BasicActiveObjectExample.impl.IncrementImpl <em>Increment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BasicActiveObjectExample.impl.IncrementImpl
		 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getIncrement()
		 * @generated
		 */
		EClass INCREMENT = eINSTANCE.getIncrement();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENT__COUNTER = eINSTANCE.getIncrement_Counter();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INCREMENT___INCREMENT = eINSTANCE.getIncrement__Increment();

		/**
		 * The meta object literal for the '{@link model.BasicActiveObjectExample.impl.Increment_IncrementClassifierBehaviorImpl <em>Increment Increment Classifier Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BasicActiveObjectExample.impl.Increment_IncrementClassifierBehaviorImpl
		 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getIncrement_IncrementClassifierBehavior()
		 * @generated
		 */
		EClass INCREMENT_INCREMENT_CLASSIFIER_BEHAVIOR = eINSTANCE.getIncrement_IncrementClassifierBehavior();

		/**
		 * The meta object literal for the '{@link model.BasicActiveObjectExample.impl.Increment_incrementMethodImpl <em>Increment increment Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BasicActiveObjectExample.impl.Increment_incrementMethodImpl
		 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getIncrement_incrementMethod()
		 * @generated
		 */
		EClass INCREMENT_INCREMENT_METHOD = eINSTANCE.getIncrement_incrementMethod();

		/**
		 * The meta object literal for the '{@link model.BasicActiveObjectExample.impl.AIM_TmTc_StructImpl <em>AIM Tm Tc Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BasicActiveObjectExample.impl.AIM_TmTc_StructImpl
		 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getAIM_TmTc_Struct()
		 * @generated
		 */
		EClass AIM_TM_TC_STRUCT = eINSTANCE.getAIM_TmTc_Struct();

		/**
		 * The meta object literal for the '<em><b>Set Mtq speed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AIM_TM_TC_STRUCT___SET_MTQ_SPEED = eINSTANCE.getAIM_TmTc_Struct__SetMtq_speed();

		/**
		 * The meta object literal for the '<em><b>Set Mtm value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AIM_TM_TC_STRUCT___SET_MTM_VALUE = eINSTANCE.getAIM_TmTc_Struct__SetMtm_value();

		/**
		 * The meta object literal for the '<em><b>Set Wheel 1speed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AIM_TM_TC_STRUCT___SET_WHEEL_1SPEED = eINSTANCE.getAIM_TmTc_Struct__SetWheel_1_speed();

		/**
		 * The meta object literal for the '<em><b>Set Wheel 2speed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AIM_TM_TC_STRUCT___SET_WHEEL_2SPEED = eINSTANCE.getAIM_TmTc_Struct__SetWheel_2_speed();

		/**
		 * The meta object literal for the '<em><b>Get Mtq speed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AIM_TM_TC_STRUCT___GET_MTQ_SPEED = eINSTANCE.getAIM_TmTc_Struct__GetMtq_speed();

		/**
		 * The meta object literal for the '<em><b>Get Mtm value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AIM_TM_TC_STRUCT___GET_MTM_VALUE = eINSTANCE.getAIM_TmTc_Struct__GetMtm_value();

		/**
		 * The meta object literal for the '<em><b>Get Wheel 1speed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AIM_TM_TC_STRUCT___GET_WHEEL_1SPEED = eINSTANCE.getAIM_TmTc_Struct__GetWheel_1_speed();

		/**
		 * The meta object literal for the '<em><b>Get Wheel 2speed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AIM_TM_TC_STRUCT___GET_WHEEL_2SPEED = eINSTANCE.getAIM_TmTc_Struct__GetWheel_2_speed();

		/**
		 * The meta object literal for the '{@link model.BasicActiveObjectExample.impl.AIM_TmTc_Struct_Activity6Impl <em>AIM Tm Tc Struct Activity6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BasicActiveObjectExample.impl.AIM_TmTc_Struct_Activity6Impl
		 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getAIM_TmTc_Struct_Activity6()
		 * @generated
		 */
		EClass AIM_TM_TC_STRUCT_ACTIVITY6 = eINSTANCE.getAIM_TmTc_Struct_Activity6();

		/**
		 * The meta object literal for the '{@link model.BasicActiveObjectExample.impl.StateThreadImpl <em>State Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BasicActiveObjectExample.impl.StateThreadImpl
		 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getStateThread()
		 * @generated
		 */
		EClass STATE_THREAD = eINSTANCE.getStateThread();

		/**
		 * The meta object literal for the '<em><b>Pipe Input Stream</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_THREAD__PIPE_INPUT_STREAM = eINSTANCE.getStateThread_PipeInputStream();

		/**
		 * The meta object literal for the '{@link model.BasicActiveObjectExample.impl.PowerThreadImpl <em>Power Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BasicActiveObjectExample.impl.PowerThreadImpl
		 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getPowerThread()
		 * @generated
		 */
		EClass POWER_THREAD = eINSTANCE.getPowerThread();

		/**
		 * The meta object literal for the '<em><b>Lock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_THREAD__LOCK = eINSTANCE.getPowerThread_Lock();

		/**
		 * The meta object literal for the '{@link model.BasicActiveObjectExample.impl.State_Machine_AOCSImpl <em>State Machine AOCS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BasicActiveObjectExample.impl.State_Machine_AOCSImpl
		 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getState_Machine_AOCS()
		 * @generated
		 */
		EClass STATE_MACHINE_AOCS = eINSTANCE.getState_Machine_AOCS();

		/**
		 * The meta object literal for the '<em><b>Powerthread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_AOCS__POWERTHREAD = eINSTANCE.getState_Machine_AOCS_Powerthread();

		/**
		 * The meta object literal for the '<em><b>Statethread</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE_AOCS__STATETHREAD = eINSTANCE.getState_Machine_AOCS_Statethread();

		/**
		 * The meta object literal for the '<em><b>Set AOCS Mode</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE_AOCS___SET_AOCS_MODE = eINSTANCE.getState_Machine_AOCS__SetAOCSMode();

		/**
		 * The meta object literal for the '{@link model.BasicActiveObjectExample.impl.AOCS_ModuleImpl <em>AOCS Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BasicActiveObjectExample.impl.AOCS_ModuleImpl
		 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getAOCS_Module()
		 * @generated
		 */
		EClass AOCS_MODULE = eINSTANCE.getAOCS_Module();

		/**
		 * The meta object literal for the '<em><b>Aim tmtc struct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AOCS_MODULE__AIM_TMTC_STRUCT = eINSTANCE.getAOCS_Module_Aim_tmtc_struct();

		/**
		 * The meta object literal for the '{@link model.BasicActiveObjectExample.CAN_TmTc_Struct <em>CAN Tm Tc Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BasicActiveObjectExample.CAN_TmTc_Struct
		 * @see model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl#getCAN_TmTc_Struct()
		 * @generated
		 */
		EClass CAN_TM_TC_STRUCT = eINSTANCE.getCAN_TmTc_Struct();

		/**
		 * The meta object literal for the '<em><b>Get Destination Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAN_TM_TC_STRUCT___GET_DESTINATION_ADDRESS = eINSTANCE.getCAN_TmTc_Struct__GetDestinationAddress();

		/**
		 * The meta object literal for the '<em><b>Get Source Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAN_TM_TC_STRUCT___GET_SOURCE_ADDRESS = eINSTANCE.getCAN_TmTc_Struct__GetSourceAddress();

		/**
		 * The meta object literal for the '<em><b>Set Destination Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAN_TM_TC_STRUCT___SET_DESTINATION_ADDRESS__INT = eINSTANCE.getCAN_TmTc_Struct__SetDestinationAddress__int();

		/**
		 * The meta object literal for the '<em><b>Set Source Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAN_TM_TC_STRUCT___SET_SOURCE_ADDRESS__INT = eINSTANCE.getCAN_TmTc_Struct__SetSourceAddress__int();

	}

} //BasicActiveObjectExamplePackage
