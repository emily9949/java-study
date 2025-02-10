package com.sumin.section03.map.run;

import com.sumin.section01.list.dto.BookDTO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Map 의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다 */
        Map<Object, Object> hMap = new HashMap<>();
        hMap.put(new String("one"), new java.util.Date());
        hMap.put(12, "red apple");
        hMap.put(33, 123);

        /* 설명. Map 은 key 를 통해 value를 뽑는 것이 기본적이며
            key 값은 객체의 동등 비교(e,h)로 키 값이 같은지 판단한다. */
        System.out.println("키가 \"one\"인 Value 값: " + hMap.get("one"));
        System.out.println("키가 \"one\"인 Value 값: " + hMap.get(new String("one")));
        System.out.println(hMap); // println 안의 모든 객체들의 toString 이 실행된다.

        /* 목차. 1. Key 가 중복되는 경우 */
        /* 설명. 우리가 만든 객체도 key로 사용할 수 있으며 이때 해당 객체는 e,h 가 반드시 오버라이딩 되어 있어야 한다. */
        // ("홍길동전", "허균", 50000) 이 같으면 Key 로 중복이 못 들어가게 BookDTO 클래스에서 e,h 메소드를 재정의함
        hMap.put(new BookDTO(1, "홍길동전", "허균", 50000), 1);
        hMap.put(new BookDTO(2, "홍길동전", "허균", 50000), 2);
        System.out.println("BookDTO 객체를 활용한 key 와 value 쌍을 두개 추가 후: " + hMap);
        // key 에 계속 같은 객체를 넣으면 중복을 인식 못한다.
        // 사용자가 정의한 객체를 제외하고, 다른 타입으로는 기본적인 중복 체크 알고리즘은 들어있음

        /* 목차. 2. value 가 중복되는 경우 */
        hMap.put(44, 123);
        System.out.println("value 가 중복되는 Key 와 value 쌍을 추가 후: " + hMap);

        /* 설명. Map 을 활용해 보자 */
        Map<String, String> hMap2 = new HashMap<>();
        hMap2.put("one", "java 17");
        hMap2.put("two", "mariaDB 10");
        hMap2.put("three", "servlet/jsp");
        hMap2.put("four", "spring boot 3.0");
        hMap2.put("five", "vue");

        System.out.println("hMap2 = " + hMap2);

        /* 설명. Map 에 담긴 값을 순회해서 확인하는 방법 */
        /* 목차. 1. keySet() 을 활용해 key를 Set 으로 바꾸고 iterator를 돌리는 방법  */
        Set<String> keys = hMap2.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println("key = " + key + ", value = " + hMap2.get(key));
        }

        /* 목차. 2. entrySet() 을 활용하는 방법 (key와 value를 묶은 Entry 타입을 통해 key 없이도 value만 추출 가능) */
        // key, value 를 entry 로 묶어서 바꿈.
        Set<Map.Entry<String, String>> set = hMap2.entrySet();
        Iterator<Map.Entry<String, String>> iter2 = set.iterator(); // Map 안에 있는 Entry 인터페이스
        while (iter2.hasNext()) {
            Map.Entry<String, String> entry = iter2.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
    }
}
