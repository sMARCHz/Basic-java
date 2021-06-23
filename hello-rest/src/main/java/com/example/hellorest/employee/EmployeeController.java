package com.example.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private MyRandom random;

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException err) {
            System.out.println("Cannot convert to number");
        }
        int number = random.nextInt(10);
        Optional<Employee> result = repository.findById(_id);
        if (result.isPresent()) {
            Employee employee = result.get();
            return new EmployeeResponse(
                    employee.getId(),
                    employee.getFirstName() + number,
                    employee.getLastName());
        }
        return new EmployeeResponse();
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByID2(@RequestParam String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException err) {
            System.out.println("Cannot convert to number");
        }
        return new EmployeeResponse(_id, "Nattanon", "Ch");
    }

    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody EmployeeRequest request) {
        return new EmployeeResponse(999, request.getFname(), request.getLname());
    }
}
