/**
 */
package petrinet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinet.PetrinetPackage;
import petrinet.Places;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Places</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.PlacesImpl#getNbr_jetons <em>Nbr jetons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlacesImpl extends ZoneImpl implements Places {
	/**
	 * The default value of the '{@link #getNbr_jetons() <em>Nbr jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbr_jetons()
	 * @generated
	 * @ordered
	 */
	protected static final int NBR_JETONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbr_jetons() <em>Nbr jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbr_jetons()
	 * @generated
	 * @ordered
	 */
	protected int nbr_jetons = NBR_JETONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.PLACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNbr_jetons() {
		return nbr_jetons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNbr_jetons(int newNbr_jetons) {
		int oldNbr_jetons = nbr_jetons;
		nbr_jetons = newNbr_jetons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.PLACES__NBR_JETONS, oldNbr_jetons, nbr_jetons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.PLACES__NBR_JETONS:
				return getNbr_jetons();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.PLACES__NBR_JETONS:
				setNbr_jetons((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetrinetPackage.PLACES__NBR_JETONS:
				setNbr_jetons(NBR_JETONS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetrinetPackage.PLACES__NBR_JETONS:
				return nbr_jetons != NBR_JETONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nbr_jetons: ");
		result.append(nbr_jetons);
		result.append(')');
		return result.toString();
	}

} //PlacesImpl
