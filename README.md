## Project: Customizing Linux Distributions for Raspberry Pi Zero 2W

### Project Structure:
- Kas
- Docker
- meta-rpi-bsp (BSP Layer)
- meta-rpi-distro (Distro Layer)
- meta-rpi-prj (Software Layer)

#### Build:
- Prepare KAS yml files for all layers and local configuration file
- Setup custom downloads and sstate-cache directories
- Enable build information output

#### Machine:
Custom machine development (Raspberrypi02w)
- Control every machine feature
- Remove kernel from going into the rootfs
- Linux kernel optimization (custom defconfig or configuration fragments
- Linux kernel device tree overlay recipe
- Linux kernel module recipe

#### Distribution:
Separate Yocto distribution layer development
- Custom distro configuration development (Distro.conf)
- Support for init manager (systemd)
- Optimizations (no recommended packages, full control on distro features)
- No poky
- Enable CVE checks
- Disable GPLv3 packages for all images
- Enable build information integration for all images

#### Image:
Control image features
- Control every package
- Create development and production images

For development:
   - Enable -dev and -dbg packages
   - Integrate profiling, debugging and development packages
   - Disable ssh password for root user
   
- Add data partition (WIC/kickstart file)   

#### OTA:
- Integrate RAUC Yocto layer
- Develop custom bundle
- Enable bundle encryption
- Enable adaptive update support
- Test RAUC update
   
#### Security:   
