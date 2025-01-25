package com.sumin.section01.array;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        int [] arr = new int[5];
        System.out.println("arr = " + arr.toString());     // arr 값 : [I@3fee733d 주소값을 지니고 있음
        System.out.println("배열의 모습을 보고싶어: " + Arrays.toString(arr));  // Heap 영역의 arr 값을 보여줌. 1차원 배열만 가능

    }
}
