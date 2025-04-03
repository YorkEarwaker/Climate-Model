# Power Systems psy

Power supply for mcd component modules, microcontroller boards, single computer boards, analogue peripherals, sensors, . 

## Status

TODO
* <todo: consider, power consumption for micorocontorller board/single coputer board and analogue peripherals, sensors>
* <todo: consider, power per deployment scenario, remote deployment renewable and rechargeable battery, grid access>
* <todo: consider, different renewable power generation options; solar, wind, wave (bouys), >
* <todo: consider, hydrogen, fuel cell, >
* <todo: consider, rechargeable battery, paired with renewable source, >
* <todo: consider, solar will only function at 60 due to surface contamination, dust, pollen, consider self cleaning mechanisms and coatings for panel to prohibit mold and so on, >
* <todo: consider, maintenance schedule, >
* <todo: consider, sonic vibration to dispel dust, pollen, from surface of solar panel >
* <todo: consider, solar panel or solar skin, photovoltaic, first renewable power unit, first iteration >
* <todo: consider, rechargeable battery, first iteration, >
* <todo: consider, power consumption for small units to be fairly low as mcd modules will be in sleep mode for most to the time, sleep mode between synopic sensor reading windows, network connection modules might be separate component units aka SCB,  >
* <todo: consider, will some sensors, as component modules have separate batteries as part of manufacturer spec, ? >
* <todo: consider, bench power supply unit for research and development, circuit testing,  >
* <todo: consider, integrated into circuit board and also as separate unit interface to power supply for all power consumption? as a energy ps brick interface to whole unit, . Depends on deployment scenario. Depends on complexity of unit, >

DONE
* <done: intent to commit>
* <done: consider, hybrid-energy as separate repository for renewable energy technology unit, mixed energy generationg base, hybrid renewable energy unit, hybrid reu to produce hydrogen for combined energy generation unit, micro combined heat and power fuel cells, >

## BoM

Suppliers
* Solar Panels and Management Boards [WS](https://thepihut.com/collections/solar-panels-and-management-boards), The Pi Hut, 
* <todo: seek other suppliers!>

Voltage regulator <todo: compile candidate list>
* MCP1700, [PDF](https://ww1.microchip.com/downloads/en/DeviceDoc/MCP1700-Low-Quiescent-Current-LDO-20001826E.pdf), tech sheet, Low Quiescent Current LDO, 

## References

Terms
* Power consumption, 
* Power supply, [WS](https://en.wikipedia.org/wiki/Power_supply), integrated into circuit board,   
* Power source, renewable, grid, hydrogen fuel cell, battery, 
* Voltage regulator

News Papers - battery
* Pico powered from 3.7 V Li Po battery charged with solar panel?, [WS](https://forums.raspberrypi.com/viewtopic.php?t=305398), Raspberry Pi, forums
* ...

News Papers - solar panel
* How I tried to power a Raspberry Pi Pico with solar panels, [WS](https://www.reddit.com/r/raspberrypipico/comments/14v1c0x/how_i_tried_to_power_a_raspberry_pi_pico_with/?rdt=53180), Reddit, Raspberry Pi Pico, 
* PicoW with solar on my garden, [WS](https://forums.raspberrypi.com/viewtopic.php?t=338235), Raspberry Pi, forums
*  Raspberry Pi Pico W (Solar-Powered) Remote Weather Station, [WS](https://picockpit.com/raspberry-pi/raspberry-pi-pico-w-remote-weather-station/), 17 July 2022, raspi berry, Pi Cockpit, 
* Supply Raspberry Pi with electricity via solar cell and battery, [WS](https://tutorials-raspberrypi.de/raspberry-pi-pico-solar-zelle-panel-akku-anleitung/), Raspberry Pi, forums, DE, 

News Papers - charge management module
* ...
* ...

News Papers - RPi Pico, microcontroller, power reduction
* Switching P-Mosfet with DS3231 (Pico-W Low Power System), [WS](https://forums.raspberrypi.com/viewtopic.php?t=351661), Raspberry Pi, forums, 
* ...

