package com.sumin.chap01.section01.timecomplexity;

/* 수업목표. 시간복잡도를 이해할 수 있다. */
/* 설명. 알고리즘 실행 시 입력값이 증가함에 따라 연산이 걸리는 시간의 증가도를 나타낸다 */

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 1, 2, 15, 4, 9, 10, 7};
//        System.out.println(getFirst(arr));
        System.out.println(binarySearch(arr, 9));
        System.out.println(reverse(arr));
    }

    /* 설명. 상수 시간 0(1) */
    /* 설명.
    *   입력값의 크기와 상관 없이 항상 일정한 시간이 걸리는 알고리즘이다.
    * */
    private static int getFirst(int[] arr) {
        return arr[2];
    }

    /* 설명. 로그 시간 O(log n) */
    /* 설명.
    *   입력값이 증가함에 따라 처리 시간이 로그만큼 증가하는 알고리즘이다.
    *   이진 탐색은 매 단계마다 탐색 범위를 절반으로 줄이므로 매우 효율적이며 O(log n)에 해당한다.
    *   (단, 정렬이 선행 되어야 한다.)
    * */

    private static int binarySearch(int[] arr, int target) {
        /* 설명. 초기 세팅 (배열을 오름차순 정렬하고 시작) */
        Arrays.sort(arr); // 퀵 정렬로 (nlogn) 시간만큼이 소요된다 (지금 고려사항 X), 병합 정렬(logn)

        /* 설명. 배열의 처음과 끝을 지칭하는 위치(인덱스)를 담은 변수 두개(두 개의 포인터) */
//        int left = 0;
//        int right = arr.length - 1;

          int left = 0, right = arr.length - 1; // 같은 타입이면 한줄로 작성할 수도 있다.

          while (left <= right) {
              int mid = left + (right - left) / 2;
              if (arr[mid] == target) {
                  return mid; // 찾고자하는 값의 인덱스 위치를 반환
              } else if (arr[mid] < target) {
                  left = mid + 1;
              } else {
                  right = mid - 1;
              }
          }
          return -1; // 정답이 없을 경우
    }

    /* 설명. 선형 시간 O(n) */
    /* 설명. 입력값이 증가함에 따라 처리 시간이 선형적으로 증가하는 알고리즘이다.
    *   배열의 모든 요소를 한 번씩 순회해야 하므로 배열의 크기에 비례하는 시간이 필요하다.
    * */

    private static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        } // for 문을 두 번돌려도 O(2n) 이 아니라 O(n) 으로 표기한다.
        return reversed;
    }

    /* 설명. 지수 시간 O(2^n) */
    // 트리 구조로 작동한다.
    private static int fibonacci(int n) {
        if(n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
