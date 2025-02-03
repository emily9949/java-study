package com.sumin.section04.constructor;

public class User {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate; // java.util.Date 는 import 하지 않고 쓰기도한다. (코드 인지를 위해)

    /* 설명. 기본 생성자(매개변수가 없는)를 활용한 객체 생성.
        컴파일 시 자동으로 포함되어 있으나, 반드시 명시적으로 쓰는게 좋다!  */
    public User() {
        System.out.println("기본 생성자 호출");
    }

    /* 설명. 객체가 생성될 때 원하는 필드를 초기화 하기 위해, 매개변수 있는 생성자를 활용해 객체를 생성할 수 있다. */
    public User(String id, String pwd, String name) {
        /* 설명. 생성자 안에서의 this.은 이 생성자로 만들어질 객체에 접근하는 것이다
        *   생성자 안에서는 this 를 생략하지 않는다. */

        System.out.println("매개변수 있는 생성자 호출 ");

        this.id = id;
        this.name = name;
        this.pwd = pwd;

    }

    public User(String id, String pwd, String name, java.util.Date enrollDate) {
        // this.id = id;
        // this.pwd = pwd;
        // this.name = name;

        /* 설명. this()를 통해 다른 생성자를 활용하여 코드의 길이를 줄일 수 있다
        *  설명. this()는 항상 첫 줄에 작성되어야 한다. 2개 이상 작성할 수 없다. (다른 생성자를 한 번만 참조할 수 있다)*/
        this(id, pwd, name); // 기존에 생성된 생성자를 활용해서 코드의 길이를 줄일 수 있다.
        this.enrollDate = enrollDate;
    }

    public String information() {
        // this. 이 생략되어 있음. 함수를 호출한 객체의 id, pwd .. 를 의미함
        return "id: " + id + ", pwd: " + this.pwd + ", name: " + this.name
                + ", enrollDate: " + this.enrollDate;
    }
}
