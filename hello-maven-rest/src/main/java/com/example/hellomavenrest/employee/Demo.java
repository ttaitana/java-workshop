package com.example.hellomavenrest.employee;

import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        Task t1 = new Task("Task 1");
        t1.start();
        Task t2 = new Task("Task 2");
        t2.start();

        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 2; i++){
            service.execute(new Task("Task " + i));
        }

        System.out.println("Task t1 with id : " + t1.getId());
        System.out.println("Task t2 with id : " + t2.getId());
        System.out.println("Main thread id : " + Thread.currentThread().getId());
    }
}

class Task extends Thread{

    private String name;

    public Task(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task Id : " + this.getId());
    }
}
