package com.mt.Chapter10.ch10_recipe04;

import java.util.concurrent.TimeUnit;

/**
 * Task used to get information about a Thread. Makes a for loop with 100 steps. In
 * each step, sleeps for 100 milliseconds. Total execution time: 10 seconds
 *
 */
public class Task implements Runnable {

    /**
     * Main method of the task
     */
    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s: %d\n",Thread.currentThread().getName(),i);
        }
    }
}
