package com.mt.Chapter2.ch02_recipe01_solution;

import java.util.Objects;

public class ParkingStats {

    /**
     * This two variables store the number of cars and motorcycles in the
     * parking
     */
    private long numberCars;
    private long numberMotorcycles;

    private ParkingCash cash;

    private final Object controlCars, controlMotorcycles;

    /**
     * Constructor of the class
     */
    public ParkingStats(ParkingCash cash) {
        numberCars = 0;
        numberMotorcycles = 0;
        this.cash = cash;
        controlCars = new Object();
        controlMotorcycles = new Object();
    }

    public void carComeIn() {
        synchronized (controlCars) {
            numberCars++;
        }
    }

    public void carGoOut() {
        synchronized (controlCars) {
            numberCars--;
        }
        cash.vehiclePay();
    }

    public void motoComeIn() {
        synchronized (controlMotorcycles) {
            numberMotorcycles++;
        }
    }

    public void motoGoOut() {
        synchronized (controlMotorcycles) {
            numberMotorcycles--;
        }
        cash.vehiclePay();
    }

    public long getNumberCars() {
        return numberCars;
    }

    public long getNumberMotorcycles() {
        return numberMotorcycles;
    }

}
