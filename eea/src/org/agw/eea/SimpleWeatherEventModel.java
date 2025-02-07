/**
 * Extreme Event Attribution
 */
package org.agw.eea;

/**
 * SimpleWeatherEventModel
 * Model of the weather event
 * Sources
 * https://ascmo.copernicus.org/articles/6/177/2020/
 * 
 */
public class SimpleWeatherEventModel implements WeatherEventModel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Simple Weather Event Model!");
	}
	
	/**
	* default-constructor
	*/ 
	private SimpleWeatherEventModel() {
		super();
		System.out.println("Simple Weather Event Model.default-constructor ");
	}
	
	@Override
	public void model() {
		System.out.println("Simple Weather Event Model.model ");
	}
		
	@Override
	public void time() {
		System.out.println("Simple Weather Event Model.time ");
	}
	
	@Override
	public void space() {
		System.out.println("Simple Weather Event Model.space ");
	}

	@Override
	public void weatherEvent() {
		System.out.println("Simple Weather Event Model.weatherEvent ");
	}

	@Override
	public void observationalData() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Statistical Method
	 * 
	 * Fitting procedure, 
	 * Suppressing large unphysically realistic shape parameters ξ, with 
	 * penaltyTerm ζ to keep them in range
	 * |ζ| ≤ 0.4 
	 * 
	 * Low extremes of precipitation
	 * scale parameter σ 
	 * threshold μ
	 * Zero probability below zero precipitation
	 * (ζ < 0, σ < μζ) 
	 * 
	 * for selection of statistical model kind to use.
	 * See enum org.agw.mth.sta.StatisticalModelKind; 
	 * DIRAC ("Dirac"), // Dirac delta function <todo: consider refactoring, Dirac does not fit well here. only part of a method as function, >
	 * GAUSSIAN ("Gaussian"), // 
	 * GPD ("GPD"), // generalised Pareto distribution GPD, also known as peak over threshold POT
	 * GEV ("GEV"), // generalised extreme value GEV
	 * GUMBLE ("Gumble"), // 
	 * GAMMA ("Gamma"); //
	 */
	@Override
	public void statisticalMethod() {
		// TODO Auto-generated method stub
		
	}

	/** 
	 * Trend Definition
	 * concentration and smoothed GMST as Pearson correlation coefficient
	 * r(T′, CO_2) = 0.93, CO_2 
	 * 
	 * distribution evaluated for a given year, the covariate-dependent function
	 * a year in the past (T′ = T′_0)
	 * the current year (T′ = T′_1)
	 * 
	 * gives probabilities for event as least as extreme as observed 
	 * in two (2) year p_0 and P_1
	 * expressed as return periods
	 * 𝜏_0 = 1/p_0 and 𝜏_1 = 1/p_1
	 * 
	 * Shift fit <todo: implement>
	 * ...
	 * Scale fit <todo: implement>
	 * fit parameters μ_0, σ_0, α
	 * μ = μ_0 exp(αT′/μ_0), 
	 * σ = σ_0 exp(αT′/μ_0),
	 * 
	 * 100/Δ I / I = 100[exp(α(T′_1- T′_0)/μ_0)-1]
	 * Shift and Scale fit <todo: implement>
	 * ...
	 */
	@Override
	public void trendDefinition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modesOfNaturalVariability() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * modelEvaluation, 
	 * evaluate climate/weather models to use to replicate extreme events
	 * result of this activity is a list of models that can be used to model the extreme event in question
	 * If fewer than two models pass the evaluation test it cannot be used for robust attribution statement,
	 * a single model is likely overconfident, 
	 * for model run, as factual (industrial) and counterfactual (preindustrial), climate conditions
	 * factual, yes anthropogenic increase, as is current anthropogenic green house gas warming, since circa 1778
	 * counterfactual, no anthropogenic increase, supposition of no anthropogenic green house gas warming, say circa 1778
	 * 
	 * Step 1
	 * evaluation of model general properties <todo: implement>
	 * model resolution, is the model sufficiently fine grained 
	 *  - tropical cyclone 25k res min
	 *  - short duration precipitation EE 1k res min, non hydrostatic model
	 *  - orography; mountains, coastlines, katabatic winds (e.g. US.CA.LA Santa Ana winds?), https://en.wikipedia.org/wiki/Katabatic_wind
	 *  - spacial pattern of variable to observations
	 *  - seasonal cycle of variable to observations
	 *  - a n other?
	 *   
	 * Step 2
	 * evaluation of model statistical description of extremes <todo: implement>
	 *  - do uncertainties determined above correlate (are in accordance with) fit parameters of distribution
	 *  - bias correction, additive of temperature
	 *  - bias correction, multiplicative of precipitation
	 *  - bias correction, multiplicative of wind
	 *  - a n other? 
	 *  - If sufficient (how much?) overlap of parameters fitted to observations and confidence intervals of fit parameters
	 *  - then model is sufficiently fit for purpose for EEA kind
	 *  - fit parameter, confidence interval of temperature σ (scale parameter)
	 *  - fit parameter, confidence interval of precipitation σ∕μ (scale parameter/threshold parameter)
	 *  - fit parameter, confidence interval of wind σ∕μ (scale parameter/threshold parameter)
	 *  - fit parameter, confidence interval of ξ (shape parameter), if appropriate, <todo: what are the tests for appropriateness? >
	 *  - trend parameter, α to observed value, only if source of discrepancy is known that prevents realistic simulation
	 *  - e.g. heat wave trend, aerosol influences (model; over estimation/under estimation, not included)
	 *  - e.g. heat wave trend, irrigation (model; over estimation/under estimation, not included)
	 *  - i.e. some trend, a n other relevant parameterisation? (model; over estimation/under estimation, not included)
	 *  
	 * Step 3
	 * evaluation of model physical causes of extremes <todo: implement>
	 * Q. does the model generate extremes for the right reasons? still subject of research!
	 * - are natural variability to extreme realistic, <todo: what are the test for realistic, how can this be made STP, model meta data in first instance? analysis of algorithms? > 
	 * - e.g. extreme event, do modelled ENSO teleconnections look realistic 
	 * - e.g. extreme precipitation on US Gulf Coast, do modelled meteorological conditions include one third non hurricane events
	 * - e.g. extreme event, do modelled forcings relate to extreme response to forcings, see also hazard synthesis 
	 * - <todo: what is the comprehensive list of modelled meteorological conditions look like for evaluation of model? >
	 * 
	 * 
	 * by product of this statistical check, step 2, is information on model biases <todo: how can these be reported beforehand in model meta data? as a mode service,>
	 * a bias correction is necessary often to correct model before model can be compared to observations
	 * simplest method is evaluate model for same return period found for observations, keep p_0 fixed and implies no return period analysis
	 * 
	 * In cases where ensemble models are pooled different models, each model biases must be corrected individually, 
	 * 
	 * Step 4
	 * physical process of models should be checked (evaluated) if there is failure to pass these preceding model validation criteria with observation
	 * where models have differences with observations
	 * <todo: how to operationalise this? stp. first instance require models to published meta data of physical processes, as first pass?>
	 */
	@Override
	public void modelEvaluation() {
		// TODO Auto-generated method stub
		
	}
}
