Difference between JPA, Hibernate, and Spring Data JPA - Hands-on Example
📄 Overview
This repository contains a Hibernate-based Java application to demonstrate the difference between JPA, Hibernate, and Spring Data JPA, as explained in the hands-on exercise.

✅ Key Concepts
1. Java Persistence API (JPA)
A specification (JSR 338) for object-relational mapping in Java.

Provides standard annotations and APIs.

Does not provide implementation, only guidelines.

2. Hibernate
An Object-Relational Mapping (ORM) framework that implements JPA.

Requires writing boilerplate code for session management, transactions, etc.

Handles the database operations but you manage the flow manually.

3. Spring Data JPA
A Spring-based abstraction over JPA implementations like Hibernate.

Removes most of the boilerplate code.

Provides JpaRepository interfaces for CRUD operations.

Handles transactions and sessions automatically.

🔨 This Project: Hibernate Example
✔️ Demonstrates:
How to persist an Employee object using Hibernate

Manual session and transaction handling

🛠️ Technology Stack:
Java

Hibernate Core

MySQL Database

Maven

