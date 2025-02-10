package com.sumin.section01.list.run;

import com.sumin.section01.list.comparator.AscendingPrice;
import com.sumin.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. ArrayList 에서 관리되는 자료형의 정렬 기준을 이용할 수 있다. */
        /* 설명. 제네릭 클래스의 자료형은 기본 자료형을 넣을 수 없다. */
        /* 설명. booklist 는 현재 객체의 주소만을 가지고 있는 list 이다.  */
        List<BookDTO> booklist = new ArrayList<>();

        /* 설명. BookDTO 객체(필드4개)는 정렬의 기준이 8가지가 있다. */
        /* 목차. 1. Comparable 인터페이스 구현 방법 활용 */
        booklist.add(new BookDTO(1, "홍길동전", "허균", 50000));
        booklist.add(new BookDTO(2, "목민심서", "정약용", 45000));
        booklist.add(new BookDTO(3, "삼국사기", "김부식", 30000));
        booklist.add(new BookDTO(4, "동의보감", "허준", 40000));

        // compareTo 를 활용해 price 를 기준으로 정렬이 됨
        Collections.sort(booklist);
        Collections.sort(booklist, new AscendingPrice()); // AscendingPrice 객체를 기준으로 추가 정렬

        for (BookDTO bookDTO : booklist) {
            System.out.println(bookDTO);
        }

        for (int i = 0; i < booklist.size(); i++) { // 컬렉션은 size() 를 통해서 크기를 구함
            System.out.println(booklist.get(i));
        }
    }

}
