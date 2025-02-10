package com.sumin.section02.set.run;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. TreeSet에 대해 이해하고 활용할 수 있다 */
        /* 설명. Tree 구조를 활용해 중복 제거 + 정렬을 해준다 */
        Set<String> tSet = new TreeSet<>();
        tSet.add("ramen");
        tSet.add("pork");
        tSet.add("beef");
        tSet.add("chicken");
        tSet.add("french fries");
        tSet.add("rice");

        System.out.println("tSet: " + tSet);
        // tSet: [beef, chicken, french fries, pork, ramen, rice]

        /* 설명.
        *   로또 번호 발생기 (feat. 보너스 번호 추출 제외)
        *   1부터 45까지 중복되지 않고 오름차순 정렬된 6개의 값 추출하기
        *  */
        Set<Integer> lotto = new TreeSet<>(); // Integer 는 이미 오름차순으로 정렬이 되어있음 (comparable)

        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1); // 1부터 45까지의 난수 발생
        }
        System.out.println("lotto: " + lotto);

        /* 설명. 배열을 활용한 TressSet 과 같은 기능 (정렬 제외) 을 하는 알고리즘 구현해 보기 */
        int[] arr = new int[6];

        
        // for (배열을 순회하는 동안) 난수 생성 
        // for (배열을 다시 순회) 하면서 if (해당 인덱스의 배열 값 == 다른 인덱스의 배열 값) 
        // 해당 인덱스의 배열 값을 새로운 난수 값으로 대체. (i-- 로 인덱스 되돌아감)
        //
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random() * 45) + 1); // 난수 생성
           
            /* 설명. 이전 생성된 값들과 비교 */
            i = duplicateValidation(i, arr);
        }

        System.out.println("arr: " + Arrays.toString(arr));
    }

    private static int duplicateValidation(int current, int[] arr) {
        for (int j = 0; j < current; j++) { // i+1 부터 순회
            if (arr[current] == arr[j]) {
                current--;
                break;
            }
        }
        return current;
    }
}
