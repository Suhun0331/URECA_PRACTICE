package org.example.jan.java_250120.ch02;

public class VarInitTest {
    static int a; // 정수형 멤버 변수는 0으로 자동 초기화 됨.

    public static void main(String[] args) {

        System.out.println("member variable : " + a);

        int b; //정수형 지역 변수는 자동 초기화 없음. -> 초기화 후 사용해야 함.
        b = 7; // 여기에서 메모리 할당
        System.out.println("local variable = " + b);
    }
}
