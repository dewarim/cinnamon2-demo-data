/etc/init.d/tomcat7 stop
rm -rf /var/lib/tomcat7/webapps/dandelion*
cp /home/cinnamon/dandelion.war.new /var/lib/tomcat7/webapps/dandelion.war
/etc/init.d/tomcat7 start
