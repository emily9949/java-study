package com.sumin.section04.testapp.run;

import com.sumin.section04.testapp.aggregate.BloodType;
import com.sumin.section04.testapp.aggregate.Member;
import com.sumin.section04.testapp.service.MemberService;

import java.util.Scanner;

public class Application {

    /* 설명. 프로그램 키자마자
        1. MemberRepository 가 실행됨
        2. MemberService() 가 실행됨
        3. Application 의 ms 변수가 초기화됨 */
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
            System.out.print("메뉴를 선택해 주세요: ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    ms.findAllMembers();
                    break;
                case 2:
                    ms.findMemberBy(chooseMemNo());
                    break;
                case 3:
                    ms.registMember(signUp());
                    break;
                case 4:
                    Member selected = ms.findMemberForMod(chooseMemNo());
                    if (selected == null) continue; // 예외처리 기능. 건너뛰고 while 처음으로 돌아간다.
                    ms.modifyMember(reform(selected));
                    break;
                case 5:
                    ms.removeMember(chooseMemNo());
                    break;
                case 9:
                    System.out.println("회원관리 프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("번호를 잘못 입력하셨습니다");
            }
        }
    }

    /* 설명. 회원 수정 페이지 */
    private static Member reform(Member modifyMember) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==== 회원 정보 수정 서브 메뉴 ==== ");
            System.out.println("1. 패스워드");
            System.out.println("2. 나이");
            System.out.println("3. 취미");
            System.out.println("4. 혈액형");
            System.out.println("9. 메인 메뉴로 돌아가기");
            System.out.print("내용을 선택하세요: ");
            int chooseNo = sc.nextInt();
            sc.nextLine(); // 버퍼의 개행 제거용
            switch (chooseNo) {
                case 1:
                    System.out.print("수정 할 패스워드를 입력하세요: ");
                    modifyMember.setPwd(sc.nextLine());
                    break;
                case 2:
                    System.out.print("수정 할 나이를 입력하세요: ");
                    modifyMember.setAge(sc.nextInt());
                    break;
                case 3:
                    System.out.print("수정할 취미를 입력하세요: ");
                    modifyMember.setHobbies(resetHobbies());  // 배열은 단순 Scanner 로 입력 X
                    break;
                case 4:
                    System.out.print("수정 할 혈액형을 입력하세요: ");
                    modifyMember.setBloodType(resetBloodType()); // enum 은 단순 Scanner 로 입력 X
                    break;
                case 9:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return modifyMember;
                default:
                    System.out.println("번호를 다시 제대로 입력해주세요");
            }
        }
    }

    private static BloodType resetBloodType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정 할 혈액형을 입력하세요: (A, B, O, AB) ");
        String bloodType = sc.nextLine();
        BloodType bt = null;
        switch (bloodType) {
            case "A": bt = BloodType.A; break;
            case "B": bt = BloodType.B; break;
            case "O": bt = BloodType.O; break;
            case "AB": bt = BloodType.AB; break;
        }
        return bt;
    }

    // 수정할 때는 취미 갯수가 달라질 수 있으니까 새로운 배열 생성
    private static String[] resetHobbies() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 취미의 갯수를 입력하세요(1개 이상): ");
        int length = sc.nextInt();
        sc.nextLine();

        String[] hobbies = new String[length];
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print((i+1) + "번째 취미를 입력하세요: ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }
        return hobbies;
    }

    private static Member signUp() {
        Member member = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요: ");

        String id = sc.nextLine();

        System.out.print("패스워드를 입력하세요: ");
        String pwd = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("입력할 취미의 갯수를 입력하세요(숫자는 1이상): ");
        int length = sc.nextInt();
        sc.nextLine(); // 버퍼에 남은 엔터 제거용

        String[] hobbies = new String[length];
        for (int i = 0; i < hobbies.length; i++) {
            System.out.print((i+1) + "번 째 취미를 입력하세요: ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }

        // 사용자의 입력을 enum 타입으로 바꾸어주어야함
        System.out.print("혈액형을 입력하세요(A, AB, B, O): ");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch (bloodType) {
            case "A": bt = BloodType.A; break;
            case "B": bt = BloodType.B; break;
            case "AB": bt = BloodType.AB; break;
            case "O": bt = BloodType.O; break;
        }

        member = new Member(id, pwd, age, hobbies, bt);
        return member;
    }

    /* 설명. 회원 번호를 입력 받아 int로 반환하는 메소드 */
    private static int chooseMemNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 번호를 입력하세요: ");
        return sc.nextInt();
    }
}
