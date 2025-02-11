package com.sumin.section03.grammer;

public enum UserRole2 {
    GUEST("게스트"), // 각각 생성자 호출
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String DESCRIPTION;
    UserRole2(String description) {
        DESCRIPTION = description;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }
}
