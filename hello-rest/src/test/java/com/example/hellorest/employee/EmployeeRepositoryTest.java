package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    public void foundWithID1() {
        Employee employee = new Employee("Nattanon from DB", "Ch from DB");
        repository.save(employee);

        Employee employee1 = repository.getById(1);
        assertEquals(1, employee1.getId());
        assertEquals("Nattanon from DB", employee1.getFirstName());
        assertEquals("Ch from DB", employee1.getLastName());
    }
}