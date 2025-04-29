package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource; //database connection

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/testdb")
    public String testDatabaseConnection() {
        try (Connection conn = dataSource.getConnection()) {
            if (conn.isValid(2)) {
                return "Database connection successful!";
            } else {
                return "Database connection failed.";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Database connection error: " + e.getMessage();
        }
    }
}
