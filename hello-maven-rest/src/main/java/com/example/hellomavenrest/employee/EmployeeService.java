package com.example.hellomavenrest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class EmployeeService {
    @Autowired
    private Random random;

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeResponse getUser(int id){
        Optional<EmployeeEntity> result = employeeRepository.findById(id);
        return this.responseMapping(result);
    }

    private EmployeeResponse responseMapping(Optional<EmployeeEntity> ent){
        if(ent.isPresent()){
            int number = this.random.nextInt(10);
            EmployeeEntity emp = ent.get();
            return new EmployeeResponse(emp.getId(), emp.getFirstName() + number, emp.getLastName());
        }
//       ? Not found!!
        throw new EmployeeNotFoundException();
//        return new EmployeeResponse();
    }
}
