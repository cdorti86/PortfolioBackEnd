FROM amazoncorretto:11
MAINTAINER cdcorti86
COPY target/Portfolio-0.0.1-SNAPSHOT.jar app-0.0.1.jar
ENTRYPOINT ["java","-jar","/app-0.0.1.jar"]