package org.example.jan.java_250120.ch03;

public class ShortTest {
    public static void main(String[] args) {
        if(1 < 2 | 0 < 2) System.out.println("True");

//        if(1 < 2 | (5/0) < 2) System.out.println("True"); - 앞이 true지만 뒤 조건도 검사해서 error 뜸

        if(1 < 2 || (5/0) < 2) System.out.println("True"); //앞이 true이면 뒤 조건 검사 x -> True 출력 - 숏 서킷 로직

        if(1 > 2 && (5/0) < 2) System.out.println("False"); //마찬가지로 앞이 false라서 뒤 조건 검사 x - error안뜸
    }
}
