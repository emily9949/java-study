package com.sumin.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {
        for (int i = 2; i <= 9; i++) {         // 행 (나중에 증가하는 부분)을 바깥에
            System.out.println(i + "단");
            printGugudanOf(i);
            System.out.println();
        }
    }

    /* 설명. 전달인자로 i 를 넘겨주면 해당 단수의 구구단을 출력하는 메소드 */
    // static 을 달아야 하는게 맞지만 달지 않아도 인텔리제이에서 자동으로 객체 생성하며 해석하는듯함.
    private static void printGugudanOf(int i) {
        for (int j = 1; j <= 9; j++) {     // 열 (먼저 증가하는 부분)은 안쪽에
            System.out.println(i + " * " + j + " = " + (i * j));
        }
    }

    public void printStars() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오: ");
        int input = sc.nextInt();
        for (int i = 0; i < input ; i++) {
            /* 설명. 공백 찍기 */
            printSpace(input, i);
            /* 설명. 별 찍기 */
            printStar(i);
            System.out.println();

        }
    }

    private static void printStar(int i) {
        for (int j = 0; j < (i +1) ; j++) {
            System.out.print("*");
        }
    }

    private static void printSpace(int input, int i) {
        for (int j = 0; j < input
                -(i +1); j++) {  // input - (i+1) 만큼 반복해서 공백을 찍음
            System.out.print(" ");
        }
    }
}
