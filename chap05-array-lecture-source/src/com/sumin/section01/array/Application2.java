package com.sumin.section01.array;

import java.util.Arrays;

public class Application2 {
    /* 수업목표. 배열의 사용방법을 익혀 배열을 사용할 수 있다 */
    /* 설명.
    *   배열의 사용방법
    *   1. 배열의 선언
    *   2. 배열의 크기 할당
    *   3. 배열의 인덱스 공간에 값 대입
    * */
    public static void main(String[] args) {

        int[] iArr;
        char cArr[];     // []의 위치는 변수명 뒤에 써도 성립하지만 지양하자

        iArr = new int[5];
        cArr = new char[5];

        System.out.println("iArr = " + iArr);
        System.out.println("cArr에 담긴 값:  " + Arrays.toString(cArr));

        System.out.println("cArr의 주소를 10진수 형태로 보고 싶다 " + cArr.hashCode());

        /* 설명. cArr이 null 값을 담고 있어서 nullpointerexception 오류가 뜬다 */
        cArr = null;
        System.out.println("cArr의 값을 비우고(null) 보면 " + cArr.hashCode());


    }


}
