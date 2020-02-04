# SPRING BOOT SECURITY OAUTH2
## by Wiehan Van Niekerk
A basic customer authorization server using spring boot security

# Getting Started
## Reference Assistance
* Blaine Viljoen 
* dzone Website

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/maven-plugin/)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#boot-features-security)

### Guides
* https://dzone.com/articles/spring-boot-security-json-web-tokenjwt-hello-world
* https://www.javainuse.com/spring/boot-jwt-mysql

### Steps
1. First, you need to change the application.properties to match you Database
2. Use the SQL file under Resouces to see the structure of the database

### Errors
1. Token don't save in the database
2. The updateUserToken don't work (Method update user by saving the Token)

### dependencies
		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
		
		<dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
		
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
		
		<!-- https://mvnrepository.com/artifact/com.microsoft.sqlserver/mssql-jdbc -->
        <dependency>
            <groupId>com.microsoft.sqlserver</groupId>
            <artifactId>mssql-jdbc</artifactId>
            <version>7.4.1.jre8</version>
        </dependency>
		
		<!--Oauth2-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
            <version>2.2.4.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-jwt</artifactId>
            <version>1.0.10.RELEASE</version>
        </dependency>
		
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt</artifactId>
            <version>0.9.1</version>
        </dependency>
