package com.sumin.section04.testapp.run;

import com.sumin.section04.testapp.service.MemberService;

import java.util.Scanner;

public class Application {

    /* 설명. 프로그램 키자마자
        1. MemberRepository 가 실행됨
        2. MemberService() 가 실행됨
        3. Application 의 ms 변수 초기화 */
    private static final MemberService ms = new MemberService();
    // final 은 처음에 명시적 초기화를 해주어야만 한다. 초기화 안하면 컴파일 에러가 남.
    // final : 요청을 처리해줄 객체는 하나만 고정하겠다  (사용자마다 하나의 객체를 사용한다)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("===== 회원 관리 프로그램 =====");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 정보 수정");
            System.out.println("5. 회원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴를 선택해 주세요: ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    ms.findAllMembers();
                    break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 9:
                    System.out.println("회원관리 프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다");
            }
        }
    }
}
