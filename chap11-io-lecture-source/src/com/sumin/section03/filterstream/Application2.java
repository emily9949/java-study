package com.sumin.section03.filterstream;

import java.io.*;

public class Application2 {
        public static void main(String[] args) {

            /* 수업목표. 표준입출력(콘솔과의 입출력)을 이해하고 활용할 수 있다. */

            // System.in/out 도 스트림이다. BufferedReader 로 읽으려면 보조 스트림을 두 개 써야한다.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            /* 설명. Scanner 보다 BufferedReader 가 속도면에서 빠르다. 코테는 BufferedReader 로 풀 것 ! */
            System.out.println("문자열 입력: ");

            try {
                String input = br.readLine();


            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (br != null) br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            BufferedWriter bw = null;
            OutputStreamWriter osw = null;
            osw = new OutputStreamWriter(System.out);
            bw = new BufferedWriter(osw);

            try {
                bw.write("println이 좋은 거구나");
                bw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (bw != null) bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
}
