package com.sumin.section02.looping;

import java.util.Scanner;

public class D_doWhile {
    public void testSimpleDoWhileStatement() {

        /* 설명. do-while문. 최소 한 번의 입력을 받고 반복하고 싶을 때 사용한다
        *   한 번은 반드시 실행된다.  사용자의 입력 또는 메뉴 선택을 요구할 때 사용함.
        * */
        do {
            System.out.println("반복문 실행 될까? ");
        } while (false);

        System.out.println("반복 종료 이후");

    }

    public void testDoWhileExample() {

        int sumPrice = 0;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("sumPrice에 담을래 뺄래?");
            System.out.println("1. 담을래");
            System.out.println("2. 뺄래");
            System.out.println("3. 나갈래");
            System.out.print("번호를 고르시오: ");
            choice = sc.nextInt();
            if (choice == 1) {
                sumPrice += 1000;
            }
            if (choice == 2) {
                sumPrice -= 1000;
            }
            System.out.println("현재 sumPrice에는 " + sumPrice);
        } while(choice < 3);
    }
}
