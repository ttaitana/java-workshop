package com.example.hellomavenrest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private NumberRandom random;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (Exception e) {
            System.out.println("Invalid type of id");
        }

//      Todo: Workshop
//        int number = this.random.nextInt(10);
        EmployeeEntity result = employeeRepository.getById(_id);
        return this.responseMapping(result);
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByParams(@RequestParam String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (Exception e) {
            System.out.println("Invalid type of id");
        }
        EmployeeEntity result = employeeRepository.getById(_id);
        return this.responseMapping(result);
    }

    @PostMapping("/employee")
    public EmployeeResponse createEmployee(@RequestBody EmployeeRequest req) {
        int id = this.random.nextInt(10);

        EmployeeEntity employee =  new EmployeeEntity(req.getFirstName(), req.getLastName());
        EmployeeEntity result =  employeeRepository.save(employee);
        return this.responseMapping(result);
    }

    private EmployeeResponse responseMapping(EmployeeEntity ent){
        return new EmployeeResponse(ent.getId(), ent.getFirstName(), ent.getLastName());
    }
}
