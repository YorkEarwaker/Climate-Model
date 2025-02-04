/**
 * Extreme Event Attribution
 */
package org.agw.eea;

/**
 * SimpleWeatherEventAttribution
 * 
 */
public class SimpleWeatherEventAttribution implements WeatherEventAttribution {
	
	// <todo: consider this implements AnthropogenicEventAttribution.java >
	// <todo: use SimpleWeatherEventModel.java here ?>
	// <todo: use a concrete class that implements EventAttributionProtocol.java here? or this implments EventAttributionProtocol.java>

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Simple Weather Event Attribution!");
	}
	
	/**
	* default-constructor
	*/ 
	private SimpleWeatherEventAttribution() {
		super();
		System.out.print("Simple Weather Event Attribution.default-constructor ");
	}

	@Override
	public void analysisTrigger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventDefinition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trendDetection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modelEvaluation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiAttribution() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hazardSynthesis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vulnerabilityAndExposureAnalysis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void communication() {
		// TODO Auto-generated method stub
		
	}
	
	
}
