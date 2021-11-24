
FROM docker.io/openjdk:17
ENV APP_HOME=/home/app
WORKDIR $APP_HOME
COPY build/docker/layers/libs $APP_HOME/libs
COPY build/docker/layers/resources $APP_HOME/resources
COPY build/docker/layers/application.jar $APP_HOME/application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/home/app/application.jar"]