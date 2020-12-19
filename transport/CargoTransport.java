package com.tms.lesson6.transport;

public class CargoTransport extends GroundTransport {
    int carryingCapacity;

    public CargoTransport(int power, int maxSpeed, int weight, String mark, int numberOfWheels, int fuelConsumption, int carryingCapacity) {
        super(power, maxSpeed, weight, mark, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public void cargoCheck (double cargoWeight){
        if (cargoWeight <= carryingCapacity){
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    @Override
    public void printIfo() {
        super.printIfo();
        System.out.println("carryingCapacity = " + carryingCapacity);
    }
}
