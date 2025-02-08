package com.sumin.section01.generic;

import java.util.Date;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 제네릭(generic)에 대해 이해할 수 있다 */
        /* 설명.
         *    Object에서 꺼낼 때마다 어떤 자료형,타입인지 일일히 확인해서 다운캐스팅을 해야함.
         *    구현의 편리성은 챙겼으나 타입의 안정성이 낮고, 불안하다.
         *    그렇기 때문에 다양한 타입으로 변신이 가능한 제너릭을 쓰는 것 !
         *  */
        MyGenericTest mgt = new MyGenericTest();

        mgt.setValue("Hello World");
        mgt.setValue(1);
        mgt.setValue(3.14);
        mgt.setValue(new Date());

        // 3.14가 autoboxing 을 거쳐 Wrapper 클래스의 Double 객체가 됨
        // (MyGenericTest 에서 Object 객체로 받아오기 때문)
        System.out.println(mgt.getValue().toString());

        // Object 형을 Double 형으로 다운캐스팅. 다운캐스팅을 할 때 autounboxing 이 일어남.
        double dNum = (Double) mgt.getValue(); // 컴파일 에러가 아닌 런타임 에러가 발생하는 위험한 구문

        GenericTest<Integer> gt1 = new GenericTest<Integer>();
        gt1.getValue(); // <> 안의 참조자료형을 자동 반환하게 됨. 여기서는 Integer 타입으로 가져옴.
        gt1.setValue(1); // 타입의 안정성이 높다! <> 안에 참조자료형을 위반하지 않는다.

        /* 설명.
         *    제네릭 클래스는 다양한 자료형으로 변할 수 있어 클래스 하나만으로 활용가치가 높아진다 (구현의 편의성)
         *   매개변수나 반환형도 제네릭 타입으로 지정되어 명확히 해당 타입에 대해 처리할 수 있다 (타입의 안정성)
         * */
    }
}
