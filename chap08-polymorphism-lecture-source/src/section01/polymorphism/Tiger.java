package section01.polymorphism;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어 먹습니다");
    }

    @Override
    public void run() {
        super.run(); // 부모타입의 메소드를 호출하는 코드. 안해도 됨.
        System.out.println("호랑이는 웬만해선 달리지 않습니다 ");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다 ");
    }

    public void bite() {
        System.out.println("호랑이가 물어 뜯습니다");
    }
}
