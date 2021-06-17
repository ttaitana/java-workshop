package com.company;

public class Main {

    public static void main(String[] args) {
//        String firstName = args[0];
//        String lastName = args[1];
//        Employee employee = new Employee(firstName, lastName);
//        String result = employee.getFullName();
//        System.out.println(result);
        MyRange range = new MyRange(args[0]);
        String result = range.getResult();
        System.out.println(result);
    }
}
