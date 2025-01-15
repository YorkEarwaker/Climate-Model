/**
 * Global Warming Model
 */
package org.agw.gwm;

/**
 * SimpleGlobalWarmingModel
 */
public class SimpleGlobalWarmingModel implements GlobalWarmingModel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Simple Global Warming Model!");
	}
	
	/**
	* default-constructor
	*/ 
	private SimpleGlobalWarmingModel() {
		super();
		System.out.print("Simple Global Warming Model.default-constructor ");
	}
	
	/**
	 * from Model
	 */
	@Override
	public void model() {
		System.out.print("Simple Global Warming Model.model ");
	}
		
	@Override
	public void time() {
		System.out.print("Simple Global Warming Model.time ");
	}
	
	@Override
	public void space() {
		System.out.print("Simple Global Warming Model.space ");
	}
	
	/**
	 * from GlobalWarmingModel
	 */
	@Override
	public void radiativeForcingEstimate() {
		System.out.print("Simple Global Warming Model.radiativeForcingEstimate ");
	}
	
	@Override
	public void globalMeanSurfaceTemperature() {
		System.out.print("Simple Global Warming Model.radiativeForcingEstimate ");
	}
	
	@Override
	public void atmosphericCO2Concentration() {
		System.out.print("Simple Global Warming Model.radiativeForcingEstimate ");
	}
}
