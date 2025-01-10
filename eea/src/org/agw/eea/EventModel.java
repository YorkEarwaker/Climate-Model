/**
 * 
 */
package org.agw.eea;

/**
 * todo: provide arguments, consider generics
 */
public interface EventModel {
	
	/**
	 * constants; public static final field declarations, default
	 */

	/**
	 * public abstract method declarations, default
	 * private abstract method declartions, if any
	 */
	 
	/**
	 * model of the event
	 */
	public void model(); // todo: what is being modelled, model type attributes
	
	/**
	 * temporal defintion of event
	 * choice of timescale
	 * temporal extent 
	 */
	public void time(); // todo: date time, range, averages over durration, when is this
	
	/**
	 * spacial definition of event
	 * choice of area
	 * spacial extent 
	 */
	public void space(); // todo: geo location, averages over area, where is this, earth another planet
	
	/**
	 * defualt method implementation declarations, if any
	 */

}