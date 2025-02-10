package com.sumin.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. Stack 에 대해 이해하고 사용할 수 있다 */
        /* 설명.
        *   Stack 이란?
        *   후입선출(LIFO) 또는 선입후출(FILO) 의 자료구조로 push(), pop(), peek() 등의 메소드를
        *   활용하여 자료를 처리할 수 있다.
        * */

        /* 설명. Stack 객체 생성 후 데이터 추가 */
        Stack<Integer> stack = new Stack<>();


        /* 설명. int 형을 Integer 로 autoboxing. 동등 객체 비교를 해야하기 때문에
        *   (equals, hashcode가 오버라이딩 되어 있어야함). 예를 들어, 본인이 생성한 객체
        *   bookDTO 를 Stack 에 넣는다면 equals, hashcode 를 오버라이딩 해야함 !!
        * */

        stack.push(1); // list 계열이지만, add() 가 아닌 push() 로 값을 집어넣음
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("stack = " + stack);

        System.out.println("peek = " + stack.peek()); // 맨 위의 값을 보기만 하는 것

        /* 설명. Stack 은 마지막부터 하나씩 순차적으로 카운팅 한다. (feat. 동등 비교가 가능해야 한다 (e, h 오버라이딩) */
        System.out.println("search = " + stack.search(2)); // 4 출력

        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());

        System.out.println(stack);

    }
}
