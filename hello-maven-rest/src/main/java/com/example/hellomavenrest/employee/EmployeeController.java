package com.example.hellomavenrest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private NumberRandom random;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired private EmployeeService employeeService;

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
//        Optional<EmployeeEntity> result = employeeRepository.findById(_id);
        return this.employeeService.getUser(_id);
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByParams(@RequestParam String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (Exception e) {
            System.out.println("Invalid type of id");
        }
//        Optional<EmployeeEntity> result = employeeRepository.findById(_id);
        return this.employeeService.getUser(_id);
    }

    @PostMapping("/employee")
    public EmployeeResponse createEmployee(@RequestBody EmployeeRequest req) {
        int id = this.random.nextInt(10);

        EmployeeEntity employee =  new EmployeeEntity(req.getFirstName(), req.getLastName());
        EmployeeEntity result =  employeeRepository.save(employee);
        return new EmployeeResponse(result.getId(), result.getFirstName(), result.getLastName());
    }


}
