package org.example.jan.java_250120.ch13;

public class GenericTest2 {

    public static void main(String[] args) {

        AllType<Integer> all1 = new AllType<>();
        Integer intObj = 1;
        all1.setMember(intObj);
        System.out.println("all1 = " + all1.getMember());

        AllType<String> all2 = new AllType<>();
        String sObj = "hi";
        all2.setMember(sObj);
        System.out.println("all2 = " + all2.getMember());
    }
}
