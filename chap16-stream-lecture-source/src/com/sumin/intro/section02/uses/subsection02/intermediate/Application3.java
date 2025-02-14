package com.sumin.intro.section02.uses.subsection02.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 중계 연산 중 하나인 sorted에 대해 이해하고 사용할 수 있다 */
        List<Integer> integerList = IntStream.of(5, 10, 99, 2, 1, 35)
                                             .boxed() // IntStream 에서 Stream 으로 boxing
                                             .sorted(new DescInteger()) // 정렬 기준을 만들어줌
                                             .collect(Collectors.toList()); // 컬렉션으로 변환 (List)
        System.out.println("정렬된 Integer List: " + integerList);
    }
}
