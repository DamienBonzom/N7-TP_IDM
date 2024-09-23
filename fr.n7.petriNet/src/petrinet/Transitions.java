/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Transitions#isEst_possible <em>Est possible</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getTransitions()
 * @model
 * @generated
 */
public interface Transitions extends zone {
	/**
	 * Returns the value of the '<em><b>Est possible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est possible</em>' attribute.
	 * @see #setEst_possible(boolean)
	 * @see petrinet.PetrinetPackage#getTransitions_Est_possible()
	 * @model required="true"
	 * @generated
	 */
	boolean isEst_possible();

	/**
	 * Sets the value of the '{@link petrinet.Transitions#isEst_possible <em>Est possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est possible</em>' attribute.
	 * @see #isEst_possible()
	 * @generated
	 */
	void setEst_possible(boolean value);

} // Transitions
