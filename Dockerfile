FROM maven:3-openjdk-18 as build 
COPY .  .
RUN mvn install


FROM openjdk:17-jdk-alpine 
COPY --from=build target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
