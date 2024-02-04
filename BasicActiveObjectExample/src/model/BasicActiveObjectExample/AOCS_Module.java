/**
 */
package model.BasicActiveObjectExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AOCS Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.BasicActiveObjectExample.AOCS_Module#getAim_tmtc_struct <em>Aim tmtc struct</em>}</li>
 * </ul>
 *
 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage#getAOCS_Module()
 * @model
 * @generated
 */
public interface AOCS_Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Aim tmtc struct</b></em>' reference list.
	 * The list contents are of type {@link model.BasicActiveObjectExample.AIM_TmTc_Struct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aim tmtc struct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aim tmtc struct</em>' reference list.
	 * @see model.BasicActiveObjectExample.BasicActiveObjectExamplePackage#getAOCS_Module_Aim_tmtc_struct()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<AIM_TmTc_Struct> getAim_tmtc_struct();

} // AOCS_Module
