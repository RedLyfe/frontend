FROM openjdk:18
ADD target/frontend-0.0.1-SNAPSHOT.jar frontend-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "frontend-0.0.1-SNAPSHOT.jar"]