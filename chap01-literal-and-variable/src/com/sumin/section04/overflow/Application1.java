package com.sumin.section04.overflow;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
        /* 설명.
        *   자료형 별 값의 최대 범위를 벗어나는 경우
        *   발생한 carry 를 버림처리하고 부호 비트를 반전시켜 순환한다
        * */

        /* 설명. 오버플로우 */
        byte num1 = 126;

        num1++;                               // num1 = num1 + 1
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 = " + num1);// overflow 발생 (부호가 바뀜)

        /* 설명. 언더플로우(최소->최대) */
        num1--;
        System.out.println("num1 = " + num1);

        num1 = (byte)(num1-1);              // 정수형 4byte 를 1byte로 강제 형변환 해주어야함

    }
}
