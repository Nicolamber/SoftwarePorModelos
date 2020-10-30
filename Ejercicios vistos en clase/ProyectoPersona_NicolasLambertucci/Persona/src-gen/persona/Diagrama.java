/**
 */
package persona;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link persona.Diagrama#getPersona <em>Persona</em>}</li>
 * </ul>
 *
 * @see persona.PersonaPackage#getDiagrama()
 * @model
 * @generated
 */
public interface Diagrama extends EObject {
	/**
	 * Returns the value of the '<em><b>Persona</b></em>' containment reference list.
	 * The list contents are of type {@link persona.Persona}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona</em>' containment reference list.
	 * @see persona.PersonaPackage#getDiagrama_Persona()
	 * @model containment="true"
	 * @generated
	 */
	EList<Persona> getPersona();

} // Diagrama
