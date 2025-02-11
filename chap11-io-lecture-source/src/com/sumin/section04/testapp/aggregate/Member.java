package com.sumin.section04.testapp.aggregate;

import java.io.Serializable;
import java.util.Arrays;

public class Member implements Serializable { // 객체 입출력을 하기 위해 Serializable 구현
    private int memNo;  // 아이디
    private String id;  // 번호
    private String pwd; // 비번
    private int age; // 나이
    private String[] hobbies; // 취미들
    private BloodType bloodType; // 혈액형
    private AccountStatus accountStatus; // 활성화여부

    public Member() {
    }

    public Member(int memNo, String id, String pwd, int age, String[] hobbies, BloodType bloodType, AccountStatus accountStatus) {
        this.memNo = memNo;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.bloodType = bloodType;
        this.accountStatus = accountStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMemNo() {
        return memNo;
    }

    public void setMemNo(int memNo) {
        this.memNo = memNo;
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

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", memNo=" + memNo +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", bloodType=" + bloodType +
                ", accountStatus=" + accountStatus +
                '}';
    }
}
