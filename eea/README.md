# Extreme event attribution eea

Extreme weather event attribution as they occure in the present. Past event attribution to out of holocine climate conditions at the time. Preditcion of future extreme weather event prediciton on scenario conditions. Prediction of new kinds of as yet unexperienced extreme weather events.

An attempt toward some means of automation. Operationalization.

Events like; convective storms, extra-tropical cylones, tropical cyclones, precipitation, drought, heat, snow and ice, cold, ...

Effects like, amoungs others; climate refugees, climate migration, wet bulb event organ failure deaths, flood drowning deaths, fire burns deaths, infrastructure failure/damage/destruction, algal blooms, outgassing, marine life die off, famine, flood, fire wildfires,/urban-firestorms, conflict, ...

## Status

TODO
* <todo: upload first module core, java directory source structure>
* <todo: look at Imperial web site, EEA collateral, >
* <todo: email Imperial EEA team, inquire where it might be possible to contribute, >
* <todo: use of gai as means of interpretation reasoning, creation of gai capability a seperate project/programme, >
* <todo: create boscard >
* <todo: obervational data aquisition for analysis, reliability issues, homogeneity issues, missing data gap issues, etc  . requirement for protocols, requirements for seperate project UN WWO working with partners like WWA and others to create 'reliable off the shelf' data set avaiable, local regional gobal, for eea efforts and others, data is a first class issue, >
* <todo: requirement, observational data, long time series up to and including the event, >
* <todo: statistical analysis of data, methods, protocols, processes, activities, tasks, workflow, this should be part of data project >
* <todo: consider, climate/weather numerical prediction model, physics, that can represent extreme weather events well, most are not fit for purpose for doing so, High Priority! see also \clm >
* <todo: consider, gap analysis of existing climate/weather models NP physics, which have capability to model specific extreme weather events kinds,  >
* <todo: consider, what are the model test/evaluation criteria for these? to best operationalise? >
* <todo: consider, what is the model metadata required for evaluation? how to make EEA model evaluation meta data available for all models? see also \clm meta data climate model concerns >
* <todo: consider, indecies like; Fire Weather Index FWI, meteorological information; temperature, humidity, wind speed, precipitation, . time; preceding weeks and months. use FWI for characteristics making wildfire more likely, atmospheric patterns and other trends,  >
* <todo: consider, list all indecies like FWI for extreme event attribution, as first step to operationalise in code base; protocols, methods, processes, algorithms, variables, , >
* <todo: consider, determine extreme climate event ece as a attribution concern with separate parallel but distinct protocol to extreme weather event ewe? Is the input for ece projected extreme events ee base on planetary boundary science? doughnut economics? future cast, regional models? future cast possibly of ele's?>
* <todo: consider, substantive difference between terms, extreme meteorological event eme, extreme weather event ewe, extreme climate event ece, other similar terms . for example and extreme anthropogenic event eae might also be an eme, ewe, ece, but an eae may be unrelated to meteorology, it might be political or economic or social and so on, >
* <todo: consider, relation to extreme geological event ege, where it might be a solar flare, caldera, earth quake, stumani, earth magnetic poll switch, and so on, some of which at extreme might also be classified as ele,  . >
* <todo: consider, off the shelf prepackaged model run data for extreme events, medium term, requires regional models at low enough resolution for all ee scenario and ee use cases, open source (and COTS), open source preferred, >
* <todo: consider, off the shelf model configuration,  open source (and COTS), open source preferred, >
* <todo: consider, ontology set for weather models/climate models as a means of standardisation, common nomencalture, common units of measure, and so on, implies weather ontology and climate ontology as prerequisites, >
* <todo: consider, ontology set for domains of discourse - eea, pbs, mph, eco, geo, clm, amn, and so on, -  common nomencalture, common units of measure, and so on, as applied science and engineering, >
* <todo: consider, INFORM Global Risk Index GRI, risk management index, link to \mph or \emr or other similar? see step 7 activty in EEA protocol vulnerability and exposure analysis, >
* ...

DONE
* <done: Intent to start, >
* <done: consider org\agw\eea AnthropogenicEventAttribution interface >

## Libraries

Climate and weather specific ones.
* KNMI Climate Explorer, [WS](https://climexp.knmi.nl/start.cgi), GitLab <todo: source url to hyperlink, >,  web application

Models
* climate prediction dot net CPDN, [WS](https://climateprediction.net/)
* CPDN, weather@home, wwa [WS](https://www.worldweatherattribution.org/weatherhome/), regional climate model
* CPDN, others to list ...
* PRECIS, info [WS](https://www.metoffice.gov.uk/research/applied/international/precis/introduction), tech manual [PDF](https://www.metoffice.gov.uk/binaries/content/assets/metofficegovuk/pdf/research/applied-science/precis/tech_man_v2.pdf), Met Office, CPDN, regional climate model, downscaled 50km - 25km resolution, 

Languages
* Java, app server side, 
* Python, analytics?, not in current iteration
* C++, hardware, firmware, GPU, etc, not in current iteration
* TypeScript, i.e. node.js etc, not in current iteration

Data
* JSON, data interchange, 
* Linked data, ontology, worm holes, 
* RDF, triples, directed graphs, 

## References

Papers - science, eea
* A protocol for probabilistic extreme event attribution analyses, 10 Nov 2020 (Published), Philip, S., Kew, S., van Oldenborgh, G. J., Otto, F., Vautard, R., van der Wiel, K., King, A., Lott, F., Arrighi, J., Singh, R., and van Aalst, M.: Adv. Stat. Clim. Meteorol. Oceanogr., 6, 177–203, 2020. [DOI](https://doi.org/10.5194/ascmo-6-177-2020), [WS](https://ascmo.copernicus.org/articles/6/177/2020/)
* Pathways and pitfalls in extreme event attribution. 10 May 2021 (Published), van Oldenborgh, G.J., van der Wiel, K., Kew, S. et al., Climatic Change 166, 13 (2021)., [DOI](https://doi.org/10.1007/s10584-021-03071-7), [WS](https://link.springer.com/article/10.1007/s10584-021-03071-7)
* Formally combining different lines of evidence in extreme-event attribution, 30 Oct 2024 (Published), Friederike E. L. Otto, Clair Barnes, Sjoukje Philip, Sarah Kew, Geert Jan van Oldenborgh, Robert Vautard, Volume 10, issue 2, ASCMO, 10, 159–171, 2024, Advances in Statistical Climatology, Meteorology and Oceanography, [DOI](https://doi.org/10.5194/ascmo-10-159-2024), [WS](https://ascmo.copernicus.org/articles/10/159/2024/)

Papers - incident reports, eea
* Climate change increased the likelihood of wildfire disaster in highly exposed Los Angeles area, 28 January, 2025, Clair Barnes, etal, World Weather Attribution, [PDF](https://www.worldweatherattribution.org/wp-content/uploads/WWA-scientific-report-LA-wildfires-1.pdf), [WS](https://www.worldweatherattribution.org/climate-change-increased-the-likelihood-of-wildfire-disaster-in-highly-exposed-los-angeles-area/)

News Papers - science, eea
* World Weather Attribution, methods [WS](https://www.worldweatherattribution.org/methods/),

News Papers - incident reports, eea
* LA wildfires more likely because of climate change, says attribution study, 31 January 2025, Simon Levey, Sam Ezra Fraser-Baxter, Imperial, [WS](https://www.imperial.ac.uk/news/260633/la-wildfires-more-likely-because-climate/) 
* Smouldering materials cause toxic fumes as LA wildfires damp down, 31 January 2025, Martin Sayers, Eleanor Green, Simon Levey, Imperial, [WS](https://www.imperial.ac.uk/news/260634/smouldering-materials-cause-toxic-fumes-la/)

Tools
* UK climate extremes, [WS](https://www.metoffice.gov.uk/research/climate/maps-and-data/uk-climate-extremes), Met Office
* UK daily weather extremes, [WS](https://www.metoffice.gov.uk/weather/observations/weather-extremes), Met Office

Terms
* Extreme event, 
* Extreme event attribution, [WP](https://en.wikipedia.org/wiki/Extreme_event_attribution)
* Extreme weather, event,
* Statistical Climatology,

Resolution
* Downscaling, resolution for regional climate models
* Regional climate model, RCM, 
* Dynamical downscaling
* Statistical downscaling

Baseline - reference value, observed, reconstructed, 1900 baseline for eea investigations, 
* Global Surface Temperature GST, [WP](https://en.wikipedia.org/wiki/Global_surface_temperature), weighted average temperature over land and oceans, global mean surface temperature GMST, global average surface temperature GAST, 
* Ocean heat content OHC, ocean heat uptake OHU, 
* Sea surface temperature SST, surface layer, 
* Surface air temperature SAT, surface layer, over land and ice, 
* Temperature, Climate proxy record, reconstructed, tree rings, marine sediments, lake sediments, ice cores, coral rings, paeleoclimatology, past climate, 
* Temperature, Instrumental temperature record, observed, reliable temperature measurements, circa 1850-1880, UK, others?
* ...

Organisations academy
* World Weather Attribution, [WS](https://www.worldweatherattribution.org/), [WP](https://en.wikipedia.org/wiki/World_Weather_Attribution), multi nation academic effort, 

Mathematics
* Statisics
