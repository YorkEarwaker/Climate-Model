# Autonomous meteorological network amn

Units oversight by local jurisdiction national meteorolgical and hydrological service NMHS. In coordination with other stakeholders; public health, environment agency, transport agency, agriculture agency, metropolitan agency, and so on. Specific stakeholder sites of interest. Unmanned technology systems. Synoptic six hourly, hourly, other temporal resolution time measure metric. System of systems. Local, regional, and global systems management.

Meeting WMO standards. Other standard sub sets, yet to be defined, for specific stakeholder group concerns. Standards deltas from WMO base station optimal might be on a; per observational instrument unit basis, or use case scenario basis, or industry vertical basis, ? 

Land born units fixed s/m/l, water born units buoys, air born units weather balloons. Likely meso amn's for different concerns of diverse stakeholder groups. For example, meso networks for; public health and epidemiology, micro climates of large urban centres, transport (road, rail, air, marine, ) infrastructure network, agricultural irrigation network, telco network, energy (electric, hydrogen, fossil, ) network, and so on.

Weather/climate data is a first class topic of concern. 

See 
* Extreme event attribution eea [GH](https://github.com/YorkEarwaker/Climate-Model/tree/main/eea)
* Global warming model gwm [GH](https://github.com/YorkEarwaker/Climate-Model/tree/main/gwm), global warming level, e.g. IPCC 1.5 Paris Agreement
* Planetary boundary science pbs [GH](https://github.com/YorkEarwaker/Climate-Model/tree/main/pbs)
* Weather and climate data [GH](https://github.com/YorkEarwaker/Climate-Model/tree/main/data), 
* Medicine and public health mph [GH](https://github.com/YorkEarwaker/Climate-Model/tree/main/mph)
* others tbd ...

## Goals & Objectives

* Toward, temporal and spacial completeness, geo coverage ground based, High priority!
* Toward, scope and quality and integrity, geo coverage ground based, High priority!
* Global warming data, global warming limits,
* World Weather Attribution data, extreme event attribution
* Extreme event emergency management response and recovery data
* Planning data, mitigation, adaptation, civil engineering, 
* Medicine and public health
* Planetary boundary science
* Future proofing adaptation
* Strategic resilliency 
* Global weather knows no borders
* Open source for complete transparency
* UN SDG's
* Development assistance

## Status

TODO
* <todo: research, >
* <todo: contact WMO >
* <todo: first itertion land born units, small, mediumm, large, small priority? check priority stakeholder group, assume small yes to avoid analysis parallysis, >
* <todo: parallel workstreams land, water, air, >
* <todo: Autonomous Meteorological Network, placeholder name, project name tbc, aws autonomous/automated weather station? wsn weather station network? msn meteorological station network? gmn global meterological network? other name?  >
* <todo: consider base instrumentation, Thermometer (air/sea surface temperature), Barometer (air pressure), Hydrometer (humidity), Anemometer (wind speed), Pyranometer (solar radiation), Rain guage (precipitation), Wind vane (wind direction), ceilometer (cloud height), present weather sensor/visibility sensor, ultrasonic snow depth sensor, Evaporation pan, others. Which are core base which are specific to context? >
* <todo: consider C++ repository structure, as this will be systems engineering; hardward, firmware, . some server side application code telemetry data processing, may require java code base, & web front end, >
* <todo: consider, several sub-directories to amn project if multiple code bases are required, >
* <todo: consider, similar objectives, autonomous atmospheric network aan, at varous heights in the gas phase column, gasses, aerosols, particulates, spectroscopy, high altitude airship/balloon h = P_0/ρg, h is altutude, P_0 initial pressure, ρ is air density, g is acceleration due to gravity, weather and environmental monitoring >
* <todo: consider, similar objectives, autonomous oceanic network aon, at varous depths in the liquid phase column, disolved gasses, temperature, flows, biome, Bathyscaphe, >
* <todo: consider, radiosondes, telemetry instrument that measures atmospheric variables and transmits them to the ground, battery powered, balloon lift, >
* <todo: consider, METAR every hour, SYNOP every six hours, and other report standards, >
* <todo: consider, station-based validation data, NFRs; completeness, availability, >
* <todo: consider, measurement and control module, data logger, like; Campbell Scientific CR10X,  >
* <todo: consider, power energy requirements, sml station base, battery, solar, wind, hydro, hydrogen, local grid (if available), >
* <todo: consider, standards WMO concern delta mitigation, unit basis, scenario basis, other basis, >
* <todo: consider, sourcing Met Office inspection scheme for weather stations, others like WMO, NOAA, and so on >
* <todo: consider, what are the optimal station distribution, who many per kilometre, for which use cases; climate ncp, meterological nwp, eea, mph, emr, business vertical like transport, and so on, >
* <todo: consider, how could business vertical and other use case scenarios datasets be used or made compatible for use in ncp/nwp models, that is be of necessary quality and integrity, they would greatly increase spatial resolution, and likely temporal resolution, that is joined upness, core to this in standardised instrument specs for quality and integrity and maintenance, but this should not be a focus for analysis paralysis, >

DONE
* <done: intent to commit >
* <done: consider OSGi repository structure, as this will be an IIoT systems engineering; . Will not better allow for multiple code bases, OSGi for implementation in Java centric projects, Apache Celix for OSGi implementation for C/C++ centric projects, >

## Standards

International - global
* Instruments and Methods of Observation Programme (IMOP), WMO, [WS](https://community.wmo.int/en/activity-areas/imop)

Jurisdiction - regional
* <todo: source for WMO measurement lead centres and others; CA, CN, DE, ES, EU, IT, JP, KR, FI, NO - nordic countries, RU, TR, UK, US, ... >
* <todo: source for WMO regional instrument centres and other; AG, AU, CN, DE, EG, FR, JP, TR, ...>
* ISO/IEC 17025, regional instrument centre accreditation criteria, 

Orgs
* Commission for Observation, Infrastructure and Information Systems INFCOM, WMO? 

## Libs

International
* Java assessment, regional instrument centres, WMO, [WS](https://wmoomm.sharepoint.com/sites/wmocpdb/eve_group/Forms/AllItems.aspx?id=%2Fsites%2Fwmocpdb%2Feve%5Fgroup%2FExpert%20Team%20on%20Quality%2C%20Traceability%20and%20Calibration%20%28ET%2DQTC%29%20%282020%2D2024%29%5F4b0a2388%2Dc404%2Deb11%2Da813%2D000d3a25bdee%2FGroup%20Members%2FJava%2Dassessment&p=true&ga=1)

## References

* Automatic weather station [WS](https://en.wikipedia.org/wiki/Automatic_weather_station), 
* Weather station [WP](https://en.wikipedia.org/wiki/Weather_station), Met Office [WS](https://www.metoffice.gov.uk/weather/learn-about/how-forecasts-are-made/observations/weather-stations)
* Systems engineering
* Industrial internet of things IIOT,
* Synoptic, set times of 24hr day,

Organisations
* WMO
* Regional Climate Centres RCCs,
* Regional Climate Outlook Forums RCOFs,
* National Meteorological and Hydrological Services NMHSs, for example; UK Met Office, 
* 

Hardware Bill of Materials BoM - to consider capablility like
* measurement, 
* monitoring, 
* telemetry, 
* control, 
* data logging, 
* data storage, 
* data retrieval,  
* 
* Instrument shelter, [WP](https://en.wikipedia.org/wiki/Stevenson_screen) Sevenson screen, 

Papers
* Guidelines on validation procedures for meteorological data from automatic weather stations, 9 March 2011, J. Estévez, P. Gavilán, J.V. Giráldez, Journal of Hydrology, Volume 402, Issues 1–2,
2011, Pages 144-154, ISSN 0022-1694, [DOI](https://doi.org/10.1016/j.jhydrol.2011.02.031.), [WS](https://www.sciencedirect.com/science/article/pii/S0022169411001594)

News Papers
* How are gases in the atmosphere analyzed and measured?, 18 October 2021, Andrew Moseman, Jesse Kroll, Ask MIT Climate, MIT, [WS](https://climate.mit.edu/ask-mit/how-are-gases-atmosphere-analyzed-and-measured), By shining different kinds of light and radiation through air samples, scientists can tell which gases are absorbing or reacting to that light, and in what amounts.
 * Weather Observation site classification, Met Office, [WS](https://www.metoffice.gov.uk/weather/learn-about/how-forecasts-are-made/observations/observation-site-classification)
 * ...

