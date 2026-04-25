# 🚀 Deployment Logger API

A simple Spring Boot REST API for managing deployment records.
This project demonstrates core backend concepts like CRUD operations, layered architecture, and API testing.

---

## 📌 Features

* ➕ Create a deployment
* 📥 Get all deployments
* 🔄 Update a deployment
* ❌ Delete a deployment

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Lombok
* Maven
* H2 Database (default)

---

## ⚙️ Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/deployment-logger.git
cd deployment-logger
```

---

### 2. Run the application

```bash
./mvnw spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

## 📡 API Endpoints

### ➕ Create Deployment

```
POST /deployments
```

Request Body:

```json
{
  "projectName": "my-app",
  "version": "v1.0",
  "status": "SUCCESS"
}
```

---

### 📥 Get All Deployments

```
GET /deployments
```

---

### 🔄 Update Deployment

```
PUT /deployments/{id}
```

Example:

```
PUT /deployments/1
```

---

### ❌ Delete Deployment

```
DELETE /deployments/{id}
```

---

## 🧠 Project Structure

```
src/main/java/com/fred/deploymentlogger

controller/   → Handles HTTP requests  
service/      → Business logic  
repository/   → Database operations  
entity/       → Database model  
```

---

## 🧪 Testing the API

You can test endpoints using tools like Postman.

Example flow:

1. Send a POST request to create data
2. Use GET to retrieve it
3. Use PUT to update it
4. Use DELETE to remove it

---

## 🚀 Future Improvements

* Add input validation
* Introduce DTOs for cleaner architecture
* Connect to PostgreSQL
* Add authentication (JWT)
* Dockerize the application

---
