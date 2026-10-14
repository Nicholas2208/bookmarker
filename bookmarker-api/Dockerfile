# Start with a base image containing Java runtime
FROM eclipse-temurin:17-jdk-jammy

# Information around who maintains the image
MAINTAINER Nicholas White

# Add the application's jar to the image
COPY target/bookmarker-api-0.0.1-SNAPSHOT.jar bookmarker-api-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "bookmarker-api-0.0.1-SNAPSHOT.jar"]