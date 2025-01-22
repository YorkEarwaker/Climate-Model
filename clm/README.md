# Climate model clm

Start at climate model. Related to weather model. Related to planetary boundary science

Model contents include amoungst others;
* Physical principles, physical laws
* Variables, varients, of physical principles
* Constsants, invarients, of physical principles
* Parameterization, various systems and cycles, physicl processes, physics, chemistry, geology, topogrophy, ...

Will likely eventually be a multi code project.  

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

DONE
* <done: intent to commit>
* <done: started to model basic model components in Java, wip, iterate, >

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

parameters (perameterization), of cm, air, land, water, molecules, elements, 
* hydrocycle, water, H2O, 
* hydrocycle, clouds, 
* hydrocycle, rain, precipitation, 
* hydrocycle, snow, grownd cover and albedo effect, and precipitation?, 
* hydrocycle, ice, grownd & sea cover and albedo effect, 
* hydrocycle, evaporation
* hydrocycle, perculation? , loss from atmosphere to lithosphere subaquifer? 
* hydrocycle, runoff?, loss from atmosphere to liquid bodies, rivers, lakes, oceans, ?
* carboncycle?, C 6
* nitrogencycle?, N 7
* hydrogencycle?, H 1
* oxygencycle?, O 8? 
* phosphatecycle?, P 15? orthophosphate (PO4)3- 
* sulphercycle? S 16?, sulphides, coal bruning, acid rain, ocean acidification ...
* a n other cycle, 

parameters (perameterization), of cm, air, land, 
* topograpy
* orogrophy
* coast lines
* land cover
* soil types
* agriculture
* deforestation
* urbanisation, heat islands, albedo,

parameters (perameterization), of cm, air, water, oceans
* sea surface temperature sst,
* 

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

News Papers - climate models
* Climate Models, 8 January 2021, Elfatih Eltahir, Aaron Krol, Explainer, MIT Climate Portal, MIT, [WS](https://climate.mit.edu/explainers/climate-models)
* Unified Model, The Unified Model (UM) is a numerical model of the atmosphere used for both weather and climate applications., Met Office, [WS](https://www.metoffice.gov.uk/research/approach/modelling-systems/unified-model)
* Numerical Weather Prediction Model, weather forecasting, Met Office, [WS](https://www.metoffice.gov.uk/research/approach/modelling-systems/unified-model/weather-forecasting)
* Seasonal and climate models, Configurations of the Unified Model for seasonal, decadal and centennial climate predictions, Met Office, [WS](https://www.metoffice.gov.uk/research/approach/modelling-systems/unified-model/climate-models)

News Papers - parameterization
*  Orographic processes, The influence of mountains and hills on both local weather and large-scale weather systems., Met Office, [WS](https://www.metoffice.gov.uk/research/foundation/parametrizations/orography)
* 

