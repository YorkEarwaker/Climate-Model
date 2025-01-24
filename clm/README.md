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
* <todo: consider, review of Met Office parameterization criteria >
* <todo: consider, multi resolution model grids for NWP, Ensemble, others types, e.g. finer grained inner domain 1-2k, courser grained outer domain 4-5k, variable transition boundary between fine grain and course grain, >
* <todo: consider, model grid time step, time between factoring for grid point, >
* <todo: consider, model perterbations, model scenarios, for ensamble forecasts and other types, slight variations of conditions, >
* <todo: consider, model initial starting parameters, model secnarios, >
* <todo: consider, interfaces for DecadalClimateModel, CentenialClimateModel, other large time steps, >
* <todo: consider, model grid resolution, vertical hieght atmosphere resolution, vertical depth ocean resolution, >
* <todo: consider, prallelism, Java threading, >
* <todo: consider, core climate\weather model, dynamical core, laws of fluid motion, dynamical equations of fluid motion, non linar Naview Stokes partial differential equations, laws of thermodynamics, concervation laws for example of mass, >
* <todo: condider, dynamical core, spherical harmonics, >
* <todo: consider, hydrostatic equations of motion vs non hydrostatic equations of motion, >
* <todo: consider, 16 bit vs 32 bit vs 64 bit reals, mixed precision arithmatic, neural nets, >
* <todo: consider, changing project name to \unm or \uni or similar, to represent unified model or universal model,  >
* <todo: consider, multiple grid kinds for model, for different model run computation scenarios, >
* <todo: better organise, parameters (perameterization), of cm, example of atmospheric processes and parametrization, see Met Office article >
* <todo: consider, move parameterization content to seperate page in documentation, >

DONE
* <done: intent to commit>
* <done: started to model basic model components in Java, wip, iterate, >
* <done: consider, grid for model, create seperate documentation page for same. >

## Libraries

Libs
* to source

Languages
* Java, 
* C, not in this iteration
* Cpp, not in this iteration
* other? Python, analytics? not in this iteration

## References

* Climate model
* Unified model

Model equations
* physical principles,
* varibles of physical principles
* Parameterization
* 

physical principles, of cm, seven
* conservation of air mass
* conservation of water mass
* conservation of energy
* conservation of momentum of air in three directions
* ideal gas law applied to air

variables, of principles, of cm, seven
* air temperature
* pressure
* density
* water vapor content
* wind magnitude in three directions

resolution, of cm
* fine grained, tens of kilometers
* course grained, hundreds of kilometers
* 
geo location, of cm
* global, course grained, IPCC, 
* regional, fine grained, disease, agriculture, adpatation

Chemical elements, earth systems, 
* Abundance of chemical elements, [WP](https://en.wikipedia.org/wiki/Abundance_of_the_chemical_elements)
* Chemical compostion of atmosphere, [WP](https://en.wikipedia.org/wiki/Atmosphere_of_Earth#Composition)
* Chemical composition of sea water, [WP](https://en.wikipedia.org/wiki/Seawater#Chemical_composition)

Papers
* The physics of numerical analysis: a climate modelling case study, 2020, Palmer T. N., Phil. Trans. R. Soc. A.37820190058, [DOI](http://doi.org/10.1098/rsta.2019.0058), [WS](https://royalsocietypublishing.org/doi/10.1098/rsta.2019.0058)
* Neural general circulation models for weather and climate., 22 July 2024, Kochkov, D., Yuval, J., Langmore, I. et al., Nature 632, 1060–1066 (2024). [DOI](https://doi.org/10.1038/s41586-024-07744-y)

News Papers - climate models
* Climate Models, 8 January 2021, Elfatih Eltahir, Aaron Krol, Explainer, MIT Climate Portal, MIT, [WS](https://climate.mit.edu/explainers/climate-models)
* Unified Model, The Unified Model (UM) is a numerical model of the atmosphere used for both weather and climate applications., Met Office, [WS](https://www.metoffice.gov.uk/research/approach/modelling-systems/unified-model)
* Numerical Weather Prediction Model, weather forecasting, Met Office, [WS](https://www.metoffice.gov.uk/research/approach/modelling-systems/unified-model/weather-forecasting)
* Seasonal and climate models, Configurations of the Unified Model for seasonal, decadal and centennial climate predictions, Met Office, [WS](https://www.metoffice.gov.uk/research/approach/modelling-systems/unified-model/climate-models)
* Atmospheric processes and parametrization scientists, Our atmospheric processes and parametrization scientists, Met Office, [WS](https://www.metoffice.gov.uk/research/approach/our-research-staff/parametrization)

News Papers - obervations
* How we measure atmospheric pressure, Atmospheric pressure is measured by a barometer that employs a silicon capacitive pressure sensor having excellent repeatability and long term stability characteristics., Met Office, [WS](https://www.metoffice.gov.uk/weather/guides/observations/how-we-measure-atmospheric-pressure)
