/**
 * Extreme Event Attribution
 */
package org.agw.eea;

import org.agw.mdl.Model;

/**
 * EventModel
 * WIP
 */
public interface EventModel extends Model {
	
	// <todo: final static constants, method declarations, method defaults, >
	
	/**
	 * constants; public static final field declarations, default
	 */
	 
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