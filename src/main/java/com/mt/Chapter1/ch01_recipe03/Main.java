package com.mt.Chapter1.ch01_recipe03;

import java.util.concurrent.TimeUnit;

/**
 * Main class of the example. Search for the autoexect.bat file on the Windows
 * root folder and its subfolders during ten seconds and then, interrupts the
 * Thread
 */
public class Main {

    /**
     * Main method of the core. Search for the autoexect.bat file on the Windows
     * root folder and its subfolders during ten seconds and then, interrupts
     * the Thread
     *
     * @param args
     */
    public static void main(String[] args) {
        // Creates the Runnable object and the Thread to run it
        FileSearch searcher = new FileSearch("C:\\", "asdch-rpm-server.zip");
        Thread thread = new Thread(searcher);

        // Starts the Thread
        thread.start();

        // Wait for ten seconds
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupts the thread
        thread.interrupt();
    }

}
