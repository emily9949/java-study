package com.sumin.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 값을 직접 연산하여 출력할 수 있다. */
        System.out.println("======= 정수와 정수의 연산 =======");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("======= 실수와 실수의 연산 =======");
        System.out.println(1.23 + 4.56);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0); // 프로그래밍 언어는 정확한 실수를 인지하지 못할 수도 있다. 근사한 값으로 계산

        System.out.println("======= 정수와 실수의 연산 =======");
        System.out.println(123 / 5);
        System.out.println(123 / 5.0); // 실수 값이 나오려면 최소 하나는 실수여야 한다.

        System.out.println("======= 문자와 정수의 연산 =======");
        System.out.println('a' + 1); // 문자는 숫자로 인식이 될 수 있다. 아스키 코드 변환.
        System.out.println('a' % 2);

        /* 설명. 문자열과 문자열의 연산은 '+' 만 가능하며 이어붙이기 효과가 발생한다*/
        System.out.println("======= 문자열과 문자열의 연산 =======");
        System.out.println("Hello" + "World");
        // System.out.println("Hello" - "World");

        /* 설명. 문자열과 다른 형태의 값을 더하면 문자열이 된다*/
        System.out.println("======= 문자열과 다른 형태의 값 연산 =======");
        System.out.println("Hello" + 123); // "Hello" + "123" => "Hello123"
        System.out.println("Hello" + true);
        System.out.println(123 + 1 + "hello" + 123.0 + 2); // 왼쪽에서부터 인식하기 때문에 이항식 계산 후 문자열을 이어붙인다
        System.out.println(123 + 1 + "hello" + (123.0 + 2));





    }
}
