#  Deployment Logger API

A simple Spring Boot REST API for managing deployment records.
This project demonstrates CRUD operations, layered architecture, and Docker containerization.

---

## Features

- Create deployment records
- Retrieve all deployments
- Retrieve deployment by ID
- Update deployment
- Delete deployment
- Input validation using `@Valid`
- Custom exception handling
- Global exception handler (`@RestControllerAdvice`)
- PostgreSQL database integration
- Automatic table creation using Hibernate

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven
- Hibernate
- Postman (API testing)

---

##  Project Structure

```text id="structure"
controller/   → Handles HTTP requests  
service/      → Business logic  
repository/   → Database access  
entity/       → Database model  
dto/           → Data transfer objects (optional layer)
exception/     → Custom exceptions + handlers

```

---

##  Setup & Run (Without Docker)

### 1. Clone the repository

```bash id="clone"
git clone https://github.com/your-username/deployment-logger.git
cd deployment-logger
```

---

### 2. Run the application

```bash id="runapp"
./mvnw spring-boot:run
```

Application runs at:

```text id="url"
http://localhost:8080
```

---

##  API Endpoints

###  Create Deployment

```text id="post"
POST /deployments
```

```json id="postbody"
{
  "projectName": "my-app",
  "version": "v1.0",
  "status": "SUCCESS"
}
```

---

###  Get All Deployments

```text id="get"
GET /deployments
```

---

###  Update Deployment

```text id="put"
PUT /deployments/{id}
```

---

###  Delete Deployment

```text id="delete"
DELETE /deployments/{id}
```

---

##  Docker Setup

###  Build Docker image

```bash id="dockerbuild"
docker build -t deployment-logger .
```

---

###  Run Docker container

```bash id="dockerrun"
docker run -p 8080:8080 deployment-logger
```

---

###  Access API

```text id="dockerurl"
http://localhost:8080/deployments
```

---

