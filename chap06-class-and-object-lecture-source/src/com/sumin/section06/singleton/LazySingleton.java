package com.sumin.section06.singleton;

public class LazySingleton {
    private static LazySingleton lazy; // 인스턴스 변수만 선언한 것

    private LazySingleton() {}

    // 최초 생성 시점에 객체를 한 번 생성하고, 계속 이어서 씀.
    public static LazySingleton getInstance() {
        if (lazy == null)  lazy = new LazySingleton(); // 처음 한 번만 객체를 생성함.

        return lazy;
    }
}
