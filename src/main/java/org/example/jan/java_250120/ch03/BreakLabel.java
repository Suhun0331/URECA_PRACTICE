package org.example.jan.java_250120.ch03;

public class BreakLabel { // 딱히 사용되진 않음, 그냥 그런게 있구나 ~ 하기
    public static void main(String[] args) {
        for(int a = 1; a<=5; a++){
            naMam : for(int b = 1; b<=5; b++){
                for(int c = 1; c<=10; c++){
                    if(c == 3) continue;

                    System.out.println("a = " + a + "b = " + b + "c = " + c);

                    if(c == 3) break naMam;
                }
            }
        }
    }
}
