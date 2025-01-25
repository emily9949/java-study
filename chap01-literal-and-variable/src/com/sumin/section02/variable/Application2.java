package com.sumin.section02.variable;

public class Application2 {

    public static void main(String[] args) {
        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다 (feat. 자료형(type)*/

        /* 목차. 1. 정수를 취급하는 자료형*/
        byte bNum;           //1byte
        short sNum;          //2byte
        int iNum;            //4byte
        long lNum;           //8byte

        /* 목차. 2. 실수를 취급하는 자료형*/
        float fNum;          //4byte
        double dNum;         //8byte

        /* 목차. 3. 문자를 취급하는 자료형*/
        char ch;             //2byte

        /* 목차. 4. 논리값를 취급하는 자료형*/
        boolean isTrue;      //1byte (긍정의문은 형태의 변수명 사용할 것)

        /* 목차. 5. 문자열를 취급하는 자료형*/
        String str;

        /* 설명. 각 변수에 값 대입해 보기*/
        bNum = 1;
        sNum = 1;
        iNum = 1;
        lNum = 2200000000L; // 자바는 정수를 Int 로 받아들이기 때문에 long형을 사용하려면 끝에 L을 붙여줘야한다 (21억 5천만이 넘으면)

        fNum = 3.14f;       // 자바는 실수를 double 형으로 인지함. float형을 사용하려면 끝에 f를 붙여야한다.
        dNum = -3.14;

        ch = 'a';
        ch = 97;            // char는 숫자를 담을 수 있는데 양수만 가능하다 (아스키 코드, 유니코드 체계에는 음수가 없다)

        isTrue = true;
        
        /* 설명. 변수를 활용한 합계(sum), 평균(avg) 출력해 보기*/
        int kor = 90;
        int math = 80;
        int eng = 75;
        
        int sum = kor + math + eng;
        System.out.println("합계: " + sum);
        
        double avg = sum / 3.0;             // 연산 시 소수점을 살리고 싶으면 최소 하나는 실수형으로 계산하자
        System.out.println("avg = " + avg);

        double avg2 = sum / 3;               //자료의 손실이 일어남
        System.out.println("avg = " + avg2);
    }
}
