package com.sumin.section2.functionInterface;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class Application1 {
    public Application1() {
    }

    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Consumer에 대해 이해하고 사용할 수 있다.
        * 설명. 반환형이 없는 메소드 관련 람다식  */
//        Consumer<String> consumer = (str) -> {
//            System.out.println("(이)가 입력됨");
//        };

        Consumer<String> consumer = str -> System.out.println(str + "(이)가 입력됨");

        consumer.accept("피카츄");
        consumer.accept("hello");

        BiConsumer<String, LocalTime> biConsumer =
                (str, time) -> System.out.println(str + "(이)가 " + time + "에 입력됨");
        biConsumer.accept("Hello?", LocalTime.now());

        /* 설명.
        *   (int)(Math.random() * 갯수) + 초기값
        *   new Random().nextInt(갯수) + 초기값 (다운캐스팅을 할 필요가 없다)
        * */

        ObjIntConsumer<Random> objIntConsumer =
                (random, bound) -> System.out.println("1부터 " + bound + "까지의 난수 발생: "
                + random.nextInt(bound) + 1); // 메소드가 하나인 추상 메소드 구현
        objIntConsumer.accept(new Random(), 10);
    }
}
