package com.sumin.section08.uses;

// DB 역할
public class MemberRepository {

    private final static Member[] staticMembers = new Member[100]; // 회원 100명을 담을 객체 배열 생성. 다른 곳에서는 접근 불가
    private static int count; // 현재 저장된 회원의 수-1

    // static 값을 건드리는 메소드도 static이어야 의미가 있다.
    public static void store(Member[] members) {
        for (int i = 0; i < members.length; i++) {
            staticMembers[count++] = members[i];
        }

    }

    public static Member[] findAllMembers() {
        return staticMembers;
    }
}
