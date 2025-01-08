/**
 * Kinds of weather event
 * Stubb work in progress
 */
package org.agw.eea;

/**
 * enum weather event kind 
 * <todo: find ontology to base kinds on as difinitive source, International Geographic Union, World Meteorological Organisation WMO,  perhaps? >
 */
public enum WeatherEventKind {
	
	TROPICAL_CYCLONE ("Tropical Cyclone"), # wind storm? 
	EXTRA_TROPICAL_CYCLONE ("Extra Tropical Cyclone"), # wind storm?, storm surge, precipitation, flood 
	HEAT ("Heat"), # temperature extreme
	COLD ("Cold"), # temperature extreme
	DROUGHT ("Drought"), # meteorological drought, lack of precipitation
	FLOOD ("Flood"), # excess extreme precipitation
	CONVECTIVE_STORM ("Convective Storm"); # wind storm?
	
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