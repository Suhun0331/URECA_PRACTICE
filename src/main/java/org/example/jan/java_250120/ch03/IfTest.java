package org.example.jan.java_250120.ch03;

public class IfTest {
    public static void main(String[] args) {
        int a = 7;
        if(a > 5) System.out.println("a는 5보다 크다.");
        if(a < 5) System.out.println("a는 5보다 작다.");

        switch("hi"){
            case"hi" : System.out.println("hi"); break;
            case "hello": System.out.println("Hello"); break;
            default: System.out.println("default"); break;
        }

    }
}
