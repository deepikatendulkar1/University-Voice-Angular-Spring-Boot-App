# 🎓 University Voice – Angular & Spring Boot App  
This full-stack web application enables prospective students to share their campus visit feedback. Built using Angular and Spring Boot, the system supports real-time form validation, RESTful communication, and full CRUD operations with a MySQL database.  
## 📌 Description  
Full-stack survey application using Angular and Spring Boot with REST APIs, form validation, and MySQL-backed CRUD operations. Designed as part of SWE 642 coursework to demonstrate complete frontend-to-backend integration and database management.  
## 🛠️ Tech Stack  
- Frontend: Angular (TypeScript, Bootstrap, Reactive Forms)  
- Backend: Spring Boot (REST API, JPA)  
- Database: MySQL  
- Build Tools: Maven, Node.js  
- Other: Postman (API testing), VS Code  
## 🧩 Features  
🌐 Angular Frontend  
- Landing page with navigation  
- Survey form:  
  - Inputs: name, address, contact info, survey date  
  - Checkboxes: favorite aspects of the campus  
  - Radio buttons: source of interest  
  - Dropdown: likelihood to recommend  
  - Textarea for comments  
- Form validation with custom error messages  
- REST API integration to submit and retrieve data  
⚙️ Spring Boot Backend  
- RESTful endpoints:  
  - POST /survey – Create a new survey  
  - GET /surveys – List all surveys  
  - PUT /survey/{id} – Update a survey  
  - DELETE /survey/{id} – Delete a survey  
- JPA entity for survey modeling  
- CRUD operations using JPA repository  
- Database setup via CRUD_ass3.sql  
## 📁 Folder Structure  
| Folder/File         | Description                                |  
|----------------------|--------------------------------------------|  
| survey-app/          | Angular frontend code                      |  
| demo_survey_app/     | Spring Boot backend project                |  
| CRUD_ass3.sql        | SQL schema for survey data                 |  
| recording/           | Video demo showcasing project functionality|  
| README.md            | Project documentation                      |  
## 🚀 Getting Started  
🔧 Prerequisites  
- Node.js and Angular CLI installed  
- JDK 17+ and Maven  
- MySQL server running  
🖥️ Run the Frontend  
cd survey-app  
npm install  
ng serve  
⚙️ Run the Backend  
cd demo_survey_app  
./mvnw spring-boot:run  
🗃️ Set Up MySQL Database  
Use MySQL CLI or Workbench to run:  
source CRUD_ass3.sql;  
## 🎥 Demo  
A video demo of the entire application is included in the recording/ folder.  
## 👨‍💻 Contributors  
- Deepika Tendulkar  
(If group project: Add team members here)  
## 📬 Contact  
📧 deepikatenduulkar5@gmail.com  
🔗 LinkedIn: https://www.linkedin.com/in/deepika-tendulkar-a88bb8166/  
*Developed as part of SWE 642 – Modern Web Development at George Mason University.*
