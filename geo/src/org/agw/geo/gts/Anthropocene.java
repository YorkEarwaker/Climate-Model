/**
 * Geological Time Scale GTS
 */
package org.agw.geo.gts;

/**
 * Anthropocene, new geological age, age of man, large scale planetary wide human impact on geosphere and biosphere and other planetary natural systems
 * Place holder information until the Age is officially ratified
 * Anyone doubting that human (man) kind is responsible for extreme events in planetary geology is in Anthropocene denial
 * <todo: consider, relation to historiography periodization, extend modern age?, re stone age, bronze age, iron age, and so on. how to make this connection? steam age? atomic age? >
 */
public interface Anthropocene extends Age, Stage {
	 
	 /**
	 * Information
	 */
	public static final String NAME = "Anthropocene";
	public static final String TIME_SPAN = "0.0002 - 0"; // consider range
	// ± within range, confidence interval, uncertainty bounding
	public static final double UNCERTAINTY_BOUNDING = 0; // 
	public static final double DURATION = 0.00017792638099106418; // 1778 steam age, consider other number type, 
	// Ma (megaannum), SI unit, paleontology, celestial mechanics, https://en.wikipedia.org/wiki/Year#SI_prefix_multipliers
	public static final String SI_UNIT = "Ma";
	
	/**
	 * Definition
	 */
	public static final String CHRONOLOGICAL_UNIT = Age.NAME;
	public static final String STRATIGRAPHIC_UNIT = Stage.NAME;
	// <todo: upper boundary >
	// <todo: lower boundary > 
	// lower boundary, consider, ...
	// lower boundary, consider, industrial age, circa 1740, 
	// lower boundary, consider, steam (engine) age, James Watt & Matthew Boulton 1778, good choice marks start of mass use of coal and steam powered industry and atmospheric CO2 [WS](https://www.parliament.uk/about/living-heritage/transformingsociety/tradeindustry/industrycommunity/collections/collections/steam-engines-act/), Parliament, gov, UK
	// lower boundary, consider, consumer (mass production) age, Ford model T, circa 1908, [WP](https://en.wikipedia.org/wiki/Ford_Model_T)
	// lower boundary, consider, atomic age, 16 July 1945, Trinity test, [WS](https://www.afnwc.af.mil/About-Us/History/Trinity-Nuclear-Test/) , 
	// lower boundary, consider, ...
	
	/**
	 * References
	 */
	public static final String WIKIPEDIA_URI = "https://en.wikipedia.org/wiki/Anthropocene"; // consider RDF friendly name for field
	/* geochronology, GSSA,  */
	public static final String GSSA_URI = "to be sourced"; // <todo: source, GSSA URI, link to ICS/IUGS resource, >
	/* chronostratigraphy, GSSP, hard science, physical evidence base, */
	public static final String GSSP_URI = "to be sourced"; // <todo: source, GSSP URI, link to ICS/IUGS resource, >
	 
	/**
	 * Atmospheric and climatic data
	 *
	 * <todo: source,>
	 */
	 
	 /**
	  * Archeological data
	  *
	  * Fire, 
	  * Natural History Museum, Humans made fire 350,000 years earlier than previously thought, [WS](https://www.youtube.com/watch?v=8nlr7f9P_yo), 10 December 2025, BBC News
	  * <todo; source NHM paper, fire, human made, pyrite & flint, >
	  */
	  
	 
}
