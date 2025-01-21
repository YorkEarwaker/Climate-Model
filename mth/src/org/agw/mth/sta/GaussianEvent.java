/**
 * Mathematics
 */
package org.agw.mth.sta;

/**
 * GaussianEvent
 * Stubb
 * <todo: consider different gaussian solutions, >
 * <todo: consider better name for this class ? related to eea things, but not sure Event is right name, maybe it is, ponder more, >
 */
public class GaussianEvent extends Gaussian {
	
	
	//<todo: consider variable types, should these even be here, in an abstract class perhpas? >
	//<todo: int is placeholder var type, taken from wwa eea paper https://doi.org/10.5194/ascmo-6-177-2020 >
	
	 private int shapeParameter ξ ; // Xi ξ https://en.wikipedia.org/wiki/Xi_(letter)
	 private int scaleParameter σ  ; // Sigma σ https://en.wikipedia.org/wiki/Sigma
	 private int threshold μ ; // Mu μ https://en.wikipedia.org/wiki/Mu_(letter)
	 private int thing x ; // the thing being modelled, precipitation, temperature, <todo: refactor, after better definition, >
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Gaussian Event"); // debug
	}
	
	/**
	* default-constructor
	*/ 
	public void gaussianEvent() {
		super();
		System.out.println("Gaussian Event.constructor"); // debug
	}

}