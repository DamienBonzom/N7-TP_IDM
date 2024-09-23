/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liens</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Liens#getPredecesseur <em>Predecesseur</em>}</li>
 *   <li>{@link petrinet.Liens#getSuccesseur <em>Successeur</em>}</li>
 *   <li>{@link petrinet.Liens#isIs_read_arc <em>Is read arc</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getLiens()
 * @model
 * @generated
 */
public interface Liens extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Predecesseur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecesseur</em>' reference.
	 * @see #setPredecesseur(zone)
	 * @see petrinet.PetrinetPackage#getLiens_Predecesseur()
	 * @model required="true"
	 * @generated
	 */
	zone getPredecesseur();

	/**
	 * Sets the value of the '{@link petrinet.Liens#getPredecesseur <em>Predecesseur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecesseur</em>' reference.
	 * @see #getPredecesseur()
	 * @generated
	 */
	void setPredecesseur(zone value);

	/**
	 * Returns the value of the '<em><b>Successeur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successeur</em>' reference.
	 * @see #setSuccesseur(zone)
	 * @see petrinet.PetrinetPackage#getLiens_Successeur()
	 * @model required="true"
	 * @generated
	 */
	zone getSuccesseur();

	/**
	 * Sets the value of the '{@link petrinet.Liens#getSuccesseur <em>Successeur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successeur</em>' reference.
	 * @see #getSuccesseur()
	 * @generated
	 */
	void setSuccesseur(zone value);

	/**
	 * Returns the value of the '<em><b>Is read arc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is read arc</em>' attribute.
	 * @see #setIs_read_arc(boolean)
	 * @see petrinet.PetrinetPackage#getLiens_Is_read_arc()
	 * @model required="true"
	 * @generated
	 */
	boolean isIs_read_arc();

	/**
	 * Sets the value of the '{@link petrinet.Liens#isIs_read_arc <em>Is read arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is read arc</em>' attribute.
	 * @see #isIs_read_arc()
	 * @generated
	 */
	void setIs_read_arc(boolean value);

} // Liens
