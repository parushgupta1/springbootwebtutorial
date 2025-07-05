package com.example.springbootwebtutorial.springbootwebtutorial.controllers;

import com.example.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
    @GetMapping(path="/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){
  return  new EmployeeDTO(employeeId,"parus","parush@parush.com",27, LocalDate.now(),Boolean.TRUE);
    }

    @GetMapping
    public String getEmployees(@RequestParam(required = false) Integer age,@RequestParam(required = false) String SortBy){
        return  "age:"+age+"SortBy"+SortBy;
    }
    @PostMapping
    public EmployeeDTO setEmployees(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(10000L);
        return inputEmployee;
    }
    @PutMapping String putEmp(){
        return "hello from put";
    }


}
