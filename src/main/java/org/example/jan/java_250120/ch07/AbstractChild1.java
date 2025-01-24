package org.example.jan.java_250120.ch07;

public class AbstractChild1 extends AbstractSuper{ // 의사 extends Person
    String job;

    public void empPrint(){
        System.out.println(name + ssn + job);
    }


    @Override
    public void print() {
        System.out.println("child1");
    }
}
