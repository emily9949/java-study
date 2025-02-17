package com.sumin.section02.enumtype;

// 왜 생성자가 여러번 호출되는지???
public class Application {
    public static void main(String[] args) {
//        Subjects subject = new Subjects();  우리가 enum 타입의 생성자를 직접 사용 X
        Subjects subject1 = Subjects.JAVA; // JAVA 형 객체가 들어있음.
        // 호출 시 enum 안 필드의 모든 객체가 자동 생성된다 (중복 생성되지 않음. 싱글톤 개념)
        Subjects subject2 = Subjects.HTML; // 이미 만들어진 객체의 참조
        Subjects subject3 = Subjects.JAVA;

        /* 설명.
        *   1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 각각 한 개임을 보장한다.
        *      작성한 순서에 따라 각각은 다른 인스턴스가 생성되며 최초 호출 시에 enum 의 생성자를 활용해
        *      생성된다. (lazy singleton 개념) 
        *
        *   설명.
        *    2. 단일 인스턴스를 보장하기에 == 비교가 가능하다 (동일 객체 비교)
        * */


        if(subject1 == subject2) {} // 서로 다른 객체이다
        if (subject1 == subject3) { // 서로 같은 객체이기 때문 (싱글톤 객체이므로)
            // equals() 함수를 굳이 쓰지 않아도 됨.
            System.out.println("두 과목은 같은 과목이다. ");
        } else {
            System.out.println("서로 다른 과목이다. ");
        }

        /* 설명. 3. 상수 필드명을 문자열로 변경하기 쉽다. */
        System.out.println(Subjects.JAVA.toString()); // 우리가 재정의해서 쓸 수 있다.
        System.out.println(Subjects.JAVA.name());

        /* 설명. 4. values() 를 이용하면 상수값 배열을 반환받고 이를 활용하여 연속처리해 줄 수 있다.
        *       (상수필드들에 주입된 객체들을 순회할 수 있다.)
        *  */
        Subjects[] subjects = Subjects.values();

        System.out.println(subjects[0].name());
        for(Subjects sub : subjects) {
            System.out.println(sub.toString()); // 나중에 문자열로 DB 에 보낸다
            System.out.println(sub.ordinal()); // 나중에 순서로 DB에 보낸다
            System.out.println(sub.name()); // 나중에 이름으로 DB 에 보낸다
            System.out.println(sub);
            // enum 에 선언된 상수들의 순서를 인덱스 체계로 추출. (클래스 + 배열 느낌)
        }

        /* 설명. 5. 타입 안정성을 보장한다. */
        printSubjects(Subjects.JAVA);
//        printSubjects(0); -> Subjects 타입이 아니면 전달할 수 없다.
    }

    private static void printSubjects(Subjects subjects) {
    }
}
