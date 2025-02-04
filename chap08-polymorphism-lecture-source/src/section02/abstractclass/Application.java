package section02.abstractclass;

public class Application {
    public static void main(String[] args) {
        // Product p = new Product(); -> 추상 클래스의 객체를 생성할 수 없다.

        Phone smartPhone = new Phone(); // 부모 역할으로 객체를 담을 수는 있다
        smartPhone.abstractMethod();

        Product smartPhone2 = new Phone();  // 다형성 적용은 가능
        smartPhone2.abstractMethod();
    }
}
