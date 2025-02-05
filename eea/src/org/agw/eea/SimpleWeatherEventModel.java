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

	@Override
	public void statisticalMethod() {
		// TODO Auto-generated method stub
		
	}

	/** 
	 * Shift fit <todo: implement>
	 * ...
	 * Scale fit <todo: implement>
	 * fit parameters μ_0, σ_0, α
	 * μ = μ_0 exp(αT′/μ_0), 
	 * σ = σ_0 exp(αT′/μ_0),
	 * 
	 * 100/Δ I / I = 100[exp(α(T_1′- T_0′)/μ_0)-1]
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
	 * evaluation of model general properties <todo: implement>
	 * model resolution, is the model sufficiently fine grained 
	 *  - tropical cyclone 25k res min
	 *  - short duration precipitation EE 1k res min, non hydrostatic model
	 *  - orography; mountains, coastlines, katabatic winds (e.g. US.CA.LA Santa Ana winds?), https://en.wikipedia.org/wiki/Katabatic_wind
	 *  - spacial pattern of variable to observations
	 *  - seasonal cycle of variable to observations
	 *  - a n other?
	 *   
	 * evaluation of model statistical description of extremes <todo: implement>
	 *  - do uncertainties determined above correlate (are inacordance with) fit parameters of distribution
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
	 *  - i.e. some trend, a n other relevant parameterization? (model; over estimation/under estimation, not included)
	 *  
	 *  
	 * evaluation of model physical causes of extremes <todo: implement>
	 * 
	 */
	@Override
	public void modelEvaluation() {
		// TODO Auto-generated method stub
		
	}
}
