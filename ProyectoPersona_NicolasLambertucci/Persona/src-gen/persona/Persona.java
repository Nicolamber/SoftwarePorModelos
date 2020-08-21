/**
 */
package persona;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link persona.Persona#getNombrePersona <em>Nombre Persona</em>}</li>
 * </ul>
 *
 * @see persona.PersonaPackage#getPersona()
 * @model
 * @generated
 */
public interface Persona extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Persona</em>' attribute.
	 * @see #setNombrePersona(String)
	 * @see persona.PersonaPackage#getPersona_NombrePersona()
	 * @model
	 * @generated
	 */
	String getNombrePersona();

	/**
	 * Sets the value of the '{@link persona.Persona#getNombrePersona <em>Nombre Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Persona</em>' attribute.
	 * @see #getNombrePersona()
	 * @generated
	 */
	void setNombrePersona(String value);

} // Persona
