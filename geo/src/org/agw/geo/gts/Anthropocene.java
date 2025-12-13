/**
 * Geological Time Scale GTS
 */
package org.agw.geo.gts;

/**
 * Anthropocene, new geological age, age of man, large scale planetary wide human impact on geosphere and biosphere and other planetary natural systems
 * Place holder information until the Age is officially ratified
 * Anyone doubting that human (man) kind is responsible for extreme events in planetary geology is in Anthropocene denial
 * <todo: consider, relation to historiography periodization, extend modern age?, re stone age, bronze age, iron age, and so on. how to make this connection? steam age? atomic age? >
 */
public interface Anthropocene extends Epoch, Series {
	 
	 /**
	 * Information
	 */
	public static final String NAME = "Anthropocene";
	public static final String TIME_SPAN = "0.0002 - 0"; // consider range
	// ± within range, confidence interval, uncertainty bounding
	public static final double UNCERTAINTY_BOUNDING = 0; // 
	public static final double DURATION = 0.00017792638099106418; // 1778 steam age, consider other number type, 
	// Ma (megaannum), SI unit, paleontology, celestial mechanics, https://en.wikipedia.org/wiki/Year#SI_prefix_multipliers
	public static final String SI_UNIT = "Ma";
	
	/**
	 * Definition
	 */
	public static final String CHRONOLOGICAL_UNIT = Epoch.NAME;
	public static final String STRATIGRAPHIC_UNIT = Series.NAME;
	// <todo: upper boundary >
	// <todo: lower boundary > 
	// lower boundary, consider, ...
	// lower boundary, consider, industrial age, circa 1740, 
	// lower boundary, consider, steam (engine) age, James Watt & Matthew Boulton 1778, good choice marks start of mass use of coal and steam powered industry and atmospheric CO2 [WS](https://www.parliament.uk/about/living-heritage/transformingsociety/tradeindustry/industrycommunity/collections/collections/steam-engines-act/), Parliament, gov, UK
	// lower boundary, consider, consumer (mass production) age, Ford model T, circa 1908, [WP](https://en.wikipedia.org/wiki/Ford_Model_T)
	// lower boundary, consider, atomic age, 16 July 1945, Trinity test, [WS](https://www.afnwc.af.mil/About-Us/History/Trinity-Nuclear-Test/) , 
	// lower boundary, consider, ...
	public static final String HOMO_INDUSTRIAL_STEAM_URI = "https://www.parliament.uk/about/living-heritage/transformingsociety/tradeindustry/industrycommunity/collections/collections/steam-engines-act/"; // Parliament, gov, UK
	
	/**
	 * References
	 */
	public static final String WIKIPEDIA_URI = "https://en.wikipedia.org/wiki/Anthropocene"; // consider RDF friendly name for field
	/* geochronology, GSSA,  */
	public static final String GSSA_URI = "to be sourced"; // <todo: source, GSSA URI, link to ICS/IUGS resource, >
	/* chronostratigraphy, GSSP, hard science, physical evidence base, */
	public static final String GSSP_URI = "to be sourced"; // <todo: source, GSSP URI, link to ICS/IUGS resource, >
	 
	/**
	 * Atmospheric and climatic data
	 *
	 * Trends in CO2, CH4, N2O, SF6, [WS](https://gml.noaa.gov/ccgg/trends/), NASA, Global Monitoring Laboratory
	 * Carbon Dioxide - Earth Indicator, [WS](https://science.nasa.gov/earth/explore/earth-indicators/carbon-dioxide/), NASA, from 1958
	 * Global Mean CO2 Mixing Ratios (ppm): Observations, [WS](https://data.giss.nasa.gov/modelforce/ghgases/Fig1A.ext.txt), NASA, from 1850
	 * Climate change: atmospheric carbon dioxide, [WS](https://www.climate.gov/news-features/understanding-climate/climate-change-atmospheric-carbon-dioxide), NASA, 
	 * Advanced Global Atmospheric Gases Experiment, [WS](https://www-air.larc.nasa.gov/missions/agage/), NASA's Atmospheric Composition Focus Area in Earth Science
	 * Trends in atmospheric concentrations of CO2 (ppm), CH4 (ppb) and N2O (ppb), between 1800 and 2017, [WS](https://www.eea.europa.eu/en/analysis/maps-and-charts/atmospheric-concentration-of-carbon-dioxide-5), European Environment Agency, 1780, C02 280.1 ppm
	 * Atmospheric CO2 over the last 1000 years: A high-resolution record from the West Antarctic Ice Sheet (WAIS) Divide ice core, [WS](https://doi.org/10.1029/2011GB004247), 26 May 2012 , AGU, Global Biochemical Cycles, 
	 * CO2M (Carbon Dioxide Monitoring) Mission, [WS](https://www.eoportal.org/satellite-missions/co2m), Copernicus Anthropogenic Carbon Dioxide Monitoring (CO2M), European Space Agency (ESA)
	 *
	 * Annual concentration of atmospheric carbon dioxide, [WS](https://ourworldindata.org/grapher/co2-long-term-concentration), Our World Data, 
	 * Global C02 Levels [WS](https://www.co2levels.org/), 1780, C02 280.1 ppm
	 * Atmospheric C02 Earth [WS](https://www.co2.earth/),  
	 *
	 * Historic warships to be raided for missing climate data [WS](https://www.reading.ac.uk/news/2021/research-news/pr860780), 26 October 2021, University of Reading, Global Surface Air Temperature 
	 * Global Surface Air Temperature, [WS](https://glosat.org/), GloSAT, 
	 *
	 * Ocean acidification, [WS](https://www.noaa.gov/education/resource-collections/ocean-coasts/ocean-acidification), NOAA, 
	 *
	 * <todo: source, for 1778, for a number of molecules in atmosphere (ice core data), in sediment, in other tbd, >
	 * <todo: source, for 1778, temperature from various sources for example tree rings, other, ... for different locations, for different places, for different matter types in specific phase transitions,  >
	 */
	 // Atmosphere
	 // 1780, CO2 280.1 ppm // current best base sourced, 
	 // 1778, CO2 xxx.x ppm // Carbon dioxide
	 // 1778, CH4 xxx.x ppb // Methane
	 // 1778, N2O xxx.x ppb // Nitrous oxide
	 // 1778, SF6 xxx.x ppb // Sulphur hexafluoride
	 // 1778, XXX xxx.x ppm // ...
	 // 1778, ...
	 
	 // Temperature
	 // 1778, SST xxx.x C   // Sea Surface Temperature, average, 
	 // 1778, SAT xxx.x C   // Surface Air Temperature, average, 
	 // also other temperature values and metrics as they are deemed necessary, useful, diurnal temperature range (DTR) and other location specific metrics, boundary conditions highest/lowest at location at time of year at sea level land at elevation land ..., 
	 
	 // Oceans
	 // 1778, ocean acidity xxx.x pH     // fall of circa 0.1 pH units in last 200 yrs (1825-2025), pH logarithmic scale used to specify the acidity or basicity of aqueous solutions, 
	 // 1778, CO2           xxx.x ppm/b  // CO2 absorbed in the oceans, circa two thirds of anthropogenic CO2 is taken up by the oceans? more?
	 // 1778, HCO3,         xxx.x ppm/b  // CO2 + H2O + CO_3^2, -> 2 HCO_3^- , take up of carbonate ions to bicarbonate ions hampers impedes calcification for organisms in ocean biome 
	 // ...
	 
	 /**
	  * Archaeological data
	  *
	  * Fire, 
	  * fire, Homo neanderthalensis (human) made, pyrite & flint, 
	  * Humans made fire 350,000 years earlier than previously thought, [WS](https://www.youtube.com/watch?v=8nlr7f9P_yo), 10 December 2025, BBC News
	  * Earliest fire-making dating back 400,000 years unearthed in Suffolk, England, [WS](https://www.nhm.ac.uk/discover/news/2025/december/earliest-fire-making-dating-back-400-000-years-unearthed-in-suffolk-england.html), 10 December 2025, Josh Davis, Natural History Museum, retrieved 12 December 2025 17:34 UK
	  * Davis, R., Hatch, M., Hoare, S. et al. Earliest evidence of making fire. Nature (2025). https://doi.org/10.1038/s41586-025-09855-6 , 
	  */
	  public static final String HOMO_EARLIEST_FIRE_URI = "https://doi.org/10.1038/s41586-025-09855-6"; // paper for cited first homo genus fire record 
	  // <todo: source, some other official time date? record of same first fire evidence for homo genus, >
}
