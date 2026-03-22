# 🛰 Satellite Management System

![Java](https://img.shields.io/badge/Java-17-orange)
![SpringBoot](https://img.shields.io/badge/SpringBoot-Backend-green)
![REST API](https://img.shields.io/badge/API-REST-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

A **Satellite Management System API** built using **Java and Spring Boot** that simulates operations for managing satellites, missions, and monitoring their status.

This backend system demonstrates **enterprise backend architecture, RESTful API development, and system management operations**.

---

# 🔗 Repository

GitHub Repository

https://github.com/ChinmayaKumarSingh/Satellite-Management

```

# ✨ Features

✔ Satellite registration and management
✔ Mission creation and tracking
✔ Satellite health monitoring
✔ Orbit and status tracking
✔ RESTful API design
✔ Controller-Service architecture
✔ Clean project structure

```

# 🛠 Tech Stack

| Technology      | Usage                 |
| --------------- | --------------------- |
| Java 17         | Programming Language  |
| Spring Boot     | Backend Framework     |
| Spring Data JPA | ORM                   |
| Maven           | Build Tool            |
| REST API        | Backend Communication |

---

# 📂 Project Structure

```
satellite-management
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.satellite
│   │   │        ├── controller
│   │   │        ├── service
│   │   │        ├── repository
│   │   │        ├── model
│   │   │        └── SatelliteManagementApplication.java
│   │   │
│   │   └── resources
│   │        └── application.properties
│
├── pom.xml
└── README.md
```

---

# 🏗 System Architecture

```
Client / Monitoring System
        |
        | HTTP Request
        v
Spring Boot Controller
        |
        v
Service Layer
(Business Logic)
        |
        v
Repository Layer
(Spring Data JPA)
        |
        v
Database
        |
        v
API Response
```

---

# 🔄 Request Flow

```
Client Request
      |
      v
Controller Layer
      |
      v
Service Layer
      |
      v
Process Satellite Data
      |
      v
Database Operation
      |
      v
Return API Response
```

---

# 🌐 API Endpoints

| Method | Endpoint         | Description              |
| ------ | ---------------- | ------------------------ |
| GET    | /satellites      | Get all satellites       |
| GET    | /satellites/{id} | Get satellite details    |
| POST   | /satellites      | Register a new satellite |
| PUT    | /satellites/{id} | Update satellite status  |
| DELETE | /satellites/{id} | Remove satellite         |
| GET    | /missions        | Get all missions         |

---

# 📦 Example Request

### Register Satellite

POST /satellites

```json
{
 "name": "Sat-X1",
 "orbit": "Low Earth Orbit",
 "status": "Active"
}
```

---

# 📦 Example Response

### Success Response

```
Satellite registered successfully
```

### Error Response

```
Satellite not found
```

---

# ▶ Run Locally

### Clone repository

```
git clone https://github.com/ChinmayaKumarSingh/Satellite-Management.git
```

### Navigate to project

```
cd Satellite-Management
```

### Run application

```
mvn spring-boot:run
```

---

# 📈 Future Improvements

• Satellite telemetry monitoring
• Real-time mission tracking
• Authentication using JWT
• Docker containerization
• Swagger API documentation

---

# 👨‍💻 Author

**Chinmaya Singh**


