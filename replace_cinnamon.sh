/etc/init.d/tomcat7 stop
rm -rf /var/lib/tomcat7/webapps/cinnamon*
#rm -rf /home/cinnamon/cinnamon-system/index/*
cp /home/cinnamon/cinnamon.war.new /var/lib/tomcat7/webapps/cinnamon.war
/etc/init.d/tomcat7 start
