#!/bin/bash

export EXPCON_DATABASE_URL='jdbc:postgresql://localhost:5432/test_db'
export EXPCON_DATABASE_USER='test'
export EXPCON_DATABASE_PASSWORD='test'

docker-compose up -d db
./gradlew flywayMigrate -i
docker-compose stop db