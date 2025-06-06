package org.example;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! by "+Thread.currentThread().getName());
        long n =1000000000;

        MultiThreading threadObj=new MultiThreading(n);
        Thread t=new Thread(threadObj);
        t.start();


    }
}