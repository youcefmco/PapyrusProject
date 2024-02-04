/**
 */
package model.BasicActiveObjectExample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAN Tm Tc Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage#getCAN_TmTc_Struct()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CAN_TmTc_Struct extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	int getDestinationAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * println
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSourceAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model addressRequired="true" addressOrdered="false"
	 * @generated
	 */
	void setDestinationAddress(int address);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model addressRequired="true" addressOrdered="false"
	 * @generated
	 */
	void setSourceAddress(int address);

} // CAN_TmTc_Struct
