package com.sumin.section04.constructor;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다 */

        User user1 = new User();
        System.out.println(user1.information());

        User user2 = new User("홍길동", "hong123", "hong");
        System.out.println(user2.information());

        User user3 = new User("hong", "hong123", "홍길동", new java.util.Date());  // 현재 시간을 지닌 date 형 객체를 생성해줌
        System.out.println(user3.information());

    }



}
