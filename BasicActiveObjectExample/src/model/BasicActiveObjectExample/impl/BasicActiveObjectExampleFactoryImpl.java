/**
 */
package model.BasicActiveObjectExample.impl;

import model.BasicActiveObjectExample.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicActiveObjectExampleFactoryImpl extends EFactoryImpl implements BasicActiveObjectExampleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicActiveObjectExampleFactory init() {
		try {
			BasicActiveObjectExampleFactory theBasicActiveObjectExampleFactory = (BasicActiveObjectExampleFactory)EPackage.Registry.INSTANCE.getEFactory(BasicActiveObjectExamplePackage.eNS_URI);
			if (theBasicActiveObjectExampleFactory != null) {
				return theBasicActiveObjectExampleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicActiveObjectExampleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActiveObjectExampleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BasicActiveObjectExamplePackage.INCREMENT: return createIncrement();
			case BasicActiveObjectExamplePackage.INCREMENT_INCREMENT_CLASSIFIER_BEHAVIOR: return createIncrement_IncrementClassifierBehavior();
			case BasicActiveObjectExamplePackage.INCREMENT_INCREMENT_METHOD: return createIncrement_incrementMethod();
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT: return createAIM_TmTc_Struct();
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT_ACTIVITY6: return createAIM_TmTc_Struct_Activity6();
			case BasicActiveObjectExamplePackage.STATE_THREAD: return createStateThread();
			case BasicActiveObjectExamplePackage.POWER_THREAD: return createPowerThread();
			case BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS: return createState_Machine_AOCS();
			case BasicActiveObjectExamplePackage.AOCS_MODULE: return createAOCS_Module();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment createIncrement() {
		IncrementImpl increment = new IncrementImpl();
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment_IncrementClassifierBehavior createIncrement_IncrementClassifierBehavior() {
		Increment_IncrementClassifierBehaviorImpl increment_IncrementClassifierBehavior = new Increment_IncrementClassifierBehaviorImpl();
		return increment_IncrementClassifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment_incrementMethod createIncrement_incrementMethod() {
		Increment_incrementMethodImpl increment_incrementMethod = new Increment_incrementMethodImpl();
		return increment_incrementMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIM_TmTc_Struct createAIM_TmTc_Struct() {
		AIM_TmTc_StructImpl aiM_TmTc_Struct = new AIM_TmTc_StructImpl();
		return aiM_TmTc_Struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIM_TmTc_Struct_Activity6 createAIM_TmTc_Struct_Activity6() {
		AIM_TmTc_Struct_Activity6Impl aiM_TmTc_Struct_Activity6 = new AIM_TmTc_Struct_Activity6Impl();
		return aiM_TmTc_Struct_Activity6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateThread createStateThread() {
		StateThreadImpl stateThread = new StateThreadImpl();
		return stateThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerThread createPowerThread() {
		PowerThreadImpl powerThread = new PowerThreadImpl();
		return powerThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State_Machine_AOCS createState_Machine_AOCS() {
		State_Machine_AOCSImpl state_Machine_AOCS = new State_Machine_AOCSImpl();
		return state_Machine_AOCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AOCS_Module createAOCS_Module() {
		AOCS_ModuleImpl aocS_Module = new AOCS_ModuleImpl();
		return aocS_Module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActiveObjectExamplePackage getBasicActiveObjectExamplePackage() {
		return (BasicActiveObjectExamplePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicActiveObjectExamplePackage getPackage() {
		return BasicActiveObjectExamplePackage.eINSTANCE;
	}

} //BasicActiveObjectExampleFactoryImpl
