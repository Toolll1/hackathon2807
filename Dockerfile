FROM amazoncorretto:11-alpine-jdk
COPY target/*.jar ewm-service.jar
ENTRYPOINT ["java","-jar","/fintech-service.jar"]