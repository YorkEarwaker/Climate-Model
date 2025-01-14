/**
 * Geological Time Scale GTS
 */
package org.agw.geo.gts;

/**
 * Anthropocene, new geological age, age of man, large scale planetary wide human impact on geosphere and biosphere and other planetary natural systems
 * Place holder information until the Age is offically ratified
 * Anyone doubting that human (man) kind is responsible for extreme events in planetary geology is in Anthropocene denial
 * <todo: consider, relation to historiography periodization, extend modern age?, re stone age, bronze age, iron age, and so on. how to make this connection? steam age? atomic age? >
 */
public interface Anthropocene extends Age, Stage {
	 
	 /**
	 * Information
	 */
	public static final String NAME = "Anthropocene";
	public static final String TIME_SPAN = "to be sourced"; // consider range
	// ± within range, confidence interval, uncertainty bounding
	public static final int UNCERTAINTY_BOUNDING =  -1; // to be souced, <todo: consider set to null, can java int be null?>
	public static final int DURATION = -1; // to be sourced, consider other number type, <todo: consider set to null, can java int be null?>
	// Ma (megaannum), SI unit, paleontology, celestial mechanics, https://en.wikipedia.org/wiki/Year#SI_prefix_multipliers
	public static final String SI_UNIT = "Ma";
	
	/**
	 * Definition
	 */
	public static final String CHRONOLOGICAL_UNIT = "Age";
	public static final String STRATIGRAPHIC_UNIT = "Stage";
	// <todo: upper boundary >
	// <todo: lower boundary > 
	// lower boundary, consider, ...
	// lower boundary, consider, industrial age, circa 1740 
	// lower boundary, consider, steam engine, James Watt & Matthew Bouolton 1778, good choice marks start of mass use of coal and steam powered industry and atmospheric CO2 
	// lower boundary, consider, atomic age, 16 July 1945, Trinity test, https://www.afnwc.af.mil/About-Us/History/Trinity-Nuclear-Test/ , 
	// lower boundary, consider, mass production, ford model T  
	// lower boundary, consider, ...
	
	/**
	 * References
	 */
	public static final String WIKIPEDIA_URI = "https://en.wikipedia.org/wiki/Anthropocene"; // consider RDF friendly name for field
	/* chronology */
	public static final String GSSA_URI = "to be sourced"; // <todo: source, GSSA URI, link to ICS/IUGS resource, >
	/* stratigraphy */
	public static final String GSSP_URI = "to be sourced"; // <todo: source, GSSP URI, link to ICS/IUGS resource, >
	 
	/**
	 * Atmospheric and climatic data
	 *
	 * <todo: source,>
	 */
	 
}