FROM openjdk:19-alpine
ADD build/libs/*.jar spring-boot-example.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-example.jar"]
