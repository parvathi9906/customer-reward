# customer-reward
Spring Boot REST API for a customer rewards program. Calculates reward points per customer for each month and the total over a three-month period using purchase transaction data stored in MySQL.
# Customer Rewards Application

## Problem Statement

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

Customers receive:
- **2 points** for every dollar spent above $100 in a transaction.
- **1 point** for every dollar spent between $50 and $100 in a transaction.
- **0 points** for the first $50 spent in a transaction.

For example, a $120 purchase earns 90 points: (2 × $20) + (1 × $50) = 90 points.

Given transaction records over a three-month period, calculate the reward points earned by each customer per month and the total.

## Requirements

- Solve the problem using Spring Boot.
- Create a RESTful endpoint.
- Use a sample dataset that demonstrates the solution.
- Store transaction data in MySQL.
- Commit the source code to GitHub. Do not submit a ZIP file.

## Technologies

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST API

## Running the Application

1. Configure your MySQL database.
2. Set the `DB_USERNAME` and `DB_PASSWORD` environment variables.
3. Run the application using the Maven wrapper:

   ```powershell
   .\mvnw.cmd spring-boot:run
   ```

## Reward Calculation

| Transaction Amount | Reward Points |
|---:|---:|
| $40 | 0 |
| $75 | 25 |
| $100 | 50 |
| $120 | 90 |
| $200 | 250 |
