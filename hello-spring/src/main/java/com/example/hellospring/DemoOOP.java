package com.example.hellospring;

public class DemoOOP {

    public static void main(String[] args) {
        Employee employee = new Employee(12, "Java");
        System.out.println(employee);

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        System.out.println("Employee1 : " + employee1);
        System.out.println("Employee2 : " + employee2);

        if(employee1.equals(employee2)){
            System.out.println("Equal 2");
        }
    }
}
