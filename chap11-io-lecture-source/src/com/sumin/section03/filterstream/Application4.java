package com.sumin.section03.filterstream;

import com.sumin.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {
        MemberDTO[] memArr = new MemberDTO[100];
        memArr[0] = new MemberDTO("user01", "pass01", "홍길동",
                "hong123@gmail.com", 25, '남');
        memArr[1] = new MemberDTO("user02", "pass02", "유관순",
                "korea123@gmail.com", 25, '여');
        memArr[2] = new MemberDTO("user03", "pass03", "강감찬",
                "hong123@gmail.com", 40, '남');

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new FileOutputStream("src/com/sumin/section03/filterstream/testObject.txt")
            );

            // 파일을 DB 로 사용중.
            for (int i = 0; i < 3; i++) { // 온전한 객체만 들어가도록 실체가 있는 수만큼 반복
                // memArr.length 로 길이를 지정하게 되면 null 값이 참조하는 (존재하지 않는 객체)도 출력됨.
                oos.writeObject(memArr[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        MemberDTO[] newMemArr = new MemberDTO[memArr.length];

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new FileInputStream("src/com/sumin/section03/filterstream/testObject.txt")
            );

//            newMemArr[0] = (MemberDTO)ois.readObject();
            int index = 0;
            while (true) {
                newMemArr[index++] = (MemberDTO) ois.readObject();
            }


        } catch (EOFException e){
            System.out.println("회원 정보 읽기 완료!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

