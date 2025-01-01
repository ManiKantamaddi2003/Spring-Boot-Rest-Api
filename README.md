# MyDairy App REST API

## Overview
The **MyDairy App REST API** is a Spring Boot application that provides CRUD operations for managing users and diary entries. It uses a MySQL database for data persistence and follows RESTful API principles.

---

## Features
- User Management
  - Create, read, update, and delete users.
- Diary Entry Management
  - Create, read, update, and delete diary entries.
- Partial updates using PATCH requests.

---

## Technology Stack
- **Backend Framework**: Spring Boot
- **Database**: MySQL
- **ORM**: JPA (Jakarta Persistence API)
- **Language**: Java
- **Build Tool**: Maven

---

## Prerequisites
1. Java 17 or higher
2. Maven
3. MySQL Server
4. IDE (IntelliJ, Eclipse, etc.)

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/mydairy-app-rest-api.git
   cd mydairy-app-rest-api
   ```

2. Configure the database:
   - Update the `application.properties` file in `src/main/resources/`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/mydairy
     spring.datasource.username=your_db_username
     spring.datasource.password=your_db_password
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     ```

3. Build the application:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

---

## Endpoints

### User Management

| Method   | Endpoint          | Description                     |
|----------|-------------------|---------------------------------|
| `GET`    | `/users/`         | Retrieve all users.             |
| `POST`   | `/users/`         | Add a new user.                 |
| `PUT`    | `/users/`         | Update a user.                  |
| `GET`    | `/users/{id}`     | Get a user by ID.               |
| `DELETE` | `/users/{id}`     | Delete a user by ID.            |
| `PATCH`  | `/users/{id}`     | Partially update a user by ID.  |

### Diary Entry Management

| Method   | Endpoint             | Description                     |
|----------|----------------------|---------------------------------|
| `GET`    | `/entrie/`           | Retrieve all entries.           |
| `POST`   | `/`                  | Add a new entry.                |
| `PUT`    | `/`                  | Update an entry.                |
| `GET`    | `/entries/{id}`      | Get an entry by ID.             |
| `DELETE` | `/{id}`              | Delete an entry by ID.          |
| `PUT`    | `/{id}`              | Fully update an entry by ID.    |
| `PATCH`  | `/{id}`              | Partially update an entry by ID.|

---

## Project Structure
```
src/main/java/com/twg/springbootmydairyrestapi/
├── controllers   # REST controllers for handling API requests.
├── entities      # JPA entities (User, Entry).
├── repository    # Repositories for database interaction.
├── service       # Service layer for business logic.
└── MyDairyRestApiApplication.java # Main application entry point.
```

---

## Example Requests

### 1. Add a New User
**Request**:
```json
POST /users/
{
  "username": "john_doe",
  "password": "securePass123"
}
```

**Response**:
```json
{
  "id": 1,
  "username": "john_doe",
  "password": "securePass123"
}
```

### 2. Get All Users
**Request**:
```http
GET /users/
```

**Response**:
```json
[
  {
    "id": 1,
    "username": "john_doe",
    "password": "securePass123"
  },
  {
    "id": 2,
    "username": "jane_smith",
    "password": "password123"
  }
]
```

---

## Future Enhancements
- Implement authentication and authorization using Spring Security.
- Add user-friendly error handling and validation.
- Introduce Swagger for API documentation.

---
