/**
 * Geological Time Scale GTS
 */
package org.agw.geo.gts;

/**
 * Holocene, 
 * 
 * <todo: refactor to get reference data from reference database, >
 */
public interface Holocene extends Epoch, Series {
	
	/**
	 * Information
	 */
	public static final String NAME = "Holocene";
	public static final String TIME_SPAN = "0.012 – 0"; // consider range
	// ± within range, confidence interval, uncertainty bounding
	public static final int UNCERTAINTY_BOUNDING =  0;
	public static final int DURATION = 0.0117; // consider other number type
	// Ma (megaannum), SI unit, paleontology, celestial mechanics, https://en.wikipedia.org/wiki/Year#SI_prefix_multipliers
	public static final String SI_UNIT = "Ma";
	
	/**
	 * Definition
	 */
	public static final String CHRONOLOGICAL_UNIT = "Epoch";
	public static final String STRATIGRAPHIC_UNIT = "Series";
	// <todo: upper boundary >
	// <todo: lower boundary >
	
	/**
	 * References
	 */
	public static final String WIKIPEDIA_URI = "https://en.wikipedia.org/wiki/Holocene"; // consider RDF friendly name for field
	public static final String GSSP_URI = "to be sourced"; // <todo: source, GSSP URI, >
	 
	/**
	 * Atmospheric and climatic data
	 *
	 * <todo: source,>
	 */
}