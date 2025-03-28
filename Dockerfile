FROM eclipse-temurin:21-jdk-alpine
RUN apk add --no-cache fontconfig ttf-dejavu
ENV TZ=America/Lima
RUN apk update && apk add --no-cache tzdata
COPY siafms-1.2.1.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]