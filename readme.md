# Job Portal

This is a simple Job Portal application built using Java, Spring, JSP, JSTL, and follows the Spring MVC design pattern. The application allows users to new add job posts and view all job posts available on the portal.


## Features

- Add new job posts.
- View all job posts.
- Built using Java and Spring framework.
- Uses JSP and JSTL for the view layer.
- Follows the Spring MVC design pattern.


## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- An IDE of your choice (e.g., IntelliJ IDEA, Eclipse)
- Apache Tomcat (optional, if you don't want to use the embedded server)


## Getting Started


### Clone the Repository

```bash
git clone https://github.com/syednayabhuda/job-portal.git
cd job-portal
```

### Configuration

If you need to change the port number, you can do so in the application.properties file located in src/main/resources/.

```
server.port=9090
```

Change 9090 to your desired port number.


### Build and Run the Application
Using Maven

Build the project:

    mvn clean install

Run the project:

    mvn spring-boot:run

Using IDE

    Import the project as a Maven project in your IDE.
    Run the JobPortalApplication class as a Java application.

Access the Application

Once the application is running, you can access it in your web browser at:

http://localhost:<YOUR_DESIRED_PORT>

Adding a Job Post

    To add a new job post, navigate to the "Add Job" section from the home page and fill out the required fields.

Viewing Job Posts
    
    To view all job posts, navigate to the "View All Jobs" section from the home page.


### Folder Structure

    src/main/java/com/snh/jobportal: Contains the Java source files.
    src/main/resources: Contains the configuration files.
    src/main/webapp/views: Contains the JSP files.


### Technologies Used

- Java
- Spring Framework
- JSP
- JSTL
- Maven
    

### Contribution

Feel free to fork this repository and contribute by submitting a pull request. For major changes, please open an issue first to discuss what you would like to change.