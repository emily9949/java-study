package com.sumin.section02.userexception.exception;

public class PriceNegativeException extends Exception{ // Exception 을 상속 받으면 예외 클래스가 됨

    /* 설명. Exception 클래스의 구조 때문에 메세지를 매개변수로 받는 생성자가 있으면 좋다*/
    public PriceNegativeException(String message) {
        super(message);
    }
}
