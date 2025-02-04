package section03.interfaceImplements;

import java.io.Serializable;

/* 설명. 인터페이스는 여러개의 타입을 구현할 수 있음 */
public class Product implements InterProduct, Serializable {

    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩 메소드...");
    }


}
