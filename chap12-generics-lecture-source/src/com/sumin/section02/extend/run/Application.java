package com.sumin.section02.extend.run;

import com.sumin.section02.extend.vo.*;


public class Application {
    public static void main(String[] args) {

        /* 수업목표. 제네릭 클래스를 좀 더 활용하는 예제를 이해할 수 있다 */

//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<>();

        /* 설명. <T extends Rabbit> 에 의해 Rabbit 및 하위 타입으로만 제네릭 객체 생성 가능 */
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>(); // Rabbit/Bunny/DrunkenBunny 다 가능
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>(); // Bunny만 가능
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>(); // DrunkenBunny만 가능

        farm4.setRabbit(new Rabbit());
        farm4.getRabbit().cry();
        farm4.setRabbit(new Bunny()); // Bunny 가 자식 클래스이기 때문에 RabbitFarm<Rabbit>에 들어갈 수 있다
        farm4.getRabbit().cry(); // 동적 바인딩 실행

//      farm5.setRabbit(new Rabbit());   -> 컴파일 에러 발생
        farm5.setRabbit(new Bunny());
        farm5.getRabbit().cry();


    }
}
