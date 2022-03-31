FROM openjdk:8u131-jdk-alpine

MAINTAINER Binh Nguyen

EXPOSE 8080

WORKDIR /usr/local/bin/

COPY target/openshift-springboot-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["java","-jar","webapp.jar"]