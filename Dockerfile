FROM openjdk:17-jdk-appine3.14
COPY "./target/music-catalog-0-0-1-SNAPSHOT.jar" "/app/music-catalog.jar"
EXPOSE 8080
CMD ["java","-jar","/app/music-catalog.jar"]