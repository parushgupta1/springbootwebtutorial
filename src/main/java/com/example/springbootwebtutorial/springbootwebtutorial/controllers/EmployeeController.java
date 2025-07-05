package com.example.springbootwebtutorial.springbootwebtutorial.controllers;

import com.example.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {
    @GetMapping(path="/employees/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable String employeeId){
  return  new EmployeeDTO(1L,"parus","parush@parush.com",27, LocalDate.now(),Boolean.TRUE);
    }
}
