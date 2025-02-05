package section01.polymorphism;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        Animal an1 = new Animal(); // 같은 타입이기 때문에, 다형성이 아님
        Animal an2 = new Tiger();  // 다형성. Tiger 객체를 생성하고, 이를 Animal 타입의 변수에 넣음. tiger 객체를 animal 타입으로 참조.
        Animal an3 = new Rabbit(); // 다형성

        /* 설명. Animal은 Tiger나 Rabbit이 아니다 (두 타입을 지니고 있지 않다)*/
        // Tiger t1 = new Animal(); -> 다형성이 아님. 불가능.


        /* 설명. 동적 바인딩 확인하기
        *   컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가 (정적 바인딩)
        *   런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩 되어 바뀌어 동작하는 것을 의미힌다.
        *   (동적 바인딩의 조건 : 상속, 다형성, 오버라이딩)
        * */

        /* 설명. 오버라이딩이기 때문에 동적 바인딩이 일어남*/
        an1.cry();
        an2.cry();

        /* 설명. 오버라이딩이 아니기 때문에 동적 바인딩이 안 일어남 */
        //an2.bite(); // Animal 클래스로 인지하기 때문에 Tiger 클래스의 bite() 는 실행이 안됨
        an3.cry();

        /* 설명. 부모타입을 강제로 자식 타입으로 형변환 하는 것이 가능하다 (단, 조심해야 한다.) */
        ((Tiger)an2).bite(); // 자식 타입으로 형변환 하면 bite() 메소드 실행 가능

        // ((Rabbit)an2).jump(); // 코드에서는 에러가 안나는데, 런타임 시점에서는 에러가 난다. 컴파일 시점에는 Animal 타입이면 Rabbit으로 객체를 만들 수 있다고 생각하기 때문

        /* 설명. instanceof 란?
            해당 객체의 타입을 런타임 시점에 확인하기 위한 연산자
            사용하면 안전하게 타입을 형변환해서 사용할 수 있다.
        */
        if (an2 instanceof Tiger) {
            ((Tiger)an2).bite();
        }

        if (an3 instanceof Rabbit) {
            ((Rabbit)an3).jump();
        }

        if(an3 instanceof Animal) {
            System.out.println("Animal 은 맞지");
        }

        Animal anmial2 = new Tiger(); // 다형성을 적용, 자동 형변환 (auto up-casting), 묵시적 형변환
        Rabbit rabbit2 = (Rabbit)an3; // 다형성 적용 X, 강제 형변환 (down-casting), 명시적 형변환
    }
}
