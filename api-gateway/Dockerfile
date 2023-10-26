FROM eclipse-temurin

LABEL mentainer="dhruv@gmail.com"

WORKDIR /app

COPY  target/api-gateway-0.0.1-SNAPSHOT.jar /app/springboot-api-gateway.jar

CMD ["java", "-jar", "springboot-api-gateway.jar"]