package com.javaeight;

/**
 * Created by EM on 24.09.2015.
 */
public class Executor {

    public static void main(String[] args) {
        String string = "Some";

        Converter<String, Long> function1 = Long::valueOf;
        System.out.println(function1.convert("5"));

        Converter<String, Double> function2 = Double::valueOf;
        System.out.println(function2.convert("5"));

    }

    private void workingWithStreams() {
        Company company = new Company();
        company.getEmployees();
    }

}
