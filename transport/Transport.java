package com.tms.lesson6.transport;

public abstract class Transport {
    private int horsePower;
    private int maxSpeed;
    private int weight;
    private String mark;

    public Transport(int power, int maxSpeed, int weight, String mark) {
        this.horsePower = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.mark = mark;
    }

    public void printIfo() {
        System.out.println("horsePower = " + horsePower);
        System.out.println("powerInKilowatts = " + powerInKilowatts(horsePower));
        System.out.println("maxSpeed = " + maxSpeed);
        System.out.println("weight = " + weight);
        System.out.println("mark = " + mark);
    }

    double powerInKilowatts(int horsePower) {
        return horsePower * 0.74;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getMark() {
        return mark;
    }
}
