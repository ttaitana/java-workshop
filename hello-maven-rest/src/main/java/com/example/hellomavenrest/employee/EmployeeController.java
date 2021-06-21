package com.example.hellomavenrest.employee;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    public EmployeeResponse getEmployeeById(int id){
        return new EmployeeResponse(id, "Taitana", "Yumee");
    }
}
