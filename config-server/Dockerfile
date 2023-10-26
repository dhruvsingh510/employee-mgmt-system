FROM eclipse-temurin

LABEL mentainer="dhruv@gmail.com"

WORKDIR /app

COPY  target/config-server-0.0.1-SNAPSHOT.jar /app/springboot-config-server.jar

CMD ["java", "-jar", "springboot-config-server.jar"]