/**
 */
package model.BasicActiveObjectExample.impl;

import java.util.List;

import model.BasicActiveObjectExample.BasicActiveObjectExamplePackage;
import model.BasicActiveObjectExample.StateThread;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.BasicActiveObjectExample.impl.StateThreadImpl#getPipeInputStream <em>Pipe Input Stream</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateThreadImpl extends MinimalEObjectImpl.Container implements StateThread {
	/**
	 * The cached value of the '{@link #getPipeInputStream() <em>Pipe Input Stream</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipeInputStream()
	 * @generated
	 * @ordered
	 */
	protected List pipeInputStream;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActiveObjectExamplePackage.Literals.STATE_THREAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPipeInputStream() {
		if (pipeInputStream != null && pipeInputStream.eIsProxy()) {
			InternalEObject oldPipeInputStream = (InternalEObject)pipeInputStream;
			pipeInputStream = (List)eResolveProxy(oldPipeInputStream);
			if (pipeInputStream != oldPipeInputStream) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicActiveObjectExamplePackage.STATE_THREAD__PIPE_INPUT_STREAM, oldPipeInputStream, pipeInputStream));
			}
		}
		return pipeInputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List basicGetPipeInputStream() {
		return pipeInputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPipeInputStream(List newPipeInputStream) {
		List oldPipeInputStream = pipeInputStream;
		pipeInputStream = newPipeInputStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActiveObjectExamplePackage.STATE_THREAD__PIPE_INPUT_STREAM, oldPipeInputStream, pipeInputStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicActiveObjectExamplePackage.STATE_THREAD__PIPE_INPUT_STREAM:
				if (resolve) return getPipeInputStream();
				return basicGetPipeInputStream();
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
			case BasicActiveObjectExamplePackage.STATE_THREAD__PIPE_INPUT_STREAM:
				setPipeInputStream((List)newValue);
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
			case BasicActiveObjectExamplePackage.STATE_THREAD__PIPE_INPUT_STREAM:
				setPipeInputStream((List)null);
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
			case BasicActiveObjectExamplePackage.STATE_THREAD__PIPE_INPUT_STREAM:
				return pipeInputStream != null;
		}
		return super.eIsSet(featureID);
	}

} //StateThreadImpl
