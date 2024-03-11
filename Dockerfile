FROM openjdk:11
MAINTAINER "paparao"
COPY target/app.jar  /usr/app
WORKDIr /usr/app
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "app.jar"]
