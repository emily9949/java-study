package com.sumin.section01.method;

public class Application2 {
    public static void main(String[] args) {

        System.out.println("main() 시작됨...");

        /* 설명. non-static 메소드인 경우 메소드를 new 연산자로 인지시켜 호출할 수 있다 */
        Application2 app = new Application2(); // 클래스 내부의 non-static 함수들도 모두 사용할 수 있음. static을 사용하지 않아도 된다
        app.methodA();                         // . 은 접근 연산자이다
        app.methodB();

        System.out.println("main() 종료됨...");
    }

    public void methodA() {
        System.out.println("methodA() 시작됨...");
        System.out.println("methodA() 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB() 시작됨...");
        System.out.println("methodB() 종료됨...");
    }
}
