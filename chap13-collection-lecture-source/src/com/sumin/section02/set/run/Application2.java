package com.sumin.section02.set.run;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. LinkedHashSet 에 대해 이해하고 활용할 수 있다. */
        /* 설명.
        *   LinkedHashSet 은 저장 당시의 순서를 유지하는 특성을 가지고 있다.
        *   (중복 제거 + 순서 유지)
        * */

        Set<String> lSet = new LinkedHashSet<>();
        lSet.add("ramen");
        lSet.add("pork");
        lSet.add("beef");
        lSet.add("chicken");
        lSet.add("french fries");
        lSet.add("rice");
        System.out.println("lSet = " + lSet);

        Iterator<String> iter = lSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
