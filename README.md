# ulkona
A small project to explore new technologies using Java Spring Boot

## Technologies used

To make this project, I use several technologies. These are free replacements of what I had first in mind.

More will be added when the project progresses.

### Base

- Spring Web (Building REST api's & handling HTTP requests)
- Spring Data JPA (Accessing and managing data in a relational database)
- Validation (Validating incoming data, eg: required fields, formats, ...)
- PostgreSQL Driver (Connecting the Spring Boot application to PostgreSQL)
- Flyway Migration (Managing and versioning db schema changes)
- Spring Boot Actuator (Monitoring the application through health checks)

### Development extra

- Spring Boot DevTools (Improve dev tooling with eg automatic restarts)

### Testing

- Testcontainers (Running temporary Docker container during integration tests)
- PostgreSQL (Database I picked)

## Running the project

### Preparation

Use these details:
- Java JDK 21 (Normally 17 is also supported, but 21 is advised for this)
- Maven
- Docker & Docker Desktop

### Starting

Let Maven load in the dependencies and start Docker Desktop. Validate with the following commands that you have Docker succesfully:
```shell
docker --version
```
```shell
docker compose version
```

Run the following command to create & start the Docker container. [compose.yml](compose.yml) is used for this. This will:

- use a ligtweight PostgreSQL image and initialises PostgreSQL.
- check every 5 seconds if PostgreSQL is accepting connections.

```shell
docker compose up -d
```

Go to [UlkonaApplication](/src/main/java/app/netlify/jinzo/ulkona/UlkonaApplication.java) and run the application.

### Using

When everything runs, visit the following link to test endpoints:\
<http://localhost:8080/api>

### Testing

More to come here ...

### What did I learn from this

This project is meant to expand my knowledge about the technologies used in a Java API and to refresh my knowledge about Java Spring Boot.

Within this application, I learned how to use:

- PostgreSQL as a new database, which is used a lot in enterprises.
- Use Flyway for database migrations.
- More to come ...

To conclude everything and give a short explanation. I learned many new technologies to prepare myself for production-level applications in enterprises.