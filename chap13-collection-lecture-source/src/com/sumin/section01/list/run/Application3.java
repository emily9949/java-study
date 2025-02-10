package com.sumin.section01.list.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. List 계열을 출력하는 4가지 방법 */

        List<String> list = new ArrayList<String>();
        // List<String> list = new LinkedList<>(); 해도 오류가 안남
//        List<String> list = new Vector<>(); -> 동기화 처리를 위한 알고리즘이 추가되어 있다.
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("pineapple");
        list.add("mango");

        /* 설명. 1. toString() 활용하기 */
        System.out.println(list);

        /* 설명. 2. for 문 활용하기 */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /* 설명. 3. for-each 문 활용하기 (처음부터 끝까지 모든 요소를 순회) */
        for (String s : list) {
            System.out.println(s);
        }

        /* 설명. 4. iterator 활용하기 */
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        /* 설명. 1번 인덱스 (두 번째)의 과일 수정 */
        list.set(1, "kiwi");
        System.out.println("2번째 요소 수정 후 : " + list);

        /* 설명. list 가 관리하는 요소 제거 */
        /* 설명. 3번째 요소 제거 */
        list.remove(2);
        System.out.println("3번째 요소 제거 후 : " + list);

        list.clear();
        System.out.println("모든 요소 제거 후: " + list);

        /* 설명. null 과 '객체는 있지만 비어있음' 상태를 잘 구분해야 한다. */
        // list = null;
        // Null 을 대입하면 이후 list 를 활용하는 곳에서는 변수가 아무것도 참조하고 있지 않아 nullpointexception 이 뜬다.

        // isEmpty() : 객체는 존재하는데 아무것도 들어있지 않을 때

        /* 설명. 모든 요소 제거 된 이후 */
        System.out.println("isEmpty: " + list.isEmpty());
    }
}
