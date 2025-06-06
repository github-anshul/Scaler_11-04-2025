package org.example;

public class MultiThreading implements Runnable {

    long n;

    public MultiThreading(long n) {
        this.n = n;
    }
    public void calculateSum()
    {
        long sum=0;
        for(long i=0;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("sum is: "+sum+" calculated by "+Thread.currentThread().getName());
    }
    @Override
    public void run() {

        //System.out.println("Hello world! by "+Thread.currentThread().getName());

        calculateSum();
    }
}
