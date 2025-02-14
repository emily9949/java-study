package com.sumin.intro.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 중계 연산 중 하나인 flatMap 에 대해 이해하고 사용할 수 있다 */
        // List 를 품은 List (2차원 리스트)
        List<List<String>> list = Arrays.asList(
                                            Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                                            Arrays.asList("java", "spring", "springboot")
                                            );
        list.stream().forEach(System.out::println);
        System.out.println("list = " + list);
        // list = [[JAVA, SPRING, SPRINGBOOT], [java, spring, springboot]]

        List<String> flatList = list.stream().flatMap(Collection::stream)
                                             .collect(Collectors.toList());
        flatList.stream().forEach(System.out::println);
        System.out.println("flatList = " + flatList);
        // flatList = [JAVA, SPRING, SPRINGBOOT, java, spring, springboot]
    }
}
