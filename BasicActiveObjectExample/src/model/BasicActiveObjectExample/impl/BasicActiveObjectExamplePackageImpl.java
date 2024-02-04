/**
 */
package model.BasicActiveObjectExample.impl;

import java.JavaPackage;

import java.impl.JavaPackageImpl;

import java.lang.LangPackage;

import java.lang.impl.LangPackageImpl;

import java.util.UtilPackage;

import java.util.concurrent.ConcurrentPackage;

import java.util.concurrent.impl.ConcurrentPackageImpl;

import java.util.impl.UtilPackageImpl;

import model.BasicActiveObjectExample.AIM_TmTc_Struct;
import model.BasicActiveObjectExample.AIM_TmTc_Struct_Activity6;
import model.BasicActiveObjectExample.AOCS_Module;
import model.BasicActiveObjectExample.BasicActiveObjectExampleFactory;
import model.BasicActiveObjectExample.BasicActiveObjectExamplePackage;
import model.BasicActiveObjectExample.CAN_TmTc_Struct;
import model.BasicActiveObjectExample.Increment;
import model.BasicActiveObjectExample.Increment_IncrementClassifierBehavior;
import model.BasicActiveObjectExample.Increment_incrementMethod;
import model.BasicActiveObjectExample.PowerThread;
import model.BasicActiveObjectExample.StateThread;
import model.BasicActiveObjectExample.State_Machine_AOCS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicActiveObjectExamplePackageImpl extends EPackageImpl implements BasicActiveObjectExamplePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incrementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass increment_IncrementClassifierBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass increment_incrementMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiM_TmTc_StructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiM_TmTc_Struct_Activity6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateThreadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerThreadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass state_Machine_AOCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aocS_ModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caN_TmTc_StructEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicActiveObjectExamplePackageImpl() {
		super(eNS_URI, BasicActiveObjectExampleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BasicActiveObjectExamplePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicActiveObjectExamplePackage init() {
		if (isInited) return (BasicActiveObjectExamplePackage)EPackage.Registry.INSTANCE.getEPackage(BasicActiveObjectExamplePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasicActiveObjectExamplePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasicActiveObjectExamplePackageImpl theBasicActiveObjectExamplePackage = registeredBasicActiveObjectExamplePackage instanceof BasicActiveObjectExamplePackageImpl ? (BasicActiveObjectExamplePackageImpl)registeredBasicActiveObjectExamplePackage : new BasicActiveObjectExamplePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(registeredPackage instanceof JavaPackageImpl ? registeredPackage : JavaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		LangPackageImpl theLangPackage = (LangPackageImpl)(registeredPackage instanceof LangPackageImpl ? registeredPackage : LangPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(registeredPackage instanceof UtilPackageImpl ? registeredPackage : UtilPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConcurrentPackage.eNS_URI);
		ConcurrentPackageImpl theConcurrentPackage = (ConcurrentPackageImpl)(registeredPackage instanceof ConcurrentPackageImpl ? registeredPackage : ConcurrentPackage.eINSTANCE);

		// Create package meta-data objects
		theBasicActiveObjectExamplePackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theConcurrentPackage.createPackageContents();

		// Initialize created meta-data
		theBasicActiveObjectExamplePackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theConcurrentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicActiveObjectExamplePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicActiveObjectExamplePackage.eNS_URI, theBasicActiveObjectExamplePackage);
		return theBasicActiveObjectExamplePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncrement() {
		return incrementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncrement_Counter() {
		return (EAttribute)incrementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIncrement__Increment() {
		return incrementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncrement_IncrementClassifierBehavior() {
		return increment_IncrementClassifierBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncrement_incrementMethod() {
		return increment_incrementMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAIM_TmTc_Struct() {
		return aiM_TmTc_StructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIM_TmTc_Struct__SetMtq_speed() {
		return aiM_TmTc_StructEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIM_TmTc_Struct__SetMtm_value() {
		return aiM_TmTc_StructEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIM_TmTc_Struct__SetWheel_1_speed() {
		return aiM_TmTc_StructEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIM_TmTc_Struct__SetWheel_2_speed() {
		return aiM_TmTc_StructEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIM_TmTc_Struct__GetMtq_speed() {
		return aiM_TmTc_StructEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIM_TmTc_Struct__GetMtm_value() {
		return aiM_TmTc_StructEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIM_TmTc_Struct__GetWheel_1_speed() {
		return aiM_TmTc_StructEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIM_TmTc_Struct__GetWheel_2_speed() {
		return aiM_TmTc_StructEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAIM_TmTc_Struct_Activity6() {
		return aiM_TmTc_Struct_Activity6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateThread() {
		return stateThreadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateThread_PipeInputStream() {
		return (EReference)stateThreadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerThread() {
		return powerThreadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerThread_Lock() {
		return (EReference)powerThreadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState_Machine_AOCS() {
		return state_Machine_AOCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Machine_AOCS_Powerthread() {
		return (EReference)state_Machine_AOCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Machine_AOCS_Statethread() {
		return (EReference)state_Machine_AOCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState_Machine_AOCS__SetAOCSMode() {
		return state_Machine_AOCSEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAOCS_Module() {
		return aocS_ModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAOCS_Module_Aim_tmtc_struct() {
		return (EReference)aocS_ModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAN_TmTc_Struct() {
		return caN_TmTc_StructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCAN_TmTc_Struct__GetDestinationAddress() {
		return caN_TmTc_StructEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCAN_TmTc_Struct__GetSourceAddress() {
		return caN_TmTc_StructEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCAN_TmTc_Struct__SetDestinationAddress__int() {
		return caN_TmTc_StructEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCAN_TmTc_Struct__SetSourceAddress__int() {
		return caN_TmTc_StructEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActiveObjectExampleFactory getBasicActiveObjectExampleFactory() {
		return (BasicActiveObjectExampleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		incrementEClass = createEClass(INCREMENT);
		createEAttribute(incrementEClass, INCREMENT__COUNTER);
		createEOperation(incrementEClass, INCREMENT___INCREMENT);

		increment_IncrementClassifierBehaviorEClass = createEClass(INCREMENT_INCREMENT_CLASSIFIER_BEHAVIOR);

		increment_incrementMethodEClass = createEClass(INCREMENT_INCREMENT_METHOD);

		aiM_TmTc_StructEClass = createEClass(AIM_TM_TC_STRUCT);
		createEOperation(aiM_TmTc_StructEClass, AIM_TM_TC_STRUCT___SET_MTQ_SPEED);
		createEOperation(aiM_TmTc_StructEClass, AIM_TM_TC_STRUCT___SET_MTM_VALUE);
		createEOperation(aiM_TmTc_StructEClass, AIM_TM_TC_STRUCT___SET_WHEEL_1SPEED);
		createEOperation(aiM_TmTc_StructEClass, AIM_TM_TC_STRUCT___SET_WHEEL_2SPEED);
		createEOperation(aiM_TmTc_StructEClass, AIM_TM_TC_STRUCT___GET_MTQ_SPEED);
		createEOperation(aiM_TmTc_StructEClass, AIM_TM_TC_STRUCT___GET_MTM_VALUE);
		createEOperation(aiM_TmTc_StructEClass, AIM_TM_TC_STRUCT___GET_WHEEL_1SPEED);
		createEOperation(aiM_TmTc_StructEClass, AIM_TM_TC_STRUCT___GET_WHEEL_2SPEED);

		aiM_TmTc_Struct_Activity6EClass = createEClass(AIM_TM_TC_STRUCT_ACTIVITY6);

		stateThreadEClass = createEClass(STATE_THREAD);
		createEReference(stateThreadEClass, STATE_THREAD__PIPE_INPUT_STREAM);

		powerThreadEClass = createEClass(POWER_THREAD);
		createEReference(powerThreadEClass, POWER_THREAD__LOCK);

		state_Machine_AOCSEClass = createEClass(STATE_MACHINE_AOCS);
		createEReference(state_Machine_AOCSEClass, STATE_MACHINE_AOCS__POWERTHREAD);
		createEReference(state_Machine_AOCSEClass, STATE_MACHINE_AOCS__STATETHREAD);
		createEOperation(state_Machine_AOCSEClass, STATE_MACHINE_AOCS___SET_AOCS_MODE);

		aocS_ModuleEClass = createEClass(AOCS_MODULE);
		createEReference(aocS_ModuleEClass, AOCS_MODULE__AIM_TMTC_STRUCT);

		caN_TmTc_StructEClass = createEClass(CAN_TM_TC_STRUCT);
		createEOperation(caN_TmTc_StructEClass, CAN_TM_TC_STRUCT___GET_DESTINATION_ADDRESS);
		createEOperation(caN_TmTc_StructEClass, CAN_TM_TC_STRUCT___GET_SOURCE_ADDRESS);
		createEOperation(caN_TmTc_StructEClass, CAN_TM_TC_STRUCT___SET_DESTINATION_ADDRESS__INT);
		createEOperation(caN_TmTc_StructEClass, CAN_TM_TC_STRUCT___SET_SOURCE_ADDRESS__INT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		ConcurrentPackage theConcurrentPackage = (ConcurrentPackage)EPackage.Registry.INSTANCE.getEPackage(ConcurrentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(incrementEClass, Increment.class, "Increment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncrement_Counter(), theTypesPackage.getInteger(), "counter", null, 1, 1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getIncrement__Increment(), null, "increment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(increment_IncrementClassifierBehaviorEClass, Increment_IncrementClassifierBehavior.class, "Increment_IncrementClassifierBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(increment_incrementMethodEClass, Increment_incrementMethod.class, "Increment_incrementMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aiM_TmTc_StructEClass, AIM_TmTc_Struct.class, "AIM_TmTc_Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAIM_TmTc_Struct__SetMtq_speed(), null, "setMtq_speed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAIM_TmTc_Struct__SetMtm_value(), null, "setMtm_value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAIM_TmTc_Struct__SetWheel_1_speed(), null, "setWheel_1_speed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAIM_TmTc_Struct__SetWheel_2_speed(), null, "setWheel_2_speed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAIM_TmTc_Struct__GetMtq_speed(), ecorePackage.getEInt(), "getMtq_speed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAIM_TmTc_Struct__GetMtm_value(), ecorePackage.getEInt(), "getMtm_value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAIM_TmTc_Struct__GetWheel_1_speed(), ecorePackage.getEInt(), "getWheel_1_speed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAIM_TmTc_Struct__GetWheel_2_speed(), ecorePackage.getEInt(), "getWheel_2_speed", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(aiM_TmTc_Struct_Activity6EClass, AIM_TmTc_Struct_Activity6.class, "AIM_TmTc_Struct_Activity6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateThreadEClass, StateThread.class, "StateThread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateThread_PipeInputStream(), theUtilPackage.getList(), null, "pipeInputStream", null, 1, 1, StateThread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(powerThreadEClass, PowerThread.class, "PowerThread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerThread_Lock(), theConcurrentPackage.getSemaphore(), null, "lock", null, 1, 1, PowerThread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(state_Machine_AOCSEClass, State_Machine_AOCS.class, "State_Machine_AOCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Machine_AOCS_Powerthread(), this.getPowerThread(), null, "powerthread", null, 1, 1, State_Machine_AOCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Machine_AOCS_Statethread(), this.getStateThread(), null, "statethread", null, 1, 1, State_Machine_AOCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getState_Machine_AOCS__SetAOCSMode(), null, "setAOCSMode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(aocS_ModuleEClass, AOCS_Module.class, "AOCS_Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAOCS_Module_Aim_tmtc_struct(), this.getAIM_TmTc_Struct(), null, "aim_tmtc_struct", null, 1, -1, AOCS_Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(caN_TmTc_StructEClass, CAN_TmTc_Struct.class, "CAN_TmTc_Struct", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCAN_TmTc_Struct__GetDestinationAddress(), ecorePackage.getEInt(), "getDestinationAddress", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCAN_TmTc_Struct__GetSourceAddress(), theTypesPackage.getInteger(), "getSourceAddress", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getCAN_TmTc_Struct__SetDestinationAddress__int(), null, "setDestinationAddress", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "address", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCAN_TmTc_Struct__SetSourceAddress__int(), null, "setSourceAddress", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "address", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (increment_IncrementClassifierBehaviorEClass,
		   source,
		   new String[] {
			   "originalName", "IncrementClassifierBehavior"
		   });
		addAnnotation
		  (increment_incrementMethodEClass,
		   source,
		   new String[] {
			   "originalName", "incrementMethod"
		   });
		addAnnotation
		  (aiM_TmTc_Struct_Activity6EClass,
		   source,
		   new String[] {
			   "originalName", "Activity6"
		   });
	}

} //BasicActiveObjectExamplePackageImpl
