package com.example.hellospring;

public class DemoExtend {
    public static void main(String[] args) {
        Report rp = new Report();
        rp.build();
    }
}

abstract class Flow {
    abstract void generateHeader();

    abstract void generateBody();

    abstract void generateFooter();

    public void build() {
        this.generateHeader();
        this.generateBody();
        this.generateFooter();
    }
}

class Report extends Flow {

    @Override
    void generateHeader() {
        System.out.println("This is Header");
    }

    @Override
    void generateBody() {
        System.out.println("This is Body");
    }

    @Override
    void generateFooter() {
        System.out.println("This is Footer");
    }
}

interface Lego {

}
