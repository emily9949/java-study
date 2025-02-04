package section03.interfaceImplements;

/* 설명. 인터페이스끼리는 다중 상속이 가능하다. implements 대신 extends 를 써야한다. */
public interface InterProduct extends ParentInterProduct, AnotherParentInterProduct {
    /*public static final 가 항상 고정되어있어서 안적어도 무방함*/
    int MAX_NUM = 100; // 상품이 최대 100개만 저장 가능하고 변동 없이 이 값을 활용해라

    /* 설명. 인터페이스는 생성자를 가질 수 없다 (feat. 객체를 만들 수 없다.) */
    // public InterProduct() {}

    /* public abstract 는 생략 가능 */
    // public abstract void nonStaticMethod();
    void nonStaticMethod(); // 이렇게도 사용 가능함.


    /* 설명. 메소드에 바디를 넣는다는 건 규약이 아닌 것. 구현 받는 자식 클래스에서 반드시 오버라이딩 할 필요 없는 메소드이기 때문이다. */
    /* 설명. static 메소드를 사용하면 메소드의 바디부까지 작성이 가능하다 (JDK 1.8 부터 추가) */
    public static void staticMethod() {

    }

    /* 설명. non-static 메소드도 default 키워드를 사용하면 메소드의 바디부까지 작성이 가능하다 (JDk 1.8 부터 추가)*/
    public default void defaultMethod() {

    }

    /* 설명. 접근 제어자가 private인 메소드는 메소드의 바디부까지 작성이 가능하다. (feat. default도 없이) */
    private void privateMethod() {

    }
}
