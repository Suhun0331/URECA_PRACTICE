package org.example.jan.java_250120.ch05;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
        System.out.println("-----------------------------------------------------");
        int num = 0;
        int student = 0;
        int score = 0;
        int stu_arr[] = new int[0];
        int sum = 0;
        int max_score = 0;
        while(num != 5) {
            System.out.print("선택> ");
            num = scan.nextInt();
            switch(num){
                case 1:{
                    System.out.print("학생수 > ");
                    student = scan.nextInt();
                    stu_arr = new int[student];
                    break;
                }
                case 2:{
                    for(int i = 0; i<student; i++){
                        System.out.print("scores[" + i + "]> ");
                        score = scan.nextInt();
                        stu_arr[i] = score;
                        sum += score;
                        if(max_score < score) max_score = score;
                    }
                    break;
                }
                case 3:{
                    for(int i = 0; i<student; i++){
                        System.out.printf("scores[%d]: %d\n", i, stu_arr[i]);
                    }
                    break;
                }
                case 4:{
                    System.out.println("최고 점수 : " + max_score);
                    System.out.printf("평균 점수 : %.1f\n" , (float)(sum / student));
                    break;
                }
                case 5: break;
            }
        }
        scan.close();
    }
}
