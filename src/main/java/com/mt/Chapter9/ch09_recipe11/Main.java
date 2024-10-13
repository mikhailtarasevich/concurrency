package com.mt.Chapter9.ch09_recipe11;

public class Main {

    public static void main(String[] args) {

        Thread[] threads = new Thread[10];

        for (int i=0; i<10; i++) {
            Task task=new Task();
            threads[i]=new Thread(task);
            threads[i].start();
        }

        for (int i=0; i<10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
