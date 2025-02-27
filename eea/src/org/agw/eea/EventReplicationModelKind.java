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
 * **
 * sources 
 * <todo: make more readable >
 * <todo: where is there a reference data online version of this information? >
 * <todo: consider database table, Kimble, DWH, star? >
 * <todo: consider polling for updates from online sources, which? any expose URI? what are the publishing schedules for model updates metadata info? >
 * **
 * https://www.climatechangeinaustralia.gov.au/en/overview/methodology/list-models/ <todo: columnise readability, sense making, >
 * CMIP5        Institute and         Ocean horizontal     Atmosphere horizontal	Atmosphere Eq. 
 * Model ID     Country of Origin     resolution           resolution               resolution  
 *                                    (°lat x °lon)        (°lat x °lon)            Latitude (Km) Longitude (Km)
 * 				                                                                    
 * ACCESS-1.0 # *	CSIRO-BOM, Australia	1.0×1.0	1.9×1.2	210	130
 * ACCESS-1.3 #	CSIRO-BOM, Australia	1.0×1.0	1.9×1.2	210	130
 * BCC-CSM1-1	BCC, CMA, China	1.0×1.0	2.8×2.8	310	310
 * BCC-CSM1-1-M #	BCC, CMA, China	1.0×1.0	1.1×1.1	120	120
 * BNU-ESM #	BNU, China	0.9×1.0	2.8×2.8	310	310
 * CanCM4	CCCMA, Canada	1.4×0.9	2.8×2.8	310	310
 * CanESM2 #	CCCMA, Canada	1.4×0.9	2.8×2.8	310	310
 * CCSM4 # *	NCAR, USA	1.1×0.6	1.2×0.9	130	100
 * CESM1-BGC	NSF-DOE-NCAR, USA	1.1×0.6	1.2×0.9	130	100
 * CESM1-CAM5	NSF-DOE-NCAR, USA	1.1×0.6	1.2×0.9	130	100
 * CESM1-FASTCHEM	NSF-DOE-NCAR, USA	1.1×0.6	1.2×0.9	130	100
 * CESM1-WACCM	NSF-DOE-NCAR, USA	1.1×0.6	2.5×1.9	275	210
 * CMCC-CESM	CMCC, Italy	2.0×1.9	3.7×3.7	410	410
 * CMCC-CM	CMCC, Italy	2.0×1.9	0.7×0.7	78	78
 * CMCC-CMS #	CMCC, Italy	2.0×2.0	1.9×1.9	210	210
 * CNRM-CM5 # *	CNRM-CERFACS, France	1.0×0.8	1.4×1.4	155	155
 * CNRM-CM5-2	CNRM-CERFACS, France	1.0×0.8	1.4×1.4	155	155
 * CSIRO-Mk3-6-0 #	CSIRO-QCCCE, Australia	1.9×0.9	1.9×1.9	210	210
 * EC-EARTH	EC-EARTH, Europe	1.0×0.8	1.1×1.1	120	120
 * FIO-ESM	FIO, SOA, China	1.1×0.6	2.8×2.8	310	310
 * GFDL-CM2p1	NOAA, GFDL, USA	1.0×1.0	2.5×2.0	275	220
 * GFDL-CM3 *	NOAA, GFDL, USA	1.0×1.0	2.5×2.0	275	220
 * GFDL-ESM2G #	NOAA, GFDL, USA	1.0×1.0	2.5×2.0	275	220
 * GFDL-ESM2M #	NOAA, GFDL, USA	1.0×1.0	2.5×2.0	275	220
 * GISS-E2-H	NASA/GISS, NY, USA	2.5×2.0	2.5×2.0	275	220
 * GISS-E2-H-CC	NASA/GISS, NY, USA	1.0×1.0	1.0×1.0	110	110
 * GISS-E2-R	NASA/GISS, NY, USA	2.5×2.0	2.5×2.0	275	220
 * GISS-E2-R-CC	NASA/GISS, NY, USA	1.0×1.0	1.0×1.0	110	110
 * HadCM3	MOHC, UK	1.2×1.2	3.7×2.5	410	280
 * HadGEM2-AO	NIMR-KMA, Korea	1.0×1.0	1.9×1.2	210	130
 * HadGEM2-CC #	MOHC, UK	1.0×1.0	1.9×1.2	210	130
 * HadGEM2-ES	MOHC, UK	1.0×1.0	1.9×1.2	210	130
 * INMCM4	INM, Russia	0.8×0.4	2.0×1.5	220	165
 * IPSL-CM5A-LR #	IPSL, France	2.0×1.9	3.7×1.9	410	210
 * IPSL-CM5A-MR #	IPSL, France	1.6×1.4	2.5×1.3	275	145
 * IPSL-CM5B-LR #	IPSL, France	2.0×1.9	3.7×1.9	410	210
 * MIROC4h	JAMSTEC, Japan	0.3×0.2	0.56×0.56	60	60
 * MIROC5 #	JAMSTEC, Japan	1.6×1.4	1.4×1.4	155	155
 * 
 * **
 * https://psl.noaa.gov/ipcc/cmip6/models.html <todo: columnise readability, sense making, >
 * Modeling Center	Model	Institution	terms of use
 * BCC	  BCC-CSM1.1   BCC-CSM1.1(m)	  Beijing Climate Center, China Meteorological Administration	 unrestricted 
 * CCCma	  CanESM2	  Canadian Centre for Climate Modelling and Analysis	 unrestricted 
 * CMCC	  CMCC-CESM   CMCC-CM	  Centro Euro-Mediterraneo per I Cambiamenti Climatici	  non-commercial only
 * CNRM-CERFACS	  CNRM-CM5	  Centre National de Recherches Meteorologiques / Centre Europeen de Recherche et Formation Avancees en Calcul Scientifique	 unrestricted 
 * CSIRO-BOM	  ACCESS1.0   ACCESS1.3	  CSIRO (Commonwealth Scientific and Industrial Research Organisation, Australia), and BOM (Bureau of Meteorology, Australia)	  non-commercial only
 * CSIRO-QCCCE	  CSIRO-Mk3.6.0	  Commonwealth Scientific and Industrial Research Organisation in collaboration with the Queensland Climate Change Centre of Excellence	 non-commercial only 
 * EC-EARTH	  EC-EARTH	  EC-EARTH consortium	 unrestricted 
 * FIO	  FIO-ESM	  The First Institute of Oceanography, SOA, China	 non-commercial only 
 * GCESS	  BNU-ESM	  College of Global Change and Earth System Science, Beijing Normal University	 unrestricted 
 * INM	  INM-CM4	  Institute for Numerical Mathematics	 unrestricted 
 * IPSL	  IPSL-CM5A-LR   IPSL-CM5A-MR   IPSL-CM5B-LR	  Institut Pierre-Simon Laplace	 unrestricted 
 * LASG-CESS	  FGOALS-g2	  LASG, Institute of Atmospheric Physics, Chinese Academy of Sciences; and CESS, Tsinghua University	  unrestricted
 * LASG-IAP	  FGOALS-s2	  LASG, Institute of Atmospheric Physics, Chinese Academy of Sciences	  unrestricted
 * MIROC	  MIROC5	  Atmosphere and Ocean Research Institute (The University of Tokyo), National Institute for Environmental Studies, and Japan Agency for Marine-Earth Science and Technology	 non-commercial only 
 * MIROC	  MIROC-ESM   MIROC-ESM-CHEM	 Japan Agency for Marine-Earth Science and Technology, Atmosphere and Ocean Research Institute (The University of Tokyo), and National Institute for Environmental Studies	 non-commercial only 
 * MOHC (additional realizations by INPE)	  HadGEM2-AO   HadGEM2-CC   HadGEM2-ES	  Met Office Hadley Centre (additional HadGEM2-ES realizations contributed by Instituto Nacional de Pesquisas Espaciais)	 unrestricted 
 * MPI-M	  MPI-ESM-LR   MPI-ESM-MR	  Max Planck Institute for Meteorology (MPI-M)	 unrestricted 
 * MRI	  MRI-CGCM3	  Meteorological Research Institute	 non-commercial only 
 * NASA GISS	  GISS-E2-H   GISS-E2-R	  NASA Goddard Institute for Space Studies	 unrestricted 
 * NCAR	  CCSM4	  National Center for Atmospheric Research	 unrestricted 
 * NCC	  NorESM1-M   NorESM1-ME	  Norwegian Climate Centre	 unrestricted 
 * NOAA GFDL	  GFDL-CM3   GFDL-ESM2G   GFDL-ESM2M	  Geophysical Fluid Dynamics Laboratory	 unrestricted 
 * NSF-DOE-NCAR	  CESM1(BGC)   CESM1(CAM5)	  National Science Foundation, Department of Energy, National Center for Atmospheric Research	 unrestricted 
 * 
 * **
 * https://en.wikipedia.org/wiki/Climate_model <todo: consider, transposition of this information >
 * Specific models
 * Climate	HadGEM1	GFDL CM2.X	CGCM	CCSM	CESM	CFSv2	ECHAM								
 * Global weather	IFS (ECMWF)	FIM	GEM / GDPS	GFS	MPAS	NAEFS	NAVGEM	UM	JMA-GSM	GME / ICON	ARPEGE				
 * Regional and mesoscale atmospheric	NAM	RR / RAP	RAMS	WRF	RAQMS	HIRLAM	LAPS	RPM	HWRF	RGEM	HRDPS				
 * Regional and mesoscale oceanographic	HyCOM	ROMS	POM	MOM	FVCOM	MITgcm	FESOM	ADCIRC							
 * Atmospheric dispersion	ADMS	AERMOD	ATSTEP	AUSTAL2000	CALPUFF	DISPERSION21	ISC3	MEMO	MERCURE	NAME	OSPM	PUFF-PLUME	RIMPUFF	SAFE AIR	SILAM
 * Chemical transport	CLaMS	MOZART	GEOS-Chem	CHIMERE											
 * Land surface parametrization	JULES	CLASS	ISBA												
 * Cryospheric models	CICE														
 * Discontinued	Eta	LFM	MM5	NGM	NOGAPS	RUC		
 * 
 * **
 * EEA paper
 * https://link.springer.com/article/10.1007/s10584-021-03071-7
 * 
 * general background information
 * https://brian-rose.github.io/ClimateLaboratoryBook/courseware/climate-system-models.html
 * https://www.ipcc.ch/report/ar4/wg1/climate-models-and-their-evaluation/
 */
public enum EventReplicationModelKind {
	
	// <todo: consider model naming standard, e.g. UK_MOCH_HadGEM3_A_N216 or HadGEM3_A_N216_UK_MOCH >
	// <todo: NA for fields that are not known? >
	// <todo: consider model naming; Use attribute list below as a starter for model naming? >
	// <todo: first iteration, list the model id first then think about naming convention >
	// <todo: pair with Java Record >
	// <todo: is there an climate model naming convention, WMO, ISO, other?>
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
	  * others tbd
	  */
	MIROC_ESM ("MIROC-ESM"), 
	CSIRO_Mk3_6_0 ("CSIRO-Mk3.6.0"), // CMIP5 CSIRO-Mk3.6.0 and CNRM-CM5,
	CNRM_CM5 ("CNRM-CM5"), // CMIP5 CSIRO-Mk3.6.0 and CNRM-CM5,
	HadGEM3_A_N216 ("HadGEM3-A N216"); //   
	
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
