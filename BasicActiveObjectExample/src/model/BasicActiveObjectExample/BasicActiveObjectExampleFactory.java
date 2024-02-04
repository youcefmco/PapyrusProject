/**
 */
package model.BasicActiveObjectExample;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage
 * @generated
 */
public interface BasicActiveObjectExampleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicActiveObjectExampleFactory eINSTANCE = model.BasicActiveObjectExample.impl.BasicActiveObjectExampleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Increment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Increment</em>'.
	 * @generated
	 */
	Increment createIncrement();

	/**
	 * Returns a new object of class '<em>Increment Increment Classifier Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Increment Increment Classifier Behavior</em>'.
	 * @generated
	 */
	Increment_IncrementClassifierBehavior createIncrement_IncrementClassifierBehavior();

	/**
	 * Returns a new object of class '<em>Increment increment Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Increment increment Method</em>'.
	 * @generated
	 */
	Increment_incrementMethod createIncrement_incrementMethod();

	/**
	 * Returns a new object of class '<em>AIM Tm Tc Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AIM Tm Tc Struct</em>'.
	 * @generated
	 */
	AIM_TmTc_Struct createAIM_TmTc_Struct();

	/**
	 * Returns a new object of class '<em>AIM Tm Tc Struct Activity6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AIM Tm Tc Struct Activity6</em>'.
	 * @generated
	 */
	AIM_TmTc_Struct_Activity6 createAIM_TmTc_Struct_Activity6();

	/**
	 * Returns a new object of class '<em>State Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Thread</em>'.
	 * @generated
	 */
	StateThread createStateThread();

	/**
	 * Returns a new object of class '<em>Power Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Thread</em>'.
	 * @generated
	 */
	PowerThread createPowerThread();

	/**
	 * Returns a new object of class '<em>State Machine AOCS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Machine AOCS</em>'.
	 * @generated
	 */
	State_Machine_AOCS createState_Machine_AOCS();

	/**
	 * Returns a new object of class '<em>AOCS Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AOCS Module</em>'.
	 * @generated
	 */
	AOCS_Module createAOCS_Module();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicActiveObjectExamplePackage getBasicActiveObjectExamplePackage();

} //BasicActiveObjectExampleFactory
