# Expense Control

Little system to control finances.

## Goals
- Use Java to remember some stuff
- Replace my current finances excel spreadsheet
- Use Docker to learn how to dockerize a Java App.
- Maybe open production to public HTTPS Access to learn all stuff required to do so (SSL, Load balancing, backups, DevOps, etc.)
- Set up some mutation tests
- Well tested project
- Java 8 All the way
- FlyWay migrations


## Operating

Techs:
- Some shell scripting
- Make
- Docker
- Docker Compose
- PostgreSQL 9.4

### Running:


``` sh
./gradlew dockerRun
```

Where run means:
- Build a jar of Spring Boot application with gradle
- Start docker compose with two containers:
    - A Postgresql container
    - A Open JDK 8 container built from `Dockerfile`

### Stopping:


``` sh
./gradlew dockerStop
```

Where stop means:
- Stopping all containers started by `./gradlew dockerRun`