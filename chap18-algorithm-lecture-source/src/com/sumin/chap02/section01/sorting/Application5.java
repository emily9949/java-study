package com.sumin.chap02.section01.sorting;

/* 수업목표. 병합 정렬을 이해할 수 있다. */
public class Application5 {
    public static void solution(int low, int high, int[] arr) {
        int[] temp;

        if(high - low == 0) return; // 한 칸이면

        int median = low + (high - low) / 2;
        solution(low, median, arr);
        solution(median + 1, high, arr);

        /* 설명. 하나의 엘리먼트 단위로 다 분할하고 나서 이제 값을 정복(정렬해서 합한다) 한다. */
        temp = arr.clone();

        /* 설명. 분할 정복 방식으로 작은 값부터 값을 쌓음 */
        int k = low;
        int index1 = low;
        int index2 = median + 1;


        /* 설명. 좌측 인덱스가 남았을 때(마저 옮기기) */
        while(index1 <= median) {
            arr[k] = temp[index1];
            k++;
            index1++;
        }

        /* 설명. 우측 인덱스가 남았을 때(마저 옮기기) */
        while(index2 <= high) {
            arr[k] = temp[index2];
            k++;
            index2++;
        }
    }
}
