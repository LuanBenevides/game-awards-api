# Game-awards-api

### Technologies used:

<div style="display: inline_block">
    <img align="center" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java">
    <img align="center" src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring">
    <img align="center" src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white" alt="Hibernate">
    <img align="center" src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
    <br/>
</div>

<br/>

### What is this project?

This is a simple API that was built during DIO's fullstack developer bootcamp class. Initially, the following features were implemented:

1. Abstraction and representation of games as an entity in a MySQL relational database, with Spring Data JPA;
2. Allows inclusion, alteration, query, query by id and exclusion, from HTTP methods, mapped with Spring Web, following a Rest architectural pattern.

### How to use?

1. it is necessary to have an IDE configured for Spring projects such as Eclipse or InteliJ;
2. It will be necessary to contain MySQL server and MySQL Workbench on your machine as well, with the user and password configured in the properties file;
3. You will have to clone the repository to your machine, using Git Clone and import it in your ID;
4. After that, you can initialize the API by ID.

## Consuming the API:

This API will return JSON. Methods for querying, adding, changing and deleting (CRUD operations) are available in "game-awards-api.postman_collection".

You will have to use Postman or configure WEB requests in a JavaScprit code (or in another desired language) to consume it.

#### Others observations:

This api uses Flyway and Lombook as resources for optimizing and controlling the scalability of the code, if there are any doubts about its use, I recommend consulting the documentation.

Thanks for the visit. And come back often!
