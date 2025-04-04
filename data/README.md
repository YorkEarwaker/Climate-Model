# Data

Anthropogenic global warming and climate change are long term topics of concern. 

Weather data and climate data is a first class topic of concern.

Data kinds
* Climate, backward looking - centuries millenia age/stage epoch/series ..., forward looking - far time projections years decades centuries millennia,
* Weather, backward looking - years decades centuries, forward looking - near time projections days weeks months years
* Atmospheric, gas phase
* Oceanic, liquid phase
* Lithographic, solid phase
* Cryospheric, solid phase
* Biospheric, phases? sinks, absorbtion, emission, 
* Anthrospheric, emmision, storage, transformation, 
* Metadata
* Reference
* Series, time series weather/climate
* Pipeline, data transformation protocols for eea and like topics of concern 
* ...

## Status

TODO
* <todo: create projects per data type identified >
* <todo: consider better name than Series? time series weather/climate, not to confuse it with epoch/series? consult Met Office WMO WWA >
* <todo: consider moving data related concerns from other project here, for example eea datapiplines for statistical climatology >
* <todo: consider, first cut pull services to access data storage sites, RESTful, JSON, other? implies Java project, polling? probably only to dedicated notification resources,  >
* <todo: consider, first cut alert services to warn of unusal readings from data storage sites, RESTful, JSON, other? implies Java project, >
* <todo: consider, ontology package, \ont either internal to data source src\org\agw\dat\ont, alternatley as a separate top level project \ont , src\org\agw\ont\ see todo statements in other projects re ontology like \eea, >

DONE
* <done: intent to commit >
* <done: RDF metadata started >

## Libraries
* to source

## Data
Sources of data for use in modelling.

Atmospheric CO2 Measurement Sites, and other aerosols and gasses
* Mauna Loa Observatory, Hawaii, since 1958, National Ocean and Atmospheric Administration NOAA, Scripps Institute of Oceanography
* World Data Centre for Greenhouse Gases WDCGG, Global Atmosphere Watch GAW program, data hosted in Japan Meteorological Agency JMA
* Réseau Atmosphérique de Mesure des Composés à Effet de Serre RAMCES, Institut Pierre-Simon Laplace IPSL, France and other locations globally
* NOAA/ESRL Baseline Observatory Network, data hosted in Carbon Dioxide Information Analysis Center CDIAC, Oak Ridge National Laboratory ORNL

Climate data products
* Global Land Data Assimilation System GLDAS, 
* Climate Hazards Group InfraRed Precipitation with Stations CHIRPS, 
* Global Data Assimilation System GDAS, 
* ...

Paeleoclimatology
* Temperature 12k [WS](https://lipdverse.org/project/temp12k/), multidecadal and milleninal-scale change in climate over the Holocene that is the last 12,000 years, relation to planetary boundary science pbs, 

Sources of other data kinds to list
* CPC Unified Gauge-Based Analysis of Global Daily Precipitation, since 1979 to present, daily global precipitation estimates,
* Deutscher Wetterdienst, time series data [WS](https://www.dwd.de/EN/ourservices/cdc/cdc_ueberblick-klimadaten_en.html)

## Libraries

Libs
* <to be sourced>

Software
* Grid Analysis and Display System (GrADS), software for accessing, manipulating, visualising, geophysical data,

Education
* Met Matters, RMS [WS](https://www.rmets.org/metmatters/where-find-detailed-weather-data), links to a number of weather data sources
* Kaggle, Community Prediction Competition, [WS](https://www.kaggle.com/c/weather/data)


## References

* Weather series data, uninterupted homogenaic long time series
* Forecast
* Hindcast

Data - met station based data validation, quality of data, integrity of data
* station-based validation data
* record structure data test
* range/limits test
* time and interval consistency test
* persistence test
* spatial consistency test
* rate of change limits, 
* no observed change limits, continous with time, 
* validation data completeness
* validation data availability
* observation variable
* observation site, variables at sites, 
* affects on model grid point behaviour for same variable/site 
* monitoring and telemetry
* calibration attention
* maintenance attention

Data - earth observation data validation, quality of data, integrity of data
* EO data, unverified? concern; uncertainty estimates have wide variation, 
* ...

Data - evaluation criteria, estimate relative to observed values, 
* Pearson's correlation coefficient R
* Nash Sutcliffe efficiency coefficient NSE
* Mean bias error MBE
* Root mean square error RMSE
* True positive rate TPR
* False positive rate FPR

Data - evaluation criteria, non linear analysis requirement, not currently served well? mixed domain data, meteorological and some other doamin for example public health, 
* cubic splines
* polynomial transformations
* others to source

Data - met station based reports
* METAR, 
* SYNOP, 


Data - model pipelines <todo: move to model?>
* Data assimilation DA, [SD](https://www.sciencedirect.com/topics/earth-and-planetary-sciences/data-assimilation), [WP](https://en.wikipedia.org/wiki/Data_assimilation), to provide accurate initial conditions for the model, combining model forecasts with observations
* Error covarience, 
* Observation operator, h(), H, map modelled variable to actual observational data, 
* Kalman filtering, 

Time scales
* Year, February 2034, projected year of breaching 1.5 Paris agreement global temperature, initial projection was March 2045, Paris Agreement signed December 2015, last sourced 14 January 2025
* Decade, 2020 to 2029 the 2020's decade 
* Century, 2001 to 2100 the twenty-first 21st century
* Millenium, 2001 to 3000 the 3rd millenium CE

News Papers - global warming, IPCC
* We’ve ‘lost’ 19 years in the battle against global warming since the Paris Agreement, 12th December 2023, ECMWF, Copernicus, [WS](https://climate.copernicus.eu/weve-lost-19-years-battle-against-global-warming-paris-agreement)
* ...

News Papers - data sets
* CPC Unified Gauge-Based Analysis of Global Daily Precipitation, [WS](https://climatedataguide.ucar.edu/climate-data/cpc-unified-gauge-based-analysis-global-daily-precipitation), retrieved 2025-02-21, National Center for Atmospheric Research Staff (Eds). Last modified 2022-09-09
* GPCC: Global Precipitation Climatology Centre.”, [WS](https://climatedataguide.ucar.edu/climate-data/gpcc-global-precipitation-climatology-centre), retrieved 2025-02-21, National Center for Atmospheric Research Staff (Eds). Last modified 2024-03-13 
* Aviation Data Enhances Met Office Weather Forecasts, [WS](https://www.metoffice.gov.uk/about-us/news-and-media/media-centre/weather-and-climate-news/2025/aviation-data-enhances-weather-forecasts), 6 Mar 2025, Nicola Maxey






