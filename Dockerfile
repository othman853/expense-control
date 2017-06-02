FROM openjdk:8

RUN mkdir /application

COPY build/libs/expense-control.jar /application/expense-control.jar

WORKDIR /applications

EXPOSE 8080

CMD java -jar /application/expense-control.jar