FROM openjdk:8-jdk-alpine

EXPOSE 8080

COPY build/libs/spring_boot_rest1-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]