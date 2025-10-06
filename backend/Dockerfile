FROM gradle:8.12.1-jdk21 AS build

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src
RUN gradle build --no-daemon -x test

FROM openjdk:21-jdk-slim

RUN mkdir /var/lib/app

COPY --from=build /home/gradle/src/build/libs/*.jar /var/lib/app/app.jar

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseContainerSupport", "-XX:MaxRAMFraction=1", "-Djava.security.egd=file:/dev/./urandom","-jar","/var/lib/app/app.jar"]