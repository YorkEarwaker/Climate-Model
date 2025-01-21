/**
 * Global Warming Model
 */
package org.agw.gwm;

/**
 * GlobalWarmingModel
 * 
 */
public interface GlobalWarmingModel extends WarmingModel {

	/**
	 * constants; public static final field declarations, default
	 */ 	
	 
	 /**
	 * public abstract method declarations, default
	 * private abstract method declartions, if any
	 */
	 
	 // <todo: consider, is this the correct place for these method declarations?>
	/**
	 * @param args
	 */
	public void radiativeForcingEstimate(); // method declaration? // todo: what are the specific warming causes, rename method?
	
	/**
	 * @param args
	 */
	public void globalMeanSurfaceTemperature();  // (GMST) anomaly, global warming a common choice is the 4-year smoothed, 

	/**
	 * @param args
	 */	
	public void atmosphericCO2Concentration(); // method declaration?

	/**
	 * defualt method implementation declarations, if any
	 */
	 
}
