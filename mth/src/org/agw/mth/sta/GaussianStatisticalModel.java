/**
 * Mathematics
 */
package org.agw.mth.sta;

/**
 * GaussianStatisticalModel
 * Stubb
 * <todo: consider different gaussian solutions, >
  * <todo: consider deleting? possibly different usage than first imagined, and parhaps move back to org\agw\mdl ? >
 */
public class GaussianStatisticalModel extends StatisticalModel, Gaussian {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Gaussian Statistical Model"); // debug
	}
	
	/**
	* default-constructor
	*/ 
	public void gaussianStatisticalModel() {
		super();
		System.out.println("Gaussian Statistical Model.constructor"); // debug
	}
	
	@Override
	public void calculate() {
		System.out.println("Gaussian Statistical Model.calculate"); // debug
		// <todo: consider java math lib use here? >
	}

	// @Override the Model method declarations, 

}