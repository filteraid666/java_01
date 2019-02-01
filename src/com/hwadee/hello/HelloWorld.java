package com.hwadee.hello;

public class HelloWorld {
    public static void main(String[] args) {
        OutClass out = new OutClass();
        out.outPrint(1);
    }


}

class OutClass {
    private int age = 12;

    public void outPrint(int x) {
        class InClass {
            public void inPrint() {
                System.out.println(x);
                System.out.println(age);
            }
        }
        new InClass().inPrint();
    }
}
