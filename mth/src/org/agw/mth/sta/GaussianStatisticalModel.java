/**
 * Mathematics
 */
package org.agw.mth.sta;

/**
 * GaussianStatisticalModel
 * Stubb
 * <todo: consider different gaussian solutions, >
 */
public class GaussianStatisticalModel extends StatisticalModel {
	
	
	//<todo: consider variable types, should these even be here, in an abstract class perhpas? >
	//<todo: int is placeholder var type, taken from wwa eea paper https://doi.org/10.5194/ascmo-6-177-2020 >
	//<todo: implement these https://c-faq.com/lib/gaussian.html >
	 private int shapeParameter ξ ; // Xi ξ https://en.wikipedia.org/wiki/Xi_(letter)
	 private int scaleParameter σ  ; // Sigma σ https://en.wikipedia.org/wiki/Sigma
	 private int threshold μ ; // Mu μ https://en.wikipedia.org/wiki/Mu_(letter)
	 private int thing x ; // the thing being modelled, precipitation, temperature, <todo: refactor, after better definition, >
	
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

}