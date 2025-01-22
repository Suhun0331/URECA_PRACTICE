package org.example.jan.java_250120.ch03;

public class DrawStar {
    public static void main(String[] args) {
        for(int i = 0; i<3; i++){
            for(int j = 2-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k<i*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int q = 0; q<3; q++){
            for(int w = 0; w<q; w++){
                System.out.print(" ");
            }
            for(int k = 5; k>q*2; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
