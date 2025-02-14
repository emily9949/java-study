package com.sumin.intro.section01;

import java.util.Arrays;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 배열이나 컬렉션은 스트림을 이용할 수 있고 이를 이해해서 활용할 수 있다 */
        String[] sArr = new String[]{"java", "mariadb", "jdbc"};

        /* 설명. Arrays.stream (배열) 자료형을 Stream 자료형으로 변환 */
        // 배열 또는 컬렉션을 스트림으로 바꿔서 forEach 문으로 넘겨준다
        System.out.println("==== 배열로 스트림 생성 ==== ");
//        Stream<String> strStream = Arrays.stream(sArr);

        /* 설명. forEach 는 자신의 매개변수에 정의된 람다식의 매개변수로
            stream 의 각 요소들을 자동으로 넘기며 순회함 (매번 람다식 실행) */
//        strStream.forEach(x -> System.out.println(x));
//        strStream.forEach(System.out::println);

        Arrays.stream(sArr).forEach(System.out::println);
        System.out.println();

        /* 설명. Stream 으로 관리되는 요소들을 원하는 갯수만큼 반복할 수 있다. */
        Stream<String> strStream2 = Arrays.stream(sArr, 0, 2);
        strStream2.forEach(System.out::println);

        /* 설명.
        *   Builder를 활용한 스트림 생성
        *   builder는 static<T>로 되어 있는 메소드이며, 호출 시 타입 파라미터를 메소드 호출 방식으로 전달한다.
        * */
        System.out.println("==== Builder로 스트림 생성 ====");
        // 배열이나 컬렉션에 담지 않고도 스트림을 생성할 수 있음
        Stream<String> builderStream = Stream.<String>builder() // builder를 호출할 때 제네릭을 걸어야함
                                        .add("홍길동")
                                        .add("유관순")
                                        .add("윤봉길")
                                        .build(); // stream 반환
        builderStream.forEach(System.out::println);
    }
}
