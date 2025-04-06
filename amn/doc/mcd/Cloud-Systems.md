# Cloud systems csy

Hosting. Hybrid cloud for climate model application, series data storage, analytics, scaling options, 

## Status

TODO
* <todo: consider, costs for Raspberry Pi cluster,  Bill of Materials, BoM, >
* <todo: consider, is it possible to do hybrid/home cluster with only FOSS? >

DONE
* <done: intent to commit, >

## BoM

csy PoC high level list, abstract
* bare metal cluster, RPi
* control server, RPi, - to run MAAS, MAAS Power, 
* switch/hub, 
* power supply for switch/hub, dependent on cluster power load, i.e. number of cluster machines
* router, running NAT, connected to internet, use wifi router instead?
* separate internet connection? tbd
* container management, Kubernates
* storage for each cluster machine, USB stick?
* SD card (the smallest size you can find), for each cluster machine
* ...
* ..

csy PoC BoM
* Raspberry Pi, RPi 4/5 version? - bare metal cluster x 4, Arm - CPU, [WS](https://ubuntu.com/download/raspberry-pi)
* Raspberry Pi, RPi 4/5 version? - control server
* Switch/hub, UUGear Mega4? 
* Kubernates, MicroK8s, ubuntu [WS](https://microk8s.io/) FOSS? - container management
* Juju, FOSS?
* Container? 
* Metal as a Service MAAS, ubuntu [WS](https://maas.io/) FOSS?

## References

Terms
* Cloud
* Hybrid cloud
* Cluster
* Network Attached Storage NAS
* Storage Area Network SAN
* ..

News Papers - MAAS
* Build your own bare metal cloud using a Raspberry Pi cluster with MAAS, [WS](https://maas.io/tutorials/build-your-own-bare-metal-cloud-using-a-raspberry-pi-cluster-with-maas#1-overview), Canonical, 
* Homelab clusters: LXD micro cloud on Raspberry Pi, [WS](https://ubuntu.com/blog/homelab-clusters-lxd-micro-cloud-on-raspberry-pi), 9 October 2020, Rhys Davies

News Papers - cluster, rack, 
* How to build a Raspberry Pi cluster, [WS](https://www.raspberrypi.com/tutorials/cluster-raspberry-pi-tutorial/), 
* ...
* ...

News Papers - storage, san, nas, 
* How to build a Raspberry Pi NAS, [WS](https://www.raspberrypi.com/tutorials/nas-box-raspberry-pi-tutorial/)
* ...
* ...

