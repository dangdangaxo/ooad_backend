FROM openjdk:17
EXPOSE 5001 5002
LABEL authors="WORK"

ENTRYPOINT ["java", "-jar", "app.jar"]
