# JVM Comparison for a Spring Boot + Postgres Microservice

### Motivation
This project intends to compare JVMs for a Spring Boot with Postgres DB Microservice.
- OpenJDK 11 + Oracle HotSpot
- OpenJDK 11 + Eclipse OpenJ9
- Oracle JDK 11
- Azul Zulu OpenJDK 11
- Oracle GraalVM CE 20
- Amazon Coretto JDK 11
- OpenJDK 8 + Oracle HotSpot
- OpenJDK 8 + Eclipse OpenJ9

### Prerequisites
- [docker](https://www.docker.com/)
- [docker-compose](https://docs.docker.com/compose/install/)
- [npm](https://www.npmjs.com/)
- [loadtest](https://www.npmjs.com/package/loadtest)

### Setup
- Run Postgres container: `docker-compose up -d postgres`

### Run
- Run the JVM service that you want to test, eg: `docker-compose up -d hello-world-openj9-11`
- Make sure it is working: `curl http://localhost:8080/hello-world`
- Do some loadtest: `./loadtest.sh`
- Monitor container stats: `docker stats`
- Stop application container before starting others: `docker-compose stop hello-world-openj9-11`


