/**
 * Geological Time Scale GTS
 */
package org.agw.geo.gts;

/**
 * Meghalayan, 
 * 
 */
public interface Meghalayan extends Age, Stage {
	 
	  /**
	 * Information
	 */
	public static final String NAME = "Meghalayan";
	public static final String TIME_SPAN = "0.0042 – 0"; // consider range
	// ± within range, confidence interval, uncertainty bounding
	public static final int UNCERTAINTY_BOUNDING =  0; // 
	public static final int DURATION = 0.0042; // consider other number type, 
	// Ma (megaannum), SI unit, paleontology, celestial mechanics, https://en.wikipedia.org/wiki/Year#SI_prefix_multipliers
	public static final String SI_UNIT = "Ma";
	
	/**
	 * Definition
	 */
	public static final String CHRONOLOGICAL_UNIT = "Age";
	public static final String STRATIGRAPHIC_UNIT = "Stage";
	// <todo: upper boundary >
	// <todo: lower boundary >
	
	/**
	 * References
	 */
	public static final String WIKIPEDIA_URI = "https://en.wikipedia.org/wiki/Meghalayan"; // consider RDF friendly name for field
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