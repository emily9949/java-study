package com.sumin.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 한 개를 입력하세요: ");
        int input = sc.nextInt();

        if (input % 2 == 0) {
            System.out.println("짝수입니다");
        }
    }

    public void testNestIfStatement() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input > 0) {
            if (input % 2 == 0) {
                System.out.println("입력 받은 값은 양수이면서 짝수입니다. ");
            }
        }

        if (input > 0 && input % 2 == 0) {                  // 삼비논교비논삼대 : 연산 순서
            System.out.println("입력 받은 값은 양수이면서 짝수입니다 ");
        }
    }
}
