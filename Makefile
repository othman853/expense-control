run:
	./gradlew clean build
	docker-compose up -d --build web

stop:
	docker-compose stop