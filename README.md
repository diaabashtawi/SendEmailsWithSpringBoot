# 📧 Send Emails with Spring Boot

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)

A Spring Boot application to send emails using JavaMailSender and Thymeleaf for email templating.

## 🚀 Features
- 📩 Send emails with attachments
- ✉️ Use Thymeleaf templates for rich HTML emails
- 🔐 Secure email configuration with properties file
- ⚡ Lightweight and efficient email handling

## 🛠️ Tech Stack
- **Java** ☕
- **Spring Boot** 🌱
- **Thymeleaf** 🍃
- **JavaMailSender** ✉️

## 📂 Project Structure
```
SendEmailsWithSpringBoot/
│── src/
│   ├── main/
│   │   ├── java/com/example/email/
│   │   │   ├── config/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── EmailApplication.java
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   ├── application.properties
│── pom.xml
│── README.md
```

## ⚙️ Setup & Installation

1️⃣ Clone the repository:
```sh
git clone https://github.com/diaabashtawi/SendEmailsWithSpringBoot.git
```

2️⃣ Navigate to the project directory:
```sh
cd SendEmailsWithSpringBoot
```

3️⃣ Configure your SMTP settings in `application.properties`:
```properties
spring.mail.host=smtp.example.com
spring.mail.port=587
spring.mail.username=your_email@example.com
spring.mail.password=your_password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

4️⃣ Build and run the application:
```sh
mvn spring-boot:run
```

## 📧 Usage
- Access the email sending endpoint via REST API or a frontend form.
- Ensure SMTP settings are correctly configured.
- Customize the email templates in `src/main/resources/templates/`.

## 🎯 Contribution
Feel free to submit issues, fork the repo, and send PRs! Let's make this better together. 😊

## 📜 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

🚀 Happy Coding! 🎉
