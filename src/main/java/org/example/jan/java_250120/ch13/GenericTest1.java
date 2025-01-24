package org.example.jan.java_250120.ch13;

import java.util.ArrayList;

public class GenericTest1 {

    public static void main(String[] args) {
        Integer iObj = 777;
        String sObj = "hi";

//        // 1. 제네릭을 사용하지 않을 경우
//        ArrayList list1 = new ArrayList();
//        list1.add(iObj);
//        list1.add(sObj);
//        // list에 들어있는 타입을 알 수 없다.

        // 2. 제네릭을 사용할 경우
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(iObj);
//        intList.add(sObj); //int로 지정했기 때문에 string 넣을 수 없음. - error



    }
}
