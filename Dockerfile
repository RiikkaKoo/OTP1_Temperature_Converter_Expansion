FROM  maven:latest AS build
LABEL authors="riikka"

WORKDIR /app

COPY pom.xml .

COPY . /app

RUN mvn package

CMD ["java", "-jar", "target/average_speed.jar"]