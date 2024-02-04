/**
 */
package model.BasicActiveObjectExample.impl;

import java.util.concurrent.Semaphore;

import model.BasicActiveObjectExample.BasicActiveObjectExamplePackage;
import model.BasicActiveObjectExample.PowerThread;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.BasicActiveObjectExample.impl.PowerThreadImpl#getLock <em>Lock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerThreadImpl extends MinimalEObjectImpl.Container implements PowerThread {
	/**
	 * The cached value of the '{@link #getLock() <em>Lock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLock()
	 * @generated
	 * @ordered
	 */
	protected Semaphore lock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActiveObjectExamplePackage.Literals.POWER_THREAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore getLock() {
		if (lock != null && lock.eIsProxy()) {
			InternalEObject oldLock = (InternalEObject)lock;
			lock = (Semaphore)eResolveProxy(oldLock);
			if (lock != oldLock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicActiveObjectExamplePackage.POWER_THREAD__LOCK, oldLock, lock));
			}
		}
		return lock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore basicGetLock() {
		return lock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLock(Semaphore newLock) {
		Semaphore oldLock = lock;
		lock = newLock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActiveObjectExamplePackage.POWER_THREAD__LOCK, oldLock, lock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicActiveObjectExamplePackage.POWER_THREAD__LOCK:
				if (resolve) return getLock();
				return basicGetLock();
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
			case BasicActiveObjectExamplePackage.POWER_THREAD__LOCK:
				setLock((Semaphore)newValue);
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
			case BasicActiveObjectExamplePackage.POWER_THREAD__LOCK:
				setLock((Semaphore)null);
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
			case BasicActiveObjectExamplePackage.POWER_THREAD__LOCK:
				return lock != null;
		}
		return super.eIsSet(featureID);
	}

} //PowerThreadImpl
