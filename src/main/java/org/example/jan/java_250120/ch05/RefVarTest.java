package org.example.jan.java_250120.ch05;

public class RefVarTest {
    public static void main(String[] args) {
        String s1 = new String("hi");
        String s2 = new String("hi");
        String s3 = s2;
        System.out.println(s1 == s2); // false
        System.out.println(s3 == s2); // true

        String s4 = new String("여행");
        s4 = null; // net String("여행")은 쓰레기 수거 대상(가비지 컬렉터)

        String s5 = new String("취미");
        String s6 = s5;// s6에는 s5에서 가리키는 '취미'객체의 주소값(ex.100)을 저장함
        s5 = null;//그래서 s5에 null을 넣어도 '취미' 객체는 s6에 주소값이 저장돼있기 때문에 쓰레기 아님

        String name1 = "홍길동";
        String name2 = "홍길동"; // 문자열 리터럴이 동일해서 같은 주소값('홍길동' 객체의 주소)을 가짐

        if(name1 == name2){
            System.out.println("True"); // 같은 주소값 저장하므로 True 출력
        }

        String name3 = new String("가나다");
        String name4 = new String("가나다");

        if(name3 != name4){
            System.out.println("False"); // 다른 주소값 저장하므로 False 출력
        }

    }
}
