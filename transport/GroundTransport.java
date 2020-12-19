package com.tms.lesson6.transport;

public class GroundTransport extends Transport {
    int numberOfWheels;
    int fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String mark, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, mark);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void printIfo() {
        super.printIfo();
        System.out.println("numberOfWheels = " + numberOfWheels);
        System.out.println("fuelConsumption = " + fuelConsumption);
    }
}
