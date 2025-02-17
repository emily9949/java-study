package com.sumin.intro.section02.uses.subsection03.terminal;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Application5 {
    public static void main(String[] args) {

        /* 설명. 메소드 참조 관련 추가 설명 (람다식 관련) */
        BiConsumer<Member, String> biConsumer;
        biConsumer = Member::setMemberId;
        biConsumer = (x, y) -> x.setMemberId(y);

        Consumer<String> consumer;
        Member m = new Member("1", "홍길동");
        consumer = m::setMemberId;
        // 참조자료형 변수를 통해 set. m.setMemberId(String x) 와 동일
        consumer = (x) -> m.setMemberId(x);
    }
}
