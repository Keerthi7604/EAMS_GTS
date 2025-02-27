# Employment Agreement Management System

This project is a RESTful API for managing Employment Agreements within an organization. It's built using Java and Spring Boot, providing CRUD operations and search functionality for employment agreements.

## Features

	•	Create, Read, Update, and Delete employment agreements
	•	List all agreements with optional filters
	•	Search agreements based on multiple criteria like employee role, salary range, start date, etc.
	•	Basic authentication for secure access
	•	API documentation using Swagger/OpenAPI
	•	Containerization with Docker for easy deployment
## Prerequisites

- Java 17
- Maven

## Getting Started

### Clone the repository

## Step 1: Clone the repository

```bash
git clone https://github.com/Keerthi7604/EAMS_GTS.git

cd employment-agreement-management
```

## Step 2: Build the project

```bash
mvn clean install
```

## Step 3: Running the Application

```bash
mvn spring-boot:run
```

## API Endpoints

- Create Agreement: `POST /api/v1/employment-agreements`
- Get Agreement: `GET /api/v1/employment-agreements/{id}`
- Update Agreement: `PUT /api/v1/employment-agreements/{id}`
- Delete Agreement: `DELETE /api/v1/employment-agreements/{id}`
- List Agreements: `GET /api/v1/employment-agreements`
- Search Agreements: `GET /api/v1/employment-agreements/search`

For detailed information on request/response formats and query parameters, please refer to the Swagger documentation.

## Technologies Used

- Java 17
- Spring Boot 3.1.0
- Spring Data JPA
- Spring Security
- H2 Database
- SpringDoc OpenAPI (Swagger)
- Docker


## Testing

Run unit and integration tests using:

```bash
mvn test
```

## Contact

For any questions or support, feel free to reach out to the project maintainer:

	•	Email: keerthanapalanisamycse2004@gmail.com
	•	GitHub: Keerthi7604

### Thank you
#   E A M S _ G T S  
 #   E A M S _ G T S  
 #   E A M S _ G T S  
 