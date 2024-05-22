# Fase di compilazione
FROM maven:3.8.1-openjdk-17-slim AS build

# Copia il file pom.xml e i sorgenti
COPY pom.xml /usr/src/app/
COPY src /usr/src/app/src

# Esegue la compilazione
RUN mvn -f /usr/src/app/pom.xml clean package -DskipTests

# Fase di esecuzione
FROM openjdk:17-jdk-slim

# Copia l'applicazione compilata dalla fase di compilazione
COPY --from=build /usr/src/app/target/*.jar app.jar

# Espone la porta 8080 per l'applicazione
EXPOSE 8080

# Comando per eseguire l'applicazione
ENTRYPOINT ["java","-jar","/app.jar"]