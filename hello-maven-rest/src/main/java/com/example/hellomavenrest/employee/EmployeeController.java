package com.example.hellomavenrest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable String id){
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        }catch (Exception e){
            System.out.println("Invalid type of id");
        }
        return new EmployeeResponse(_id, "Taitana", "Yumee");
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByParams(@RequestParam String id){
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        }catch (Exception e){
            System.out.println("Invalid type of id");
        }
        return new EmployeeResponse(_id, "Taitana", "Yumee");
    }
}
