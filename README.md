# Calistio Backend

The official backend service for **Calistio** ([calist.io](https://calist.io)), a calisthenics platform focused on tracking progress,
helping with proper exercise form and developing training plans


## Tech Stack

* **Framework:** Java 25 / Spring Boot 4.1.1
* **Database:** PostgreSQL
* **ORM / Persistence:** Spring Data JPA / Hibernate
* **API Standard:** RESTful JSON API
* **Build Tool:** Gradle


## Getting Started

### Prerequisites

Ensure you have the following installed locally:
* **JDK 25** or higher
* **PostgreSQL** database running locally on port `5432`
* **Gradle**

### Local Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/antek-bal/calist-backend.git
   cd calist-backend
   ```

2. **Run the Application:**
   ```bash
   ./gradlew bootRun
   ```

The application will start on `http://localhost:8080`.

## Project Architecture

The project follows a standard layered architecture:

```text
src/main/java/io/calist/backend/workout
├── controller/     # REST Controllers
├── dto/            # Data Transfer Objects
├── entity/          # JPA Entities
├── repository/     # Spring Data Repositories
└── service/        # Business Logic
```

## License

This project is part of **Calistio** ecosystem and all rights are reserved by Antoni Balcerzak. See the [LICENSE](LICENSE) file for details.
