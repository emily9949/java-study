package com.sumin.intro.section02.uses.subsection03.terminal;

public class Member {
    private String memberId;
    private String memberName;

    public Member(String memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
