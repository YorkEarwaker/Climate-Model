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

## Libraries

IDE 
* Thonny Python IDE, RPi pico (MicroPython), 
* Arduion IDE, RPi pico (C/C++ SDK), can be used to program 
* VS Code, RPi pico (C/C++ SDK, MicroPython, )
* Eclipse, Eclipse CMake plugin?
* CLion, 
* CodeBlocks, RPi pico (C/C++ SDK, ), C/C++, Fortran, free, 

libs
* RPi.GPIO, python, interact with GPIO pins
* avrdude, upload firmware to microcontroller, Atmel AVR MCB, Ubuntu [WS](https://manpages.ubuntu.com/manpages/focal/man1/avrdude.1.html), [GH]()

RPi
* RPi docs, [WS](https://www.raspberrypi.com/documentation/)
* RPi docs, pico, C/C++ SDK [WS](https://www.raspberrypi.com/documentation/microcontrollers/c_sdk.html)
* ...

## References

Terms
* Real Time Operating System RTOS, [WP](https://en.wikipedia.org/wiki/Real-time_operating_system), switch between tasks based on priority, hard RTOS less jitter vs soft RTOS more jitter, time ? jitter, 
* Time Sharing Operating System TSOS, switch between tasks based on clock interrupts 

Embedded Systems - products, microcontroller board MCB, single board computer SBC
* Arduino, MCB (Atmel ATMega328P), coding (C++ ), ~200mW, cpu ( , 16MHz), ram (2kb, 32kb flash), network (additional shields for WiFi, Ethernet, ), GPIO (14 digital I/O pins, 6 analog pin inputs)
* Raspberry Pi, SBC, coding (Python, C, C++, ), ~700mW, cpu 1.5GHz, ram (512MB, 8GB), network (HDMI, USB, Ethernet, WiFi, Bluetooth, ), GPIO (40 pins, handle variety of tasks, )
Raspberry Pi Pico, MCB (RP2040), coding (C, C++, MicroPython, Rust, ), ~?mW, cpu (dual-core Arm Cortex-M0+, 133MHz), ram (264kb SRAM, 2Mb flash, ), network (WiFi, dual Bluetooth), GPIO (programmable IO (PIO), ), 

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
* Raspberry Pi, SCB, current preferred option, evaluation and PoC
* Raspberry Pi Pico, MCB, current preferred option, evaluation and PoC
* STM32 Nucleao

News Papers - RPi apps
 * What's your list of the best software/applications for your Raspberry Pi?, [WS](https://forums.raspberrypi.com/viewtopic.php?t=272664), 30 April 2020, Forums Raspberry Pi, 
 
 News Papers - RPi OS
 * Best Raspberry Pi Operating Systems for Various Purposes, [WS](https://itsfoss.com/raspberry-pi-os/) 18 Jul 2024, Ankush Das, Power up your Raspberry Pi with a versatile operating system that serves your purpose.
 
 News Papers - Respberry Pi
* I made weather station app and designed it for a Raspberry Pi using the official 7" 800x480 touch screen, [WS](https://www.reddit.com/r/raspberry_pi/comments/il03rk/i_made_weather_station_app_and_designed_it_for_a/?rdt=34061), raspberry_pi, Reddit, 
* What IDE to use? Options?, RPi pico [WS](), Forum, RPi, 

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

News Papers - RPi pico C/C++
* 1
* 2
* Raspberry Pi Pico and RP2040 - C/C++ Part 3: How to Use PIO, [WS](https://www.digikey.com/en/maker/projects/raspberry-pi-pico-and-rp2040-cc-part-3-how-to-use-pio/123ff7700bc547c79a504858c1bd8110), VS Code, 

News Papers - data logger
* Best Serial Data Logger Software for Sensor Monitoring?, [WS](https://www.reddit.com/r/embedded/comments/1gersgf/best_serial_data_logger_software_for_sensor/), RS-232, RS-485, log real time data from sensors, 
* 

News Papers - IoT storage, remote, RDBMS
* Guidance needed on proper way to store IoT data from multiple devices, [WS](https://www.reddit.com/r/SQLServer/comments/1clk9ha/guidance_needed_on_proper_way_to_store_iot_data/), different schemas per IoT device, sensor device, 
* What are you using as sensor database?, [](), IoT, Reddit, 


