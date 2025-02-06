package com.sumin.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. FileReader를 이해하고 활용할 수 있다 */
        // FileReader 의 read() 는 character 타입으로 읽음. 2byte, 3byte 로 읽을 수 있음
        FileReader fr = null;
        try {
            fr = new FileReader("src/com/sumin/section02/stream/testReader.txt");

//            int readChar = fr.read();
//            System.out.println((char) readChar);

             int readChar = 0;
             while ((readChar = fr.read()) != -1) {
                 System.out.println((char) readChar);
             }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fr != null) fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
