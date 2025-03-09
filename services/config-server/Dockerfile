FROM openjdk:23-jdk-slim
COPY src/main/java/com/azienda/config_server/ConfigServerApplication.java app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8888