---

# 📚 Book Store Management Application
A robust CRUD application built with Java, Spring Boot, and MySQL for efficient book inventory management.

## 🚀 Features
- **Full CRUD Operations**: Create, Read, Update, Delete books
- **RESTful API**: Standardized endpoints for integration
- **Database Integration**: MySQL persistence with Spring Data JPA
- **Error Handling**: Comprehensive API error responses
- **Validation**: Input validation for book data

## 🛠️ Tech Stack
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **MySQL 8+**
- **Maven** (dependency management)
- **Postman** (API testing)

## ⚙️ Prerequisites
- Java 17+ ([JDK Installation Guide](https://www.oracle.com/java/technologies/downloads/)
- MySQL 8+ ([MySQL Server](https://dev.mysql.com/downloads/mysql/))
- Postman ([Download](https://www.postman.com/downloads/)) or similar API client

## ⚙️ How to Run

1. **Clone the repository**

   ```bash
   git clone https://github.com/KrishnaBishowkarma/book-store.git
   cd book-store
   ```

2. **Set up MySQL database**

   Make sure MySQL is installed and running on your system.

3. **Create the `book_store` database and table**

   Run the SQL script located at:
   `src/main/resources/book-store.sql`

   > This will create the `book_store` database, a `book` table, and insert sample data.

4. **Configure your database credentials**

   Open `src/main/resources/application.properties` and update it with your MySQL username and password:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/book_store
   spring.datasource.username=<your_username>
   spring.datasource.password=<your_password>
   ```

5. **Run the application**

   You can run the app using your IDE or from the terminal:

   ```bash
   # Using Maven Wrapper
   ./mvnw spring-boot:run
   ```
   
   ```bash
   # Or with installed Maven
   mvn spring-boot:run
   ```

6. **Explore the API**

   Access the REST APIs via Postman or any REST client. The app will be available at: `http://localhost:8080`
   
   You can test endpoints like:

   📂 API Endpoints

   | Method | Endpoint        | Description             |
   | ------ | --------------- | ----------------------- |
   | GET    | /api/books      | Get all books           |
   | GET    | /api/books/{id} | Get book by ID          |
   | POST   | /api/books      | Add a new book          |
   | PUT    | /api/books      | Update an existing book |
   | DELETE | /api/books/{id} | Delete a book by ID     |


## 🧪 API Testing

To quickly test the API endpoints, use the provided Postman collection:

📁 [Bookstore API Postman Collection](./src/main/resources/BookStore.postman_collection.json)

### Steps:

1. Open Postman.
2. Click on **"Import"** → **"Upload Files"**.
3. Select the `BookStore.postman_collection.json` file located at:

```
src/main/resources/BookStore.postman_collection.json
```

4. Once imported, you can test all the endpoints:
- `GET /api/books`
- `GET /api/books/{id}`
- `POST /api/books`
- `PUT /api/books`
- `DELETE /api/books/{id}`

> Make sure the application is running at `http://localhost:8080` before sending any requests.

---
## 📄 License

This project is licensed under the [MIT License](LICENSE).

## 🤝 Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you'd like to change.

## 👨‍💻 Author
**Krishna B. K (Bishowkarma)**  
[🌐 Portfolio](https://krishna-bk.com.np) | [💼 LinkedIn](https://linkedin.com/in/KrishnaBishowkarma) | [🐙 GitHub](https://github.com/KrishnaBishowkarma)

---


