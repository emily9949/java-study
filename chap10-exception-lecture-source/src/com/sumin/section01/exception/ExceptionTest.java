package com.sumin.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws ArithmeticException{ // 여러개의 throw를 던질 수 있다. 호출한 곳으로 던지는 것인데, 생략해도된다.
        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if (money >= price) {
            System.out.println("원 상품을 구입하기 위한 금액이 충분합니다. ");
            return;
        } // 굳이 if-else 문을 사용하여 예외를 미리 정의하지 않고, 사용자 정의 예외처리 클래스에서 예외처리한다.

        // System.out.println("호주머니 사정이 딱하군요! ");

        /* 설명. 예외 상황에 Exception을 상속 받는 예외 클래스의 객체를 생성하고 throw 로 발생 */
        /* 설명. Exception 타입의 객체를 생성할 때는, throw로 생성을 한다. */
        throw new ArithmeticException("호주머니 사정이 딱하군요!"); // throw : 호출한 곳으로 예외를 던져준다
    }
}
