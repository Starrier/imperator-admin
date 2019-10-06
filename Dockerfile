FROM java:8
VOLUME /tmp
ADD target/admin-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8099
ENTRYPOINT ["java", "-jar","/app.jar"]