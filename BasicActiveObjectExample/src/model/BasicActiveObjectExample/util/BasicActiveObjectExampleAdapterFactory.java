/**
 */
package model.BasicActiveObjectExample.util;

import model.BasicActiveObjectExample.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage
 * @generated
 */
public class BasicActiveObjectExampleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicActiveObjectExamplePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActiveObjectExampleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasicActiveObjectExamplePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicActiveObjectExampleSwitch<Adapter> modelSwitch =
		new BasicActiveObjectExampleSwitch<Adapter>() {
			@Override
			public Adapter caseIncrement(Increment object) {
				return createIncrementAdapter();
			}
			@Override
			public Adapter caseIncrement_IncrementClassifierBehavior(Increment_IncrementClassifierBehavior object) {
				return createIncrement_IncrementClassifierBehaviorAdapter();
			}
			@Override
			public Adapter caseIncrement_incrementMethod(Increment_incrementMethod object) {
				return createIncrement_incrementMethodAdapter();
			}
			@Override
			public Adapter caseAIM_TmTc_Struct(AIM_TmTc_Struct object) {
				return createAIM_TmTc_StructAdapter();
			}
			@Override
			public Adapter caseAIM_TmTc_Struct_Activity6(AIM_TmTc_Struct_Activity6 object) {
				return createAIM_TmTc_Struct_Activity6Adapter();
			}
			@Override
			public Adapter caseStateThread(StateThread object) {
				return createStateThreadAdapter();
			}
			@Override
			public Adapter casePowerThread(PowerThread object) {
				return createPowerThreadAdapter();
			}
			@Override
			public Adapter caseState_Machine_AOCS(State_Machine_AOCS object) {
				return createState_Machine_AOCSAdapter();
			}
			@Override
			public Adapter caseAOCS_Module(AOCS_Module object) {
				return createAOCS_ModuleAdapter();
			}
			@Override
			public Adapter caseCAN_TmTc_Struct(CAN_TmTc_Struct object) {
				return createCAN_TmTc_StructAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link model.BasicActiveObjectExample.Increment <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BasicActiveObjectExample.Increment
	 * @generated
	 */
	public Adapter createIncrementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BasicActiveObjectExample.Increment_IncrementClassifierBehavior <em>Increment Increment Classifier Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BasicActiveObjectExample.Increment_IncrementClassifierBehavior
	 * @generated
	 */
	public Adapter createIncrement_IncrementClassifierBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BasicActiveObjectExample.Increment_incrementMethod <em>Increment increment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BasicActiveObjectExample.Increment_incrementMethod
	 * @generated
	 */
	public Adapter createIncrement_incrementMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct <em>AIM Tm Tc Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct
	 * @generated
	 */
	public Adapter createAIM_TmTc_StructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BasicActiveObjectExample.AIM_TmTc_Struct_Activity6 <em>AIM Tm Tc Struct Activity6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BasicActiveObjectExample.AIM_TmTc_Struct_Activity6
	 * @generated
	 */
	public Adapter createAIM_TmTc_Struct_Activity6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BasicActiveObjectExample.StateThread <em>State Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BasicActiveObjectExample.StateThread
	 * @generated
	 */
	public Adapter createStateThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BasicActiveObjectExample.PowerThread <em>Power Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BasicActiveObjectExample.PowerThread
	 * @generated
	 */
	public Adapter createPowerThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BasicActiveObjectExample.State_Machine_AOCS <em>State Machine AOCS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BasicActiveObjectExample.State_Machine_AOCS
	 * @generated
	 */
	public Adapter createState_Machine_AOCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BasicActiveObjectExample.AOCS_Module <em>AOCS Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BasicActiveObjectExample.AOCS_Module
	 * @generated
	 */
	public Adapter createAOCS_ModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BasicActiveObjectExample.CAN_TmTc_Struct <em>CAN Tm Tc Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BasicActiveObjectExample.CAN_TmTc_Struct
	 * @generated
	 */
	public Adapter createCAN_TmTc_StructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BasicActiveObjectExampleAdapterFactory
