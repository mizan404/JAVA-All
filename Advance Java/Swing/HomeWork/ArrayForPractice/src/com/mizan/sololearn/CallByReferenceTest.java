package com.mizan.sololearn;

class CallByReference {

    String name;

    void change(CallByReference r2) {
        r2.name = "Mizan";
    }

}

public class CallByReferenceTest {

    public static void main(String[] args) {
        CallByReference r1 = new CallByReference();
        r1.name = "Rahman";
        System.out.println("Before calling: " + r1.name);
        r1.change(r1);
        System.out.println("After calling: " + r1.name);
    }

}
