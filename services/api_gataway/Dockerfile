FROM openjdk:23-jdk-slim
COPY src/main/java/com/azienda/api_gataway/api_gataway/ApiGatawayApplication.java app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8222