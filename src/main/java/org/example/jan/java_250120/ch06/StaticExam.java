package org.example.jan.java_250120.ch06;

public class StaticExam {
    public static void main(String[] args) {

        StaticClass s1 = new StaticClass();
        StaticClass s2 = new StaticClass();
        s1.staticInt = 777;
        s2.staticInt = 888;
        System.out.println("s1 = " + s1.staticInt); // 888
        System.out.println("s2 = " + s2.staticInt); // 888


        StaticNonClass no1 = new StaticNonClass();
        no1.nonStaticInt = 777;
        StaticNonClass no2 = new StaticNonClass();
        no2.nonStaticInt = 888;
        System.out.println("no1 = " + no1.nonStaticInt); // 777
        System.out.println("no2 = " + no2.nonStaticInt); // 888



    }
}
