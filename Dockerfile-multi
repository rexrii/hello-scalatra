FROM maven:3.6-openjdk-11 as builder

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app

RUN mvn -f /usr/src/app/pom.xml clean package

FROM tomcat:9 
COPY --from=builder /usr/src/app/target/*.war /usr/local/tomcat/webapps/

