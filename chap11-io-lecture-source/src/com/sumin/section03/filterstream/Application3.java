package com.sumin.section03.filterstream;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 데이터 타입 입출력 보조 스트림을 이해하고 활용할 수 있다. */
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(
                        new FileInputStream("src/com/sumin/section03/filterstream/testData.txt"
                        )
            );

            while (true) {
                /* 설명. 출력했던 데이터 단위를 지켜서 입력해야 온전히 데이터를 읽을 수 있다 */
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                System.out.println(dis.readChar());
            }

        } catch (EOFException e) { // EOFException 예외처리 필수
            /* 설명. data 단위 입출력은 EOFException 처리를 통해 확인하고 처리할 수 있다. */
            System.out.println("데이터 파일 읽기 완료");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (dis != null)  dis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
