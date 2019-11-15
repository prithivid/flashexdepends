FROM maven:3.6.0-jdk-12-alpine

COPY / /dependencies

WORKDIR /dependencies

RUN mvn dependency:go-offline