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
* <todo: consider, moving much of the RPi specific PoC things to PoC dev README.md>

DONE
* <done: intent to commit>
* <done: consider, copy Raspberry Pi references things from README.md here?>

## Bill of Materials

MCB, BoM, high level list
* Description, evaluation kit, electronics kit, prototyping
* Microcontroller board, *
* Breadboard, *
* Resistors, *
* Sensors, *
* - temperature, *
* - humidity, *?
* - air pressure, *?
* - light, optional?, not required for PoC,
* - motion, optional?, not required for PoC,
* Actuators, optional?, not required for PoC, bar LCD/OLED display
* - LCD display, 
* - OLED display, 
* - LDR (Light Dependent Resistor), optional?, not required for PoC,
* - LED lights, optional?, not required for PoC,
* - relay modules, optional?, not required for PoC,
* - servo motors, optional?, not required for PoC,
* - robotic kits, optional?, not required for PoC,
* Jumper wires, *
* Power Supply, A micro-USB cable or a battery pack, *
* Wi-Fi Module, if not using Pico W, e.g. Adafruit Airlift WiFi Featherwing, 
* Shield, optional? not required for PoC, simplifies connections to various sensors and actuators, 
* - 12C, 
* - UART, 
* - SPI, 
* - analog IO, 
* - digital IO, 
* - SDW debug interface, 
* - ?V power interface, <todo: what Voltage power infrace for UK?>, 
* - - Shield manufacturers 'KEYESTUDIO Raspberry Pi PICO IO Shield' 'Crowtail Shield' 'Grove Shield' 'Click Shield' e.g. Aurdino like peripheral interface, third party manufacturer interface to their own brand hardware/solution tech stack, 
* RPi Pico 2 Pinout diagram, GPIO Reference Card, probably available via the online RPi documentation *?
* ...

What else do I need to use a Raspberry Pi Pico? [WS](https://support.thepihut.com/hc/en-us/articles/360017209098-What-else-do-I-need-to-use-a-Raspberry-Pi-Pico?input_string=breadboard+pico+compatibility)

Pi Hut, sale price, 7 March 2025

MCB - RPi Pico 2, BoM, Microcontroller board, [WS](https://www.raspberrypi.com/products/raspberry-pi-pico-2/)
* Description, Microcontroller board for weather station, MCN PoC
* - - RPi Pico 2, + head pins (headed), - WiFi 
* - - - Pi Hut, MCB, [WS](https://thepihut.com/products/raspberry-pi-pico-2?variant=54063366701441), £5.70 incl. VAT
* - - RPi Pico 2, - head pins (not headed), - WiFi, not headed requires soldering, not for first project as would require adding soldering iron and solder to BoM
* - - - Pi Hut, MCB, [WS](https://thepihut.com/products/raspberry-pi-pico-2), £4.80 incl. VAT
* - - RPi Pico 2 W, + head pins (headed) + WiFi *
* - - - Pi Hut, MCB, [WS](https://thepihut.com/products/raspberry-pi-pico-2-w?variant=54063378760065), £7.60 incl. VAT
* - - RPi Pico 2 W, - head pins (not headed), + WiFi
* - - - Pi Hut, MCB, [WS](https://thepihut.com/products/raspberry-pi-pico-2-w), £6.60 incl. VAT

MCB - RPi Pico 2, BoM, Head Pins - requires soldering kit
* - - Male Header Set for RPi Pico
* - - - Pi Hut, head pins, colour coded [WS](https://thepihut.com/products/colour-coded-headers-for-raspberry-pi-pico), £1.50 incl. VAT
* - - - Pi Hut, head pins, , £1 incl. VAT

MCB - RPi Pico 2, BoM, Breadboard
* Description, breadboard, assume breadboard for Pico 1 W works for Pico 2 W, same GPIO pin arrangement, breadboard is compatible with Pico 1, Pico 1 W, Pico 2, does not explicitly state Pico 2 W, 
* - - Breadboard for Pico *
* - - - Pi Hut, [WS](https://thepihut.com/products/breadboard-for-pico), £4.20 incl. VAT
* - - Half-Size Breadboard - White, is Not Pico compatible! Pi Hut Support email, 10 March 2025.
* - - - Pi Hut, [WS](https://thepihut.com/products/raspberry-pi-breadboard-half-size), £3 incl. VAT
* - - Full-Size Breadboard - White, is Not Pico compatible! Pi Hut Support email, 10 March 2025.
* - - - Pi Hut, [WS](https://thepihut.com/products/full-sized-breadboard), £5 incl. VAT

MCB - RPi Pico 2, BoM, Jumper Wires
* Description, jumper wires, assume male for breadboard? Jumper Wires compatible with the RPi Pico 2 Breadboard, 
* - - 120-Piece Ultimate Jumper Bumper Pack (Dupont Wire) F/M, F/F, M/M
* - - - Pi Hut, [WS](https://thepihut.com/products/thepihuts-jumper-bumper-pack-120pcs-dupont-wire),£6 incl. VAT
* - - The Pi Hut's Jumper Wire Kit (140 Piece) * 
* - - - Pi Hut, [WS](https://thepihut.com/products/jumper-wire-kit-140-piece), £4 incl. VAT

MCB - RPi Pico 2, BoM, Power Supply, RPi Pico requires minimum of 1.8 volts and a maximum of 5.5V . Safe operating voltages are between 1.8V and 5.5V.
* Description, power the Microcontroller, when attached and not via USB to a laptop or other computer, 
* - Powering your Pico [WS](https://projects.raspberrypi.org/en/projects/introduction-to-the-pico/12), Raspberry Foundation, Introduction to Raspberry Pi Pico guide
* - Run from a power supply, [WS](https://projects.raspberrypi.org/en/projects/getting-started-with-the-pico/9), Raspberry Foundation, Getting started with Raspberry Pi Pico
* - - USB-A to Micro-USB Cable * 
* - - - Pi Hut, 15cm [WS](https://thepihut.com/products/usb-to-micro-usb-cable-0-5m?variant=37979679228099), £1.50 incl. VAT *
* - - - Pi Hut, 30cm , £2.00 incl. VAT
* - - - Pi Hut, 50cm , £2.20 incl. VAT *
* - - Micro-USB Cable with On/Off Switch, optional
* - - - Pi Hut, [WS](https://thepihut.com/products/micro-usb-cable-with-on-off-switch), £3 incl. VAT, Not for PoC
* - - micro-USB power supply - UK plug, power supply when not being programmed! as uses single RPi Pico micro USB port. 
* - - - Raspberry Pi micro-USB transformer
* - - - Raspberry Pi 12.5W Micro USB Power Supply - UK Plug, [WS](https://thepihut.com/products/raspberry-pi-zero-uk-power-supply) £7.60 incl. VAT, not for PoC, but get anyway for continued time series data readings? compatible with RPi Pico 2, links from Pico support FAQ page above ? not stated compatible on web site when link is followed to Power Supply page? is Not Pico compatible! Pi Hut Support email, 10 March 2025. might be mistaken ?.
* - - Power bank, fancy battery
* - - - Pi Hut, not for PoC
* - - Battery holder/carrier/carriage
* - - - Pi Hut, not for PoC
* - - Battery rechargeable?, tbc future eval, 
* - - - Pi Hut, not for PoC
* - - Solar Panel
* - - - Pi Hut, not for PoC, likely yes for MVP, 

MCB - RPi Pico 2, BoM, Resistor
* Description, 0ohm to 1Mohm
* - - 575-Piece Ultimate Resistor Kit *
* - - - Pi Hut, [WS](https://thepihut.com/products/ultimate-resistor-kit), £6 incl. VAT
* - - Resistor01 100ohm 
* - - - Pi Hut, 
* - - Resistor02 value? ohm? 
* - - - Pi Hut, 
* - - Resistor03 value? ohm? 
* - - - Pi Hut, 

MCB - RPi Pico 2, BoM, Actuator, Display optional? nice to have to complete the circuit
* Description, display the sensor readings on the board.
* - - LCD Display 
* - - 1.8" LCD Display for Raspberry Pi Pico - pico female pins, driver
* - - - Pi Hut, [WS](https://thepihut.com/products/1-8-lcd-display-for-raspberry-pi-pico), £10.80 incl. VAT
* - - 1.3" IPS LCD Display Module (240x240) - wires, no pins
* - - - Pi Hut, [WS](https://thepihut.com/products/1-3-ips-lcd-display-module-240x240), £10.20 incl. VAT
* - - OLED display, 
* - - 1.3" OLED Display Module for Raspberry Pi Pico (64×128) - pico female pins, driver
* - - - Pi Hut, [WS](https://thepihut.com/products/1-3-oled-display-module-for-raspberry-pi-pico-64x128), £10.80 incl. VAT 

MCB - RPi Pico 2, BoM, Sensor
* Description, sensor for weather station, MCN PoC, buy direct from wholesaler? 
* - - DHT22 (AM2302), Aosong, , (temperature, humidity, ), *
* - - - Pi Hut, [WS](https://thepihut.com/products/dht22-temperature-humidity-sensor-extras), £8.70 incl. VAT
* - - BME-280, Bosch, , (temperature, humidity, air pressure, ), *
* - - - Pi Hut, [WS](https://thepihut.com/products/bme280-environmental-sensor), £8.90 incl. VAT
* - - - Pi Hut, [WS](https://thepihut.com/products/bme280-breakout-temperature-pressure-humidity-sensor)
* - - ENS160 Air Quality Monitor sensor, 
* - - - Pi Hut, not required for PoC
* - - Soil Moisture Sensor
* - - - Pi Hut, not required for PoC

Not required for PoC, but may be necessary if all headed RPi Pico 2 (W) are unavailable.

* Soldering Tip Cleaner, , £4.90 incl. VAT
* Antex XS25 Soldering Iron (UK Plug), , £34.30 incl. VAT
* Magnetic Silicone Soldering Mat, , £11 incl. VAT
* Antex Lead Free Solder - 4m Tube, , £4.40 incl. VAT

Not required for PoC, Previous generation of RPi Pico, but this older version might suffice for simple sensor reading, temp, humdity, pressure, . So might swap out

RPi Pico Variants
* Raspberry Pi Pico, , - headers £3.80 incl. VAT
* Raspberry Pi Pico, , + headers £4.80 incl. VAT
* Raspberry Pi Pico W, , - headers 
* Raspberry Pi Pico W, , + headers 

Accessories
* Female Header Set for Raspberry Pi Pico, , £1 incl. VAT, not needed for PoC 
* Stacking Header Set for Raspberry Pi Pico, , £1 incl. VAT, not needed for PoC 

Breakout/Expander
* Pin Breakout for the Raspberry Pi Pico, [WS](https://thepihut.com/products/pin-breakout-for-the-raspberry-pi-pico), £4.20 incl. VAT, *
* Pico Omnibus (Dual Expander), [WS](https://thepihut.com/products/pico-omnibus-dual-expander) £8.40 incl. VAT 

Kits - there are many to choose from
* Starter Kit for Raspberry Pi Pico (Includes Pico H), [WS](https://thepihut.com/products/starter-kit-for-raspberry-pi-pico-includes-pico-h), £10 incl. VAT, Pico 1 H, breadboard, jumper wires, ... *** This would be a good! 
* Essential Raspberry Pi Pico Kit, Pi Hut, [WS](https://thepihut.com/products/essential-raspberry-pi-pico-kit), USB cable, header pins, micro shim 

Books/diagrams
* Programming the Pico - Second Edition, £9
* Get Started with MicroPython on Raspberry Pi Pico - 2nd Edition, £15
* Adafruit GPIO Reference Card for Raspberry Pi Pico, [WS](https://thepihut.com/products/adafruit-gpio-reference-card-for-raspberry-pi-pico), £0.50 incl. VAT, GPIO pins diagram, 

### Suppler

Supplier - RPi, UK - all RPi approved? 
* The PiHut, [WS](https://thepihut.com/), official retailer
* Pimo Roni, [WS](https://shop.pimoroni.com/), tech treasure for tinkerers
* MODMYPI, [WS](https://www.modmypi.com/), resolves to The PiHut, 
* Pi Supply, [WS](https://uk.pi-supply.com/), the maker emporium
* Rapid, [WS](https://www.rapidonline.com/education)
* Cool Components, [WS](https://coolcomponents.co.uk/)
* CPC Farnell, [WS](https://cpc.farnell.com/b/raspberry-pi)
* Pi Spy, [WS](https://www.raspberrypi-spy.co.uk/buy/buy-a-pi-2/)

Supplier - electrical engineering EE, UK, online 
* Arrow, [WS](https://www.arrow.com/en), *
* Maplin, [WS](https://www.maplin.co.uk/), 
* Switch Electronics, [WS](https://www.switchelectronics.co.uk/) * 
* Mouser Electronics United Kingdom, [WS](https://www.mouser.co.uk/) *
* Enrg Tech, [WS](https://www.enrgtech.co.uk/) *
* JPR Electronics, [WS](https://www.jprelec.co.uk/) *
* Farnell UK, [WS](https://uk.farnell.com/), **

Supplier -  UK, London retail shop
* RS, [WS](https://uk.rs-online.com/web/), * ? mixed reviews of physical retail shops
* SB Components, [WS](https://shop.sb-components.co.uk/) London? ? mixed reviews

Supplier - UK, outside London
* Bowood Electronics, [WS](https://www.bowood-electronics.co.uk/) Chesterfield, 

Supplier - STEM, Maker, child oriented, UK
* Cyntech Components, [WS](https://shop.cyntech.co.uk/)
* Polydron [WS](https://www.polydron.co.uk/stem-shop.html)
* The Stem club [WS](https://www.thestemclub.co.uk/lander)
* STEM finity [WS](https://stemfinity.com/)
* ...

Supplier - UK, London, prototyping, 
* Machines Room, no longer in operation
* Cubik Innovation

Supplier - UK, lists
* UK, London, [WS](https://wiki.london.hackspace.org.uk/view/Suppliers), Hackspace
* UK, London, [WS](https://www.londonscout.co.uk/best-electronics-stores-london), London Scout
* others?

## Libraries

RPi Examples, [GH](https://github.com/raspberrypi), C,  Shell,  C++,  Python,  Makefile, 

IDE 
* Thonny Python IDE, RPi pico (MicroPython, CircuitPython, ), 
* Mu editor, (CircuitPython, )
* uPyCraft IDE, 
* Arduion IDE, RPi pico (C/C++ SDK), can be used to program 
* VS Code, RPi pico (C/C++ SDK, MicroPython, )
* Eclipse, Eclipse CMake plugin?
* CLion, 
* CodeBlocks, RPi pico (C/C++ SDK, ), C/C++, Fortran, free, 
* Arm Keil MDK v6 Community Edition, [WS](https://www.keil.arm.com/), embedded development environment, CMSIS standard and CMSIS RTX RTOS, CLI, IDE, 

libs
* RPi.GPIO, python, interact with GPIO pins
* avrdude, upload firmware to microcontroller, Atmel AVR MCB, Ubuntu [WS](https://manpages.ubuntu.com/manpages/focal/man1/avrdude.1.html), <todo: sourc GH uri>

RPi
* RPi docs, [WS](https://www.raspberrypi.com/documentation/)
* RPI docs, MCB, [WS](https://www.raspberrypi.com/documentation/microcontrollers/)
* RPi docs, pico, MCB, C/C++ SDK [WS](https://www.raspberrypi.com/documentation/microcontrollers/c_sdk.html)
* ...

???? texas instruments?
* Brindle, [WS](https://bridle.tiac-systems.net/doc/3.7.1/bridle/index.html), open source,

Languages
* C/C++, 
* MicroPython, [WP](https://en.wikipedia.org/wiki/MicroPython), [WS](https://micropython.org/), Python 3 compatible, subset of Py3 libs optimised for microcontrollers, general purpose, 
* CircuitPython, [WP](https://en.wikipedia.org/wiki/CircuitPython), [WS](https://circuitpython.org/), compatible with CPython, fork of MicroPython mpy, and Blinka + mpy for SCB, optimized for AdaFruit products, 
* Arduino, RTD Docs [WS](https://docs.arduino.cc/)
* Java, ?
* Rust, ??
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
* Programmable IO PIO, [WP](https://en.wikipedia.org/wiki/Programmed_input%E2%80%93output), not PRi PIO though same acronym
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

Flashing, microcontroller,
* Bootloader, 
* UF2 USB Flashing Format, file,  
* USB Mass Storage Class (MSC), 
* Thumb2, 

News Papers - ES projects/tutorials, RPi MCB,
* Getting started with your Raspberry Pi Pico W [WS](https://projects.raspberrypi.org/en/projects/get-started-pico-w/1), Projects, RPi Foundation, Python
* Getting Started with Raspberry Pi Pico (and Pico W) [WS](https://randomnerdtutorials.com/getting-started-raspberry-pi-pico-w/), RandomNerdTutorials, ****
* Raspberry Pi Pico Projects, [WS](https://how2electronics.com/raspberry-pi/raspberry-pi-pico-projects/)
* Current and Future Projects: Transitioning from Raspberry Pi Pico W to Pico 2 with PicoBricks, [WS](https://picobricks.com/blogs/robotic-stem-projects/current-and-future-projects-transitioning-from-raspberry-pi-pico-w-to-pico-2-with-picobricks), 9 Aug 2024, PicoBricks Team
* Raspberry Pi Pico and Pico W Pinout Guide: GPIOs Explained, [WS](https://randomnerdtutorials.com/raspberry-pi-pico-w-pinout-gpios/), RandomProjects
* Raspberry Pi Pico: DHT11/DHT22 Temperature and Humidity Sensor (MicroPython), [WS](https://randomnerdtutorials.com/raspberry-pi-pico-dht11-dht22-micropython/), RandomProjects

News Papers - UF2, bootloader, micropython
* Why does the pico accept Microsoft uf2 format rather than raw ARM machine code? [WS](https://www.reddit.com/r/raspberry_pi/comments/t79kyg/why_does_the_pico_accept_microsoft_uf2_format/), Raspberry Pi, Reddit, 
* How can I convert my Micropython code to UF2 for mass flashing, [WS](https://www.reddit.com/r/raspberrypipico/comments/1fi20gm/how_can_i_convert_my_micropython_code_to_uf2_for/), Raspberry Pi Pico, Reddit, 

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

News Papers - ide, languages
* Create New Eclipse Project For The RPi (Eclipse windows), [WS](https://raspberry-projects.com/pi/programming-in-c/compilers-and-ides/eclipse/create-new-eclipse-project-for-the-rpi), 
* Anyone used Eclipse Managed Builds for pico in C++ [WS](https://forums.raspberrypi.com/viewtopic.php?t=329752), February 2022, Forums, RPi, 
* What IDE to use? Options?, RPi pico [WS](https://forums.raspberrypi.com/viewtopic.php?t=362331), Forum, RPi, 
* MicroPython vs. Circuit Python, [WS](https://forums.raspberrypi.com/viewtopic.php?t=356535), Raspberry Pi Forum, 

News Papers - RPi Pico, C/C++, PIO
* Does C/C++ code run faster/more efficiently on Pico than MicroPython/CircuitPython? Are there any good ways to test this? [WS](https://www.reddit.com/r/raspberrypipico/comments/mhmdmh/does_cc_code_run_fastermore_efficiently_on_pico/), Raspberry Pi Pico, Reddit, 
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





