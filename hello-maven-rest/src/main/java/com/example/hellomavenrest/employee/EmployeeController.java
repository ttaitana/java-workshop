package com.example.hellomavenrest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class EmployeeController {
    @Autowired
    private NumberRandom random;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable String id){
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        }catch (Exception e){
            System.out.println("Invalid type of id");
        }

//      Todo: Workshop
        int number = this.random.nextInt(10);
        return new EmployeeResponse(_id, "Taitana"+number, "Yumee");
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

    @PostMapping("/employee")
    public EmployeeResponse createEmployee(@RequestBody EmployeeRequest req){
        return new EmployeeResponse(1, req.getFname(), req.getLname());
    }
}
