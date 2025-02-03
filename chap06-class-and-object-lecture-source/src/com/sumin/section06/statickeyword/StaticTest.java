package com.sumin.section06.statickeyword;

public class StaticTest {
    private int nonStaticCount; // stack 에 저장
    private static int staticCount; // static 영역에 저장

    public StaticTest() {

    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    // static 변수를 다루고 있으니 함수도 static으로 선언
    public static int getStaticCount() {
        return staticCount;
    }

    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public static void increaseStaticCount() {
        staticCount++;
    }
}
