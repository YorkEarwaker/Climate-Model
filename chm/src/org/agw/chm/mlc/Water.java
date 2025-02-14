/**
 * Chemical molecule
 */
package org.agw.chm.mlc;

/**
 * Water
 */
public record Water() implements Molecule {
	
	/**
	 * Information
	 */
	public static final String IUPAC_PIN_NAME = "Water"; //
	
	/**
	 * Definition
	 */
	
	/**
	 * References
	 * <todo: consider,  other URI sources, >
	 */
	public static final String WIKIPEDIA_URI = "https://en.wikipedia.org/wiki/Water";
	public static final String IUPAC_URI = "to be sourced";

}
