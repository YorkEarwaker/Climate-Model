/**
 * Model 
 * Inheritance for models including: Boundary, Climate, Event, Weather, ...
 */
package org.agw.mdl;

/**
 * Model, 
 * WIP
 * 
 */
public interface Model {
	
	// <todo: final static constants, method declarations, method defualts, >
	
	/**
	 * public abstract method declarations, default
	 * private abstract method declartions, if any
	 */
	 
	/**
	 * model of the thing of concern
	 */
	public void model(); // todo: what is being modelled, model type attributes
	
	/**
	 * temporal defintion of thing of concern
	 * choice of timescale
	 * temporal extent 
	 */
	public void time(); // todo: date time, range, averages over durration, when is this
	
	/**
	 * spacial definition of thing of concern
	 * choice of area
	 * spacial extent 
	 */
	public void space(); // todo: geo location, averages over area, where is this, earth another planet
	
	/**
	 * defualt method implementation declarations, if any
	 */
	
}