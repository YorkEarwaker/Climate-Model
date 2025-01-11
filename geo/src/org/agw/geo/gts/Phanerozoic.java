/**
 * Geological Time Scale GTS
 */
package org.agw.geo.gts;

/**
 * Phanerozoic, 
 * 
 * <todo: refactor to get reference data from reference database, >
 */
public interface Phanerozoic extends Eon, Eonothem {
	
	/**
	 * Information
	 */
	public static final String NAME = "Phanerozoic";
	public static final String TIME_SPAN = "538.8 – 0"; // consider range
	// ± within range, confidence interval, uncertainty bounding
	public static final int UNCERTAINTY_BOUNDING =  0.6;
	public static final int DURATION = 538.8; // consider other number type
	// Ma (megaannum), SI unit, paleontology, celestial mechanics, https://en.wikipedia.org/wiki/Year#SI_prefix_multipliers
	public static final String SI_UNIT = "Ma"; 
	
	/**
	 * Definition
	 */
	public static final String CHRONOLOGICAL_UNIT = "Eon";
	public static final String STRATIGRAPHIC_UNIT = "Eonothem";
	// <todo: upper boundary >
	// <todo: lower boundary >
	
	/**
	 * References
	 */
	public static final String WIKIPEDIA_URI = "https://en.wikipedia.org/wiki/Phanerozoic"; // consider RDF friendly name for field
	public static final String GSSP_URI = "to be sourced"; // <todo: source, GSSP URI, >
	 
	/**
	 * Atmospheric and climatic data
	 *
	 * <todo: source,>
	 */
}