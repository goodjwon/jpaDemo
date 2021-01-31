package com.demo.sk.jpa;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {
    @Id
    private Long id;
    @Column(name = "USER_NAME")
    private String name;
    private int age;
    @Enumerated(EnumType.STRING)
    private MemberType memberType;

    public Member(Long id, String name, int age,  MemberType memberType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.memberType = memberType;
    }

    public Member() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MemberType getMemberType() {
        return memberType;
    }
}
