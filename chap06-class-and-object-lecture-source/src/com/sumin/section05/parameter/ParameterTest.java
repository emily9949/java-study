package com.sumin.section05.parameter;

import java.util.Arrays;

public class ParameterTest {
    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("매개변수로 전달받아 수정한 값: " + num);
    }

    // 얕은 복사가 이루어짐. 배열 값을 다시 반환을 할 필요가 없다 !
    public void testPrimitiveArrayTypeParameter(int[] copyArr) {
        copyArr[0] = 100;
        copyArr[1] = 200;
        copyArr[2] = 300;
        copyArr[3] = 400;
        copyArr[4] = 500;
    }

    public void testClassTypeParameter(Rectangle rectangle) {
         rectangle.calArea();
         rectangle.calRound();
    }

    /* 설명. 가변인자는 넘어온 인자들을 받아내어 배열로 바꿔준다. */
    // String... : 가변인자로 여러개의 string 매개변수가 올 수 있음
    public void testVariableLengthArrayParameter(String... str) {
        System.out.println("넘어온 인자들 출력: " + Arrays.toString(str));
    }

    // 이렇게 int[] 로 반환할 필요가 없음
    // public void testArrayTypeParameter(int[] copyArr) {}
}
