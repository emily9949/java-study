package com.sumin.section02.package_and_import;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해할 수 있다 */
        /* 설명.
        *   패키지의 의미
        *   1. 클래스의 소속
        *   2. 원래는 클래스명의 일부분이다.
        *   3. 경우에 따라 생략 가능하다
        * */

        /* 설명. non-static 메소드 호출을 위해 calculator 인지 (feat. 다른 패키지에서) */
        com.sumin.section01.method.Calculator cal = new com.sumin.section01.method.Calculator();

        int plusResult = cal.plusTwoNumbers(100, 20);
        System.out.println("100과 20의 합: " + plusResult);

        /* 설명. 다른 패키지의 static 메소드 호출. 패키지 풀네임을 적어야 한다.*/
        int maxResult =  com.sumin.section01.method.Calculator.maxNumbersOf(100, 20);


    }
}
