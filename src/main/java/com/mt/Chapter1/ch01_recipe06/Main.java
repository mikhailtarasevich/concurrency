package com.mt.Chapter1.ch01_recipe06;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Main class of the example. Creates three WriterTaks and a CleanerTask
 *
 */
public class Main {

    /**
     * Main method of the example. Creates three WriterTasks and a CleanerTask
     *
     * @param args
     */
    public static void main(String[] args) {

        // Creates the Event data structure
        Deque<Event> deque = new ConcurrentLinkedDeque<>();

        // Creates the three WriterTask and starts them
        WriterTask writer = new WriterTask(deque);
        for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
            Thread thread = new Thread(writer);
            thread.start();
        }

        // Creates a cleaner task and starts them
        CleanerTask cleaner = new CleanerTask(deque);
        cleaner.start();

    }

}
