package com.tms.lesson6.transport;

public class LightTransport extends GroundTransport {
    private String typeOfBody;
    private int numberOfPassengers;

    public LightTransport(int power, int maxSpeed, int weight, String mark, int numberOfWheels, int fuelConsumption, String typeOfBody, int numberOfPassengers) {
        super(power, maxSpeed, weight, mark, numberOfWheels, fuelConsumption);
        this.typeOfBody = typeOfBody;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void getDistance(double time) {
        System.out.println("За время " + time + " ч. автомобиль " + super.getMark() +
                " двигаясь с максимальной скоростью " + super.getMaxSpeed() + " км/ч проедет " +
                (getMaxSpeed() * time) + " км. и израсходует " + getAllFuel(time) + " литров топлива");
    }

    private double getAllFuel(double time) {
        return super.getMaxSpeed() * time / 100 * fuelConsumption;
    }

    @Override
    public void printIfo() {
        super.printIfo();
        System.out.println("typeOfBody = " + typeOfBody);
        System.out.println("numberOfPassengers = " + numberOfPassengers);
        System.out.println("numberOfWheels = " + numberOfWheels);
        System.out.println("fuelConsumption = " + fuelConsumption);
    }
}
