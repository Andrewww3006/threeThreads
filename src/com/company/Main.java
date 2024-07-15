package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(Thread.currentThread().getName()+"started");
        StringBuilder str = new StringBuilder("a");
        for (int i = 0; i < 3; i++) {
            MyThread t = new MyThread(str);
            t.setName("MyThread_"+i);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(t.str);

            System.out.println(Thread.currentThread().getName()+"finished");

        }
    }
}