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
* <todo: Start to model basic model components in Java,  >
* <todo: consider which of the model parts would best sit in physics \phy some of which would be shared by weather \wth model >
* <todo: consider which of the model parts would be shared with weather model \wth >
* <todo: consider, start with seven physical principles of climate model >
* <todo: consider, RegionalClimateModel interface, >
* <todo: consider, GlobalClimateModel interface, >
* <todo: consider, UnifiedModel interface, Regional and Global extensions,
* <todo: ponder inheritance heirarchy, UML? >
* <todo: consider, NumericalWeatherModel interface, numerical weather prediction model, short term weather forecast, >
* <todo: consider, SeasonalClimateModel interface, >

DONE
* <done: intent to commit>

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

parameters (perameterization), of cm, molecules, elements, 
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

parameters (perameterization), of cm, land use
* topograpy
* orogrophy
* land cover
* soil types
* agriculture
* deforestation
* urbanisation, heat islands, albedo, 

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
* Numerical Weather Prediction Model, weather forecasting, [WS](https://www.metoffice.gov.uk/research/approach/modelling-systems/unified-model/weather-forecasting)

News Papers - parameterization
*  Orographic processes, The influence of mountains and hills on both local weather and large-scale weather systems., Met Office, [WS](https://www.metoffice.gov.uk/research/foundation/parametrizations/orography)
* 

