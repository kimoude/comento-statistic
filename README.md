# comento-statistic

Java 17 / Spring Boot 4.0.10 / MyBatis 4.0.0 / MariaDB

Includes lessons 3-1 through 3-3: Spring Boot setup, sample data and statistics APIs.

Download and extract comentoStatistic.zip, open pom.xml in IntelliJ, and select JDK 17.
Set DB_PASSWORD to your local MariaDB password. The default database is statistic on localhost:3306, user root.
Run `mvnw.cmd spring-boot:run`.

Endpoints:
- GET http://localhost:8031/ping
- GET http://localhost:8031/api/v1/logins/24
- GET http://localhost:8031/api/v1/logins/24/04

Run sql/sample-data.sql once against your local MariaDB to create the table and insert the lesson's four sample records. Existing rows are preserved.

The queries follow the lesson and count all request codes.
