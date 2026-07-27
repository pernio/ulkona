# ulkona
A small project to explore new technologies using Java Spring Boot

## Technologies used

To make this project, I use several technologies. These are free replacements of what I had first in mind.

More will be added when the project progresses.

### Technologies

- Java 21
- Spring Boot
- Maven
- PostgreSQL
- Flyway
- JUnit 5
- Mockito
- Testcontainers
- Docker

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

Check if the service is running using:

```shell
docker compose ps
```

Go to [UlkonaApplication](/src/main/java/app/netlify/jinzo/ulkona/UlkonaApplication.java) and run the application.

### Using

When everything runs, visit the following link to test endpoints:\
<http://localhost:8080/api>

### Testing

Tests can be found in the [tests folder](src/test/java/app/netlify/jinzo/ulkona). We have different kinds of tests

#### Unit tests

An example can be found in [this file](src/test/java/app/netlify/jinzo/ulkona/product/application/ProductServiceTest.java)

Run this with:

```shell
./mvnw test
```

Or on Windows

```shell
.\mvnw.cmd test
```

#### PostgreSQL integration test

This should be done after the product API works. An example can be found in [this file](src/test/java/app/netlify/jinzo/ulkona/product/application/ProductIntegrationTest.java)

### What did I learn from this

This project is meant to expand my knowledge about the technologies used in a Java API and to refresh my knowledge about Java Spring Boot.

Within this application, I learned how to use:

- PostgreSQL as a new database, which is used a lot in enterprises.
- Use Flyway for database migrations.
- More to come ...

This whole project was built with a goal to be production-ready. Of course this will never be used in an actual production environment, but this structure learned me how it's built. A few things I can summarize.

#### Docker

Docker is an easy way to containerize applications and use/test them in a save environment. This also allows me to run this code on any laptop.

#### Package-by-feature

In smaller applications, APIs are usually built in this structure:

```text
controller/
service/
repository/
entity/
```

This is fine for very small projects, but in large production APIs where there can be over 20 different services, it can become quite messy. That's why I work with a `feature structure`, also known as modular structure.

You give each "feature" their own subfolder to dump all code in. In the `common` folder can I place shared code that is used across all features. An example below of package-by-feature of a hospital application:

```text
common/
beds/
hospitals/
authentication/
```

#### Migrations

Migrations are "snapshots" of modifications to databases. It is important to **never** change a migration after re-running the application. You should create a new file with a later version/date in its name (depending on hich migrator you use).