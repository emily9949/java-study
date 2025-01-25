package com.sumin.section01.conditional;

public class Application {
    public static void main(String[] args) {

        A_if aClass = new A_if();

        /* 설명. 단독 if 문 흐름 확인용 메소드 호출 */
        //aClass.testSimpleIfStatement();

        /* 설명. 중첩 if 문 흐름 확인할 메소드 호출 */
        //aClass.testNestIfStatement();

        //B_ifElse bClass = new B_ifElse();

        /* 설명. 단독 If-else 문 흐름 확인할 메소드 호출 */
        //bClass.testSimpleIfElseStatement();

        /* 설명. 중첩 If-else 문 흐름 확인할 메소드 호출 */
        //bClass.testNestedIfElseStatement();

        C_ifElseIf cClass = new C_ifElseIf();

        /* 설명. 단순 if-else 문 흐름 확인할 메소드 호출*/
        //cClass.testSimpleIfElseIfStatment();

        /* 설명. 중첩 if-else 문 흐름 확인할 메소드 호출*/
        //cClass.testNestedIfElseIfStatement();

        /* 설명. Static 메소드로 switch 문 흐름 확인할 메소드 호출*/
        D_switch.testSimpleSwitchStatement();
    }
}
