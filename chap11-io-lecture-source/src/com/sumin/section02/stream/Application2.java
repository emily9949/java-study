package com.sumin.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. FileOutputStream을 이해할 수 있다. */
        /* 설명.
        *   FileOutputStream 은 FileInputStream 과 달리 해당 파일이 존재하지 않으면 파일을 생성해 주며
        *   두 번째 전달인자로 true 를 전달하면 기존 데이터에 이어서 출력을 내보낼 수도 있다. (이어 붙이기) */
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/com/sumin/section02/stream/testOutputStream.txt", true);
            // append : true 하면 계속 이어쓸 수 있다

            fos.write(97);
            fos.write('b');
            fos.write('c');
            fos.write('d');

            byte[] bArr = new byte[]{'a', 'b', 'c', 'd'};
            for(byte b : bArr) {
                fos.write(b);
            }

            fos.write(bArr, 2, 3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
