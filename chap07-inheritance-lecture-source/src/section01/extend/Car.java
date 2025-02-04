package section01.extend;

public class Car /*extends Object*/{

    private boolean runingStatus;

    public Car() {
        super(); // 모든 클래스는 Object 클래스를 상속받는다
        System.out.println("부모 클래스의 기본 생성자 호출됨..");
    }

    public void soundHorn() {
        if (runingStatus) System.out.println("빵! 빵!");
        else System.out.println("주행중이 아니라면 경적을 울릴 수 없습니다");
    }

    public void run() {
        runingStatus = true;
        System.out.println("자동차가 달리기 시작합니다");
    }

    public void stop() {
        runingStatus = false;
        System.out.println("자동차가 멈춥니다!!");
    }

}
