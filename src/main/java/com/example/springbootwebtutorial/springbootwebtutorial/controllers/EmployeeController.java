package com.example.springbootwebtutorial.springbootwebtutorial.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping(path="/")
    public String getMesssage(){
        return "pppppppp";
    }
}
