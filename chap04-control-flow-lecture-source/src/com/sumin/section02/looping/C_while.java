package com.sumin.section02.looping;

import java.util.Scanner;

public class C_while {
    /* 설명. while 은 주로 사용자의 입력값에 따라 반복 횟수가 정해지는 형태에서 쓰인다 */
    public void testWhileExample() {
        Scanner sc = new Scanner(System.in);

        /* 설명. 'y' 또는 'Y'를 입력하면 반복을 멈추는 while 문 작성*/
        // 초기값을 어떻게 설정하느냐에 따라 한 바퀴도 안 돌수도 있음
        char answer = '\0'; // 빈 문자 담기
        while (!(answer == 'y') || answer == 'Y') {
            System.out.print("끝마치려면 y를 누르시오: ");
            answer = sc.next().charAt(0);
        }
        System.out.println("프로그램이 종료되었습니다. ");

    }
}
