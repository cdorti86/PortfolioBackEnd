FROM amazoncorretto:11
MAINTAINER cdcorti86
COPY target/target/Portfolio-0.0.1-SNAPSHOT.jar Portfolio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","target/Portfolio-0.0.1-SNAPSHOT.jar"]