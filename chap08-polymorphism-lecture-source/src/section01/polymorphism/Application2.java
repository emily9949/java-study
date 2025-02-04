package section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 객체 배열을 만들어 다양한 인스턴스들을 연속 처리할 수 있다. */

        // 배열에 담을 때는 어쩔수 없이 반복문을 사용하지 않고 담아줘야함
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Tiger();
        animals[3] = new Rabbit();
        animals[4] = new Tiger();

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }

        for(Animal an : animals) {
            an.cry();
            // 각 동물의 메소드를 출력하고 싶을 때
            if (an instanceof Tiger) {
                ((Tiger) an).bite();
            }

            if (an instanceof Rabbit) {
                ((Rabbit) an).jump();
            }
        }
    }
}
