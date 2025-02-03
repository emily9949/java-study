package com.sumin.section08.uses;

public class Member {
    private int num;
    private String id;
    private String name;
    private String pwd;
    private int age;
    private char gender;

    public Member() {
    }

    public Member(int num, String id, String name, String pwd, int age, char gender) {
        this.num = num;
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.gender = gender;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Member{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
