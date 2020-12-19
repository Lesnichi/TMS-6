package com.tms.lesson6.transport;

public class CivilTransport extends AirTransport {
    int numberOfPassengers;
    boolean isBusinessClass;

    public CivilTransport(int power, int maxSpeed, int weight, String mark, int wheelNumber, int fuelConsumption, int numberOfPassengers, boolean isBusinessClass) {
        super(power, maxSpeed, weight, mark, wheelNumber, fuelConsumption);
        this.numberOfPassengers = numberOfPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    public void passengersCheck (int numberOfPassengers){
        if (numberOfPassengers <= this.numberOfPassengers){
            System.out.println("Пассажиры произвели посадку");
        } else {
            System.out.println("Пассажирам не хватило мест для посадки. Проверьте посадочные билеты");
        }
    }

    @Override
    public void printIfo() {
        super.printIfo();
        System.out.println("numberOfPassengers = " + numberOfPassengers);
        System.out.println("isBusinessClass = " + isBusinessClass);
    }
}
