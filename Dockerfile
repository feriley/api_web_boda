# Imagen base de Java 17 con Alpine (ligera)
FROM openjdk:17-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el JAR generado en el contenedor
COPY target/boda-api-0.0.1-SNAPSHOT.jar app.jar

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]

# Expone el puerto 8080 (por defecto en Spring Boot)
EXPOSE 8080