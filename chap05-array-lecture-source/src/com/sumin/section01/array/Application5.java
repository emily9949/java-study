package com.sumin.section01.array;

public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. 배열을 사용한 간단한 카드 뽑기 게임을 작성해보자 */
        String[] shape = {"SPADE", "HEART", "CLUB", "DIAMOND"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int randomShapeIndex = (int) (Math.random() * shape.length);
        int randomNumberIndex = (int) (Math.random() * numbers.length);


    }
}
