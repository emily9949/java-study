package com.sumin.section03.filterstream;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. BufferedWriter 와 BufferedReader 에 대해 이해하고 사용할 수 있다 */
        /* 설명.
        *    내부적으로 버퍼 (buffer) 를 활용해서 입출력 성능을 향상 시킨다
        *   추가적인 메소드가 제공된다
        * */

        BufferedWriter bw = null;

        try {
            // 보조 스트림(BufferedWriter) 의 메소드를 쓰게 된다
            bw = new BufferedWriter(
                    new FileWriter("src/com/sumin/section03/filterstream/testBufferd.txt"));
            bw.write("눈이");
            bw.write("하늘에서\n");
            bw.write("내려오네");

            /* 설명. 내부적으로 버퍼가 다 차지 않으면 출력으로 내보내 지지 않는데 flush()를 호출해야 버퍼가 비워진다 */
//          bw.flush(); // Buffer 주머니가 다 차지 않더라도 출력을 내보내도록 동작
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bw != null) bw.close(); // close() 를 하면 스트림을 강제로 닫음. (flush()를 포함) 출력이 내보내짐.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new FileReader("src/com/sumin/section03/filterstream/testBufferd.txt")
            );

//           String str =  br.readLine();
//           System.out.println("str =" + str);

            String str = "";
            while ((str = br.readLine()) != null) {
                System.out.println("str = " + str);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) br.close(); // 보조 스트림을 닫으면, 보조 스트림 내의 내부 스트림도 같이 닫아줌.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
