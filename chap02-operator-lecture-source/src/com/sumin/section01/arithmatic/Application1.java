package com.sumin.section01.arithmatic;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 산술 연산자에 대해 이해하고 활용할 수 있다 */
        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));

        double testNum = num1 / (double)num2;
        double  transNum = (int)(testNum * 100) / (double) 100;     // math 함수 없이 소수점 두 자리까지 끊기
        System.out.println("testNum = " + testNum);
        System.out.println("transNum = " + transNum);

        System.out.println("num1 % num2 = " + (num1 % num2));

    }


}
