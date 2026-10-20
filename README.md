# CS 305 – Software Security

## Southern New Hampshire University

**Course:** CS 305 – Software Security  
**Student:** Matthew Delphia  
**Instructor:** Professor Dan Santos

## Course Overview

This repository contains coursework and projects completed during CS 305: Software Security at Southern New Hampshire University (SNHU).

Throughout this course, I explored software security principles, vulnerability assessment, secure coding practices, cryptography, and methods for protecting sensitive information.

## Skills and Technologies

During this course, I gained hands-on experience with:

- Java and Spring Boot application development
- Secure software development practices
- SHA-256 cryptographic hashing
- HTTPS and SSL/TLS communications
- Java Keytool and digital certificates
- PKCS12 keystore configuration
- OWASP Dependency-Check vulnerability scanning
- Maven dependency management
- Static security testing and vulnerability analysis
- Functional testing and application debugging

## Course Projects

### Project One – Software Vulnerability Assessment

Examined the security of an existing software application, identified potential vulnerabilities, and evaluated methods for improving application security.

### Project Two – Artemis Financial Secure Software

Worked with an existing Java Spring Boot application to implement security improvements for Artemis Financial, a fictional financial consulting company.

The project included implementing SHA-256 checksum verification, configuring HTTPS communications, generating a self-signed certificate, and performing dependency vulnerability analysis using OWASP Dependency-Check.

## Portfolio Purpose

This repository demonstrates my developing knowledge of software security and my ability to apply secure coding principles to real-world software engineering scenarios.

As I continue my education and professional development, these skills will help me design, test, and maintain software applications that protect user information and reduce security risks.

## Security Notice

This repository is intended for educational and portfolio purposes. Passwords, private keys, keystores, and other sensitive credentials will not be published.

Project Reflection — Artemis Financial

1. Client and Software Requirements

Artemis Financial is a financial consulting company that develops individualized financial plans covering savings, retirement, investments, and insurance. The company needed to improve the security of its existing web application to better protect sensitive client information. My responsibility was to identify security vulnerabilities and implement improvements, including secure HTTPS communications and SHA-256 checksum verification to help ensure data integrity.

2. Identifying Vulnerabilities and the Importance of Secure Coding

One area where I performed well was identifying potential security weaknesses in the application's dependencies and implementing additional security measures. I used OWASP Dependency-Check to examine third-party libraries for known vulnerabilities. Secure coding is important because it reduces the risk of unauthorized access, data exposure, and application compromise. For companies handling financial information, strong security also helps maintain customer trust and protect the organization's reputation.

3. Challenges During the Vulnerability Assessment

One of the more challenging aspects of the assessment was working with older software dependencies and interpreting the results of vulnerability scans. I learned that identifying vulnerabilities requires more than simply running a scanning tool. Developers must understand the findings, determine which vulnerabilities are relevant, and distinguish existing issues from problems introduced during development.

4. Increasing Layers of Security

I improved the application's security by implementing SHA-256 checksum generation, configuring HTTPS using SSL/TLS, and generating a certificate with Java Keytool. These measures help protect data integrity and secure information during transmission. In future projects, I would continue using OWASP Dependency-Check, manual code reviews, current security standards, and vulnerability assessments to identify risks and determine appropriate mitigation strategies.

5. Testing Application Functionality and Security

After refactoring the application, I tested its functionality by running the Spring Boot server and verifying that the application operated over HTTPS on port 8443. I also tested the `/hash` endpoint to confirm that it generated the expected SHA-256 checksum. I used dependency scanning and code review to evaluate security concerns following the changes. Testing is essential because improving security should not break existing application functionality or introduce additional vulnerabilities.

6. Resources, Tools, and Coding Practices

Throughout this project, I worked with Java, Spring Boot, Maven, Java Keytool, SHA-256 hashing, SSL/TLS configuration, and OWASP Dependency-Check. I also gained experience troubleshooting configuration issues, reviewing dependencies, and testing application security. These tools and techniques will be valuable in future development projects, particularly when building applications that handle sensitive information or require secure communication between systems.

7. Demonstrating My Skills to Future Employers

I would use my Artemis Financial Practices for Secure Software Report and the associated application code to demonstrate my understanding of secure software development. This project highlights my ability to evaluate security vulnerabilities, implement cryptographic hashing, configure HTTPS communications, and perform security testing. It also demonstrates my ability to work with existing applications and improve their security while maintaining functionality. These skills will be valuable as I continue pursuing a career in software engineering.
