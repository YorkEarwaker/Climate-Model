/**
 * Global Warming Model
 */
package org.agw.gwm;

/**
 * ClimateModel
 * 
 */
public interface ClimateModel {
	
	/**
	 * constants; public static final field declarations, default
	 */

	/**
	 * public abstract method declarations, default
	 * private abstract method declartions, if any
	 */
	public void model(); // todo: what is being modelled, model type attributes
	public void time(); // todo: date time, when is this
	public void space(); // todo: geo location, where is this, earth another planet
	
	/**
	 * defualt method implementation declarations, if any
	 */

}