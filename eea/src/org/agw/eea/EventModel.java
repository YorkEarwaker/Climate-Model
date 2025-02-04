/**
 * Extreme Event Attribution
 */
package org.agw.eea;

import org.agw.mdl.Model;

/**
 * EventModel
 * WIP
 * Sources
 * https://ascmo.copernicus.org/articles/6/177/2020/
 */
public interface EventModel extends Model {
	
	// <todo: final static constants, method declarations, method defaults, >
	
	/**
	 * constants; public static final field declarations, default
	 */
	//<todo: consider variable types, should these even be here, in an abstract class perhpas? >
	//<todo: int is a placeholder variable type, >
	//<todo: consider moving these variables to WeatherEventModel >
	int shapeParameter_ξ = 0; // Xi ξ https://en.wikipedia.org/wiki/Xi_(letter)
	int scaleParameter_σ = 0; // Sigma σ https://en.wikipedia.org/wiki/Sigma
	int threshold_μ = 0; // Mu μ https://en.wikipedia.org/wiki/Mu_(letter)
	int thing_x = 0; // the thing being modelled, precipitation, temperature, <todo: refactor, after better definition, >
	
	int ζ = 0; // Zeta ζ https://en.wikipedia.org/wiki/Zeta
	int α = 0;// Alpha α https://en.wikipedia.org/wiki/Alpha
	
	// Delta Δ https://en.wikipedia.org/wiki/Delta_(letter)
	
	// Prime ′ https://en.wikipedia.org/wiki/Prime_(symbol)
	
	/**
	 * public abstract method declarations, default
	 * private abstract method declarations, if any
	 */
	
	/**
	 * Observed probability and trend
	 * Step 3
	 */

	 /**
	  * @param args
	  */
	public void observationalData();
	
	 /**
	  * @param args
	  */
	public void statisticalMethod();
	
	 /**
	  * @param args
	  * Shift fit
	  * Scale fit
	  * Shift and scale fit
	  * 
	  */
	public void trendDefinition();	
	
	/**
	 * <todo: Which of these to do first? ENSO?, AO? to source what is the approach/method? >
	 * 
	 * El Niño Southern Oscillation ENSO, La Niña, https://en.wikipedia.org/wiki/El_Ni%C3%B1o%E2%80%93Southern_Oscillation
	 * Atlantic Multidecadal Oscillation AMO, https://en.wikipedia.org/wiki/Atlantic_multidecadal_oscillation
	 * Pacific Decadal Oscillation PDO, https://en.wikipedia.org/wiki/Pacific_decadal_oscillation
	 * Pacific Meridonal Mode PMM, https://en.wikipedia.org/wiki/Pacific_Meridional_Mode
	 * North Atalantic Oscillation, https://en.wikipedia.org/wiki/North_Atlantic_oscillation
	 * Arctic Oscillation AO, aka NAM, https://en.wikipedia.org/wiki/Arctic_oscillation
	 * North Pacific Oscillation NPO, https://en.wikipedia.org/wiki/North_Pacific_Oscillation
	 * North Pacific Gyre Oscillation NPGO, 
	 * Pacific North American Teleconnection Pattern PNA, https://en.wikipedia.org/wiki/Pacific%E2%80%93North_American_teleconnection_pattern
	 * ...
	 */
	public void modesOfNaturalVariability();
	
	/**
	 * Model evaluation
	 * Step 4
	 */
	 
	
	
	/**
	 * default method implementation declarations, if any
	 */

}