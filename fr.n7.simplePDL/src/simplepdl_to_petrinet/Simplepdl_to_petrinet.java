package simplepdl_to_petrinet;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.Petri;
import petrinet.PetrinetFactory;
import petrinet.PetrinetPackage;
import petrinet.impl.PetrinetPackageImpl;
import simplepdl.Process;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;

public class Simplepdl_to_petrinet {

	public static void main(String[] args) {
		// Chargement du package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
				
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
				
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (notre modÃ¨le)
		ResourceSet resSet = new ResourceSetImpl();

		// Charger la ressource (notre modÃ¨le)
		URI modelURI = URI.createURI("models/SimplePDLCreator_Created_Process.xmi");
		Resource resource = resSet.getResource(modelURI, true);
				
		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le (Ã©lÃ©ment racine)
		Process process = (Process) resource.getContents().get(0);
		
		//Creation du nouveau reseau de petri
		// Charger le package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		PetrinetPackage packageInstance_petrinet = PetrinetPackage.eINSTANCE;
				
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg_petrinet = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m_petrinet = reg.getExtensionToFactoryMap();
		m_petrinet.put("xmi", new XMIResourceFactoryImpl());
				
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		ResourceSet resSet_petrinet = new ResourceSetImpl();

		// DÃ©finir la ressource (le modÃ¨le)
		URI modelURI_petrinet = URI.createURI("/models/transformation_reseau_petri.xmi");
		Resource resource_petrinet = resSet_petrinet.createResource(modelURI_petrinet);
				
		// La fabrique pour fabriquer les Ã©lÃ©ments de SimplePDL
		PetrinetFactory myFactory_petrinet = PetrinetFactory.eINSTANCE;

		// CrÃ©er un Ã©lÃ©ment Process
		Petri petrinet = myFactory_petrinet.createPetri();
		petrinet.setNom("Mon premier reseau de petri");
				
		// Ajouter le Process dans le modÃ¨le
		resource_petrinet.getContents().add(petrinet);

	}

}
