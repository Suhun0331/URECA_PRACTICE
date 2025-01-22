package org.example.jan.java_250120.ch02;

public class VarWhereTest {
    public static void main(String[] args) {
        int aVar = 7;
        {
            int bVar = 8;
            System.out.println("aVar = " + aVar); // 7
            System.out.println("bVar = " + bVar); // 8
        }
        System.out.println("aVar = " + aVar); // 7
        //System.out.println("bVar = " + bVar); - error
        {
            int bVar = 88;
            System.out.println("bVar = " + bVar); // 88
        }
        int bVar = 888;
        System.out.println("bVar = " + bVar); // 888
    }
}
