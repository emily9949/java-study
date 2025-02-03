package com.sumin.section04.dto;

public class Application {
    public static void main(String[] args) {
        UserDTO user1 = new UserDTO();
        System.out.println(user1.toString());

        UserDTO user2 = new UserDTO("hong", null, null, null);
        System.out.println(user2);

        /* 설명. toString()은 print() 또는 println()에서 생략 가능하다 */
        System.out.println(user2);
        System.out.println("아이디: " + user2.getId());
        user2.setId("gang");
        System.out.println("아이디: " + user2.getId());
    }
}
