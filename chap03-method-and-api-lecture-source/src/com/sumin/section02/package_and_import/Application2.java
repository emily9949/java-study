package com.sumin.section02.package_and_import;

import com.sumin.section01.method.Calculator;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. import에 대해 이해할 수 있다. */

        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10, 2);
        System.out.println("result = " + result);

        result = Calculator.maxNumbersOf(10, 30);          // static 함수를 사용하려면 클래스명.함수명
        System.out.println("result = " + result);

    }
}
