package org.example.jan.java_250120.ch03;

public class OperTest {
    public static void main(String[] args) {
        int a = 7, b = 7, c = 0, d = 0;
        c = a++ * 3; // ++가 가장 마지막에 수행. 후치연산
        d = ++b * 3; // ++가 가장 처음에 수행. 전치 연산
        System.out.println("a = " + a); // 8
        System.out.println("b = " + b); // 8
        System.out.println("c = " + c); // 21
        System.out.println("d = " + d); // 24

        a = 123; b = 4;
        System.out.println("123 / 4 = " + (a/b)); // 30
        System.out.println("123 % 4 = " + (a % b)); // 3

        float f = 1.23456789f;
        System.out.println("f = " + f); // 1.2345679 -> 소수 6자리까지만 믿을 수 있음. 그 뒤는 유효하지 않음

//        System.out.println(100 / 0); - error
        System.out.println(100 / 0.0); // Infinity(error 아님)
    }
}
