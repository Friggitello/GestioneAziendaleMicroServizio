FROM openjdk:23-jdk-slim
COPY src/main/java/com/azienda/discovery/DiscoveryApplication.java app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8761