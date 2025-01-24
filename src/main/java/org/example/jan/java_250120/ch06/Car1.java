package org.example.jan.java_250120.ch06;

public class Car1 {
    //클래스에 생성자 없으면, 자동 추가됨

    //개발자가 생성자를 만들면, 자동 추가되던 기본 생성자가 만들어지지 않음
    Car1(String name){
        System.out.println(name);
    }

    //기본 생성자 만드는 습관 들이기
    Car1(){}
}
