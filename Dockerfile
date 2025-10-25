FROM amazoncorretto:17-alpine
LABEL maintainer="joshua oladokun"
WORKDIR /app
COPY build/libs/SpringGithubAction-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]