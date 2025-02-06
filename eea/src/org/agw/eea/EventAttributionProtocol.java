/**
 * Extreme Event Attribution
 */
package org.agw.eea;

/**
 * EventAttributionProtocol
 *
 * Raid WWA protocol
 * A multi-method eight step process
 * https://ascmo.copernicus.org/articles/6/177/2020/
 * 
 * 1 analysis trigger
 * 2 event definition
 * 3 trend detection
 * 4 model evaluation
 * 5 multi-method multi-model attribution,
 * 6 hazard synthesis
 * 7 vulnerability & exposure analysis
 * 8 communication
 * 
 */
public interface EventAttributionProtocol {
	
	// <todo: consider, will this extend another interface EventAttribution? >
	// <todo: consider, will this extend another interface Protocol? >
	
	// see EventModel comments as the activity steps here are courser grained version of the subset of EventModel 
	// is implementing class of AnthropogenicEventAttribution where these are joined up?
	
	/**
	 * list eight step protocol methods? which each call a protocol process activity class?
	 * <todo: consider return arguments for protocol methods >
	 * <todo: consider method parameter arguments, >
	 * <todo: consider generics or method parameters args and return arg >
	 */
	 
	/**
	* 1 analysis trigger
	* @param args
	*/
	public void analysisTrigger(); 
	
	/** 
	 * 2 event definition
	 * @param args
	 */
	 public void eventDefinition();

	/**
	 * 3 trend detection
 	 * @param args
	 */
	 public void trendDetection();
	 
 	/**
	 * 4 model evaluation
 	 * @param args
	 */
	 public void modelEvaluation();
	 
 	/**
	 * 5 multi-method multi-model attribution,
	 * @param args
	 */
	 public void multiAttribution();
 
 	/**
	 * 6 hazard synthesis
	 * @param args
	 */
	 public void hazardSynthesis();
	 
 	/**
	 * 7 vulnerability & exposure analysis
	 * @param args
	 */
	 public void vulnerabilityAndExposureAnalysis();
	 
 	/**
	 * 8 communication
	 * @param args
	 */
	 public void communication();
	 
}