package org.example.jan.java_250120.ch03;

public class For99 {
    public static void main(String[] args) {
        for(int i = 2; i<10; i++){
            System.out.printf("==== %d단 ==== \n",i);
            for(int j = 1; j<10; j++){
                System.out.printf("%d x %d = %d \n",i,j,i*j);
            }
        }
    }
}
