/**
 * 
 */
package org.agw.gwm;

/**
 * todo: provide arguments, consider generics
 */
public interface GlobalWarmingModel extends ClimateModel {

	/**
	 * @param args
	 */
	public void forcing(); // todo: what are the specific warming causes, rename method?

}
