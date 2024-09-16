package com.mt.Chapter1.ch01_recipe08;

import java.util.concurrent.TimeUnit;

/**
 * Main class of the UnsafeTask. Creates a Runnable task and three Thread
 * objects that run it.
 *
 */
public class Main {

    /**
     * Main method of the UnsafeTaks. Creates a Runnable task and three Thread
     * objects that run it.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Creates the unsafe task
        UnsafeTask task = new UnsafeTask();

        // Throw ten Thread objects
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
