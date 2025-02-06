package com.sumin.section02.userexception;

import com.sumin.section02.userexception.exception.MoneyNegativeException;
import com.sumin.section02.userexception.exception.NotEnoughMoneyException;
import com.sumin.section02.userexception.exception.PriceNegativeException;


/* 설명. 직접 만든 예외처리의 경우 메소드 헤더에 throws 를 안 넣어주면 오류가 난다. */
public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 있습니다."); // 예외 객체 생성
        }

        if (money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }

        if (money < price) {
            throw new NotEnoughMoneyException("가진 돈보다 상품 가격이 더 비쌉니다");
        }

        /* 설명. 아무런 예외가 발생(throw) 하지 않으면 실행되는 구문 */
        System.out.println("가진 돈이 충분하시군요. 즐거운 쇼핑 되세요! ");
    }
}
