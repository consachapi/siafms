FROM openjdk:17-alpine
RUN mkdir /logs
RUN apk add --no-cache fontconfig ttf-dejavu
ENV TZ America/Lima
ADD siafms-1.2.0.jar //
ENTRYPOINT ["java", "-jar", "/siafms-1.2.0.jar"]