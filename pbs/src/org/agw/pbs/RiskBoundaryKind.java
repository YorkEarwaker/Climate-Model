/**
 * Planetary Boundary Science
 * 
 */
package org.agw.pbs;

/**
 * RiskBoundaryKind
 * Kinds of risk boundaries 
 * <todo: find ontology to base kinds on as difinitive source, Postdam PIK or SRC perhaps? >
 * 
 */
public enum RiskBoundaryKind {
		
	// <todo: review and refactor, use a consistent decomposition and agregation approach, 80% complete >
	PLANETARY_BOUNDARY ("Planetary Boundary"), // <todo: consider, probably not a correct item to list here, related to line on risk chart? elsewhere>
	HIGH_RISK_LINE ("High Risk Line"), // <todo: consider, probably not a correct item to list here, related to line on risk chart? elsewhere>
	SAFE_OPERATING_SPACE ("Safe Operating Space"), // risk kind, within planetary boundary
	ZONE_OF_UNCERTAINTY ("Zone of Uncertainty"), // risk kind, without, outside, planetary boundary, exceding safe operating space, uncertian consequences
	HIGH_RISK_ZONE ("High Risk Zone"), // risk kind, without, outside, planetary boundary, far exceding safe operationg space, likely existential risk to human existence, sink environment, 
	CONRTOL_VARIABLE  ("Control Variable"); // <todo: consider ?risk kind? is is a risk kind? delete?>
	
	private final String riskBoundary;
	
	/**
	* constructor
	*/
	private RiskBoundaryKind(String riskBoundary) {
		this.planetaryBoundary = riskBoundary;
	}
	
	public String getValue() {
		return(riskBoundary);
	}
}




