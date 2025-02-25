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
 * https://link.springer.com/article/10.1007/s10584-021-03071-7
 * 
 */
public interface EventModel extends Model {
	
	// this interface replicates with finer grained instances tasks the activities steps EventAttributionProtocol , 
	// will class the implements EventAttributionProtocol use this EventModel, 
	// will EventAttributionProtocol use EventModel as a variable instance to pass between activity steps? 
	
	// <todo: final static constants, method declarations, method defaults, >
	
	/**
	 * constants; public static final field declarations, default
	 */
	//<todo: consider variable types, should these even be here, in an abstract class perhaps? >
	//<todo: int is a placeholder variable type, >
	//<todo: consider moving these variables to WeatherEventModel >
	
	// <todo: these variables are replicated in org.agw.mth.sta.GaussianEvent . where should they sit? Likely in mathematics package via interface inheritance but where? >
	// Fit Parameters
	int scaleParameter_σ = 0; // Sigma σ https://en.wikipedia.org/wiki/Sigma, corresponding to the variability of the extreme (relative to mean)
	int dispersionParameter_σ_over_μ = 0; // σ/μ, for precipitation and wind events, corresponding to the variability of the extreme (relative to mean)
	
	int positionParameter_μ = 0; // Mu μ https://en.wikipedia.org/wiki/Mu_(letter)
	int thresholdParameter_u = 0; // 
	int dontKnowTheNameOfThisParameter_α = 0; // Alpha α https://en.wikipedia.org/wiki/Alpha <todo: scope of alpha, proper name, function, >
	int shapeParameter_ξ = 0; // Xi ξ https://en.wikipedia.org/wiki/Xi_(letter) , how fat or thin the tail is
	int thing_x = 0; // rename index_x? the thing being modelled, precipitation, temperature, wind, <todo: refactor, after better definition, >

	int penaltyTerm_ζ = 0; // Zeta ζ https://en.wikipedia.org/wiki/Zeta 
	int 𝛕 = 0; // Tau 𝛕 https://en.wikipedia.org/wiki/Tau , time <todo: scope of tau, proper name, function, likely time>
	
	// Delta Δ https://en.wikipedia.org/wiki/Delta_(letter) change in intensity of event? Δ I ?
	
	// Prime ′ https://en.wikipedia.org/wiki/Prime_(symbol)
	
	int trendParameter = 0; // concerns with model limitations, not fit for purpose? model issues relation, 
	
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
	  * 
	  * Temperature extremes
	  * - for good approximation assumption
	  * - - scale parameter σ, keep constant
	  * - - shape parameter ξ, keep constant
	  * 
	  * Precipitation and wind extremes
	  * - for index flood assumption
	  * - - dispersion parameter σ/μ, keep constant
	  * - - shape parameter ξ, keep constant
	  * 
	  * Driver identification separation 
	  * - for region/locale resolution, temporal and spatial
	  * - assumptions to be checked against model runs, model modules, parameterisations,
	  * - - local aerosol forcing
	  * - - land surface changes, orography, cityscapes, e.g. influencing wind storm severity downward in EU
	  * - - irrigation, influencing temperature downward 
	  * - - an other <todo: what is the comprehensive list >
	  * - - <todo: \amn, \data, \others, pre preparation of driver identification in advance, as changes occure e.g. \flw urban planning new neighbourhoods or new tall buildings or new irrigation scheme and so on , identification of good practice to like WMO station standards for this sort of reporting to aid in \eea and \emr to extreme events, \emr project to be included >
	  * - - <todo: assume this affects past datasets, in that locale specific changes have to be included in datasets and model runs as they occured over time, cityscapes affecting wind and temperature as heat islands and flooding as run off from paved surfaces and smog burning things fossil/wood/waste and so on, >...
	  * 
	  * Spatial pooling - ? <todo: more research, >
	  * - to increase quantity of available data, <todo: pitfalls? >
	  * 
	  * Trend detection - trend definition
	  * - strong dependency, for detection of trend in observation data, on variable
	  * - available of observation datasets and quality, 
	  * - ability of models to replicate
	  * - Athropogenic global warming and climate change sufficiently strong now to detect trends for
	  * - Ability to detect trends
	  * - - extreme heat
	  * - - extreme short duration precipitation, small scale precipitation using spatial pooling
	  * - - extreme winter events more variable, but do show trends
	  * - Hard to detect trends
	  * - - extreme drought, time scales longer, 
	  * 
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
	 * Assess that the climate model to be used is fit for purpose
	 * for extreme event attribution EEA of the particular event kind  
	 * Does the climate model, to be used to replicate extreme event,
	 * have the capability to replicate the extreme event kind under investigation
	 * 
	 * Climate models that can represent the physics of the event as numerical prediction.
	 * A number (which is best number) of models to allow for strengths and weaknesses of model kind
	 * A number (best num?) of models to allow different model spreads from several (num?) model kinds
	 * Greater confidence if (num?) models agree on results, given model uncertainties (probability of distribution of trends)
	 * 
	 * step three returns inputs to step four
	 * return period as change in probability PR
	 * observed trend and intensity ΔI
	 * 
	 * 
	 */
	public void modelEvaluation();
	
	/**
	 * default method implementation declarations, if any
	 */

}