package com.company;

public class MyThread extends Thread{

    StringBuilder str;
    MyThread(StringBuilder str){
        this.str = str;
    }

    @Override
    public void run() {
        synchronized (str) {

            System.out.println(Thread.currentThread().getName()+" started");
            for(int i = 0; i<100; i++)
                System.out.println(str);
            char temp = str.charAt(0);
            str.setCharAt(0,temp++);
        }
        System.out.println(Thread.currentThread().getName()+" finished");

        };
    }
