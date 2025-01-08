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
	
	TROPICAL_CYCLONE ("Tropical Cyclone"), # wind storm? 
	EXTRA_TROPICAL_CYCLONE ("Extra Tropical Cyclone"), # wind storm?, storm surge, percipitation, flood 
	HEAT ("Heat"), # temperature extreme
	COLD ("Cold"), # temperature extreme
	DROUGHT ("Drought"), # meteorological drought, lack of percipitation
	FLOOD ("Flood"), # excess extreme percipitation
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