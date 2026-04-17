FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/order-system-1.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
