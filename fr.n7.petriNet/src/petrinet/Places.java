/**
 */
package petrinet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Places</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Places#getNbr_jetons <em>Nbr jetons</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPlaces()
 * @model
 * @generated
 */
public interface Places extends Zone {
	/**
	 * Returns the value of the '<em><b>Nbr jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr jetons</em>' attribute.
	 * @see #setNbr_jetons(int)
	 * @see petrinet.PetrinetPackage#getPlaces_Nbr_jetons()
	 * @model required="true"
	 * @generated
	 */
	int getNbr_jetons();

	/**
	 * Sets the value of the '{@link petrinet.Places#getNbr_jetons <em>Nbr jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr jetons</em>' attribute.
	 * @see #getNbr_jetons()
	 * @generated
	 */
	void setNbr_jetons(int value);

} // Places
