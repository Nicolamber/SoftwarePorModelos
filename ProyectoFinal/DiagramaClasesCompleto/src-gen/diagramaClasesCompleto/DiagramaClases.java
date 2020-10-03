/**
 */
package diagramaClasesCompleto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagramaClasesCompleto.DiagramaClases#getPackages_contenidos <em>Packages contenidos</em>}</li>
 *   <li>{@link diagramaClasesCompleto.DiagramaClases#getArtefacto_contenido <em>Artefacto contenido</em>}</li>
 *   <li>{@link diagramaClasesCompleto.DiagramaClases#getConfiguraciones_contenidas <em>Configuraciones contenidas</em>}</li>
 * </ul>
 *
 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getDiagramaClases()
 * @model
 * @generated
 */
public interface DiagramaClases extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages contenidos</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages contenidos</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getDiagramaClases_Packages_contenidos()
	 * @model containment="true"
	 * @generated
	 */
	EList<diagramaClasesCompleto.Package> getPackages_contenidos();

	/**
	 * Returns the value of the '<em><b>Artefacto contenido</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artefacto contenido</em>' containment reference.
	 * @see #setArtefacto_contenido(Artefacto)
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getDiagramaClases_Artefacto_contenido()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Artefacto getArtefacto_contenido();

	/**
	 * Sets the value of the '{@link diagramaClasesCompleto.DiagramaClases#getArtefacto_contenido <em>Artefacto contenido</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artefacto contenido</em>' containment reference.
	 * @see #getArtefacto_contenido()
	 * @generated
	 */
	void setArtefacto_contenido(Artefacto value);

	/**
	 * Returns the value of the '<em><b>Configuraciones contenidas</b></em>' containment reference list.
	 * The list contents are of type {@link diagramaClasesCompleto.ConfiguracionManager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuraciones contenidas</em>' containment reference list.
	 * @see diagramaClasesCompleto.DiagramaClasesCompletoPackage#getDiagramaClases_Configuraciones_contenidas()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<ConfiguracionManager> getConfiguraciones_contenidas();

} // DiagramaClases
