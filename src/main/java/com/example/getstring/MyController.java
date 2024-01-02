package com.example.getstring;
 
//import org.springframework.web.bind.annotation.Restcontroller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController 

public class MyController {
@GetMapping("/")
public String getWelcometext(){
    return "Welcome to Spring Boot";
} 

}