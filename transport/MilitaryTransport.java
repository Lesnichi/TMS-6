package com.tms.lesson6.transport;

public class MilitaryTransport extends AirTransport {

    boolean bailoutSystem;
    int NumberOfMissiles;

    public MilitaryTransport(int power, int maxSpeed, int weight, String mark, int wheelNumber, int fuelConsumption, boolean bailoutSystem, int numberOfMissiles) {
        super(power, maxSpeed, weight, mark, wheelNumber, fuelConsumption);
        this.bailoutSystem = bailoutSystem;
        NumberOfMissiles = numberOfMissiles;
    }

    public void shoot(){
        if (this.NumberOfMissiles > 0){
            System.out.println("Ракета пошла ...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void isBailout(){
        if (bailoutSystem == true){
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    public void printIfo() {
        super.printIfo();
        System.out.println("bailoutSystem = " + bailoutSystem);
        System.out.println("NumberOfMissiles = " + NumberOfMissiles);
    }
}
