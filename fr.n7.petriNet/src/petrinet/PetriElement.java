/**
 */
package petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.PetriElement#getPetri <em>Petri</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPetriElement()
 * @model
 * @generated
 */
public interface PetriElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Petri</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri</em>' reference.
	 * @see #setPetri(Petri)
	 * @see petrinet.PetrinetPackage#getPetriElement_Petri()
	 * @model required="true"
	 * @generated
	 */
	Petri getPetri();

	/**
	 * Sets the value of the '{@link petrinet.PetriElement#getPetri <em>Petri</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri</em>' reference.
	 * @see #getPetri()
	 * @generated
	 */
	void setPetri(Petri value);

} // PetriElement
