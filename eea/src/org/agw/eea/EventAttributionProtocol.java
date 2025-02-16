/**
 * Extreme Event Attribution
 */
package org.agw.eea;

/**
 * EventAttributionProtocol
 *
 * Rapid WWA protocol
 * A multi-method eight step process
 * https://ascmo.copernicus.org/articles/6/177/2020/
 * https://link.springer.com/article/10.1007/s10584-021-03071-7 
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
	 * <todo: all activity description, input, throughput, and output of top level protocol activities >
	 */
	 
	/**
	* 1 analysis trigger 
	 * Activity
	 * - event pool pruning, in part re; resource constraints, manual process lack of operalisation, 
	 * 
	 * Input
	 * - extreme meteorological event eme, 
	 * - extreme weather event ewe
	 * - extreme climate event ece 
	 * 
	 * Throughput
	 * - impact thresholds, 
	 * - - number of people affected, 
	 * - - development/risk index and capability to cope, 
	 * - - others?
	 * 
	 * - near record events, new record events
	 * - - spectacle, news focus, 
	 * 
	 * Output
	 * - event selected
	 * 
	* @param args
	*/
	public void analysisTrigger(); 
	
	/** 
	 * 2 event definition
	 * Activity
	 * - event choice and definition
	 * 
	 * Input
	 * - 
	 * 
	 * Throughput
	 * - 
	 * 
	 * Output
	 * - 
	 * 
	 * @param args
	 */
	 public void eventDefinition();

	/**
	 * 3 trend detection
	 * Activity
	 * - observation set collection and assessment
	 * - estimating probability and trends of observation set
	 * 
	 * Input
	 * - 
	 * 
	 * Throughput
	 * - 
	 * 
	 * Output
	 * - 
	 * 
 	 * @param args
	 */
	 public void trendDetection();
	 
 	/**
	 * 4 model evaluation
	 * Activity
	 * - assessing and selecting models fit for purpose for a specific event attribution 
	 * 
	 * Input
	 * - 
	 * 
	 * Throughput
	 * - 
	 * 
	 * Output
	 * - 
	 * 
 	 * @param args
	 */
	 public void modelEvaluation();
	 
 	/**
	 * 5 multi-method multi-model attribution,
	 * Activity
	 * - replicating extreme event scenario in climate models for event locale/region
	 * - comparative no anthropogenic warming scenario in climate models for event locale/region
	 * 
	 * Input
	 * - 
	 * 
	 * Throughput
	 * - fixed forcing runs
	 * - transient forcing runs
	 * 
	 * Output
	 * - 
	 * 
	 * @param args
	 */
	 public void multiAttribution();
 
 	/**
	 * 6 hazard synthesis
	 * Activity
	 * - hazard risk assessment of extreme meteorological event eme, ewe, ece
	 * 
	 * Input
	 * - probability ratios and changes in intensity for both 
	 * - observation data, fits to observations
	 * - model data, transient runs
	 * 
	 * Throughput
	 * - synthesis of partial results into attribution statement
	 * 
	 * Step 1, convert fits to observation and transient runs to common base line
	 * - 1900 as common base line
	 * - provides ease of communication
	 * - availability of observation data
	 * - availability of model run data
	 * 
	 * 
	 * Output
	 * - quantitative hazard attribution
	 * 
	 * @param args
	 */
	 public void hazardSynthesis();
	 
 	/**
	 * 7 vulnerability & exposure analysis
	 * Activity
	 * - impact assessment of realized hazard risk
	 * 
	 * Input
	 * - hazard risk, extreme meteorological event eme, ewe, ece
	 * - quantitative hazard attribution
	 * 
	 * Throughput
	 * - exposure risk
	 * - vulnerability risk
	 * - country wide risk and event locale specific risk
	 * - risk management, e.g. Inform index global risk index GRI, <todo: others to source, UN? World Bank? IMF? others? >
	 * 
	 * Output
	 * - qualitative exposure attribution
	 * - qualitative vulnerability attribution
	 * 
	 * @param args
	 */
	 public void vulnerabilityAndExposureAnalysis();
	 
 	/**
	 * 8 communication
	 * Activity
	 * - Communication of attribution statement
	 * 
	 * Input
	 * - quantitative hazard attribution, extreme meteorological event eme, ewe, ece
	 * - qualitative exposure attribution, 
	 * - qualitative vulnerability attribution, 
	 * 
	 * Throughput
	 * - report generation
	 * - different outcome templates
	 * - language use style guide
	 * - automation
	 * 
	 * Output
	 * - scientific report, reproducibility, scientific community, objective record 
	 * - - scientific paper, open access journal, paper on as needed basis, 
	 * - scientific summary, scientifically literate, 
	 * - policy summary, 
	 * - press release, common language, 
	 * - social media, message amplification
	 * 
	 * @param args
	 */
	 public void communication();
	 
}