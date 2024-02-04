/**
 */
package model.BasicActiveObjectExample;

import java.util.concurrent.Semaphore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.BasicActiveObjectExample.PowerThread#getLock <em>Lock</em>}</li>
 * </ul>
 *
 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage#getPowerThread()
 * @model
 * @generated
 */
public interface PowerThread extends EObject {
	/**
	 * Returns the value of the '<em><b>Lock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock</em>' reference.
	 * @see #setLock(Semaphore)
	 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage#getPowerThread_Lock()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Semaphore getLock();

	/**
	 * Sets the value of the '{@link model.BasicActiveObjectExample.PowerThread#getLock <em>Lock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock</em>' reference.
	 * @see #getLock()
	 * @generated
	 */
	void setLock(Semaphore value);

} // PowerThread
