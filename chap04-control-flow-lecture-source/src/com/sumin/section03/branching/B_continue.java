package com.sumin.section03.branching;

public class B_continue {
    public static void testSimpleContinueStatement() {

        /* 설명. 1부처 100까지 증가하면서 4와 5의 공배수일 경우 출력 */

        for (int i = 1; i < 100; i++) {
            /* 설명. continue : 반복문의 나머지 구문을 건너뛰고 다음 스탭으로 이동 (증감식으로 이동)
            *    반복문 내에서 특정 조건에 대해 예외를 처리하고자 할 때 사용한다.
             */
            if(!(i % 4 == 0 & i % 5 == 0)) {
                continue;
            }
                System.out.println(i + "는 4와 5의 공배수입니다.");

        }

    }
}
