/**
 */
package petrinet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import petrinet.Liens;
import petrinet.PetrinetPackage;
import petrinet.Zone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.ZoneImpl#getPredecesseurs <em>Predecesseurs</em>}</li>
 *   <li>{@link petrinet.impl.ZoneImpl#getSuccesseurs <em>Successeurs</em>}</li>
 *   <li>{@link petrinet.impl.ZoneImpl#getNom_zone <em>Nom zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneImpl extends PetriElementImpl implements Zone {
	/**
	 * The cached value of the '{@link #getPredecesseurs() <em>Predecesseurs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecesseurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Liens> predecesseurs;

	/**
	 * The cached value of the '{@link #getSuccesseurs() <em>Successeurs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesseurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Liens> successeurs;

	/**
	 * The default value of the '{@link #getNom_zone() <em>Nom zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom_zone()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom_zone() <em>Nom zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom_zone()
	 * @generated
	 * @ordered
	 */
	protected String nom_zone = NOM_ZONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Liens> getPredecesseurs() {
		if (predecesseurs == null) {
			predecesseurs = new EObjectResolvingEList<Liens>(Liens.class, this, PetrinetPackage.ZONE__PREDECESSEURS);
		}
		return predecesseurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Liens> getSuccesseurs() {
		if (successeurs == null) {
			successeurs = new EObjectResolvingEList<Liens>(Liens.class, this, PetrinetPackage.ZONE__SUCCESSEURS);
		}
		return successeurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom_zone() {
		return nom_zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom_zone(String newNom_zone) {
		String oldNom_zone = nom_zone;
		nom_zone = newNom_zone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ZONE__NOM_ZONE, oldNom_zone, nom_zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.ZONE__PREDECESSEURS:
				return getPredecesseurs();
			case PetrinetPackage.ZONE__SUCCESSEURS:
				return getSuccesseurs();
			case PetrinetPackage.ZONE__NOM_ZONE:
				return getNom_zone();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.ZONE__PREDECESSEURS:
				getPredecesseurs().clear();
				getPredecesseurs().addAll((Collection<? extends Liens>)newValue);
				return;
			case PetrinetPackage.ZONE__SUCCESSEURS:
				getSuccesseurs().clear();
				getSuccesseurs().addAll((Collection<? extends Liens>)newValue);
				return;
			case PetrinetPackage.ZONE__NOM_ZONE:
				setNom_zone((String)newValue);
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
			case PetrinetPackage.ZONE__PREDECESSEURS:
				getPredecesseurs().clear();
				return;
			case PetrinetPackage.ZONE__SUCCESSEURS:
				getSuccesseurs().clear();
				return;
			case PetrinetPackage.ZONE__NOM_ZONE:
				setNom_zone(NOM_ZONE_EDEFAULT);
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
			case PetrinetPackage.ZONE__PREDECESSEURS:
				return predecesseurs != null && !predecesseurs.isEmpty();
			case PetrinetPackage.ZONE__SUCCESSEURS:
				return successeurs != null && !successeurs.isEmpty();
			case PetrinetPackage.ZONE__NOM_ZONE:
				return NOM_ZONE_EDEFAULT == null ? nom_zone != null : !NOM_ZONE_EDEFAULT.equals(nom_zone);
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
		result.append(" (nom_zone: ");
		result.append(nom_zone);
		result.append(')');
		return result.toString();
	}

} //ZoneImpl
