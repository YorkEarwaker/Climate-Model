/**
 * Kinds of weather event
 * Stubb work in progress
 */
package org.agw.eea;

/**
 * enum weather event kind 
 * <todo: find ontology to base kinds on as difinitive source, International Geographic Union perhaps? >
 */
public enum WeatherEventKind {
	
	TROPICAL_CYCLONE ("Tropical Cyclone"),
	EXTRA_TROPICAL_CYCLONE ("Extra Tropical Cyclone"),
	HEAT ("Heat"),
	COLD ("Cold"),
	CONVECTIVE_STORM ("Convective Storm");
	
	private final String weatherEvent;
	
	/**
	* constructor
	*/
	private WeatherEventKind(String weatherEvent) {
		this.weatherEvent = weatherEvent;
	}
	
	public String getValue() {
		return(weatherEvent);
	}
}