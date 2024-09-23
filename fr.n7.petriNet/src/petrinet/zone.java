/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.zone#getPredecesseurs <em>Predecesseurs</em>}</li>
 *   <li>{@link petrinet.zone#getSuccesseurs <em>Successeurs</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getzone()
 * @model
 * @generated
 */
public interface zone extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Predecesseurs</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Liens}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecesseurs</em>' reference list.
	 * @see petrinet.PetrinetPackage#getzone_Predecesseurs()
	 * @model
	 * @generated
	 */
	EList<Liens> getPredecesseurs();

	/**
	 * Returns the value of the '<em><b>Successeurs</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Liens}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successeurs</em>' reference list.
	 * @see petrinet.PetrinetPackage#getzone_Successeurs()
	 * @model
	 * @generated
	 */
	EList<Liens> getSuccesseurs();

} // zone
