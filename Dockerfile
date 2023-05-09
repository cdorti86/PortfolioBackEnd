FROM amazoncorretto:11
MAINTAINER tunombre_o_alias
COPY target/NAME-YOUR-FILE-BUILD-SPRINGBOOT.jar
NAME-YOUR-FILE-BUILD-SPRINGBOOT.jar
ENTRYPOINT ["java","-jar","target/Portfolio-0.0.1-SNAPSHOT.jar"]