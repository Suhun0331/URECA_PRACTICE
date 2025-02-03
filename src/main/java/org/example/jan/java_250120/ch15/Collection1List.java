package org.example.jan.java_250120.ch15;

import java.util.ArrayList;

public class Collection1List {

    public static void main(String[] args) {
        ArrayList origin1 = new ArrayList();
        origin1.add(777);
        origin1.add(3.14);
        origin1.add("ABC");

        ArrayList clone1 = (ArrayList) origin1.clone();

        System.out.println("origin1 = " + origin1.toString());
        System.out.println("clone1 = " + clone1.toString());

        Object objArr[] = origin1.toArray();
        for(int i = 0; i< objArr.length; i++){
            System.out.println(i + " : " + objArr[i]);
        }
        ArrayList<String> origin2 = new ArrayList<>();
    }
}
