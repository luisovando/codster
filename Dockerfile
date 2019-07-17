# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

RUN set -x && \
    addgroup -g 1000 appuser && \
    adduser -u 1000 -D -G appuser appuser