# Climate model clm

Start at climate model. Related to weather model. Related to planetary boundary science.

Model contents include amoungst others;
* Physical principles, physical laws
* Variables, varients, of physical principles
* Constsants, invarients, of physical principles
* Parameterization, various systems and cycles, physicl processes, physics, chemistry, geology, topogrophy, ...
* Computation for, numerical analysis, grid kinds, 

Will likely eventually be a multi code project.  

## Goals & Objectives

For achievement of goals <better terms needed?, does not put accross intent sufficiently well? >
* Numerical weather prediction NWP
* Unified climate and weather model 
* Unified Earth systems model, 
* Universal planetary systems model 

To better enable objectives
* Earth systems science, 
* Extreme event attribution, 
* Extreme event prediction, 
* Planetary boundary science, 
* Planetary solvancy, 
* Donught economics, 
* Risk management, 
* Adaptation, change management
* Managed retreat, change managment
* and so on and so forth

## Status

TODO
* <todo: consider which of the model parts would best sit in physics \phy some of which would be shared by weather \wth model >
* <todo: consider which of the model parts would be shared with weather model \wth >
* <todo: consider, start with seven physical principles of climate model >
* <todo: consider, RegionalClimateModel interface, >
* <todo: consider, GlobalClimateModel interface, >
* <todo: consider, UnifiedModel interface, Regional and Global extensions, >
* <todo: ponder inheritance heirarchy, UML? >
* <todo: consider, NumericalWeatherModel interface, numerical weather prediction model, short term deterministic weather forecast, >
* <todo: consider, EnsambleWeatherModel interface, multiple model runs, >
* <todo: consider, SeasonalClimateModel interface, >
* <todo: consider, multi resolution model grids for NWP, Ensemble, others types, e.g. finer grained inner domain 1-2k, courser grained outer domain 4-5k, variable transition boundary between fine grain and course grain, >
* <todo: consider, model grid time step, time between factoring for grid point, >
* <todo: consider, model perterbations, model scenarios, for ensamble forecasts and other types, slight variations of conditions, >
* <todo: consider, model initial starting parameters, model secnarios, >
* <todo: consider, interfaces for DecadalClimateModel, CentenialClimateModel, other large time steps, >
* <todo: consider, model grid resolution, vertical hieght atmosphere resolution, vertical depth ocean resolution, >
* <todo: consider, prallelism, Java threading, >
* <todo: consider, core climate\weather model, dynamical core, laws of fluid motion, dynamical equations of fluid motion, non linar Naview Stokes partial differential equations, laws of thermodynamics, concervation laws for example of mass, >
* <todo: consider, dynamical core, spherical harmonics, >
* <todo: consider, hydrostatic equations of motion vs non hydrostatic equations of motion, >
* <todo: consider, 16 bit vs 32 bit vs 64 bit reals, mixed precision arithmatic, neural nets, >
* <todo: consider, changing project name to \unm or \uni or similar, to represent unified model or universal model,  >
* <todo: consider, multiple grid kinds for model, for different model run computation scenarios, >
* <todo: consider, climate/weather numerical prediction model, physics, that can represent extreme weather events well, most are not fit for purpose for doing so, High Priority! see also \eea >
* <todo: consider, model meta data for good fit in other use cases, \eea, \mph, \emr, \eco, \pbs, for each scenario use case which is meta data set required for good fit evaluation purpose? models to publish meta data? means to acquire meta data via model api? first pass at method to derive/get values where no bespoke use case scenario meta data exists, as gap analysis! see \eea EEA as first test case example, see \amn as one remedial step >
* <todo: consider, how to assess deficiencies in model for use case scenario where natural variability mask model systematic deficiencies for use case, related to meta data and \eea, \mph, \emr, \eco, \pbs, uc/scenarios, see \eea EEA as first test case example, see \amn as one remedial step >
* <todo: consider, macro meso micro, scales of analysis and interaction, climate models, business vertical e.g. epidemiology, health care and medicine, viticulture, building architecture, terms used differently, but both relate to climate, or is it that climate conditions in vinticulture use the term differently? different definition different analysis context?, >
* <todo: consider, macro meso micro, scales of analysis and interaction, climate models, confusion conflation with grid resolution km, different contexts in which terms are used in climatology,  >
* <todo: consider, macro meso micro, in vinticulture, macroclimate region river valley, mesoclimate locale within a region, microclimate a few rows in vinyard, canopy microclimate area directly around vine leaves, >
* <todo: consider, macro meso micro, in epidemiology, population level region, SIR model macro level model predicts spread of diseases across a population? >
* <todo: consider, macro meso micro, other views from other business verticals, domains of discourse, mapping of terminology with SKOS W3C ontology mapping, >
* <todo: consider, macro meso micro, e.g. is region in climate modeling the equivalent to eco biome Global 200 concept? >
* ...

DONE
* <done: intent to commit>
* <done: started to model basic model components in Java, wip, iterate, >
* <done: consider, grid for model, create separate documentation page for same. >
* <done: consider, review of Met Office parameterization criteria, wip >
* <done: consider, move parameterization content to separate page in documentation, >

## Libraries

Libs
* ClimateLab [GH](https://github.com/climlab/climlab), Python, package for process-oriented climate modeling

Languages
* Java, 
* C, not in this iteration
* Cpp, not in this iteration
* other? Python, analytics? not in this iteration

## Learning

Book
* The Climate Laboratory, A hands-on approach to climate physics and climate modeling, Brian E. J. Rose, University at Albany, [WS](https://brian-rose.github.io/ClimateLaboratoryBook/courseware/climate-system-models.html)

## References

* Climate model
* Unified model

Model equations
* physical principles,
* variables of physical principles
* Parameterisation
* 

physical principles, of cm, seven
* conservation of air mass
* conservation of water mass
* conservation of energy
* conservation of momentum of air in three directions
* ideal gas law applied to air

model - hydrostatic
* hydrostatic equation solver
* Euler equations? highly compressable? 
* bore speed, large scale feature of flow
* interface thickness, large scale feature of flow
* macro scale, 
* low resolution, course grained

model - non hydrostatic
* non hydrostatic equation solver
* Earths gravity downward effect on upward decrease in air pressure with hight aka upward directed gradient force, 
* hydrostatic equilibrium, on Earth downward gravity force cancels upward directed gradient force
* meso scale, regional models, 
* mid? resolution, 

model - Earths rotation, <todo: move to \phy ?>
* Coriolis effect, 
* centrifugal effect,
* <todo: other rotation effects? >
* model kinds ?
* coriolis influences circulaton patterns of atmosphere and oceans, causes air and water to move in curved path
* coriolis affects large scale weather patterns and ocean currents
* upward? centrifugal effect of earth spin ? 
* downward? coriolis effect of eartch spin ?
* Earths gravity effect and Earths spin Coriolis effect
* Earths gravity effect and Earths spin centrifugal effect

variables, of principles, of cm, seven
* air temperature
* pressure
* density
* water vapor content
* wind magnitude in three directions

model - resolution, of cm
* fine grained, tens of kilometers
* course grained, hundreds of kilometers
* micro scale level, grid resolution ?km, local climate; mountain, valley, city, science direct [WS](https://www.sciencedirect.com/topics/engineering/microclimate)
* meso scale level, grid resolution ?km, regional climate; geographical homogeneous area science direct [WS](https://www.sciencedirect.com/topics/engineering/mesoclimate), 
* macro scale level, grid resolution ?km, global climate; 

geo location, of cm
* global, course grained, IPCC, 
* regional, fine grained, disease, agriculture, adaptation, 

Chemical elements, earth systems, 
* Abundance of chemical elements, [WP](https://en.wikipedia.org/wiki/Abundance_of_the_chemical_elements)
* Chemical compostion of atmosphere, [WP](https://en.wikipedia.org/wiki/Atmosphere_of_Earth#Composition)
* Chemical composition of sea water, [WP](https://en.wikipedia.org/wiki/Seawater#Chemical_composition)

Papers - nwp/ncp
* The physics of numerical analysis: a climate modelling case study, 2020, Palmer T. N., Phil. Trans. R. Soc. A.37820190058, [DOI](http://doi.org/10.1098/rsta.2019.0058), [WS](https://royalsocietypublishing.org/doi/10.1098/rsta.2019.0058)

Papers - AI/ML
* Neural general circulation models for weather and climate., 22 July 2024, Kochkov, D., Yuval, J., Langmore, I. et al., Nature 632, 1060–1066 (2024). [DOI](https://doi.org/10.1038/s41586-024-07744-y)

Papers - grid, physics
* An unstructured-grid, finite-volume, nonhydrostatic, parallel coastal ocean simulator, 3 May 2006, O.B. Fringe, M. Gerritsen, R.L. Street, Ocean Modelling, Volume 14, Issues 3–4, 2006, Pages 139-173, [DOI](https://doi.org/10.1016/j.ocemod.2006.03.006), science direct [WS](https://www.sciencedirect.com/science/article/abs/pii/S1463500306000394), Stanford [PDF](https://web.stanford.edu/~fringer/publications/obf_oceanmodelling_2006_14.pdf)

Papers - ocean circulation
* Continued Atlantic overturning circulation even under climate extremes. 26 February 2025, Baker, J.A., Bell, M.J., Jackson, L.C. et al.,  Nature 638, 987–994 (2025). [DOI](https://doi.org/10.1038/s41586-024-08544-0) [WS](https://www.nature.com/articles/s41586-024-08544-0)

News Papers - climate models
* Climate Models, 8 January 2021, Elfatih Eltahir, Aaron Krol, Explainer, MIT Climate Portal, MIT, [WS](https://climate.mit.edu/explainers/climate-models)
* Unified Model, The Unified Model (UM) is a numerical model of the atmosphere used for both weather and climate applications., Met Office, [WS](https://www.metoffice.gov.uk/research/approach/modelling-systems/unified-model)
* Numerical Weather Prediction Model, weather forecasting, Met Office, [WS](https://www.metoffice.gov.uk/research/approach/modelling-systems/unified-model/weather-forecasting)
* Seasonal and climate models, Configurations of the Unified Model for seasonal, decadal and centennial climate predictions, Met Office, [WS](https://www.metoffice.gov.uk/research/approach/modelling-systems/unified-model/climate-models)
* What are the applications of hydrostatic solvers vs non-hydrostatic solvers in numerical weather prediction?, [WS](https://earthscience.stackexchange.com/questions/2257/what-are-the-applications-of-hydrostatic-solvers-vs-non-hydrostatic-solvers-in-n), 11 July 2014, StackExchange, Earth Science, 

News Papers - observations
* How we measure atmospheric pressure, Atmospheric pressure is measured by a barometer that employs a silicon capacitive pressure sensor having excellent repeatability and long term stability characteristics., Met Office, [WS](https://www.metoffice.gov.uk/weather/guides/observations/how-we-measure-atmospheric-pressure)
