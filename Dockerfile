FROM amazoncorretto:11
MAINTAINER tunombre_o_alias
COPY target/Portfolio-0.0.1-SNAPSHOT.jar Portfolio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","target/Portfolio-0.0.1-SNAPSHOT.jar"]
