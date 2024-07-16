package com.company;

public class MyThread extends Thread {
    private StringBuilder str;
    public MyThread(String name, StringBuilder str) {
        super(name);
        this.str = str;
    }
    @Override
    public void run() {
        //System.out.println(Thread.currentThread().getName() + " started");
        synchronized (str) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "_" + str + ";");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            char temp = str.charAt(0);
            str.setCharAt(0, ++temp);
            //System.out.println(Thread.currentThread().getName() + " finished");
        }
    }
}
