package com.sumin.section08.uses;

import java.util.Arrays;

// 요청을 여러 갈래로 나눠줌.
public class MemberService {

    /* 설명. 회원 가입을 5명 진행(저장)하기 위해 회원 가입용 객체의 메소드를 호출 (전달 인자를 전달하며) */
    public void signUpMembers() {
        Member[] members = new Member[3];
        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, 'M');
        members[1] = new Member(2, "user02", "pass02", "이순신", 40, 'F');
        members[2] = new Member(3, "user03", "pass03", "이순신", 30, 'M');

        MemberRegister register = new MemberRegister();
        register.regist(members);
    }

    public void showAllMembers() {
        MemberFinder finder = new MemberFinder();
        System.out.println("==== 가입된 회원 목록 ====");
        Member[] returnMembers = finder.findAllMembers();

        for (Member member : returnMembers) {
            System.out.println(member);
        }
    }
}
