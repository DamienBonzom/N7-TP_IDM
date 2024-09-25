/**
 */
package petrinet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see petrinet.PetrinetPackage
 * @generated
 */
public interface PetrinetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetFactory eINSTANCE = petrinet.impl.PetrinetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Petri</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petri</em>'.
	 * @generated
	 */
	Petri createPetri();

	/**
	 * Returns a new object of class '<em>Petri Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petri Element</em>'.
	 * @generated
	 */
	PetriElement createPetriElement();

	/**
	 * Returns a new object of class '<em>Places</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Places</em>'.
	 * @generated
	 */
	Places createPlaces();

	/**
	 * Returns a new object of class '<em>Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transitions</em>'.
	 * @generated
	 */
	Transitions createTransitions();

	/**
	 * Returns a new object of class '<em>Liens</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Liens</em>'.
	 * @generated
	 */
	Liens createLiens();

	/**
	 * Returns a new object of class '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone</em>'.
	 * @generated
	 */
	Zone createZone();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PetrinetPackage getPetrinetPackage();

} //PetrinetFactory
