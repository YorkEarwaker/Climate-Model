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
	public static final double UNCERTAINTY_BOUNDING = 0.6;
	public static final double DURATION = 538.8; // consider other number type
	// Ma (megaannum), SI unit, paleontology, celestial mechanics, https://en.wikipedia.org/wiki/Year#SI_prefix_multipliers
	public static final String SI_UNIT = "Ma"; 
	
	/**
	 * Definition
	 */
	public static final String CHRONOLOGICAL_UNIT = Eon.NAME;
	public static final String STRATIGRAPHIC_UNIT = Eonothem.NAME;
	// <todo: upper boundary >
	// <todo: lower boundary >
	
	/**
	 * References
	 */
	public static final String WIKIPEDIA_URI = "https://en.wikipedia.org/wiki/Phanerozoic"; // consider RDF friendly name for field
	/* geochronology, GSSA,  */
	public static final String GSSA_URI = "to be sourced"; // <todo: source, GSSA URI, link to ICS/IUGS resource, >
	/* chronostratigraphy, GSSP, hard science, physical evidence base, */
	public static final String GSSP_URI = "to be sourced"; // <todo: source, GSSP URI, link to ICS/IUGS resource, >
	 
	/**
	 * Atmospheric and climatic data
	 *
	 * <todo: source,>
	 */
}