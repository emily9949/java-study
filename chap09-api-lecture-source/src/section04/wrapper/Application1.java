package section04.wrapper;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Wrapper 클래스에 대해 이해할 수 있다. */
        int intValue = 20;

        /* 설명. 기본자료형을 Wrapper 클래스 자료형으로 변환할 수 있다 (박싱, boxing) */
        Integer autoBoxingInt = 20;   // 오토 박싱 (auto-boxing)
        Integer boxingInt2 = Integer.valueOf(intValue); // 불필요한 박싱.
        // Integer는 java.lang 패키지의 클래스이기 때문에 import가 자동으로됨.

        /* 설명. Wrapper 클래스 자료형을 기본자료형으로 변환할 수 있다 (언박싱, unboxing) */
        int autoUnboxingInt = autoBoxingInt;
        int unboxingInt2 = boxingInt2.intValue(); // 불필요한 언박싱. 위에처럼 코드 작성하면 됨.

        anythingMethod(20);

        /* 설명. Wrapper 클래스 주소값 비교 */
        Integer integerTest = 30;
        Integer integerTest2 = 30;
        System.out.println("== 비교: " + (integerTest == integerTest2));
        System.out.println("equals 비교: " + integerTest.equals(integerTest2));
        System.out.println("integerTest 주소: " + System.identityHashCode(integerTest));

        /* 설명. 모든 Wrapper 클래스들도 constant pool을 활용해 동등 객체는 하나만(동일 인스턴스로) 저장한다 */
        System.out.println("integerTest2 주소: " + System.identityHashCode(integerTest2));

    }

    /* 설명. int 20 의 값을 주소값으로도 담으려면 Integer 객체를 생성해야함. int 를 Integer에 담는 것을 오토박싱이라함.*/
    private static void anythingMethod(Object obj) {
        /* 설명. int-> Integer(오토박싱) -> Object (다형성) */
        /* 설명. 출력 -> Object의 toString()에서 Integer의 toString() 동적 바인딩이 실행됨 */
        System.out.println("obj: " + obj.toString()); // 실행되는 toString 이 매번 다른 객체에서 실행됨.
    }
}
