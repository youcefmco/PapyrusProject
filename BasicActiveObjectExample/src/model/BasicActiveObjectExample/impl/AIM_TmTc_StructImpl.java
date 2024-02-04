/**
 */
package model.BasicActiveObjectExample.impl;

import java.lang.reflect.InvocationTargetException;

import model.BasicActiveObjectExample.AIM_TmTc_Struct;
import model.BasicActiveObjectExample.BasicActiveObjectExamplePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AIM Tm Tc Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AIM_TmTc_StructImpl extends MinimalEObjectImpl.Container implements AIM_TmTc_Struct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIM_TmTc_StructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActiveObjectExamplePackage.Literals.AIM_TM_TC_STRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMtq_speed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMtm_value() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWheel_1_speed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWheel_2_speed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMtq_speed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMtm_value() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWheel_1_speed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWheel_2_speed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT___SET_MTQ_SPEED:
				setMtq_speed();
				return null;
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT___SET_MTM_VALUE:
				setMtm_value();
				return null;
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT___SET_WHEEL_1SPEED:
				setWheel_1_speed();
				return null;
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT___SET_WHEEL_2SPEED:
				setWheel_2_speed();
				return null;
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT___GET_MTQ_SPEED:
				return getMtq_speed();
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT___GET_MTM_VALUE:
				return getMtm_value();
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT___GET_WHEEL_1SPEED:
				return getWheel_1_speed();
			case BasicActiveObjectExamplePackage.AIM_TM_TC_STRUCT___GET_WHEEL_2SPEED:
				return getWheel_2_speed();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AIM_TmTc_StructImpl
