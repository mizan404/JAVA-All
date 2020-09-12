package com.mizan;

class Simple {

    int data;

    Simple(int d) {
        data = d;
    }

    void show() {
        System.out.println("Data " + data);
    }
}

public class CallByRef {

    static void increase(Simple p) {
        p.data = p.data + 2;
    }

    public static void main(String[] args) {
        Simple obj1 = new Simple(5);
        increase(obj1);
        obj1.show();
    }
}
