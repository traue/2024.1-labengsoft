#!/bin/bash
sudo apt update
sudo apt install apache2 wget unzip -y
wget https://github.com/traue/2024.1-labengsoft/raw/main/vagrant-lab/labeng_site.zip
unzip labeng_site.zip
sudo cp -r labeng_site/* /var/www/html/
sudo systemctl restart apache2