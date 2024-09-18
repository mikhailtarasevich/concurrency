package com.mt.Chapter2.ch02_recipe01_problem;

public class ParkingCash {

    private static final int cost=2;

    private long cash;

    public ParkingCash() {
        cash=0;
    }

    public void vehiclePay() {
        cash+=cost;
    }

    public void close() {
        System.out.printf("Closing accounting");
        long totalAmmount;
        totalAmmount=cash;
        cash=0;
        System.out.printf("The total ammount is : %d",totalAmmount);
    }
}
