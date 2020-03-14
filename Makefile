build:
	@mvn clean package spring-boot:repackage

run:
	@java -jar target/java-crud-microservice-0.0.1-SNAPSHOT.jar

docker:
	@docker-compose up -d