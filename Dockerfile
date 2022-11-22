FROM openjdk:17-alpine
RUN cd / && mkdir target && chmod 777 -R /target
COPY ./build/libs/MambuStub-0.0.1-plain.jar /target/
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "/target/MambuStub-0.0.1-plain.jar"]