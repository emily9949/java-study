package section05.calendar;

import java.text.SimpleDateFormat;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Date 클래스 사용법을 이해하고 활용할 수 있다. */
        java.util.Date today = new java.util.Date();   // 시스템의 현재 시간을 가진 객체 생성
        System.out.println("today= " + today); // Date 형의 toString으로 자동 출력

        System.out.println("long 타입 시간: " + today.getTime());
        System.out.println("long 타입 시간을 활용한 Date: " + new java.util.Date(0L));
        System.out.println("long 타입 시간을 활용한 Date2: " + new java.util.Date(today.getTime()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일");
        String todayFormat = sdf.format(today);
        System.out.println("todayFormat = " + todayFormat);

        /* 설명. java.util.Date -> java.sql.Date */
        java.util.Date today2 = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(today2.getTime()); // getTime() 을 쓰면 long 형이 된다. util.Date 형을 sql.Date 형에 넣음

        /* 설명. java.sql.Date -> java.util.Date */
        java.util.Date today3 = sqlDate; // sqlDate는 util.Date의 자식이기 때문에, 다형성이 적용된다. (부모 클래스로 자동 형변환)
    }
}
