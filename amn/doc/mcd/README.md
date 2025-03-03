# Measurement, control, data, mcd

Metrics and telemetry, data logging and storage, . 

What other variables and metrics might be included in a amn unit? Over and above standard meterological ones. Detection of gases, particles and particulates, microbiome, chemical molecules, and so on. Likely on a per use case and scenario basis. 

Modular system of systems approach to ensure pick and mix observational tools and instruments. Where over a certain limit, to be defined, for arguments sake say ten, move from small unit size to medium unit size. The limit of ten being entirely arbitrary. Or upper limits might be; small might have five instruments, medium five to fifteen instruments, large fifteen and above, again purely arbitrary sizing exercise as initial stake in the ground. 

The standard height for measurement is set at two meters for meterological data for wind speed for example. What might a different suite of such requirements look like? Which bodies would be responsible for setting them? WMO and which others? Industry bodies? Gov bodies? NMHSs? NGOs? ... That is which are the set of stakeholder groups to canvas for respective concerns.  

Depiction of overlap of stakeholder concerns via; grid, heatmap, Euler diagram, other . Cross section comparative analysis of measurement suites per stakeholder. Use cases for fixed station sites for longer term time series data for extreme event attribution. Use cases for portable station sites for shorter term time series data for public health and epidemiology. A mixture of fixed stations sites and portable station sites both marine based and land based might also be appropriate for environment agencies in for example monitoring coastal errosion accelerated by rising sea levels. For example fixed bouys might after fifty years, or less, be further from the shoreline than when first installed. Additional bouys might be installed closer to the receded shoreline.

Another use case for portable station might the study of predicted extreme weather. Bouys put in line of hurricane. Which would be hazard work. Due to unpredictability of tacking as shown by spaghetti graphs. This might also be the case for typhoon landfall. And other project extreme events, heat and wet bulb events, precipitation events, wind events, drought events, and so on.

Portable stations would also be an useful capability in response to extreme events. And ongoing emergency management response and recovery events.

One roll out option of more permanent fix station units might be in sites where extreme events have occurred and are predicted to reoccur in the years and decades to come. So given assumption that instrumentation measurement and data validation is the same for portable and fixed units fixed units could replace portable units. <todo: consider moving this para to main amn README.md >

One parallel piece of work is in coordination with WMO and NMHS and other stakeholders like public health and global health for prospective sites for a roll out of fixed station sites. Another would be working with private sector and NGO stakeholders for industry specific roll out programme. The private sector initiatives might help finance the public health initiatives for example. <todo: consider moving this para to main amn README.md >

Portable stations for epidemiological monitoring of camps of displaced people. Climate refugees, conflict refugees, economic migrants, and so on. 

See also
* Networks [GH](https://github.com/YorkEarwaker/Networks)
* Embedded systems [GH](https://github.com/YorkEarwaker/Climate-Model/blob/main/amn/doc/mcd/Embedded-Systems.md), Raspberry Pi, Arduino, ES, IoT, 
* note. Consider another page for analogue serial electrical engineering option for mcd module.

## Status

TODO
* <todo: consider, MCD requirements for different deployment scenarios, sml, >
* <todo: consider, Bill of Materials for sub components, air balloon, land unit, water buoys,>
* <todo: consider, build, >
* <todo: consider, buy, >
* <todo: are these the correct standards to use? ITU-R V.24, V.28, , are these superseded? current? deprecated?  >
* <todo: consider, Raspberry pi, likely yes. which version pico? see also 40 pin GPIO for control circuits? start with Raspberry Pi to side step analysis paralysis, >
* <todo: consider, with Ethernet capability a requirement, probably not? >
* <todo: consider, evaluation of single board computers; Arduino IT, BeagleBone US?, & Raspberry Pi UK, NVIDAI Jetson US?, BIGTREETECH US?, Radxa ROCK 4 US?, other?  don't let this be an analysis paralysis concern, >
* <todo: consider, evaluation of SBC from CN, Nano Pi, Orange Pi, Banana Pi, others? prefer local UK tech over CN? US? EU? costs vs supply issues,  don't let this be an analysis paralysis concern, >
* <todo: consider, SBC and similar, how will they perform in stress situations, How will they endure (life span) different environmental conditions; bouys saltwater corrosion, condensation, heat, humidity, cold, >
* <todo: consider, Which to adopt computer on module COM, system on chip SoC, system in package Sip, single board computer SBC, or more analogue approach which migh have a wider survival rate in diverse environmental conditions, one size fits all env conditions? or multiple approaches dependent on env conditions? notwithstanding protective housing? >
* <todo: consider, modularisation at the SBC level? right to repair, or is the state of the art not up to this and moment,  >
* <todo: consider, start with Raspberry Pi for proof of concept PoC and first cut minimum viable product MVP, >
* <todo: consider, form factor, size spec of board and components, does Raspberry Pi conform to form factor standards, don't let this be an analysis paralysis concern, >
* <todo: consider, Proof of Concept PoC, single instrument, and Raspberry Pi?, variable temperature? data collection option tbd? >
* <todo: consider, is there a preferred SBC for automated weather stations? seek advice WMO? >
* <todo: consider, what does a small MVP look like, three instruments? which variables; temperature, humidity, precipitation, >
* <todo: purchase Raspberry Pi for PoC, >
* <todo: purchase thermometer for PoC, basic, digital/electronic?, >
* <todo: consider, several online sources for building a weather station with a Raspberry Pi online, select one to start reviewing content, >
* <todo: consider, portable screen interface to MCD, onsite configuration, inspection, maintenance, bluetooth? Ethernet? USB? chromium? tablet? >
* <todo: consider, mobile app, smartphone? minimum spec? BYO?, MCD spec? >
* <todo: consider acronym TMA, Terrestrial, Marine, Air/Atmosphere, TMAS Space? microsatellites, >
* <todo: consider, OLED display, plug in interface, current variable instrument display? >
* <todo: consider, service drone, related project, in remote location wifi free zones, or hard to access, drone data upload bluetooth, download on return? part of service drone? >
* ...

DONE
* <done: intent to commit>
* <done: consider, MCD Hardware specification, Bill of Materials BoM, building blocks, work in progress for PoC,  >

## Bill of Materials

MCD, PoC, BoM
* Description, embedded system SBC and sensor, 
* Raspberry Pi, version TBD
* product TBD, instrument, basic sensor, temperature? 

MCD CIM, PoC, BoM
* Description, portable device on site screen interface, (configuration, inspection, maintenance, CIM?) ...
* product TBD? device, open source?
* all CIM capability programmed in device, 

MCD NMT, PoC, BoM
* Description, remote device screen interface, (network, monitoring, telemetry, NMT + CIM? better/different acronym, ) ...
* product TBD? BYO device? laptop to begin with? 
* network uplink? modification prerequisite to MCD? 
* PostGres + Timescaledb extension, remote time series RDBMS? localhost PoC
* LAMP data remote processing, analytics, graphing?

MCD, MVP, BoM
* Description, TMA platform deployment agnostic?, first iteration T(MA). mid temperate only?
* product TBD, Embedded system?, SBC? Sleep mode inbetween readings/transmitting?
* product TBD, instrument 01, temperature? hygrometer? same chip, different stand alone chip, better componentisation, more cost, separate chip like more accurate?
* product TBD, instrument 02, humidity? hygrometer? chip
* product TBD, instrument 03, pressure? hygrometer? chip
* product TBD, instrument 04, precipitation? 
* product TBD, instrument 0N, other? 
* product TBD, geo location, gps? 
* product TBD, RFID? <todo: consider this is part of weather station platform TMA, also separate one for MCD module/component? rfid for each instrument too?  >
* product TBD, OLED display, variable instrument set current readings?
* product TBD, energy, battery? solar? both?
* product TBD, network, wifi, ES/SBC bluetooth RPi?, 

MCD CIM, MVP, BoM
* WIP
* More research required, 

MCD NMT, MVP, BoM
* WIP
* More research required, 
* not sure about below
* InfluxDB? some bad comments on this option, on RPi? <likely overspec for PoC but of for MVP CIM? Best keep analytics graphing remote? large unit only? took much complexity? >
* Grafana, on RPi? <likely overspec for PoC but of for MVP CIM? Best keep analytics graphing remote? large unit only? took much complexity? >

Radiosondes, BoM atmosphere, weather balloons,  <todo: breakout to separate page?>
* ...

?, BoM water sea, ocean - same as land? <todo: breakout to separate page?>

## Standards

Data device 
* ITU-R V.24, RS-232 connector, still in use? [WP](https://en.wikipedia.org/wiki/List_of_ITU-T_V-series_recommendations)
* ITU-R-V.28, RS-232 connector, still in use?
* <todo: consider, ITU and standards bodies others to source >

## Libraries

Libs
* HomeAssistant? open source
* ESPHome firmware? open source 

Services? SaaS?
* MapBox
* ClimaCell
* LocationIQ
* RainViewer

## Hardware

Connector
* USB? would this be robust enough, get loose under stressed conditions, 
* RS-232?, would a pin based connector be better, harder to dislodge under stress conditions, 
* RS-485?, 
* i2C?, 

Circuit Board, Chip 
* Raspberry Pi, RPi, Raspi, [WS](https://www.raspberrypi.com/)
* ARM, RPi chip?
* ...

Sensors
* ID, Maker, Kind, Variable, Capability
* DHT22 (AM2302), Aosong, , (temp, humidity, ), 
* SHT40, , , (temp, humidity, ), internal dehumidifier heater, 
* SHT41, , , (temp, humidity, )
* SHT3X, , , (temp, humidity, )
* SHT31, Sensirion, hygrometer, ( , ), 
* SHT71, Sensirion, hygrometer, ( , ), 
* BME-280, Bosch, , (temp, humidity, pressure, )
* BPM-?, Bosch Sensortec, , ( , )
* HDC20xx, , 
* HDC30xx, , (humidity, )
* TMP117, , (high accuracy temperature)
* PCT2075
* Si7021, Silicon Labs, hygrometer, ( , ), 
* HTU21D, Measurement Specialities, hygrometer, ( , ), 
* DS18B20 <todo: one wire protocols? research >
* SMT172 <todo: one wire protocols? research >
* ...

NFR's
* SBC, SoC, etc, concerns with
* repairability, whole unit might have to be replaced. right to repair, repair cost, remote access, locale skills, 
* maintainability, repairability concerns might though provide a basis for upskilling and education for maintenance support
* sustainability, tech waste, 
* modification, 
* monitoring, 

Catalogues
* List of open source hardware projects, [WP](https://en.wikipedia.org/wiki/List_of_open-source_hardware_projects)

## Learning

Tertiary Ed +
* MSc Cleantech Innovation, Grantham Institute, Imperial, [WS](https://www.imperial.ac.uk/grantham/education/msc-cleantech-innovation/) 
* <todo: others >

## References

Terms
* Open Source Hardware [WP](https://en.wikipedia.org/wiki/Open-source_hardware)

Circuit Board, Chip 
* General purpose input output GPIO, [WP](https://en.wikipedia.org/wiki/General-purpose_input/output), 
* Single board computer SBC, [WP](https://en.wikipedia.org/wiki/Single-board_computer), single circuit board, microprocessor, I/O, memory, 
* Embedded system, 
* IIoT, 
* other

Sensor kind
* Hygrometers, 
* Thermistor, <todo: consider, Wheatstone bridge into an ADC? research >
* Thermocouple, <todo: consider, requries I2C interface chip? research >
* Thermowell probe, 

Variables
* die temperature
* air temperature

News Papers - sensors, benchmark
* Test and Calibrate DHT22 Hygrometers, [WS](https://www.kandrsmith.org/RJS/Misc/Hygrometers/calib_dht22.html), kandrsmith
* Wide range of Hygrometers: DHT22, AM2302, AM2320, AM2321, SHT71, HTU21D, Si7021, BME280, [WS](https://www.kandrsmith.org/RJS/Misc/Hygrometers/calib_many.html), kandrsmith
* Adding Sensirion SHT31 to the range of test hygrometers. , [WS](https://www.kandrsmith.org/RJS/Misc/Hygrometers/calib_many_addsht31.html), kandrsmith
* ...







* 