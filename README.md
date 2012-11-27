# Cinnamon Demo Data

This repository contains the data and configuration files of the Cinnamon 2 server demo install, as used by the Cinnamon server VM to generate DITA content.

## Versions

* Cinnamon: 2.3.0 (license: LGPL 2.1 or later)
* DITA-OT: 1.5.4 (data files, license: Apache License 2.0)

## Links

* Cinnamon Homepage: http://cinnamon-cms.de
* Cinnamon @ Sourceforge: http://sourceforge.net/projects/cinnamon
* DITA-OT: http://dita-ot.sourceforge.net/
* GitHub: http://github.com/dewarim/cinnamon-demo-data

## Usage

The Cinnamon server looks for the files in this repository in a place defined by the environment variable CINNAMON_HOME_DIR (and, for the administration tool, DANDELION_HOME_DIR). So for example on a Linux system, 

* clone this repository into /opt/cinnamon, so that the cinnamon_config.xml is in /opt/cinnamon/cinnamon_config.xml.
* create a PostgreSQL database 'cinnamon' with user 'cinnamon'
* start your servlet container with CINNAMON_HOME_DIR set to the correct path like, (on Ubuntu, you can set this in /etc/default/tomcat7)
  export CINNAMON_HOME_DIR=/opt/cinnamon
* connect with the Cinnamon Desktop Client (.NET, Windows only)
* or use the administration interface on your server's IP address:
  http://$ip:8080/dandelion

## Contact

Questions & suggestions: ingo.wiarda@horner-project.eu
