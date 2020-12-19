package com.tms.lesson6.transport;

public class RunnerTraffic {
    public static void main(String[] args) {

        LightTransport lightTransport = new LightTransport(300, 280, 2300, "Lotus", 4, 20, "SPORT-CAR", 2);
        CargoTransport cargoTransport = new CargoTransport(700, 150, 10, "DAF", 12, 35, 20);
        CivilTransport civilTransport = new CivilTransport(7000, 1200, 120, "AirBus", 10, 8000, 250, true );
        MilitaryTransport militaryTransport = new MilitaryTransport(1000, 3000,25, "F-35", 3, 1200,true,5);
        lightTransport.printIfo();
        lightTransport.getDistance(4);
        System.out.println();
        cargoTransport.printIfo();
        cargoTransport.cargoCheck(25);
        cargoTransport.cargoCheck(19);
        System.out.println();
        civilTransport.printIfo();
        civilTransport.passengersCheck(250);
        civilTransport.passengersCheck(300);
        System.out.println();
        militaryTransport.printIfo();
        militaryTransport.shoot();
        militaryTransport.isBailout();
    }
}
