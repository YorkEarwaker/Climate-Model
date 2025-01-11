/**
 * Global Warming Model
 */
package org.agw.gwm;

/**
 * GlobalWarmingModel
 * 
 */
public interface GlobalWarmingModel extends ClimateModel {

	/**
	 * @param args
	 */
	public void forcing(); // todo: what are the specific warming causes, rename method?

}
