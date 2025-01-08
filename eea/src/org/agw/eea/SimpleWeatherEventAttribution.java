/**
 * 
 */
package org.agw.eea;

/**
 * Rapid WWA protocol
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
public class SimpleWeatherEventAttribution implements WeatherEventAttribution {
	
	// <todo: use SimpleWeatherEventModel here ?>

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
	
	
}
