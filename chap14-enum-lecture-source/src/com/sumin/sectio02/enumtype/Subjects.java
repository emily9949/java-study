package com.sumin.sectio02.enumtype;

public enum Subjects {
    /* 설명. 만들어진 5개가 모두 객체임. 내부적으로 new 생성자를 활용해서 싱글톤 객체가 만들어짐 */
    JAVA,
    MARIADB,
    JDBC,
    MYSQL,
    HTML;

    Subjects() {
        System.out.println("기본 생성자 실행됨... ");
    }

    @Override
    public String toString() {
        return "@@@@" + this.name() + "@@@@";
        // this.name() 은 호출된 객체 (예제에서는 Java.name() 과 동일)
    }
}
