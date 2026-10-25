CS 305 Portfolio Reflection: Artemis Financial

1. Client and Software Requirements

Artemis Financial was my client for this project. The company needed help identifying software security vulnerabilities and improving the security of its application. Its requirements included protecting sensitive information, securing communications, verifying data integrity, and following secure software development practices. My goal was to identify potential vulnerabilities and implement appropriate security measures while maintaining the application's functionality.

2. What I Did Well and the Importance of Secure Coding

I did well at following the security assessment process, identifying potential vulnerabilities, and implementing security improvements. I used Java's MessageDigest API to implement SHA-256 hashing and configured a self-signed certificate to support HTTPS communication in my development environment. These changes helped me understand how different security measures protect an application.

Secure coding is important because vulnerabilities can expose sensitive information, allow unauthorized access, and damage a company's reputation. Strong software security helps protect customer information, maintain trust, reduce the risk of costly security incidents, and support the company's long-term success.

3. Challenging or Helpful Parts of the Vulnerability Assessment

One of the more challenging parts of this project was configuring the development environment and troubleshooting security tools. I encountered issues involving Maven dependency checks, vulnerability reports, certificate configuration, and secure connections. Working through these issues helped me understand that security implementation involves more than writing code. Developers must also configure their environments correctly, interpret tool results, and verify that security features work as intended.

The most helpful part was learning how to connect security concepts to an actual application. Implementing SHA-256 hashing and configuring HTTPS gave me practical experience with protecting data integrity and securing communication.

4. Increasing Layers of Security and Future Vulnerability Assessments

I increased the application's layers of security by implementing SHA-256 hashing and configuring HTTPS using a digital certificate. Hashing provides a way to verify data integrity, while HTTPS helps protect information transmitted between a client and a server. I also explored static dependency analysis to identify potentially vulnerable software components.

In the future, I would use tools such as OWASP Dependency-Check to identify vulnerable dependencies and static application security testing tools to detect potential weaknesses in source code. I would prioritize vulnerabilities based on their severity, exploitability, potential impact, and the sensitivity of the information involved. I would then select mitigation techniques appropriate to the identified risks and verify that the fixes were effective.

5. Ensuring Functionality and Security

I checked that the application started successfully and that its endpoint could perform the intended hashing operation. I also verified the certificate and keystore configuration and tested access through the HTTPS connection. These steps helped me evaluate whether the security improvements worked without preventing the application from functioning.

After making changes, I reviewed the code and used dependency analysis to look for known vulnerabilities in the application's software components. I also worked through configuration and testing issues to confirm that the application could run with the security settings enabled. In future projects, I would strengthen this process by running the full test suite, repeating dependency scans after changes, reviewing scan results, and testing the application for regressions.

6. Helpful Resources, Tools, and Coding Practices

The resources and tools I used included Java, the Spring Boot framework, Eclipse, Maven, OWASP Dependency-Check, the Java MessageDigest API, and the Java keytool utility. These tools helped me implement hashing, manage the application's dependencies, configure a certificate, and investigate security issues.

Important practices I learned included reviewing dependencies for known vulnerabilities, using established cryptographic APIs instead of creating custom cryptographic algorithms, configuring secure communications, testing after code changes, and documenting security decisions. I can apply these practices to future software development projects to improve both code quality and application security.

7. Demonstrating My Skills to Future Employers

I would show future employers my completed Artemis Financial Practices for Secure Software Report, along with the relevant source code and project documentation. This work demonstrates my experience with vulnerability assessment, secure coding, SHA-256 hashing, HTTPS configuration, certificate management, and dependency analysis.

The project also demonstrates my problem-solving skills because I had to troubleshoot development and security configuration issues. Including this project in my GitHub portfolio would give employers a practical example of how I approach software security, investigate problems, and document technical work.
