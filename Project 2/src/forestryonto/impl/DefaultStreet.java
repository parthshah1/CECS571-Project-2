package forestryonto.impl;

import forestryonto.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultStreet <br>
 */
public class DefaultStreet extends WrappedIndividualImpl implements Street {

    public DefaultStreet(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.forestryspaces.org/onto#hasStreet
     */
     
    public Collection<? extends Street> getHasStreet() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASSTREET,
                                               DefaultStreet.class);
    }

    public boolean hasHasStreet() {
	   return !getHasStreet().isEmpty();
    }

    public void addHasStreet(Street newHasStreet) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASSTREET,
                                       newHasStreet);
    }

    public void removeHasStreet(Street oldHasStreet) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASSTREET,
                                          oldHasStreet);
    }


    /* ***************************************************
     * Data Property http://www.forestryspaces.org/onto#hasName
     */
     
    public Collection<? extends String> getHasName() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNAME, String.class);
    }

    public boolean hasHasName() {
		return !getHasName().isEmpty();
    }

    public void addHasName(String newHasName) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNAME, newHasName);
    }

    public void removeHasName(String oldHasName) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNAME, oldHasName);
    }


}
