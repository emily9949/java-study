package section01.extend;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 상속에 대해 이해할 수 있다. */

        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.run();
        car.soundHorn();

        System.out.println();

        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();

    }
}
