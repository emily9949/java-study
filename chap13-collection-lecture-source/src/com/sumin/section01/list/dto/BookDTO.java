package com.sumin.section01.list.dto;

public class BookDTO implements Comparable<BookDTO> {
    private int number;
    private String title;
    private String author;
    private int price;

    public BookDTO() {
    }

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    /* 설명. comparTo는 메소드를 호출한 객체(A) 와 매개변수로 넘어온 객체(B) 를 비교한다 */
    /* 설명. comparTo는 객체 비교 알고리즘이 내부적으로 작동함. */

    /* 설명.
    *   우리가 원하는 필드의 오름차순 또는 내림차순을 할 수 있다 (오로지 한가지 기준에 대해 정렬할 수 있다)
    *   필드가 n개면 총 (n*2)가지의 정렬 기준을 가질 수 있다 (각각 ASC 또는 DESC)
    *   정렬은 comparTo() 메소드가 반환하는 int 형의 부호에 따라 정해지게 되므로 오름차순과 내림차순은
    *   부호만 달리 되도록 하면 된다
    *   (해당 필드가 String 형일 경우는 String 에 정의된 comparTo() 메소드를 활용한다)
    * */
    @Override
    public int compareTo(BookDTO o) {
        /* 설명. 가격에 대한 오름차순 */
        return this.price - o.price; // 두 객체 비교는 차이(-) 로 비교. 음수면 뒤집고, 양수면 그대로 간다.

        /* 설명. 가격에 대한 내림차순 */
//        return - (this.price - o.price);
//        return o.price - this.price;

        /* 설명. 책 제목에 대한 오름차순 */
//        return this.title.compareTo(o.title);

        /* 설명. 책 제목에 대한 내림차순 */
//        return o.title.compareTo(this.title);

    }
}
