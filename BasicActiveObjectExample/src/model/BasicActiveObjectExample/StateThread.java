/**
 */
package model.BasicActiveObjectExample;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.BasicActiveObjectExample.StateThread#getPipeInputStream <em>Pipe Input Stream</em>}</li>
 * </ul>
 *
 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage#getStateThread()
 * @model
 * @generated
 */
public interface StateThread extends EObject {
	/**
	 * Returns the value of the '<em><b>Pipe Input Stream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipe Input Stream</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipe Input Stream</em>' reference.
	 * @see #setPipeInputStream(List)
	 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage#getStateThread_PipeInputStream()
	 * @model required="true" many="false" ordered="false"
	 * @generated
	 */
	List getPipeInputStream();

	/**
	 * Sets the value of the '{@link model.BasicActiveObjectExample.StateThread#getPipeInputStream <em>Pipe Input Stream</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pipe Input Stream</em>' reference.
	 * @see #getPipeInputStream()
	 * @generated
	 */
	void setPipeInputStream(List value);

} // StateThread
