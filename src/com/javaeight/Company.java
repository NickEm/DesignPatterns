package com.javaeight;

import java.util.ArrayList;
import java.util.List;

/**
 * Detailed description
 *
 * @author Mykola Morozov.
 */
public class Company {

    private List<Person> employees;

    public Company() {
        initializeEmployees();
    }

    private void initializeEmployees(){
        employees = new ArrayList<>();
        Person person1 = Person.getBuilder().withName("Jack").withAge(38).withSalary(2_000D).getPerson();
        Person person2 = Person.getBuilder().withName("Shown").withAge(29).withSalary(1_300D).getPerson();
        Person person3 = Person.getBuilder().withName("Nick").withAge(25).withSalary(1_000D).getPerson();
    }

    public List<Person> getEmployees() {
        return employees;
    }
}
