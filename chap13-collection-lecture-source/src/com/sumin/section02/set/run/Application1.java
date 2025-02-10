package com.sumin.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 hashSet 을 이용할 수 있다. */
        /* 설명. Set은 자료를 집어넣은 순서대로 저장하지 않는다. 내부적으로 Hash 알고리즘을 사용해 저장. */
//        HashSet<String> set = new HashSet<>();
        Set<String> hSet = new HashSet<>();
        hSet.add(new String("java")); // String 객체 생성
//        hSet.add(new String("java"));  리터럴로 String 객체 생성
        hSet.add(new String("mariaDB"));
        hSet.add("servlet");
        hSet.add("spring");
        hSet.add("html");

        /* 설명. Set 에 저장된 자료는 넣는 순서를 보장할 수는 없다 (넣는 순서와 다르다) */
        System.out.println("hashSet에 저장된 값: " + hSet);

        hSet.add(new String("java")); // 값은 같지만 다른 객체를 생성. 동등 객체

        /* 설명. 중복되는 데이터 추가 (feat. 중복은 동등객체를 말한다.) */
        System.out.println("java를 가진 String 추가 후: " + hSet); // 동등 객체(중복)을 저장하지 않음.

        /* 설명. Set은 인덱스 개념이 없어 Iterator (반복자)를 활용해야 한다. */
        Iterator<String> iter = hSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        /* 설명. Set을 배열로 바꿀 수는 있다 (권장하진 X) */
        Object[] arr = hSet.toArray(); // Object 배열로만 가능
        for (int i = 0; i < arr.length; i++) {
            System.out.println((String)arr[i]);
        } // Object 타입도 toString 을 호출하기 때문에, 형변환 안하고 써도 작동하나
        //  int 와 같이 배열에 다른 자료형이 들어가면 오류가 난다.

        System.out.println("size(): " + hSet.size());
        hSet.clear();
        System.out.println("size(): " + hSet.size());
        System.out.println("isEmpty(): " + hSet.isEmpty());


    }
}
