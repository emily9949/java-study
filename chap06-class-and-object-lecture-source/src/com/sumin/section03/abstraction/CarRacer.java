package com.sumin.section03.abstraction;

public class CarRacer {

    private Car myCar = new Car();

    public void startUp() {
        this.myCar.startUp();    // 자동차에게 시동을 걸기


    }

    public void stepAccelator() {
        this.myCar.go();
    }

    public void stepBreak() {

        this.myCar.stop();
    }

    public void turnOff() {
        this.myCar.turnOff();
    }

}
