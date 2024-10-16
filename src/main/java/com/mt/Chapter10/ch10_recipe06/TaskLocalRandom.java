package com.mt.Chapter10.ch10_recipe06;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Task that generates random numbers
 *
 */
public class TaskLocalRandom implements Runnable {

    /**
     * Main method of the class. Generate 10 random numbers and write them
     * in the console
     */
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        for (int i=0; i<10; i++){
            System.out.printf("%s: %d\n",name,ThreadLocalRandom.current().nextInt(10));
        }
    }

}
