# My Spring Boot Application

This is a basic Spring Boot application.

## Prerequisites

- Java 8 or higher
- Maven (Optional as you can use the Maven Wrapper)

## Building the Application

If you have Maven installed, you can build the application by running:

```
mvn clean install
```

If you don't have Maven installed, you can use the Maven Wrapper scripts included in the project:

For Unix/Linux:

```
./mvnw clean install
```

For Windows:

```
mvnw.cmd clean install
```

## Running the Application

You can run the application by using the following command:

```
java -jar target/my-spring-boot-app-0.0.1-SNAPSHOT.jar
```

Replace `0.0.1-SNAPSHOT` with your actual version.

## Application Properties

You can configure the application by modifying the `src/main/resources/application.properties` file.

## Static Content

You can add static content like CSS, JS, and images in the `src/main/resources/static` directory.

## Testing

You can add your unit tests in the `src/test/java/com/example` directory.