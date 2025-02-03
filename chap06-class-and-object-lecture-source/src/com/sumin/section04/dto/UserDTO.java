package com.sumin.section04.dto;

import java.io.Serializable;
import java.util.Date;

/* 설명.
 *   자바빈 (Java Bean) 이란?
 *   JSP 에서 사용되는 표준 액션 태그로 접근할 수 있게 만든 자바 클래스형태이다.
 *   자바 코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법을
 *   의미하는데, 그 때 사용할 수 있도록 규칙을 지정해 놓은 java 클래스를 자바빈 (java bean) 이라고 부른다.
 *   지금은 특정 목적 및 프레임워크를 위해 클래스를 작성하는 규칙이라고 보면 된다.
 * */

/* 설명. 자바빈 작성 규칙
*   1. 자바빈은 특정 패키지에 속해 있어야 함(default 패키지 사용 금지)
*   2. 필드의 접근 제어자는 private 로 선언해야 함 (캡슐화 적용)
*   3. 기본 생성자가 명시적으로 존재해야 한다 (매개변수 있는 생성자는 선택사항)
*   4. 모든 필드에 접근 가능한 설정자(setter) 와 접근자(getter)가 public 으로 작성되어 있어야 함
*   5. 직렬화 (Serializable 구현)을 고려해야 한다. (선택사항) */
public class UserDTO /*implements Serializable*/ {

    private String id;
    private String name;
    private String pwd;
    private java.util.Date enrollDate;

    // 기본 생성자는 반드시 있어야함
    public UserDTO() {

    }

    public UserDTO(String id, String name, String pwd, java.util.Date enrollDate) {

    }

    // setter, getter  등 명령 규칙이 있음. 특정 프레임워크를 위해 작성하는 것임.
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Override
    public String toString() {
        return "UserDTO [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
    }
}
