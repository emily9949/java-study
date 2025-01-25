package com.sumin.section03.increment;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 전위/후위 연산자에 대해 이해할 수 있다. */

        int num = 10;

        num++;
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);

        --num;
        System.out.println("num = " + num);

        /* 설명. 다른 연산자와 함께 쓰이거나 출력문 안에서는 전위/후위 연산자가 해석의 차이를 일으킨다. */
        int firstNum = 20;
        int result = firstNum++ + 3;                        // 다른 연산자 (+, =) 를 먼저 연산한 후, 후위 연산자를 계산한다.
        System.out.println("result = " + result);
        System.out.println("firstNum = " + firstNum);
        System.out.println("firstNum++ = " + firstNum++);   // 21. 출력이 되고 난 후 1을 더한다
        System.out.println("firstNum = " + firstNum);       // 22







    }
}
