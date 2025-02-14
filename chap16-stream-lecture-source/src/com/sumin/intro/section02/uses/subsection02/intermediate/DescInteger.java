package com.sumin.intro.section02.uses.subsection02.intermediate;

import java.util.Comparator;

public class DescInteger implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1; // 알아서 오토 언박싱이 일어남.
    }
}
