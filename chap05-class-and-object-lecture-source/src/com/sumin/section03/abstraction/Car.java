package com.sumin.section03.abstraction;

public class Car {

    private boolean isOn = false;
    private int speed;     // 클래스의 멤버 변수는 기본값으로 자동 초기화됨. int는 0이됨

    public void startUp() {
        if(this.isOn) {
            System.out.println("이미 시동이 걸려있다");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 부릉부릉");
        } // racer.myCar.isOn 호출
    }

    public void go() {
        if(this.isOn) {
            this.speed += 10;
            System.out.println("차가 앞으로 움직입니다");
        } else {
            System.out.println("차의 시동이 걸려있지 않습니다");
        }
    }

    public void stop() {
        if(isOn) {
            if (speed > 0) {
                speed = 0;
                System.out.println("급 브레이크를 밟았습니다. 차가 멈춥니다.");
            } else {
                System.out.println("차는 이미 멈춰 있는 상태입니다");
            }
        } else {
            System.out.println("차에 시동이 걸려있지 않습니다. 시동을 걸어주세요");
        }
    }

    public void turnOff() {
        if(isOn) {
            if(speed > 0) {
                System.out.println("차가 달리고 있습니다. 시동을 끌 수 없습니다.");
            } else {
                isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 켜주세요!");
            }
        } else {
            System.out.println("이미 시동이 꺼져있습니다");
        }
    }
}
