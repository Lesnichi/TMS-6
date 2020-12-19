package com.tms.lesson6.transport;

public class AirTransport extends Transport {

    private int wheelNumber;
    private int fuelConsumption;

    public AirTransport(int power, int maxSpeed, int weight, String mark, int wheelNumber, int fuelConsumption) {
        super(power, maxSpeed, weight, mark);
        this.wheelNumber = wheelNumber;
        this.fuelConsumption = fuelConsumption;
    }
}
