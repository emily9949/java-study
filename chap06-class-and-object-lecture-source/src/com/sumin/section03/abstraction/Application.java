package com.sumin.section03.abstraction;

import java.util.Scanner;

/* 설명.
*   클래스
*   1. 객체를 만들기 위한 도구이다.
*   2. 하나의 새로운 사용자 정의형 타입
*   3. 관련있는 속성과 기능의 묶음
* */

/* 설명.
*   추상화란 ?
*   객체들의 공통 부분을 추출하고 공통되지 않고 불필요한 부분을 제거한다는 의미.
*   추상화의 목적은 객체들의 유연성을 확보하기 위함.
*
*  설명.
*   1. 협력 (객체간의 필요한 의사소통)
*   2. 책임 (객체가 가진 기능)
*   3. 역할 (기능들이 모이면 역할)
*  */

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CarRacer racer = new CarRacer();    // 차 한대를 소유한 카레이서 등장
        int input = 0;
        do {
            System.out.println("===== 카레이싱 프로그램 =====");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동끄기");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택: ");
            input = sc.nextInt();
            switch (input) {
                case 1:  racer.startUp();
                    break;
                case 2: racer.stepAccelator();
                    break;
                case 3: racer.stepBreak();
                    break;
                case 4: racer.turnOff();
                    break;
                case 9:
                    System.out.println("프로그램을 이용해주셔서 감사합니다");
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다");
            }
        } while (input != 9);
    }
}
