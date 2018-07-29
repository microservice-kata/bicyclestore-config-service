FROM openjdk:8-jdk-alpine

MAINTAINER Laijin Lu <1@aikin.me>

COPY build/libs/config-service.jar /app/config-service.jar

WORKDIR /app

CMD ["java", "-jar", "-Xmx2048m", "config-service.jar"]
