package com.sumin.section04.testapp.repository;

import com.sumin.section04.testapp.aggregate.AccountStatus;
import com.sumin.section04.testapp.aggregate.BloodType;
import com.sumin.section04.testapp.aggregate.Member;
import com.sumin.section04.testapp.stream.MyObjectOutput;

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
            ArrayList<Member> defaultMembers = new ArrayList<>(); // 파일이 존재하지 않을 때 객체 생성
            defaultMembers.add(new Member(1, "user01", "pass01", 20,
                                new String[]{"발레", "수영"}, BloodType.A, AccountStatus.ACTIVE));
            defaultMembers.add(new Member(2, "user02", "pass02", 25,
                                new String[]{"게임", "영화시청"}, BloodType.O, AccountStatus.ACTIVE));
            defaultMembers.add(new Member(3, "user03", "pass03", 10,
                                new String[]{"독서", "명상"}, BloodType.AB, AccountStatus.ACTIVE));

            saveMembers(defaultMembers);

        }

        loadMembers();

    }

    /* 설명. 파일로부터 회원 객체들을 읽어와서 memberlist 컬렉션에 저장 */
    private void loadMembers() {
        try (
                //  try 안에서 변수를 선언하면, finally 블록에서 명시적으로 close()를 호출할 필요가 없어진다.
            ObjectInputStream ois = new ObjectInputStream( // 읽어올때는 변수 선언을 try 안에서 수행
                    new BufferedInputStream(
                            new FileInputStream(file)
                    )
            )) {
                while (true) {
                    memberList.add((Member) ois.readObject()); // 파일에서 객체를 읽어옴. 객체를 Member 타입으로 컬렉션에 저장
                }

            } catch (EOFException e) { // ObjectInputStream에서 더 이상 읽을 객체가 없을 때 발생. 파일의 끝에 도달
                System.out.println("회원 정보 다 읽어옴");
            }
            catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
    }

    /* 설명. ArrayList<Member>를 받으면 파일로 출력하는 메소드 (feat.덮어씌우는 기능). 재사용을 위해 메소드로 분리*/
    private void saveMembers(ArrayList<Member> defaultMembers) {
        ObjectOutputStream oos = null; // 출력할 때는 변수 선언을 try 외부에 선언
        // 중간에 buffer 를 끼움으로써 속도 향상
        try {
            oos = new ObjectOutputStream( // 객체 자료형 출력 스트림 (객체를 바이트 단위로 변환하고 이를 출력하는 스트림)
                    new BufferedOutputStream(
                            new FileOutputStream(file) // 파일에 바이트 단위로 데이터를 출력하는 기본 스트림
                    )
            );

            // 더미데이터를 하나씩 읽어서 출력으로 내보냄
            for(Member member : defaultMembers) {
                oos.writeObject(member); // 스트림을 활용해서 출력
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally { // try 외부에서 변수를 선언하면, finally 를 통해 close()를 호출해야한다.
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ArrayList<Member> selectAllMembers() {
        return memberList;
    }

    public Member selectMemberBy(int memNo) {
    Member returnMember = null; // 불러온 Member 객체를 저장할 변수 선언

        for(Member member : memberList) {
            if(member.getMemNo() == memNo) {
                returnMember = member;
            }
        }
        return returnMember; // return 은 for 문 바깥에 있어야한다
    }


    public int selectLastMemberNo() {
        Member lastMember = memberList.get(memberList.size() - 1);
        return lastMember.getMemNo();
    }

    public int insertMember(Member member) {
        /* 설명. 헤더가 추가되지 않는 ObjectOutputStream 클래스 정의(MyObjectOutputStream) */
        MyObjectOutput moo = null;
        int result = 0;
        try {
            moo = new MyObjectOutput(
                    new BufferedOutputStream(
                            new FileOutputStream(file, true)
                    )
            );
            moo.writeObject(member);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (moo != null) moo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    /* 설명. 수정된 사본이 넘어오면 컬렉션에 담긴 동일한 회원을 update 하고 컬렉션의 회원 정보로 파일을 덮어씌운다  */
    public int updateMember(Member reformedMember) {
        for (int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getMemNo() == reformedMember.getMemNo()) {
                memberList.set(i, reformedMember); // 원하는 위치의 컬렉션을 갈아끼움. 컬렉션 업데이트
                saveMembers(memberList); // 파일로 덮어씌움. 파일 업데이트

                return 1; // 업데이트 성공시 1을 넘김
            }

        }

        return 0; // 실패시 0을 넘김 (for 문 돌다가 if 문을 안 만나는 경우 고려)
    }

    /* 설명. soft delet (일종의 업데이트)를 통해 회원 탈퇴를 구성 */
    public int deleteMember(int removeMemNo) {
        int result = 0;

        for (Member mem : memberList) {
            if(mem.getMemNo() == removeMemNo) {
                mem.setAccountStatus(AccountStatus.DEACTIVATED);
                result = 1;
                saveMembers(memberList); // DB에도 저장 (덮어씌우기 방식)
            }
        }
        return result;
    }
}
