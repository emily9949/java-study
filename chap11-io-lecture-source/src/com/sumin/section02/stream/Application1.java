package com.sumin.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. FileInputStream 을 이해할 수 있다 */
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("src/com/sumin/section02/stream/testInputStream.txt");
           //System.out.println((char) fis.read());

//            while (fis.read() != -1) { // read() 할 때마다 2byte씩 읽어서 b d 로 출력됨
//               System.out.print((char) fis.read());
//             }

            // 이렇게 출력해야 a b c d e 제대로 출력됨
            /* 설명. 반복횟수를 셀 필요 없이 EOF(End Of File)를 반환값(-1)을 활용하여 처리할 수 있다 */
            int input = 0;
            while ((input = fis.read()) != -1) {
                System.out.print((char) input);
            }


        } catch (FileNotFoundException e) {
            System.out.println("파일 경로 잘 확인할 것");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fis != null)  fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
