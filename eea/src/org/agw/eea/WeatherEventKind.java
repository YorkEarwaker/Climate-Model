/**
 * Extreme Event Attribution
 * 
 */
package org.agw.eea;

/**
 * WeatherEventKind
 * Kinds of weather event, enum weather event kind 
 * <todo: find ontology to base kinds on as difinitive source, International Geographic Union, World Meteorological Organisation WMO,  perhaps? >
 */
public enum WeatherEventKind {
	
	TROPICAL_CYCLONE ("Tropical Cyclone"), # wind storm?,  hurricane/typhoon, storm surge, precipitation, flood, tornadoes, 
	EXTRA_TROPICAL_CYCLONE ("Extra Tropical Cyclone"), # wind storm?
	HEAT ("Heat"), # temperature extreme, heat wave
	COLD ("Cold"), # temperature extreme, cold wave
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