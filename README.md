# Ulkona

A monorepo to explore new technologies in a way to make this production-ready. This shows my skills on full-stack level.

## Introduction

Ulkona translates to "Outdoors" in Finnish. I did my Erasmus exchange in Finland, so that's why I chose this specific language. The concept behind this is simple. It's a customer-based warehouse / inventory-reservation application. Sounds simple, right? Well, I wanted to go further.

Next to a backend, I'm making a website and app. The website should a customer reservation portal. The app should be for staff operations, which includes stock actions and reservation handling.

The backend is the main scope of this project, as in that subfolder, I experiment with new technologies that are actually used in the industry. I'm aiming to make a production-ready application. Ofcourse this will probably not be able to handle 1k users, but that's also not within scope. It's a simple learning experiment.

## Subfolders

### Backend

This is what I started with and was the main goal of this project. It uses Java Spring Boot as core with PostgreSQL as database. [All details can be found in here.](/backend/README.md)

### Mobile app

This was the second scope of the project. A simple mobile app using React Native in Expo to show data from the backend. [All details can be found in here.](/app/README.md)

### Website

This was the third scope of the project. A desktop interface in website format that uses React.js, tailwind and more. [All details can be found in here.](/website/README.md)

## What's next

This is my complete checklist into expanding this project. Things that are done will be striped-through

### Backend

- ~~Add basic endpoint to revisit Spring Boot~~
- ~~Create a first migration~~
- ~~Run application in Docker~~
- ~~Add products in PostgreSQL~~
- ~~Add first unit & integration tests~~
- Add automated tests on Github
- Add Swagger UI
- Make a class diagram
- Add shops
- Linking products with shops via shop stocks
- Add customers
- Link customers with shops via reservations (Using an idempotency key)
- Concurrency-safe stock reservation (What happens when 2 customers buy at the same time)
- Reservation expiry
- Reservation cancellation
- Reservation collection
- Add pagination, filtering and sorting
- Add limited discounts for products
- Add redis to cache and rate limit
- RabbitMQ events
- Notification worker
- Add Spring Security
- Customer and employee roles
- Authentication
- Authorization rules
- Request validation
- Health & metics
- Logging while keeping an eye on preventing personal data stored
- Audit logs
- Add an LLM with Ollama showing reccommendations

### App

- Setup app file structure
- Create a login screen
- Create a dashboard to show all stock with filter + pagination
- Connect to the api
- Use a safe way to log tokens to stay logged in for a while

### Website

- ~~Setup website file structure~~