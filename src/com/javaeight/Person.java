package com.javaeight;

import com.oracle.webservices.internal.api.databinding.Databinding;

/**
 * Detailed description
 *
 * @author Mykola Morozov.
 */
public class Person {

    public String name;

    public Integer age;

    public Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public static class Builder {
        private Person person;

        private Builder(){
            person = new Person();
        }

        public Builder withName(String name) {
            person.setName(name);
            return this;
        }

        public Builder withAge(Integer age) {
            person.setAge(age);
            return this;
        }

        public Builder withSalary(Double salary) {
            person.setSalary(salary);
            return this;
        }

        public Person getPerson() {
            return person;
        }
    }

    public static Builder getBuilder(){
        return new Builder();
    }
}
