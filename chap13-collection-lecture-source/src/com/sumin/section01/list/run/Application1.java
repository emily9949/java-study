package com.sumin.section01.list.run;

import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 컬렉션 프레임워크에 대해 이해할 수 있다 (list 부터) */
        /* 설명. 모든 컬렉션은 제네릭 타입이면 다이아몬드 연산자(<>)를 생략하면 <Object>인 상태이다. */
//       ArrayList list = new ArrayList(); -> 제네릭 <> 을 지정하지 않았기 때문에, Object 로 적용된다
//       List<Object> list = new ArrayList<>(); // List 계열은 다형성 적용 가능
        List list = new ArrayList<>(); // 제네릭 타입에서 <> 를 안적어주면 Object 로 적용된다. 모든 타입을 받을 수 있음.

        // 제네릭 타입으로 여러 형태의 자료형을 받아오고 있음
        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(new java.util.Date());

        /* 설명. 모든 컬렉션은 toString()이 잘 오버라이딩 되어 쉽게 출력해 볼 수 있다. */
        System.out.println("list = " + list);

        System.out.println("첫 번째 값: " + list.get(0));
        System.out.println("첫 번째 값: " + list.get(1));
        System.out.println("list에 담긴 데이터의 크기: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /* 설명.
        *   배열보다 ArrayList가 좋은 점
        *   1. 미리 크기를 할당할 필요가 없다
        *   2. 들어있는 값의 갯수를 잘 파악할 수 있다 (size())
        *   3. 경우에 따라 (제네릭 타입을 생략하면) 다양한 값을 한번에 저장할 수 있다.
        *   4. 중간에 값을 추가 및 삭제가 용이하다.
        * */

        /* 설명. 2번째 위치에 10을 끼워넣기 */
        list.add(1,10);
        System.out.println("list = " + list);

        list.add(10);
        System.out.println("list = " + list);

        /* 설명. 원하는 위치의 값 수정 */
        list.set(0, "banana");
        System.out.println("list = " + list);

        /* 설명. 원하는 위치의 값 제거 (이후 요소들의 위치가 영향을 받음) */
        list.remove(0);
        System.out.println("list = " + list);

        /* 추가로, 컬렉션 대신 배열로 한번 중간에 값 추가 연습해보기 */
        int[] intArr = new int[5];
        int num = 0;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = ++num;
        }

        /* 설명. 2번째 위치에 7을 추가해 (기존 배열 크기 +1)이 되는 코드 작성 [1,7,2,3,4,5]*/
        int[] newIntArr = new int[intArr.length + 1];
        System.arraycopy(intArr, 1, newIntArr, 2, 4);


    }
}
