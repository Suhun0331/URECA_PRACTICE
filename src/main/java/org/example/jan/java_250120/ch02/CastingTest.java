package org.example.jan.java_250120.ch02;

/**
 * Data Type Casting
 * - Promotion(묵시적/자동적 형태 변환) : 작은 data type을 큰 data type으로 옮길 때 발생
 * - Demotion(명시적/강제적 형태 변환) : 큰 data type을 작은 data type으로 옮길 때 발생
 */

public class CastingTest {
    public static void main(String[] args) {
        byte bVar = 127;
        int iVar = bVar; // Promotion(묵시적/자동적 형태 변환)
        System.out.println("bVar = " + bVar); // 127
        System.out.println("iVar = " + iVar); // 127

        int iVar2 = 128;
        byte bVar2 = (byte)iVar2; // Demotion(명시적/강제적 형태 변환)
        System.out.println("bVar2 = " + bVar2); // -128(흘러넘쳐서 다시 반대에서 시작)
        System.out.println("iVar2 = " + iVar2); // 128

        int iVar3 = 99999999;
        double dVar3 = iVar3;
        System.out.println("dVar3 = " + dVar3);
        System.out.println("iVar3 = " + iVar3);

        double dVar4 = 9.123456789;
        int iVar4 = (int) dVar4;
        System.out.println("iVar4 = " + iVar4);
        System.out.println("dVar4 = " + dVar4);

        char chVar = 'Z';
        System.out.println("chVar = " + chVar); // Z
        System.out.println("(byte)chVar = " + (byte)chVar); // 90

        int iVar5 = chVar;
        System.out.println("iVar5 = " + iVar5); //90

        char chVar2 = (char) iVar5;
        System.out.println("chVar2 = " + chVar2); //Z

        byte bVar6 = 7, bVar7 = 8;
        int iVar7 = bVar6 + bVar7;
        // byte bVar8 = bVar6 + bVar7; 얘는 불가능(바이트 두개 더하면 int 되기 때문)
        byte bVar8 = (byte) (bVar6 + bVar7);
        System.out.println("iVar7 = " + iVar7); // 15
        System.out.println("bVar8 = " + bVar8); // 15

        float fVar1 = 99.9f, fVar2 = 3.14f;
        float fVar3 = fVar1 + fVar2;
        System.out.println("fVar3 = " + fVar3); // 103.04

        long lVar = 999999L, lVar2 = 777777l;


    }
}
