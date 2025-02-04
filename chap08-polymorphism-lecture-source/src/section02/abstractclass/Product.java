package section02.abstractclass;

/* 설명. 추상 클래스로 생성하면 객체를 생성하지 못함. */
public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public Product() {
    }

    public void nonStaticMethod() {
    }

    public void staticMethod() {

    }

    /* 설명. 불완전 메소드를 생성하려면 클래스도 추상 클래스여야함.*/
    /* 설명. 추상 메소드가 하나라도 있다면 해당 클래스는 추상 클래스가 되어야 한다. */
    public abstract void abstractMethod() ; // 메소드의 헤더부만 존재. {} 를 넣으려고 하면 오류가 난다. 자식 클래스에서 재정의하면 됨.
}
