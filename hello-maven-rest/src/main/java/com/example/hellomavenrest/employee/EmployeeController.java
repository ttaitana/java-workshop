package com.example.hellomavenrest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class EmployeeController {
    @Autowired
    private NumberRandom random;

    public void setRandom(NumberRandom random) {
        this.random = random;
    }

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
}
