package com.sumin.section02.looping;

public class A_for {
    public void testSimpleForStatement() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }

    int sum = 0;
    public void testForExample() {

    /* 설명. for 문을 통해 개선해 보자 (규칙적이며 반복적인 코드들)*/
        for (int i = 0; i < 5; i++) {
            sum += (i + 1) * 2 + 1;
        }

        System.out.println("sum = " + sum);
    }
}
