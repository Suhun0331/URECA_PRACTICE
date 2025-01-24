package org.example.jan.java_250120.ch07;

public class AbstractChild2 extends AbstractSuper{ // 환자 extends Person
    String patientNo;


    public void patientPrint(){
        System.out.println(name + ssn + patientNo);
    }

    @Override
    public void print() {
        System.out.println("child2");
    }
}
