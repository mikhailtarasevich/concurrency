package com.mt.Chapter2.ch02_recipe02;


/**
 * This class implements a consumer of events.
 *
 */
public class Consumer implements Runnable {

    /**
     * Store to work with
     */
    private EventStorage storage;

    /**
     * Constructor of the class. Initialize the storage
     * @param storage The store to work with
     */
    public Consumer(EventStorage storage){
        this.storage=storage;
    }

    /**
     * Core method for the consumer. Consume 100 events
     */
    @Override
    public void run() {
        for (int i=0; i<100; i++){
            storage.get();
        }
    }

}
