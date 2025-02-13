package com.sumin.section03.reference;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 기존에 존재하는 생성자를 참조한 람다식을 활용할 수 있다. */
//        Function<String, Member> costMember = x-> new Member(x);
        Function<String, Member> costMember =
                Member::new; // 생성자도 참조가 가능
//        -> 어떤 생성자인지 알아서 골라서 들어감 (여기서는 String 하나를 받는 생성자로 인식)

        Member member1 = costMember.apply("A"); // new로 객체를 생성하는 것과 같다
//        Member member1 = new Member("A"); 이렇게 쓰는 것과 같음
        System.out.println("member1 = " + member1);

        Member member2 = costMember.apply("B");
        System.out.println("member2 = " + member2);
    }
}
