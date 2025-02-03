package com.sumin.section06.singleton;

public class EagerSingleton {
    // 프로그램을 켜자마자 인지가 되어 객체가 생성됨. 본인의 객체를 생성후 static 영역의 변수에 담음.
    private static EagerSingleton eager = new EagerSingleton();

    // 객체가 하나만 생성되게 하도록, private을 건다.
    private EagerSingleton() {}

    // 필요할 때 호출하면 eager 객체를 전달
    public static EagerSingleton getInstance() {
        return eager;
    }
}
