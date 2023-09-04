FROM tomcat:8.0
COPY target/*.war /usr/local/tomcat/webapps/hello-scalatra.war
EXPOSE 9090
CMD ["catalina.sh","run"]
