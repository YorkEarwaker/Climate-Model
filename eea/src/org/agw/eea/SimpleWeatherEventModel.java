/**
 * Extreme Event Attribution
 */
package org.agw.eea;

/**
 * SimpleWeatherEventModel
 * Model of the weather event
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
	 * 100/Δ l / l = 100[exp(α(T_1′- T_0′)/μ_0)-1]
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
}
