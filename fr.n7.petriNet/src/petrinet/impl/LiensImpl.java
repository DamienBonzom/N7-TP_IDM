/**
 */
package petrinet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinet.Liens;
import petrinet.PetrinetPackage;
import petrinet.zone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Liens</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.LiensImpl#getPredecesseur <em>Predecesseur</em>}</li>
 *   <li>{@link petrinet.impl.LiensImpl#getSuccesseur <em>Successeur</em>}</li>
 *   <li>{@link petrinet.impl.LiensImpl#isIs_read_arc <em>Is read arc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiensImpl extends PetriElementImpl implements Liens {
	/**
	 * The cached value of the '{@link #getPredecesseur() <em>Predecesseur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecesseur()
	 * @generated
	 * @ordered
	 */
	protected zone predecesseur;

	/**
	 * The cached value of the '{@link #getSuccesseur() <em>Successeur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesseur()
	 * @generated
	 * @ordered
	 */
	protected zone successeur;

	/**
	 * The default value of the '{@link #isIs_read_arc() <em>Is read arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_read_arc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ARC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_read_arc() <em>Is read arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_read_arc()
	 * @generated
	 * @ordered
	 */
	protected boolean is_read_arc = IS_READ_ARC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiensImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.LIENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public zone getPredecesseur() {
		if (predecesseur != null && predecesseur.eIsProxy()) {
			InternalEObject oldPredecesseur = (InternalEObject)predecesseur;
			predecesseur = (zone)eResolveProxy(oldPredecesseur);
			if (predecesseur != oldPredecesseur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.LIENS__PREDECESSEUR, oldPredecesseur, predecesseur));
			}
		}
		return predecesseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public zone basicGetPredecesseur() {
		return predecesseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredecesseur(zone newPredecesseur) {
		zone oldPredecesseur = predecesseur;
		predecesseur = newPredecesseur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.LIENS__PREDECESSEUR, oldPredecesseur, predecesseur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public zone getSuccesseur() {
		if (successeur != null && successeur.eIsProxy()) {
			InternalEObject oldSuccesseur = (InternalEObject)successeur;
			successeur = (zone)eResolveProxy(oldSuccesseur);
			if (successeur != oldSuccesseur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.LIENS__SUCCESSEUR, oldSuccesseur, successeur));
			}
		}
		return successeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public zone basicGetSuccesseur() {
		return successeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccesseur(zone newSuccesseur) {
		zone oldSuccesseur = successeur;
		successeur = newSuccesseur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.LIENS__SUCCESSEUR, oldSuccesseur, successeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_read_arc() {
		return is_read_arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_read_arc(boolean newIs_read_arc) {
		boolean oldIs_read_arc = is_read_arc;
		is_read_arc = newIs_read_arc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.LIENS__IS_READ_ARC, oldIs_read_arc, is_read_arc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.LIENS__PREDECESSEUR:
				if (resolve) return getPredecesseur();
				return basicGetPredecesseur();
			case PetrinetPackage.LIENS__SUCCESSEUR:
				if (resolve) return getSuccesseur();
				return basicGetSuccesseur();
			case PetrinetPackage.LIENS__IS_READ_ARC:
				return isIs_read_arc();
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
			case PetrinetPackage.LIENS__PREDECESSEUR:
				setPredecesseur((zone)newValue);
				return;
			case PetrinetPackage.LIENS__SUCCESSEUR:
				setSuccesseur((zone)newValue);
				return;
			case PetrinetPackage.LIENS__IS_READ_ARC:
				setIs_read_arc((Boolean)newValue);
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
			case PetrinetPackage.LIENS__PREDECESSEUR:
				setPredecesseur((zone)null);
				return;
			case PetrinetPackage.LIENS__SUCCESSEUR:
				setSuccesseur((zone)null);
				return;
			case PetrinetPackage.LIENS__IS_READ_ARC:
				setIs_read_arc(IS_READ_ARC_EDEFAULT);
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
			case PetrinetPackage.LIENS__PREDECESSEUR:
				return predecesseur != null;
			case PetrinetPackage.LIENS__SUCCESSEUR:
				return successeur != null;
			case PetrinetPackage.LIENS__IS_READ_ARC:
				return is_read_arc != IS_READ_ARC_EDEFAULT;
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
		result.append(" (is_read_arc: ");
		result.append(is_read_arc);
		result.append(')');
		return result.toString();
	}

} //LiensImpl
