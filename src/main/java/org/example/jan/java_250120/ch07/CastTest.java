package org.example.jan.java_250120.ch07;

public class CastTest {

    public static void main(String[] args) {
        CastSuper su = new CastChild(); // 자동 형변환, 다형성의 기초
        su.printSuper();
//        su.printChild(); 는 불가능.
        CastChild ch = (CastChild) su; // printChild를 사용하기 위해 강제 형변환
        ch.printChild();

        // 이형의 데이터를 담는 배열 : heterogeneous collection.
        CastSuper [] suArr = new CastSuper[4];
        suArr[0] = new CastChild();
        suArr[1] = new CastChild2();

    }
}
