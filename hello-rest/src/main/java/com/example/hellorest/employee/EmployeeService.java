package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private MyRandom random;

    @Autowired
    private EmployeeRepository repository;

    public EmployeeResponse process(int id) {
        int number = random.nextInt(10);
        Optional<Employee> result = repository.findById(id);
        if (result.isPresent()) {
            Employee employee = result.get();
            return new EmployeeResponse(
                    employee.getId(),
                    employee.getFirstName() + number,
                    employee.getLastName());
        }
        return new EmployeeResponse();
    }
}
