FROM amazoncorretto:18-alpine-jdk

COPY target/web-invoice-uts-programacion-Frank-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

