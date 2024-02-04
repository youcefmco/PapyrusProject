/**
 */
package model.BasicActiveObjectExample.impl;

import java.util.Collection;

import model.BasicActiveObjectExample.AIM_TmTc_Struct;
import model.BasicActiveObjectExample.AOCS_Module;
import model.BasicActiveObjectExample.BasicActiveObjectExamplePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AOCS Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.BasicActiveObjectExample.impl.AOCS_ModuleImpl#getAim_tmtc_struct <em>Aim tmtc struct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AOCS_ModuleImpl extends MinimalEObjectImpl.Container implements AOCS_Module {
	/**
	 * The cached value of the '{@link #getAim_tmtc_struct() <em>Aim tmtc struct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAim_tmtc_struct()
	 * @generated
	 * @ordered
	 */
	protected EList<AIM_TmTc_Struct> aim_tmtc_struct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AOCS_ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActiveObjectExamplePackage.Literals.AOCS_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AIM_TmTc_Struct> getAim_tmtc_struct() {
		if (aim_tmtc_struct == null) {
			aim_tmtc_struct = new EObjectResolvingEList<AIM_TmTc_Struct>(AIM_TmTc_Struct.class, this, BasicActiveObjectExamplePackage.AOCS_MODULE__AIM_TMTC_STRUCT);
		}
		return aim_tmtc_struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicActiveObjectExamplePackage.AOCS_MODULE__AIM_TMTC_STRUCT:
				return getAim_tmtc_struct();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicActiveObjectExamplePackage.AOCS_MODULE__AIM_TMTC_STRUCT:
				getAim_tmtc_struct().clear();
				getAim_tmtc_struct().addAll((Collection<? extends AIM_TmTc_Struct>)newValue);
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
			case BasicActiveObjectExamplePackage.AOCS_MODULE__AIM_TMTC_STRUCT:
				getAim_tmtc_struct().clear();
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
			case BasicActiveObjectExamplePackage.AOCS_MODULE__AIM_TMTC_STRUCT:
				return aim_tmtc_struct != null && !aim_tmtc_struct.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AOCS_ModuleImpl
