/**
 */
package model.BasicActiveObjectExample.impl;

import java.lang.reflect.InvocationTargetException;

import model.BasicActiveObjectExample.BasicActiveObjectExamplePackage;
import model.BasicActiveObjectExample.PowerThread;
import model.BasicActiveObjectExample.StateThread;
import model.BasicActiveObjectExample.State_Machine_AOCS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine AOCS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.BasicActiveObjectExample.impl.State_Machine_AOCSImpl#getPowerthread <em>Powerthread</em>}</li>
 *   <li>{@link model.BasicActiveObjectExample.impl.State_Machine_AOCSImpl#getStatethread <em>Statethread</em>}</li>
 * </ul>
 *
 * @generated
 */
public class State_Machine_AOCSImpl extends MinimalEObjectImpl.Container implements State_Machine_AOCS {
	/**
	 * The cached value of the '{@link #getPowerthread() <em>Powerthread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerthread()
	 * @generated
	 * @ordered
	 */
	protected PowerThread powerthread;

	/**
	 * The cached value of the '{@link #getStatethread() <em>Statethread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatethread()
	 * @generated
	 * @ordered
	 */
	protected StateThread statethread;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State_Machine_AOCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActiveObjectExamplePackage.Literals.STATE_MACHINE_AOCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerThread getPowerthread() {
		if (powerthread != null && powerthread.eIsProxy()) {
			InternalEObject oldPowerthread = (InternalEObject)powerthread;
			powerthread = (PowerThread)eResolveProxy(oldPowerthread);
			if (powerthread != oldPowerthread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__POWERTHREAD, oldPowerthread, powerthread));
			}
		}
		return powerthread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerThread basicGetPowerthread() {
		return powerthread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerthread(PowerThread newPowerthread) {
		PowerThread oldPowerthread = powerthread;
		powerthread = newPowerthread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__POWERTHREAD, oldPowerthread, powerthread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateThread getStatethread() {
		if (statethread != null && statethread.eIsProxy()) {
			InternalEObject oldStatethread = (InternalEObject)statethread;
			statethread = (StateThread)eResolveProxy(oldStatethread);
			if (statethread != oldStatethread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__STATETHREAD, oldStatethread, statethread));
			}
		}
		return statethread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateThread basicGetStatethread() {
		return statethread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatethread(StateThread newStatethread) {
		StateThread oldStatethread = statethread;
		statethread = newStatethread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__STATETHREAD, oldStatethread, statethread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAOCSMode() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__POWERTHREAD:
				if (resolve) return getPowerthread();
				return basicGetPowerthread();
			case BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__STATETHREAD:
				if (resolve) return getStatethread();
				return basicGetStatethread();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__POWERTHREAD:
				setPowerthread((PowerThread)newValue);
				return;
			case BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__STATETHREAD:
				setStatethread((StateThread)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__POWERTHREAD:
				setPowerthread((PowerThread)null);
				return;
			case BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__STATETHREAD:
				setStatethread((StateThread)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__POWERTHREAD:
				return powerthread != null;
			case BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS__STATETHREAD:
				return statethread != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BasicActiveObjectExamplePackage.STATE_MACHINE_AOCS___SET_AOCS_MODE:
				setAOCSMode();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //State_Machine_AOCSImpl
