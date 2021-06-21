package com.example.hellomavenrest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable int id){
        return new EmployeeResponse(id, "Taitana", "Yumee");
    }
}
