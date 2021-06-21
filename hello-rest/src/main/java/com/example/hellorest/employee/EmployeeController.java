package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id) {
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        }
        catch (NumberFormatException err) {
            System.out.println("Cannot convert to number");
        }
        return new EmployeeResponse(_id, "Nattanon", "Ch");
    }
}
