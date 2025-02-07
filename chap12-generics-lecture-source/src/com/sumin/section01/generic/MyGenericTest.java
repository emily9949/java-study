package com.sumin.section01.generic;

/* 설명. Object 형을 활용해 구현의 편리성은 있지만 타입 안정성은 보장되지 않는다.*/
public class MyGenericTest {
    private Object value; // 모든 값을 Object 로 받아오기 때문에 받아올 떄는 편하다

    public MyGenericTest() {
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
