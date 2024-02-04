/**
 */
package model.BasicActiveObjectExample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine AOCS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.BasicActiveObjectExample.State_Machine_AOCS#getPowerthread <em>Powerthread</em>}</li>
 *   <li>{@link model.BasicActiveObjectExample.State_Machine_AOCS#getStatethread <em>Statethread</em>}</li>
 * </ul>
 *
 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage#getState_Machine_AOCS()
 * @model
 * @generated
 */
public interface State_Machine_AOCS extends EObject {
	/**
	 * Returns the value of the '<em><b>Powerthread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Powerthread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Powerthread</em>' reference.
	 * @see #setPowerthread(PowerThread)
	 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage#getState_Machine_AOCS_Powerthread()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PowerThread getPowerthread();

	/**
	 * Sets the value of the '{@link model.BasicActiveObjectExample.State_Machine_AOCS#getPowerthread <em>Powerthread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powerthread</em>' reference.
	 * @see #getPowerthread()
	 * @generated
	 */
	void setPowerthread(PowerThread value);

	/**
	 * Returns the value of the '<em><b>Statethread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statethread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statethread</em>' reference.
	 * @see #setStatethread(StateThread)
	 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage#getState_Machine_AOCS_Statethread()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StateThread getStatethread();

	/**
	 * Sets the value of the '{@link model.BasicActiveObjectExample.State_Machine_AOCS#getStatethread <em>Statethread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statethread</em>' reference.
	 * @see #getStatethread()
	 * @generated
	 */
	void setStatethread(StateThread value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setAOCSMode();

} // State_Machine_AOCS
