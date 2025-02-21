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
	 * - - - ≥ 100 deaths
	 * - - - ≥ 1,000,000 people affected
	 * - - - ≥ 50% of total population affected
	 * - - - & co indicator appeals by IFRC & RCS
	 * - - development/risk index and capability to cope, 
	 * - - extreme loss of life, absolute, and percent within national boundary,
	 * - - extreme economic loss, absolute, and percent within national boundary,
	 * 
	 * - near record events, new record events
	 * - - spectacle, news focus, 
	 * 
	 * Output
	 * - extreme meteorological event selected
	 * 
	* @param args
	*/
	public void analysisTrigger(); 
	
	/** 
	 * 2 event definition
	 * Activity
	 * - event choice and definition
	 * - event attribution goal('s), event kind classification, event variables, event region spatial, event timespan temporal, 
	 * 
	 * Input
	 * - extreme meteorological event
	 * 
	 * Throughput
	 * - goals may overlap, but a single one takes primacy?
	 * - goal 1; to be maximising of anthropogenic contribution, best index for this to test for external forcing signal, averages over large areas and time scales 
	 * - goal 1.1?; to be relevant for adaptation not simply mitigation, impacts the really affect people
	 * - goal 2; to be meteorological extreme, index maximising return time of event, but increases signal to noise ratio
	 * - goal 3; to be maximising of human society impact and ecological impact, best index for this to test for
	 * - What question is being asked above, and what physical variables can be mapped to answer the question of attribution, 
	 * - - meteorological variables, <todo: list meteorological variables, map to event type, >
	 * - - hydrological variables, <todo: list hydrological variables, map to event type, >
	 * - - other physical impact models, <todo: list of other variable criteria? map to event type, . that is what other physical models are used? >
	 * - question 'framing' using 'class based' definition, all events of similar magnitude or more extreme, 
	 * - spatial and temporal properties of variable, 3 day average/max index over a month/season, area region, 
	 * - class based event, event definition, e.g. heat and drought to extreme fire index, moderate rain moderate wind extreme water levels, 
	 * - local expert input, spatial area/region definition for example, 
	 * 
	 * common indices - impact literature, definition of extreme event kinds
	 * 
	 * Heat extremes
	 * highest maximum temperature of the year TXx, shorter heat waves, imapct on people outdoors, e.g. India
	 * maximum of 3-day average maximum temperatures TX3x, longer heat waves, impact on people indoors, e.g. EU 
	 * 3-day daily mean temperatures TG3x, correlates well with daily maximum, 
	 * Expert Team on Climate Change Detection and Indices ETDDCI
	 * Universal Thermal Comfort Index UTCI, physical model of how human dissipate heat, requires non universal applicable qualifiers like clothing sytle and skin colour,
	 * Web bulb temperature, humidity related to ability of body cooling via perspiration
	 * 
	 * Cold extremes
	 * similar to heat mean avergages but for temperature minima
	 * ice model?
	 * snowfall, snowdepth, ?
	 * 
	 * High precipitation extremes
	 * annual maximum of 3-day averaged precipitation RX3day
	 * flooding, hydrological model, 
	 * river basin average precipitation over a given time period also useful in place of hydro model
	 * in situ flooding
	 * additional complications, confounding? contributors, river basin management, land use, in addition to changes in atmosphere in atmospheric model
	 * 
	 * Drought extremes
	 * Additional complications, confounding? contributors, 
	 * Meteorological drought - lack of rain
	 * Agricultural drought - lack of soil moisture, good soil modules in climate model required, or irrigation effects in a hydrological model
	 * Other human intervention is water cycle,
	 * Palmer Drought Severity Index
	 * Soil moisture potential evaporation
	 * 
	 * Standard event definitions required for, - see \amn as part of a possible solution?
	 * Wind storm extremes, 
	 * Tornadoes extremes
	 * Hurricane extremes
	 * Hail and freezing rain extremes
	 * particularly challenging above, as long homogeneous time series often not available, and nor are suitable models for replication
	 * 
	 * Output
	 * - event attribution kind and scope
	 * 
	 * @param args
	 */
	 public void eventDefinition();

	/**
	 * 3 trend detection
	 * Activity
	 * - observation set collection and assessment
	 * - estimating probability and trends of observation set
	 * - establish return time of event
	 * 
	 * Input
	 * - event attribution kind and scope
	 * - long time series min fifty (50) years, preferred one hundred (100) years or more
	 * - time series inclusive of extreme event
	 * - time series observation selection
	 * - - time series often not perfect so best reliable dataset of the available set to be selected
	 * - - <todo: see \amn, \data, \others, indicates global preparedness and capability uplift, toward data integrity and preparedness, data pipelines, >
	 * - - <todo: see \amn, \data, \others, UN SDG's & development aid, improve locale and regional personnel competency and capability maturity, >
	 * - - gridded analysis, 
	 * - - quality controlled weather stations, hydrological stations, actual measurements, 
	 * - - radar analysis, often limited available spatially and temporally <todo: radar weather station locations, >   
	 * - - satellite analysis, often limited temporally, not hard physical measurement datasets, of actual physical index, precipitation, wind, runoff, soil moisture, ...
	 * - - - CPC Unified Gauge-Based Analysis of Global Daily Precipitation, since 1979 to present, daily global precipitation estimates,
	 * - - - Grid Analysis and Display System (GrADS), software for accessing, manipulating, visualising, geophysical data,
	 * - - - <todo: full list of other dataset sources, where is this all co-located? WMO? can it all be locally sourced and also globally centrally managed? also regionally managed? see \amn, \data, \others, >
	 * 
	 * Throughput
	 * - see also EventModel, SimpleWeatherEventModel
	 * - observational data, time series dataset pruning and selection, for particular indecies related to event kind, 
	 * - statisical method selection, for particular indecies (temperature, precipitation, wind, ... ) related to event kind, 
	 * - data pipeline, prepare and process time series dataset for selected statistical analysis method, 
	 * - define trend, using statistical analysis method and prepared dataset
	 * 
	 * Output
	 * - event kind instance trend definition
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