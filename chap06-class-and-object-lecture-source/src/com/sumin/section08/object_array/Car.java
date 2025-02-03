package com.sumin.section08.object_array;

public class Car {
    private String modelName;
    private int maxSpeed;

    public Car(){

    }

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName; // this : 만들어진 객체를 의미
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed() {
        System.out.println(modelName + "차량이 최고 시속" + maxSpeed + "km/h로 달립니다");
    }
}
