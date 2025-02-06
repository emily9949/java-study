package com.sumin.section02.userexception;

import com.sumin.section02.userexception.exception.MoneyNegativeException;
import com.sumin.section02.userexception.exception.NotEnoughMoneyException;
import com.sumin.section02.userexception.exception.PriceNegativeException;

public class Application3 {
    public static void main(String[] args) {

        ExceptionTest2 et = new ExceptionTest2();

        try {
            et.checkEnoughMoney(30000, 40000);
            et.checkEnoughMoney(30000, -40000);

            /* 설명. multi-catch 구문은 두 개 이상의 예외를 (|) 를 사용해서 하나의 catch 블럭에서 처리할 수 있다. */
        } catch (PriceNegativeException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) { // 부모 클래스일수록 catch 구문은 아래로 가야한다. 위에서 예외를 다 잡아버리면 안되기 때문.
            System.out.println("어떤 예외든 커몬");
            System.out.println("어떤 예외든 메세지는: " + e.getMessage());
        }

        System.out.println("프로그램을 종료하겠습니다");
    }
}
