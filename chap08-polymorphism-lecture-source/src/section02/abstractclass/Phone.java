package section02.abstractclass;

public class Phone extends Product{
    public Phone() {
        // super();  생략. 부모의 생성자를 먼저 생성하고 난 이후 자식의 기본 생성자를 생성한다.
    }

    /* 설명. 부모가 추상 클래스일 경우, 자식 클래스는 최소 1개이상의 추상 메소드를 오버라이딩 해야됨. (자식클래스에게 규약을 부여하는 것) */
    @Override
    public void abstractMethod() {
        System.out.println("안 빼먹고 오버라이딩 했다");
    }

}
