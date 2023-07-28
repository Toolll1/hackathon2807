FROM amazoncorretto:11-alpine-jdk
COPY target/*.jar fintech-service.jar
ENTRYPOINT ["java","-jar","/fintech-service.jar"]