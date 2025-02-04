package section01.object.run;

import section01.object.dto.BookDTO;

public class Application1 {
    public static void main(String[] args) {
        // 다른 주소에 생성된 두 객체
        BookDTO book1 = new BookDTO(1, "홍길동전", "허균", 50000);
        BookDTO book2 = new BookDTO(2, "홍길동전", "허균", 50000);

        // 동일 비교(주소값이 같냐?) -> false 값이 나옴
        System.out.println("두 인스턴스를 == 연산자로 비교: " + (book1 == book2));

        // 동등 비교 (필드값이 같으면 동등하다고 판단), BookDTO 에서 equals() 함수를 재정의 해놓았음.
        System.out.println("두 인스턴스를 equals() 메소드로 비교: " + book1.equals(book2));
        System.out.println("book1의 hashCode: " + book1.hashCode()); // hashCode를 오버라이딩 해서 수정했기 때문에 같은 값이 나옴
        System.out.println("book2의 hashCode: " + book2.hashCode());



    }
}
