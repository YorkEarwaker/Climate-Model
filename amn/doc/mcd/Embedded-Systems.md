# Embedded systems esy

Embedded systems, digital module of mcd part of weather system whole.

## Status

TODO
* <todo: consider, embedded systems for mcd, >
* <todo: consider, Raspberry Pi, evaluation, >
* <todo: consider, best OS from installing on Raspberry Pi of MCD capability, time sharing OS Ubuntu? >
* <todo: consider, best OS for Arduino, real time OS ? rtos only? >
* <todo: consider, TSOS or RTOS, for weather station mcd? normal operating condition vs extreme event stress operating conditions, >
* <todo: consider, as a real time controller Arduino may be the better choice, sensor readings, controlling actuators, etc, limitations with >
* <todo: consider, both Arduino and Raspberry Pi as separate components in large option 'advanced' mcd? Arduino control, reading, . RPi onbaord analytics, networking options, >
* <todo: consider, copy Raspberry Pi todo: things from README.md here?>

DONE
* <done: intent to commit>
* <done: consider, copy Raspberry Pi references things from README.md here?>

## Bill of Materials

Evaluation kit - electronics kit, 
* Microcontroller, PRi pico 2
* Breadboard, 
* Resistors, 
* Sensors, 
* - temperature
* - humidity
* - air pressure
* - light 
* - motion
* Actuators, optional?, not required for PoC, bar LDR/LCD display
* - LDR display, ? which LCD/LDR
* - LCD diasplay, ? which LCD/LDR
* - LED lights, 
* - relay modules
* - servo motors
* - robotic kits
* Jumper wires, 
* Power Supply, A micro-USB cable or a battery pack
* Wi-Fi Module, if not using Pico W, e.g. Adafruit Airlift WiFi Featherwing
* Shield, optional? simplifies connections to various sensors and actuators, 12C, UART, 'Grove Shield' Aurdino like peripheral interface 
* RPi pico 2 Pinout diagram, 
* ...

Suppliers - UK
* Arrow, [WS](https://www.arrow.com/en), *
* RS, [WS](https://uk.rs-online.com/web/), *
* Maplin, [WS](https://www.maplin.co.uk/), 
* Bowood Electronics, [WS](https://www.bowood-electronics.co.uk/) ????
* Switch Electronics, [WS](https://www.switchelectronics.co.uk/) * 
* Mouser Electronics United Kingdom, [WS](https://www.mouser.co.uk/) *
* Enrg Tech, [WS](https://www.enrgtech.co.uk/) *
* JPR Electronics, [WS](https://www.jprelec.co.uk/) *
* Digital Outlet London, [WS](https://www.walthamforest.gov.uk/rubbish-and-recycling/waltham-forest-reuse-and-repair-directory/digital-outlet-london), ????
* Buy & Sell Electronics Outlet, closed?
* Farnell UK, [WS](https://uk.farnell.com/), *
* UK, London, [WS](https://wiki.london.hackspace.org.uk/view/Suppliers), Hackspace
* others?

## Libraries

IDE 
* Thonny Python IDE, RPi pico (MicroPython), 
* uPyCraft IDE, 
* Arduion IDE, RPi pico (C/C++ SDK), can be used to program 
* VS Code, RPi pico (C/C++ SDK, MicroPython, )
* Eclipse, Eclipse CMake plugin?
* CLion, 
* CodeBlocks, RPi pico (C/C++ SDK, ), C/C++, Fortran, free, 
* Arm Keil MDK v6 Community Edition, [WS](https://www.keil.arm.com/), embedded development environment, CMSIS standard and CMSIS RTX RTOS, CLI, IDE, 

libs
* RPi.GPIO, python, interact with GPIO pins
* avrdude, upload firmware to microcontroller, Atmel AVR MCB, Ubuntu [WS](https://manpages.ubuntu.com/manpages/focal/man1/avrdude.1.html), [GH]()

RPi
* RPi docs, [WS](https://www.raspberrypi.com/documentation/)
* RPI docs, MCB, [WS](https://www.raspberrypi.com/documentation/microcontrollers/)
* RPi docs, pico, MCB, C/C++ SDK [WS](https://www.raspberrypi.com/documentation/microcontrollers/c_sdk.html)
* ...

Languages
* C/C++, 
* MicroPython, 
* CircuitPython, 
* Arduino, 
* Java, ?
* Rust, ?

Tool chain RPi MCB - coding
* ...

Tool chain RPi SCB - coding
* ...

## Standards

* STEP AP210: ISO 10303-210, Electronic assembly interconnect and packaging design
* Gerber format, [WP](https://en.wikipedia.org/wiki/Gerber_format) printed circuit board PCB, ASCI file standards, describing PCB circuits design layout, 

* Common Microcontroller Software Interface Standard CMSIS, Arm [GH](https://arm-software.github.io/CMSIS_6/latest/General/index.html), Arm Keil IDE [WS](https://www.keil.arm.com/cmsis), microcontroller software development, 

## References

Terms
* Real Time Operating System RTOS, [WP](https://en.wikipedia.org/wiki/Real-time_operating_system), switch between tasks based on priority, hard RTOS less jitter vs soft RTOS more jitter, time ? jitter, 
* Time Sharing Operating System TSOS, switch between tasks based on clock interrupts 

Embedded Systems - products, microcontroller board MCB, single board computer SBC
* Arduino, MCB (Atmel ATMega328P), coding (C++ ), ~200mW, cpu ( , 16MHz), ram (2kb, 32kb flash), network (additional shields for WiFi, Ethernet, ), GPIO (14 digital I/O pins, 6 analog pin inputs)
* Raspberry Pi, SBC, coding (Python, C, C++, ), ~700mW, cpu 1.5GHz, ram (512MB, 8GB), network (HDMI, USB, Ethernet, WiFi, Bluetooth, ), GPIO (40 pins, handle variety of tasks, )
* Raspberry Pi Pico, MCB (RP2040), coding (C, C++, MicroPython, Rust, ), ~?mW, cpu (dual-core Arm Cortex-M0+, 133MHz), ram (264kb SRAM, 2Mb flash, ), network (WiFi, dual Bluetooth), GPIO (programmable IO (PIO), ), 

Input output
* Programmable IO PIO, [WP](https://en.wikipedia.org/wiki/Programmed_input%E2%80%93output), not PRi PIO though smane acronym
* 12C
* SPI
* GPIO

Real Time Computing 
* Jitter, telecomms, 
* Real time computing RTC, hard RT vs soft RT, event driven, 
* Preemtive priority, event priority, 
* Multicore processor, CPU, one task event execution per core, 
* Memory allocation, no memory leaks, avoid requirement for reboot to free blocked resources, all set statically at compile wherever possible not dynamic memory allocation at runtime, avoids dynamic memory fragmentation, no swap to disk file memory management,   
* Fixed size block algorithms, for RTC, memory management, simple embedded systems, 
 
 List of microcontrollers board MCB & single computer boards SCB
* Arduino, MCB, 
* ESP32, 
* ATMega328P, 
* Raspberry Pi, SCB, embedded Linux, current preferred option, evaluation and PoC
* Raspberry Pi Pico, MCB, current preferred option, evaluation and PoC
* STM32 Nucleao
* ROCK, SCB?
* Micro.bit [WS](https://microbit.org/), MCB?, AI
* Yocto, [WS](https://www.yoctoproject.org/), SCB?, embedded Linux, Linux Foundation, 

List of RTOS
* CMSIS RTX
* FreeRTOS
* Zephyr

News Papers - ES projects/tutorials, RPi MCB,
* Getting Started with Raspberry Pi Pico (and Pico W) [WS](https://randomnerdtutorials.com/getting-started-raspberry-pi-pico-w/), ****
* Raspberry Pi Pico Projects, [WS](https://how2electronics.com/raspberry-pi/raspberry-pi-pico-projects/)
* Current and Future Projects: Transitioning from Raspberry Pi Pico W to Pico 2 with PicoBricks, [WS](https://picobricks.com/blogs/robotic-stem-projects/current-and-future-projects-transitioning-from-raspberry-pi-pico-w-to-pico-2-with-picobricks), 9 Aug 2024, PicoBricks Team

News Papers - RPi apps
 * What's your list of the best software/applications for your Raspberry Pi?, [WS](https://forums.raspberrypi.com/viewtopic.php?t=272664), 30 April 2020, Forums Raspberry Pi, 
 
 News Papers - RPi OS
 * Best Raspberry Pi Operating Systems for Various Purposes, [WS](https://itsfoss.com/raspberry-pi-os/) 18 Jul 2024, Ankush Das, Power up your Raspberry Pi with a versatile operating system that serves your purpose.
 
 News Papers - Respberry Pi, SCB
* I made weather station app and designed it for a Raspberry Pi using the official 7" 800x480 touch screen, [WS](https://www.reddit.com/r/raspberry_pi/comments/il03rk/i_made_weather_station_app_and_designed_it_for_a/?rdt=34061), raspberry_pi, Reddit, 

News Papers - Arduino
* First project I'm really proud of! An air quality sensor that writes to external SD memory + has an LCD screen. (I also don't understand capacitors and added them for no reason, no clue if there's a point to them here), [WS](https://www.reddit.com/r/ArduinoProjects/comments/1foninq/first_project_im_really_proud_of_an_air_quality/), ArduinoProjects, Reddit, 
* Temp Sensor with OLED Display, [WS](https://www.reddit.com/r/ArduinoProjects/comments/1h22i1g/temp_sensor_with_oled_display/), ArduinoProjects, Reddit, 

News Papers - STM32 Nucleo, ESP32,  ...
* Which STM32 nucleo board to purchase? [WS](https://www.reddit.com/r/embedded/comments/1e5rktt/which_stm32_nucleo_board_to_purchase/), embedded, Reddit, 
* How can I prevent my STM Nucleo from frying? [WS](https://electronics.stackexchange.com/questions/740489/how-can-i-prevent-my-stm-nucleo-from-frying), StackExchange, 

News Papers - embedded systems, sensors
* What are some good modern temperature sensors? [WS](https://www.reddit.com/r/embedded/comments/1d3cakd/what_are_some_good_modern_temperature_sensors/), embedded, Reddit, 
* ...

News Papers - ide
* Create New Eclipse Project For The RPi (Eclipse windows), [WS](https://raspberry-projects.com/pi/programming-in-c/compilers-and-ides/eclipse/create-new-eclipse-project-for-the-rpi), 
* Anyone used Eclipse Managed Builds for pico in C++ [WS](https://forums.raspberrypi.com/viewtopic.php?t=329752), February 2022, Forums, RPi, 
* What IDE to use? Options?, RPi pico [WS](https://forums.raspberrypi.com/viewtopic.php?t=362331), Forum, RPi, 

News Papers - RPi pico C/C++, PIO
* 1
* 2
* Raspberry Pi Pico and RP2040 - C/C++ Part 3: How to Use PIO, [WS](https://www.digikey.com/en/maker/projects/raspberry-pi-pico-and-rp2040-cc-part-3-how-to-use-pio/123ff7700bc547c79a504858c1bd8110), VS Code, 
* What is PIO?, RPi pico [WS](https://www.raspberrypi.com/news/what-is-pio/), 9 Mar 2021, Alex Bate, PIO and RP2040
* A closer look at Raspberry Pi RP2040 Programmable IOs (PIO), [WS](https://www.cnx-software.com/2021/01/27/a-closer-look-at-raspberry-pi-rp2040-programmable-ios-pio/), 27 January 2021, Abhishek Jadhav

News Papers - data logger
* Best Serial Data Logger Software for Sensor Monitoring?, [WS](https://www.reddit.com/r/embedded/comments/1gersgf/best_serial_data_logger_software_for_sensor/), RS-232, RS-485, log real time data from sensors, 
* 

News Papers - IoT storage, remote, RDBMS
* Guidance needed on proper way to store IoT data from multiple devices, [WS](https://www.reddit.com/r/SQLServer/comments/1clk9ha/guidance_needed_on_proper_way_to_store_iot_data/), different schemas per IoT device, sensor device, 
* What are you using as sensor database?, [](), IoT, Reddit, 

News Papers - starter kit, basic things to get started, BoM, 
* Freenove Ultimate Starter Kit for Raspberry Pi Pico 1 2 W H WH, [WS](https://store.freenove.com/products/fnk0058)
* Raspberry Pi Pico Accessories & Add Ons, [WS](https://thepihut.com/collections/pico), 
* Grove Starter Kit for Raspberry Pi Pico, [WS](https://www.kiwi-electronics.com/en/grove-starter-kit-for-raspberry-pi-pico-10621)
* Choosing the Right Development Boards & Tools [WS](https://uk.rs-online.com/web/content/discovery/ideas-and-advice/development-tools-guide), modified 8 Jan 2024, RS, 





