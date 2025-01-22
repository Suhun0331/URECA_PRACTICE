package org.example.jan.java_250120.ch02;

public class EqualsTest {
    public static void main(String[] args) {

        int a;
        a = 7;
        System.out.println("a = " + a);
        int b = 7;
        System.out.println(a == b); // true

        String s = new String("hi");
        String s2 = new String("hi");
        String s3 = new String("HI");
        System.out.println(s == s2); // false - 위치값 비교
        System.out.println(s.equals(s2)); // true - 참조내용 비교
        System.out.println(s.equalsIgnoreCase(s3)); // true - 대소문자 무시하고 비교

        // String 상수
        String s4 = "hello", s5 = "hello";
        System.out.println("상수 비교 : " + (s4 == s5)); // true - s4와 s5 hello는 하나의 hello를 동시에 같이 사용함

    }
}
