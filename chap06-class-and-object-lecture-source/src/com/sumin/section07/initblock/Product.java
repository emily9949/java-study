package com.sumin.section07.initblock;

public class Product {
    // 필드
    private String name = "아이폰";
    private int price;
    private static String brand; // 제조사


    // initblock 사용.
    /* 설명. 초기화 블록은 생성자 이전에 실행되며 어떤 생성자로 객체를 생성하든 공통적인 로직이 있다면 작성 */

    /* 설명. 인스턴스 초기화 블록 */
    {
        System.out.println("초기화 블록 실행...");
        price = 170;
        brand = "삼성";
    }

    /* 설명. static 초기화 블록 (인스턴스 블록보다 먼저 실행) */
    static
    {
       // price = 200;  static 초기화 블록에서는 인스턴스 변수에 접근이 불가능하다.
        Product.brand = "엘쥐";
    }

    // 생성자가 name 을 덮어씌움. 생성자까지 코드가 실행되어야 객체가 생성됨.
    public Product() {
        System.out.println("기본 생성자 호출");
        name = "샤오미";
    }

    // 메소드
    // ' 를 출력하고 싶을때는 \' 를 대신 쓴다.
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + Product.brand + '\'' +
                '}';
    }
}
