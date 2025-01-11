/**
 * Geological Time Scale GTS
 */
package org.agw.geo.gts;

/**
 * Cenozoic, 
 * 
 * <todo: refactor to get reference data from reference database, >
 */
public interface Cenozoic extends Era, Erathem {
	
	/**
	 * Information
	 */
	public static final String NAME = "Cenozoic";
	public static final String TIME_SPAN = "66.0 – 0"; // consider range
	// ± within range, confidence interval, uncertainty bounding
	public static final int UNCERTAINTY_BOUNDING =  0;
	public static final int DURATION = 66.0; // consider other number type
	// Ma (megaannum), SI unit, paleontology, celestial mechanics, https://en.wikipedia.org/wiki/Year#SI_prefix_multipliers
	public static final String SI_UNIT = "Ma"; 
	
	/**
	 * Definition
	 */
	public static final String CHRONOLOGICAL_UNIT = "Era";
	public static final String STRATIGRAPHIC_UNIT = "Erathem";
	// <todo: upper boundary >
	// <todo: lower boundary >
	
	/**
	 * References
	 */
	public static final String WIKIPEDIA_URI = "https://en.wikipedia.org/wiki/Cenozoic"; // consider RDF friendly name for field
	public static final String GSSP_URI = "to be sourced"; // <todo: source, GSSP URI, >
	 
	/**
	 * Atmospheric and climatic data
	 *
	 * <todo: source,>
	 */
}