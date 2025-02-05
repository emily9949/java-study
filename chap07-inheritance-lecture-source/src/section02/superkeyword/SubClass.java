package section02.superkeyword;

import section03.overriding.SuperClass;

public class SubClass extends SuperClass {

    /* 설명. 부모 메소드의 헤드부와 일치하게 오버라이딩 */

    @Override
    public void method(int num){

    }

    /* 설명. 메소드 이름 변경 (새로운 메소드를 생성한 셈) */
    // @Override
    public void method1(int num) {

    }

    /* 설명. 메소드의 반환형(리턴 타입) 변경*/
    // @Override
    //public String method(int num) {
    //
    //}

    /* 설명. 경우에 따라서는 메소드의 반환형을 달리 해도 오버라이딩이 된다
    *   (부모 메소드 리턴 타입(Object)의 자식 타입으로는 가능 -> 모든 타입은 Object 의 자식 타입이다.)
    * */

    @Override
    public String method2(int num) {
        // Object를 상속받는 String 클래스
        return null;
    }

    /* 설명. 부모 메소드가 private 이라면 오버라이딩 할 수 없다 */
    // @Override
    // private void privateMethod() {}

    /* 설명. final 메소드는 오버라이딩 불가 */
    // @Override
    // public final void finalMethod() {}

    /* 설명. 다른 패키지더라도 상속관계이므로 오버라이딩 성립 */
    @Override
    protected void protectedMethod() {}
    // public void protectedMethod() {} => 더 큰 범위로 접근 제어자를 바꾸는 건 성립

    /* 설명. default 접근자일 때, 다른 패키지가 되면 오버라이딩 불가 */
    // @Override
    // void defaultMethod() {}

}
