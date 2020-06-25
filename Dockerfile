FROM tomcat:8:0
MAINTAINER {your name]
COPY target/*.war /usr/local/tomcat/webapps/hello-scalatra.war
EXPOSE 8080

