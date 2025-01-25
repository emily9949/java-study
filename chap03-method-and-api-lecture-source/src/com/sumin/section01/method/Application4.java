package com.sumin.section01.method;

public class Application4 {
    public static void main(String[] args) {

    /* 수업목표. 여러 개의 전달인자를 이용한 메소드 호출을 할 수 있다.*/
    Application4 app4 = new Application4();
    app4.testMethod("홍길동", 21, '남');

    String name = "유관순";
    int age = 20;
    char gender = '여';
    app4.testMethod(name, age, gender);
    }

    public void testMethod(String name, int age, final char gender) {    // 성별에는 상수를 사용했기 때문에 함수 내에서 대입이 일어날 수 없다.
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은"
                            + gender + "입니다");

    }

}
