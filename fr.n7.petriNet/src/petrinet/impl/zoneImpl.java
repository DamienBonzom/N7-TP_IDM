/**
 */
package petrinet.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import petrinet.Liens;
import petrinet.PetrinetPackage;
import petrinet.zone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.zoneImpl#getPredecesseurs <em>Predecesseurs</em>}</li>
 *   <li>{@link petrinet.impl.zoneImpl#getSuccesseurs <em>Successeurs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class zoneImpl extends PetriElementImpl implements zone {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected zoneImpl() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.ZONE__PREDECESSEURS:
				return getPredecesseurs();
			case PetrinetPackage.ZONE__SUCCESSEURS:
				return getSuccesseurs();
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
		}
		return super.eIsSet(featureID);
	}

} //zoneImpl
