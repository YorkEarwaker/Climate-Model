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
	
	// <todo: final static constants, method declarations, method defualts, >
	
	/**
	 * constants; public static final field declarations, default
	 */
	 //<todo: consider variable types, should these even be here, in an abstract class perhpas? >
	 shapeParameter ξ ; // Xi ξ https://en.wikipedia.org/wiki/Xi_(letter)
	 scaleParameter σ  ; // Sigma σ https://en.wikipedia.org/wiki/Sigma
	 threshold μ ; // Mu μ https://en.wikipedia.org/wiki/Mu_(letter)
	 thing x ; // the thing being modelled, precipitation, temperature, <todo: refactor, after better definition, >
	 
	 
	/**
	 * public abstract method declarations, default
	 * private abstract method declartions, if any
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
	  */
	public void trendDefinition();
	
	/**
	 * Model evaluation
	 * Step 4
	 */
	
	
	
	/**
	 * defualt method implementation declarations, if any
	 */

}