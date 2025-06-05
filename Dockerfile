# Etapa 1: Construcción
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Imagen final liviana
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/target/boda-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
