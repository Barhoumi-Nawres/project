
# YOCTO-Project using Raspberry pi02w 

Using Raspberrypi0 2w 
## Hardware Requirements:
Raspberry Pi Zero 2 W
SD Card (16 GB)

## Project Architecture:

### Main Directories :
- docker 
- kas 
- meta-rpi-bsp
- meta-rpi-distro
- meta-rpi-prj
  ### Setup Process:
  Prepare KAS yml files for all layers and local configuration file

  1.install kas :
```bash
git clone https://github.com/siemens/kas.git
```
  2.Commands :
```bash
 kas-container checkout file.yml
  kas-container shell  file.yml 
  kas-container build  file.yml
```

 

