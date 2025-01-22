package org.example.jan.java_250120.ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int [] iArr1;
        int iArr2[];
        iArr1 = new int[3];

        int[] iArr3 = new int[3];

        int[] iArr4 = {1, 2, 3};
//        iArr2 = {1, 2, 3}; - 배열 생성과 함께 값을 넣는건 가능하지만 생성 후 값을 넣는건 불가능.
        iArr2 = new int[]{1, 2, 3}; //얘는 가능
    }
}
