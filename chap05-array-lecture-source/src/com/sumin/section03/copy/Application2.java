package com.sumin.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 깊은 복사에 대해 이해할 수 있다 */
        /* 설명.
        *   깊은 복사를 하는 방법은 4가지가 있다
        *   1. for 문을 이용한 동일한 인덱스 값들끼리 일일히 복사
        *   2. Object의 clone() 을 이용한 복사 (사용 빈도 높음)
        *   3. System 의 arraycopy() 를 이용한 복사
        *   4. Arrays 의 copyOf() 를 이용한 복사
        * */

        int[] originArr = new int[]{1, 2, 3, 4};
        print(originArr, "원본");

        /* 설명. 1. for 문을 활용 */
        int[] copyArr1 = new int[originArr.length]; // 크기가 똑같은 배열을 생성
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }

        print(copyArr1, "for문을 활용한 사본");

        /* 설명. 2. clone() 활용 */
        // clone 함수는 java.lang.Object 의 메소드다
        int[] copyArr2 = originArr.clone();
        print(copyArr2, "clone()을 활용한 사본");

        /* 설명. 3. arraycopy()를 이용한 복사 */
        int[] copyArr3 = new int[originArr.length];
        // 원본보다 크기가 3 더 큼
        System.arraycopy(originArr, 0, copyArr3, 3, 3);
        print(copyArr3, "arraycopy() 를 활용한 사본");

        /* 설명. 4. copyOf() 를 이용한 복사 (처음부터 원하는 길이만큼)*/
        int[] copyArr4 = Arrays.copyOf(originArr, 2);
        print(copyArr4, "copyOf()를 활용한 사본");
    }

    public static void print(int[] arr, String desc) {
        System.out.println("==== " + desc + " ====");
        System.out.println("넘어온 배열의 Hashcode: " + arr.hashCode());  // 배열의 주소 출력
        System.out.println(Arrays.toString(arr));
    }
}
