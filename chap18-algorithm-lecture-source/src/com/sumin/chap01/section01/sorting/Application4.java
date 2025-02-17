package com.sumin.chap01.section01.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

/* 수업목표. 퀵 정렬을 이해할 수 있다 */
/* 설명.
*   퀵 정렬
*   기준값(pivot)을 선정해 해당 값보다 작은 데이터와 큰 데이터로 분류하는 것을 반복해서 정렬하는 것으로
*   병합 정렬 알고리즘과 함께 실제 정렬 알고리즘으로 많이 활용되고 있다.
*   시간 복잡도는 O(nlogn) 이다.
* */
public class Application4 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int length = Integer.parseInt(br.readLine());
            IntStream intStream = Arrays.stream(br.readLine().split(" "))
                                         .mapToInt(Integer::parseInt);
            int[] arr = intStream.toArray();

            solution(0, arr.length-1, arr);

            for(int i : arr) {
                System.out.print(i + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void solution(int low, int high, int[] arr) {
        if(low >= high) { // 한 칸이거나 low 개념의 포인터가 high 개념의 포인터를 지나쳤다면

        }

        /* 설명. process 하나가 끝나고 high 위치가 반환되면 그 위치를 자르기 위한 기준으로 보고 이분할 한다. */
        int pivot = process(low, high, arr);

        solution(low, pivot, arr);
        solution(pivot + 1, high, arr);
    }

    private static int process(int left, int right, int[] arr) {

        // do-while 문을 쓰기 위해 최초의 값만 고려하기 위한 개념 (제자리 걸음 구현)
        int lo = left-1;
        int hi = right+1;

        int pivot = arr[(left + right) / 2]; // 중앙 지점의 값

        while(true) {
            /* 설명. pivot 위치에 있는 값보다 큰 값을 가르키면 hi 포인터는 감소한다. */
            do {
                lo++;
            } while(arr[lo] < pivot); // pivot 보다 크거나 같을 때까지 증가

            do {
                hi--;
            }while(arr[hi] > pivot); // pivot 보다 작거나 같을 때까지 감소

            /* 설명. lo 포인터의 위치가 hi 포인터를 앞지르거나 같으면 hi 포인커터 ㄷ*/
            if(lo >= hi) {
                return hi;
            }

            swap(arr, lo, hi);
        }
    }

    private static void swap(int[] arr, int lo, int hi) {
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
    }
}
