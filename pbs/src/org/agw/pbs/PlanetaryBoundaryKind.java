/**
 * Planetary Boundary Science
 * 
 */
package org.agw.pbs;

/**
 * PlanetaryBoundaryKind
 * Kinds of planetary boundary
 * <todo: find ontology to base kinds on as difinitive source, Postdam PIK or SRC perhaps? >
 *
 */
public enum PlanetaryBoundaryKind {
	
	// <todo: consider, does this overcomplicate choice? are there items missing? What is definitive nomenclature, short from, long form, etc? >
	// <todo: consider, this should be retrieved from a database for operational use, >
	// <todo: review and refactor, use a consistent decomposition and agregation approach, 80% complete >
	CLIMATE ("Climate"), // # 1 climate change
	CLIMATE_C02_CONCENTRATIONS ("Climate CO2 Concentrations"), // # 
	CLIMATE_RADIATIVE_FORCING ("Climate Radiative Forcing"), // # 
	STRATOSPHERE ("Stratosphere"), // # 3 stratospheric ozone depletion
	STRATOSPHERIC_OZONE ("Stratospheric Ozone"), // # 
	STRATOSPHERIC_OZONE_DEPLETION ("Stratospheric Ozone Depletion"), // # 
	ATMOSPHERE ("Atmosphere"), // # 9 atmospheric aerosol loading
	ATMOSPHERIC_AEROSOL ("Atmospheric Aerosol"), // # 
	ATMOSPHERIC_AEROSOL_LOADING ("Atmospheric Aerosol Loading"), // # 
	OCEAN ("Ocean"), // # 2 ocean acidification
	OCEAN_ACIDIFICATION ("Ocean Acidification"), // # 
	BIOGEOCHEMICAL ("Biogeochemical"), // # 4 biogeochemical flows
	BIOGEOCHEMICAL_NITROGEN_CYCLE ("Biogeochemical Nitrogen Cycle"), // # 
	BIOGEOCHEMICAL_PHOSPHORUS_CYCLE ("Biogeochemical Phosphorus Cycle"), // # 
	FRESHWATER ("Freshwater"), // # 5 global freshwater use
	FRESHWATER_GREEN_WATER ("Freshwater Green Water"), // # 
	FRESHWATER_BLUE_WATER ("Freshwater Blue Water"), // # 
	LAND_SYSTEM ("Land System"), // # 6 land system change
	BIOSHPERE ("Biospehre"), // # 7 erosion of biosphere integrity
	BIOSHPERE_FUNCTIONAL INTEGRITY ("Biospehre Functional Integrity"), // # 
	BIOSHPERE_GENETIC_DIVERSITY ("Biospehre Genetic Diversity"), // # 
	NOVEL_ENTITIIES ("Novel Entities"); // # 8 chemical pollution
	
	private final String planetaryBoundary;
	
	/**
	* constructor
	*/
	private PlanetaryBoundaryKind(String planetaryBoundary) {
		this.planetaryBoundary = planetaryBoundary;
	}
	
	public String getValue() {
		return(planetaryBoundary);
	}
}




