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
	 */
	public void time(); // todo: date time, when is this
	
	/**
	 * spacial definition of event
	 */
	public void space(); // todo: geo location, where is this, earth another planet
	
	/**
	 * defualt method implementation declarations, if any
	 */

}