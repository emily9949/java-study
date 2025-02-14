package com.sumin.section01.intro;

/* 설명. FuntionalInterface만 람다식으로 적용 가능하다*/
@FunctionalInterface // 두 개 이상의 추상 메소드가 선언되었는지 체크해주는 어노테이션
public interface Calculator {
    int sumTwoNumbers(int first, int second);
}