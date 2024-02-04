/**
 */
package model.BasicActiveObjectExample.util;

import model.BasicActiveObjectExample.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage
 * @generated
 */
public class BasicActiveObjectExampleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicActiveObjectExamplePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicActiveObjectExampleSwitch() {
		if (modelPackage == null) {
			modelPackage = BasicActiveObjectExamplePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BasicActiveObjectExamplePackage.INCREMENT: {
				Increment increment = (Increment)theEObject;
				T result = caseIncrement(increment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActiveObjectExamplePackage.INCREMENT_INCREMENT_CLASSIFIER_BEHAVIOR: {
				Increment_IncrementClassifierBehavior increment_IncrementClassifierBehavior = (Increment_IncrementClassifierBehavior)theEObject;
				T result = caseIncrement_IncrementClassifierBehavior(increment_IncrementClassifierBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActiveObjectExamplePackage.INCREMENT_INCREMENT_METHOD: {
				Increment_incrementMethod increment_incrementMethod = (Increment_incrementMethod)theEObject;
				T result = caseIncrement_incrementMethod(increment_incrementMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT: {
				AIM_TmTc_Struct aiM_TmTc_Struct = (AIM_TmTc_Struct)theEObject;
				T result = caseAIM_TmTc_Struct(aiM_TmTc_Struct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT_ACTIVITY6: {
				AIM_TmTc_Struct_Activity6 aiM_TmTc_Struct_Activity6 = (AIM_TmTc_Struct_Activity6)theEObject;
				T result = caseAIM_TmTc_Struct_Activity6(aiM_TmTc_Struct_Activity6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActiveObjectExamplePackage.STATE_THREAD: {
				StateThread stateThread = (StateThread)theEObject;
				T result = caseStateThread(stateThread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActiveObjectExamplePackage.POWER_THREAD: {
				PowerThread powerThread = (PowerThread)theEObject;
				T result = casePowerThread(powerThread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS: {
				State_Machine_AOCS state_Machine_AOCS = (State_Machine_AOCS)theEObject;
				T result = caseState_Machine_AOCS(state_Machine_AOCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActiveObjectExamplePackage.AOCS_MODULE: {
				AOCS_Module aocS_Module = (AOCS_Module)theEObject;
				T result = caseAOCS_Module(aocS_Module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicActiveObjectExamplePackage.CAN_TM_TC_STRUCT: {
				CAN_TmTc_Struct caN_TmTc_Struct = (CAN_TmTc_Struct)theEObject;
				T result = caseCAN_TmTc_Struct(caN_TmTc_Struct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Increment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Increment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrement(Increment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Increment Increment Classifier Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Increment Increment Classifier Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrement_IncrementClassifierBehavior(Increment_IncrementClassifierBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Increment increment Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Increment increment Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrement_incrementMethod(Increment_incrementMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AIM Tm Tc Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AIM Tm Tc Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIM_TmTc_Struct(AIM_TmTc_Struct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AIM Tm Tc Struct Activity6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AIM Tm Tc Struct Activity6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAIM_TmTc_Struct_Activity6(AIM_TmTc_Struct_Activity6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateThread(StateThread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerThread(PowerThread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine AOCS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine AOCS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState_Machine_AOCS(State_Machine_AOCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AOCS Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AOCS Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAOCS_Module(AOCS_Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAN Tm Tc Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAN Tm Tc Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAN_TmTc_Struct(CAN_TmTc_Struct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BasicActiveObjectExampleSwitch
