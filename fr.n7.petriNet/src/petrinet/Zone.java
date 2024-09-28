/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Zone#getPredecesseurs <em>Predecesseurs</em>}</li>
 *   <li>{@link petrinet.Zone#getSuccesseurs <em>Successeurs</em>}</li>
 *   <li>{@link petrinet.Zone#getNom_zone <em>Nom zone</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Predecesseurs</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Liens}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecesseurs</em>' reference list.
	 * @see petrinet.PetrinetPackage#getZone_Predecesseurs()
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
	 * @see petrinet.PetrinetPackage#getZone_Successeurs()
	 * @model
	 * @generated
	 */
	EList<Liens> getSuccesseurs();

	/**
	 * Returns the value of the '<em><b>Nom zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom zone</em>' attribute.
	 * @see #setNom_zone(String)
	 * @see petrinet.PetrinetPackage#getZone_Nom_zone()
	 * @model required="true"
	 * @generated
	 */
	String getNom_zone();

	/**
	 * Sets the value of the '{@link petrinet.Zone#getNom_zone <em>Nom zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom zone</em>' attribute.
	 * @see #getNom_zone()
	 * @generated
	 */
	void setNom_zone(String value);

} // Zone
