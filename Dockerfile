FROM openjdk:8-alpine
COPY ./target/das-boot-1.0-SNAPSHOT.jar /usr/src/dasboot/
WORKDIR /usr/src/dasboot
EXPOSE 8080
CMD ["java", "-jar", "das-boot-1.0-SNAPSHOT.jar"]