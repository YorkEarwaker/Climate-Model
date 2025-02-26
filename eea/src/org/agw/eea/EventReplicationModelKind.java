/**
 * Extreme Event Attribution
 */
package org.agw.eea;

/**
 * EventReplicationModelKind wip
 * perhaps naming of this thing is wrong not kind but Inst or List or Enum?
 * Climate and weather models used to replicate the extreme event
 * Should this be a Record instead? reference data?
 * How to include other context in this like originator Met Office, UK for example?
 * 
 * sources
 * https://link.springer.com/article/10.1007/s10584-021-03071-7
 * https://www.climatechangeinaustralia.gov.au/en/overview/methodology/list-models/
 * https://www.ipcc.ch/report/ar4/wg1/climate-models-and-their-evaluation/
 * https://brian-rose.github.io/ClimateLaboratoryBook/courseware/climate-system-models.html
 * https://psl.noaa.gov/ipcc/cmip6/models.html
 * https://en.wikipedia.org/wiki/Climate_model see footer Specific models
 */
public enum EventReplicationModelKind {
	
	// <todo: consider model naming standard, e.g. UK_MOCH_HadGEM3_A_N216 or HadGEM3_A_N216_UK_MOCH >
	// <todo: NA for fields that are not known? >
	// <todo: consider model naming; Use attribute list below as a starter for model naming? >
	// <todo: first iteration, list the model id first then think about naming convention >
	// <todo: pair with Java Record >
	/** 
	  * 
	  * CMIP5 Model ID
	  * Institute and Country of Origin
	  * Ocean horizontal resolution  (°lat x °lon)
	  * Atmosphere horizontal resolution (°lat x °lon)
	  * Atmosphere Eq. resolution
	  * Latitude  (Km)
	  * Longitude (Km)
	  * terms of use
	  */
	MIROC_ESM ("MIROC-ESM"), 
	CSIRO_Mk3_6_0 ("CSIRO-Mk3.6.0"), // CMIP5 CSIRO-Mk3.6.0 and CNRM-CM5,
	CNRM_CM5 ("CNRM-CM5"), // CMIP5 CSIRO-Mk3.6.0 and CNRM-CM5,
	HadGEM3_A_N216 ("HadGEM3-A N216"); //   
	/*
	Specific models
	Climate	
	IGCMHadCM3HadGEM1GFDL CM2.XCGCMCCSMCESMCFSv2ECHAM
	Global weather	
	IFS (ECMWF)FIMGEM / GDPSGFSMPASNAEFSNAVGEMUMJMA-GSMGME / ICONARPEGE
	Regional and mesoscale atmospheric	
	NAMRR / RAPRAMSWRFRAQMSHIRLAMLAPSRPMHWRFRGEMHRDPS
	Regional and mesoscale oceanographic	
	HyCOMROMSPOMMOMFVCOMMITgcmFESOMADCIRC
	Atmospheric dispersion	
	ADMSAERMODATSTEPAUSTAL2000CALPUFFDISPERSION21ISC3MEMOMERCURENAMEOSPMPUFF-PLUMERIMPUFFSAFE AIRSILAM
	Chemical transport	
	CLaMSMOZARTGEOS-ChemCHIMERE
	Land surface parametrization	
	JULESCLASSISBA
	Cryospheric models	
	CICE
	Discontinued	
	EtaLFMMM5NGMNOGAPSRUC
	*/
	
	private final String eventReplicationModel;
	
	/**
	* constructor
	*/
	private EventReplicationModelKind(String eventReplicationModel) {
		this.eventReplicationModel = eventReplicationModel;
	}
	
	public String getValue() {
		return(eventReplicationModel);
	}
}
