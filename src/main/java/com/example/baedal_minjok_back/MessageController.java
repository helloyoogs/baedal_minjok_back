package com.example.baedal_minjok_back;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@CrossOrigin
    @GetMapping("/api/message")
    public String getMessage() {
        return "Hello from Spring Boot!";
    }
}