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

## References

Terms
* 
* Real Time Operating System RTOS, [WP](https://en.wikipedia.org/wiki/Real-time_operating_system), switch between tasks based on priority, hard RTOS less jitter vs soft RTOS more jitter, time ? jitter, 
* Time Sharing Operating System TSOS, switch between tasks based on clock interrupts 

Embedded Systems - products
* Arduino, microcontroller board, coding (C++ ), ~200mW, cpu 16MHz, ram (2k, 32k flash), network (additional shields for WiFi, Ethernet, )
* Raspberry Pi, single board computer, coding (Python, C, C++, ), ~700mW, cpu 1.5GHz, ram (512MB, 8GB), network (HDMI, USB, Ethernet, WiFi, Bluetooth, )

Real Time Computing 
* Jitter, telecomms, 
* Real time computing RTC, hard RT vs soft RT, event driven, 
* Preemtive priority, event priority, 
* Multicore processor, CPU, one task event execution per core, 
* Memory allocation, no memory leaks, avoid requirement for reboot to free blocked resources, all set statically at compile wherever possible not dynamic memory allocation at runtime, avoids dynamic memory fragmentation, no swap to disk file memory management,   
* Fixed size block algorithms, for RTC, memory management, simple embedded systems, 

News Papers - RPi apps
 * What's your list of the best software/applications for your Raspberry Pi?, [WS](https://forums.raspberrypi.com/viewtopic.php?t=272664), 30 April 2020, Forums Raspberry Pi, 
 
 News Papers - RPi OS
 * Best Raspberry Pi Operating Systems for Various Purposes, [WS](https://itsfoss.com/raspberry-pi-os/) 18 Jul 2024, Ankush Das, Power up your Raspberry Pi with a versatile operating system that serves your purpose.
 
 News Papers - Respberry Pi
* I made weather station app and designed it for a Raspberry Pi using the official 7" 800x480 touch screen, [WS](https://www.reddit.com/r/raspberry_pi/comments/il03rk/i_made_weather_station_app_and_designed_it_for_a/?rdt=34061), raspberry_pi, Reddit, 

News Papers - Arduino
* First project I'm really proud of! An air quality sensor that writes to external SD memory + has an LCD screen. (I also don't understand capacitors and added them for no reason, no clue if there's a point to them here), [WS](https://www.reddit.com/r/ArduinoProjects/comments/1foninq/first_project_im_really_proud_of_an_air_quality/), ArduinoProjects, Reddit, 
* Temp Sensor with OLED Display, [WS](https://www.reddit.com/r/ArduinoProjects/comments/1h22i1g/temp_sensor_with_oled_display/), ArduinoProjects, Reddit, 

News Papers - embedded systems
* What are some good modern temperature sensors? [WS](https://www.reddit.com/r/embedded/comments/1d3cakd/what_are_some_good_modern_temperature_sensors/), embedded, Reddit, 
* ...

News Papers - data logger
* Best Serial Data Logger Software for Sensor Monitoring?, [WS](https://www.reddit.com/r/embedded/comments/1gersgf/best_serial_data_logger_software_for_sensor/), RS-232, RS-485, log real time data from sensors, 
* 

News Papers - IoT storage, remote, RDBMS
* Guidance needed on proper way to store IoT data from multiple devices, [WS](https://www.reddit.com/r/SQLServer/comments/1clk9ha/guidance_needed_on_proper_way_to_store_iot_data/), different schemas per IoT device, sensor device, 
* What are you using as sensor database?, [](), IoT, Reddit, 