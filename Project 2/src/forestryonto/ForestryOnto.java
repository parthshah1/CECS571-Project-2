package forestryonto;

import forestryonto.impl.*;


import java.util.Collection;

import org.protege.owl.codegeneration.CodeGenerationFactory;
import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.FactoryHelper;
import org.protege.owl.codegeneration.impl.ProtegeJavaMapping;
import org.protege.owl.codegeneration.inference.CodeGenerationInference;
import org.protege.owl.codegeneration.inference.SimpleInference;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

/**
 * A class that serves as the entry point to the generated code providing access
 * to existing individuals in the ontology and the ability to create new individuals in the ontology.<p>
 * 
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: ForestryOnto<br>
 */
public class ForestryOnto implements CodeGenerationFactory {
    private OWLOntology ontology;
    private ProtegeJavaMapping javaMapping = new ProtegeJavaMapping();
    private FactoryHelper delegate;
    private CodeGenerationInference inference;

    public ForestryOnto(OWLOntology ontology) {
	    this(ontology, new SimpleInference(ontology));
    }
    
    public ForestryOnto(OWLOntology ontology, CodeGenerationInference inference) {
        this.ontology = ontology;
        this.inference = inference;
        javaMapping.initialize(ontology, inference);
        delegate = new FactoryHelper(ontology, inference);
    }

    public OWLOntology getOwlOntology() {
        return ontology;
    }
    
    public void saveOwlOntology() throws OWLOntologyStorageException {
        ontology.getOWLOntologyManager().saveOntology(ontology);
    }
    
    public void flushOwlReasoner() {
        delegate.flushOwlReasoner();
    }
    
    public boolean canAs(WrappedIndividual resource, Class<? extends WrappedIndividual> javaInterface) {
    	return javaMapping.canAs(resource, javaInterface);
    }
    
    public  <X extends WrappedIndividual> X as(WrappedIndividual resource, Class<? extends X> javaInterface) {
    	return javaMapping.as(resource, javaInterface);
    }
    
    public Class<?> getJavaInterfaceFromOwlClass(OWLClass cls) {
        return javaMapping.getJavaInterfaceFromOwlClass(cls);
    }
    
    public OWLClass getOwlClassFromJavaInterface(Class<?> javaInterface) {
	    return javaMapping.getOwlClassFromJavaInterface(javaInterface);
    }
    
    public CodeGenerationInference getInference() {
        return inference;
    }

    /* ***************************************************
     * Class http://www.forestryspaces.org/onto#Borough
     */

    {
        javaMapping.add("http://www.forestryspaces.org/onto#Borough", Borough.class, DefaultBorough.class);
    }

    /**
     * Creates an instance of type Borough.  Modifies the underlying ontology.
     */
    public Borough createBorough(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_BOROUGH, DefaultBorough.class);
    }

    /**
     * Gets an instance of type Borough with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Borough getBorough(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_BOROUGH, DefaultBorough.class);
    }

    /**
     * Gets all instances of Borough from the ontology.
     */
    public Collection<? extends Borough> getAllBoroughInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_BOROUGH, DefaultBorough.class);
    }


    /* ***************************************************
     * Class http://www.forestryspaces.org/onto#Jurisdiction
     */

    {
        javaMapping.add("http://www.forestryspaces.org/onto#Jurisdiction", Jurisdiction.class, DefaultJurisdiction.class);
    }

    /**
     * Creates an instance of type Jurisdiction.  Modifies the underlying ontology.
     */
    public Jurisdiction createJurisdiction(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_JURISDICTION, DefaultJurisdiction.class);
    }

    /**
     * Gets an instance of type Jurisdiction with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Jurisdiction getJurisdiction(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_JURISDICTION, DefaultJurisdiction.class);
    }

    /**
     * Gets all instances of Jurisdiction from the ontology.
     */
    public Collection<? extends Jurisdiction> getAllJurisdictionInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_JURISDICTION, DefaultJurisdiction.class);
    }


    /* ***************************************************
     * Class http://www.forestryspaces.org/onto#PSSite
     */

    {
        javaMapping.add("http://www.forestryspaces.org/onto#PSSite", PSSite.class, DefaultPSSite.class);
    }

    /**
     * Creates an instance of type PSSite.  Modifies the underlying ontology.
     */
    public PSSite createPSSite(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_PSSITE, DefaultPSSite.class);
    }

    /**
     * Gets an instance of type PSSite with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public PSSite getPSSite(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_PSSITE, DefaultPSSite.class);
    }

    /**
     * Gets all instances of PSSite from the ontology.
     */
    public Collection<? extends PSSite> getAllPSSiteInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_PSSITE, DefaultPSSite.class);
    }


    /* ***************************************************
     * Class http://www.forestryspaces.org/onto#PSStatus
     */

    {
        javaMapping.add("http://www.forestryspaces.org/onto#PSStatus", PSStatus.class, DefaultPSStatus.class);
    }

    /**
     * Creates an instance of type PSStatus.  Modifies the underlying ontology.
     */
    public PSStatus createPSStatus(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_PSSTATUS, DefaultPSStatus.class);
    }

    /**
     * Gets an instance of type PSStatus with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public PSStatus getPSStatus(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_PSSTATUS, DefaultPSStatus.class);
    }

    /**
     * Gets all instances of PSStatus from the ontology.
     */
    public Collection<? extends PSStatus> getAllPSStatusInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_PSSTATUS, DefaultPSStatus.class);
    }


    /* ***************************************************
     * Class http://www.forestryspaces.org/onto#Park
     */

    {
        javaMapping.add("http://www.forestryspaces.org/onto#Park", Park.class, DefaultPark.class);
    }

    /**
     * Creates an instance of type Park.  Modifies the underlying ontology.
     */
    public Park createPark(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_PARK, DefaultPark.class);
    }

    /**
     * Gets an instance of type Park with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Park getPark(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_PARK, DefaultPark.class);
    }

    /**
     * Gets all instances of Park from the ontology.
     */
    public Collection<? extends Park> getAllParkInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_PARK, DefaultPark.class);
    }


    /* ***************************************************
     * Class http://www.forestryspaces.org/onto#ParkZone
     */

    {
        javaMapping.add("http://www.forestryspaces.org/onto#ParkZone", ParkZone.class, DefaultParkZone.class);
    }

    /**
     * Creates an instance of type ParkZone.  Modifies the underlying ontology.
     */
    public ParkZone createParkZone(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_PARKZONE, DefaultParkZone.class);
    }

    /**
     * Gets an instance of type ParkZone with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public ParkZone getParkZone(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_PARKZONE, DefaultParkZone.class);
    }

    /**
     * Gets all instances of ParkZone from the ontology.
     */
    public Collection<? extends ParkZone> getAllParkZoneInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_PARKZONE, DefaultParkZone.class);
    }


    /* ***************************************************
     * Class http://www.forestryspaces.org/onto#PlantingSpace
     */

    {
        javaMapping.add("http://www.forestryspaces.org/onto#PlantingSpace", PlantingSpace.class, DefaultPlantingSpace.class);
    }

    /**
     * Creates an instance of type PlantingSpace.  Modifies the underlying ontology.
     */
    public PlantingSpace createPlantingSpace(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_PLANTINGSPACE, DefaultPlantingSpace.class);
    }

    /**
     * Gets an instance of type PlantingSpace with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public PlantingSpace getPlantingSpace(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_PLANTINGSPACE, DefaultPlantingSpace.class);
    }

    /**
     * Gets all instances of PlantingSpace from the ontology.
     */
    public Collection<? extends PlantingSpace> getAllPlantingSpaceInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_PLANTINGSPACE, DefaultPlantingSpace.class);
    }


    /* ***************************************************
     * Class http://www.forestryspaces.org/onto#Sanctuary
     */

    {
        javaMapping.add("http://www.forestryspaces.org/onto#Sanctuary", Sanctuary.class, DefaultSanctuary.class);
    }

    /**
     * Creates an instance of type Sanctuary.  Modifies the underlying ontology.
     */
    public Sanctuary createSanctuary(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_SANCTUARY, DefaultSanctuary.class);
    }

    /**
     * Gets an instance of type Sanctuary with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Sanctuary getSanctuary(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_SANCTUARY, DefaultSanctuary.class);
    }

    /**
     * Gets all instances of Sanctuary from the ontology.
     */
    public Collection<? extends Sanctuary> getAllSanctuaryInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_SANCTUARY, DefaultSanctuary.class);
    }


    /* ***************************************************
     * Class http://www.forestryspaces.org/onto#Street
     */

    {
        javaMapping.add("http://www.forestryspaces.org/onto#Street", Street.class, DefaultStreet.class);
    }

    /**
     * Creates an instance of type Street.  Modifies the underlying ontology.
     */
    public Street createStreet(String name) {
		return delegate.createWrappedIndividual(name, Vocabulary.CLASS_STREET, DefaultStreet.class);
    }

    /**
     * Gets an instance of type Street with the given name.  Does not modify the underlying ontology.
     * @param name the name of the OWL named individual to be retrieved.
     */
    public Street getStreet(String name) {
		return delegate.getWrappedIndividual(name, Vocabulary.CLASS_STREET, DefaultStreet.class);
    }

    /**
     * Gets all instances of Street from the ontology.
     */
    public Collection<? extends Street> getAllStreetInstances() {
		return delegate.getWrappedIndividuals(Vocabulary.CLASS_STREET, DefaultStreet.class);
    }


}
