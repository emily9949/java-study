package com.sumin.section04.testapp.repository;

import com.sumin.section04.testapp.aggregate.AccountStatus;
import com.sumin.section04.testapp.aggregate.BloodType;
import com.sumin.section04.testapp.aggregate.Member;

import java.io.*;
import java.util.ArrayList;

/* 설명. 데이터베이스 개념(Member 관련 파일)과 입출력 (CRUD)을 위해 만들어지며
    성공데이터 또는 성공/실패 여부를 반환 (java의 컬렉션 개념으로 데이터를 관리하기도 한다) */
public class MemberRepository {

   /* 설명. 초기에 Member 파일이 없다면 파일을 만들어 더미데이터(dummy data) 를 쌓는다 */
    private final ArrayList<Member> memberList = new ArrayList<>();
    private final File file = new File("src/com/sumin/section04/testapp/db/memberDB.dat");
    // DB와의 연결정보

    /* 설명. 프로그램 구동 시 MemberRepository 생성자가 호출되며 초기에 실행할 내용들 */
    public MemberRepository() {
        // 프로그램을 켜자마자(생성자를 이용해 생성되자마자)

        if (!file.exists()) {
            ArrayList<Member> defaultMembers = new ArrayList<>();
            defaultMembers.add(new Member(1, "user01", "pass01", 20,
                                new String[]{"발레", "수영"}, BloodType.A, AccountStatus.ACTIVE));
            defaultMembers.add(new Member(2, "user02", "pass02", 25,
                                new String[]{"게임", "영화시청"}, BloodType.O, AccountStatus.ACTIVE));
            defaultMembers.add(new Member(3, "user03", "pass03", 10,
                                new String[]{"독서", "명상"}, BloodType.AB, AccountStatus.ACTIVE));

            saveMembers(defaultMembers);

        }
    }

    /* 설명. ArrayList<Member>를 받으면 파일로 출력하는 메소드 (feat.덮어씌우는 기능). 재사용을 위해 메소드로 분리*/
    private void saveMembers(ArrayList<Member> defaultMembers) {
        ObjectOutputStream oos = null;
        // 중간에 buffer 를 끼움으로써 속도 향상
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file)
                    )
            );

            // 더미데이터를 하나씩 읽어서 출력으로 내보냄
            for(Member member : defaultMembers) {
                oos.writeObject(member);
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
    }

    public ArrayList<Member> selectAllMembers() {
        return null;
    }
}
