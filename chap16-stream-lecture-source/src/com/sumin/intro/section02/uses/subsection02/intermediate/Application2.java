package com.sumin.intro.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 중계 연산 중 하나인 map 에 대해 이해하고 사용할 수 있다 */
        /* 설명. 맵 (map)은 스트림에 들어있는 데이터를 람다식으로 가공하고 새로운 스트림에
        *       담아주는 메소드이다
        * */

        IntStream intStream = IntStream.range(1, 10);
        intStream.filter(i-> i % 2 != 0) // 홀수만 걸러짐, Predicate
                .map(i -> i * 5) // operator (매개변수와 같은 타입 반환)
                .forEach(result-> System.out.println(result + " ")); // consumer
    }
}
