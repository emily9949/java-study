package com.sumin.section01.exception;

public class Application {
    public static void main(String[] args) throws ArithmeticException { // 해당 클래스에서도 throws 로 예외를 던짐.

        /* 수업목표. 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다. */
        /* 설명.
        *   1. throws를 통한 위임
        *   2. try-catch를 통한 처리 */

       ExceptionTest et = new ExceptionTest();

        /* 목차. 1. throws 로 처리 시*/
        et.checkEnoughMoney(50000, 10000);

        /* 목차. 2. try-catch 로 처리 시 */
        // try 블록은 너무 크지 않게, 적당한 범위로 지정하자
        try {
            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(50000, 10000); // = new ArithmeticException 이 된다. 호출하면 throw로 예외를 받음.
            System.out.println("예외가 없었군요. 돈이 많으신가봐요.");
        } catch (ArithmeticException e) { // 예외 발생하면 try의 나머지 코드를 건너뛰고 catch로 넘어간다
            System.out.println("예외가 발생했군요!");

            /* 설명.
            *   try 블럭에서 발생한 예외 (객체)를 처리하는 부분
            *   예외 객체를 활용하게 되면 해당 예외 객체의 메소드를 사용할 수 있다. */


            /* 설명. getMessage : 상위 클래스 throwable의 getMessage를 실행한다. 부모의 생성자에게 예외 메세지를 계속 넣어보내는 구조.*//*
            System.out.println("그 예외는: " + e.getMessage() + "때문이군요!!");
            System.out.println("돈 좀 넉넉히 들고 다닙시다.");

            /* 설명. 예외 메세지와 발생한 문제들을 추적할 수 있게 빨간 글씨의 메세지로 처리되는 방식 */
            e.printStackTrace();

            // System.exit(0); // 자바 어플리케이션이 즉시 종료되도록 처리
        }

        try {
            int num = 10;
            System.out.println(num / 0);
        } catch (Exception e) { // 다형성, 동적바인딩 적용. 꼭 ArithmeticException 이라고 안 적어도 동작한다.
            System.out.println("0으로 나누면 안돼");
            System.out.println(e.getMessage() + "라잖아");
        }


        System.out.println("프로그램을 종료합니다. ");
    }
}
