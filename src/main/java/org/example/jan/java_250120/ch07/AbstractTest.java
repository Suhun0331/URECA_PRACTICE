package org.example.jan.java_250120.ch07;

public class AbstractTest {

    public static void main(String[] args) {
        AbstractChild1 ch1 = new AbstractChild1();
        AbstractChild2 ch2 = new AbstractChild2();

        AbstractTest test = new AbstractTest();
        test.print(ch1);
        test.print(ch2);
    }

    private void print(AbstractSuper su){
        su.print();
    }

}
