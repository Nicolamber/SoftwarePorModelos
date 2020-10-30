/**
 */
package persona;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see persona.PersonaFactory
 * @model kind="package"
 * @generated
 */
public interface PersonaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persona";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/persona";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "persona";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersonaPackage eINSTANCE = persona.impl.PersonaPackageImpl.init();

	/**
	 * The meta object id for the '{@link persona.impl.DiagramaImpl <em>Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see persona.impl.DiagramaImpl
	 * @see persona.impl.PersonaPackageImpl#getDiagrama()
	 * @generated
	 */
	int DIAGRAMA = 0;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__PERSONA = 0;

	/**
	 * The number of structural features of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link persona.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see persona.impl.PersonaImpl
	 * @see persona.impl.PersonaPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 1;

	/**
	 * The feature id for the '<em><b>Nombre Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NOMBRE_PERSONA = 0;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link persona.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagrama</em>'.
	 * @see persona.Diagrama
	 * @generated
	 */
	EClass getDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link persona.Diagrama#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persona</em>'.
	 * @see persona.Diagrama#getPersona()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_Persona();

	/**
	 * Returns the meta object for class '{@link persona.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see persona.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the attribute '{@link persona.Persona#getNombrePersona <em>Nombre Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Persona</em>'.
	 * @see persona.Persona#getNombrePersona()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_NombrePersona();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersonaFactory getPersonaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link persona.impl.DiagramaImpl <em>Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see persona.impl.DiagramaImpl
		 * @see persona.impl.PersonaPackageImpl#getDiagrama()
		 * @generated
		 */
		EClass DIAGRAMA = eINSTANCE.getDiagrama();

		/**
		 * The meta object literal for the '<em><b>Persona</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__PERSONA = eINSTANCE.getDiagrama_Persona();

		/**
		 * The meta object literal for the '{@link persona.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see persona.impl.PersonaImpl
		 * @see persona.impl.PersonaPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Nombre Persona</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__NOMBRE_PERSONA = eINSTANCE.getPersona_NombrePersona();

	}

} //PersonaPackage
