package com.sumin.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHp(int hp) {
        /* 설명. // this 는 해당 메소드를 호출한 객체를 의미함.*/
        if(hp >= 0) this.hp = hp;
        else this.hp = 0;
    }
}
