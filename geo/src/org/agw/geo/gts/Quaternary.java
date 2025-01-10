/**
 * Geological Time Scale GTS
 */
package org.agw.geo.gts;

/**
 * Quaternary, 
 * 
 * <todo: refactor to get reference data from reference database, >
 */
public interface Quaternary extends Period, System {

	/**
	 * Information
	 */	 
	public static final String NAME = "Quaternary";
	public static final String TIME_SPAN = "2.58 – 0"; // consider range
	// ± within range, confidence interval, uncertainty bounding
	public static final int UNCERTAINTY_BOUNDING =  0;
	public static final int DURATION = 2.58; // consider other number type
	// Ma (megaannum), SI unit, paleontology, celestial mechanics, https://en.wikipedia.org/wiki/Year#SI_prefix_multipliers
	public static final String SI_UNIT = "Ma"; 
	
	/**
	 * Definition
	 */
	public static final String CHRONOLOGICAL_UNIT = "Period";
	public static final String STRATIGRAPHIC_UNIT = "System";
	// <todo: upper boundary >
	// <todo: lower boundary >
	
	/**
	 * References
	 */
	public static final WIKIPEDIA_URI = "https://en.wikipedia.org/wiki/Quaternary"; // consider RDF friendly name for field
    public static final GSSP_URI = "to be sourced"; // <todo: source, GSSP URI, >
	
	/**
	 * Atmospheric and climatic data
	 *
	 * <todo: consider how to use this here, >
Mean atmospheric O2 content	c. 20.8 vol %
(100 % of modern)
Mean atmospheric CO2 content	c. 250 ppm
(0.9 times pre-industrial)
Mean surface temperature	c. 14 °C
(0.5 °C above pre-industrial)
*/
}