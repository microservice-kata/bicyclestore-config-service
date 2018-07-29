FROM openjdk:8-jdk-alpine

MAINTAINER Laijin Lu <1@aikin.me>

COPY build/libs/bicyclestore-config-service.jar /app/bicyclestore-config-service.jar

WORKDIR /app

CMD ["java", "-jar", "-Xmx2048m", "bicyclestore-config-service.jar"]
