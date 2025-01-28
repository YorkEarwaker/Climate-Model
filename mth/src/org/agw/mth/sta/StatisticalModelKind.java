/**
 * Mathematics
 */
package org.agw.mth.sta;

/**
 * StatisticalModelKind
 * Kinds of statistical model, enum statistical model kind 
 * <todo: are these models in the same form used in other than extreme events?  >
 */
public enum StatisticalModelKind {
	
	DIRAC ("Dirac"), // Dirac delta function <todo: consider refactoring, Dirac does not fit well here. only part of a method as function, >
	GAUSSIAN ("Gaussian"), // 
	GPD ("GPD"), // generalised Pareto distribution GPD, also known as peak over threshold POT
	GEV ("GEV"), // generalised extreme value GEV
	GUMBLE ("Gumble"), // 
	GAMMA ("Gamma"); // 
	
	private final String statisticalModel;
	
	/**
	* constructor
	*/
	private StatisticalModelKind(String statisticalModel) {
		this.statisticalModel = statisticalModel;
	}
	
	public String getValue() {
		return(statisticalModel);
	}
}