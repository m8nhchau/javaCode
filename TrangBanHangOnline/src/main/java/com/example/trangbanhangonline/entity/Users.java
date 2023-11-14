package com.example.trangbanhangonline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "USER_ID")
    private Integer userID;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTH_DAY")
    private Date birthDay;

    @Column(name = "PHONE_NUMBER")
    private Double phoneNumber;

    @Column(name = "ADDRESS")
    private String address;

    @OneToOne
    @JoinColumn(name =  "USER_ID")
    private Admin admin;

    @OneToOne
    @JoinColumn(name =  "USER_ID")
    private Customer customer;

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    List<Session> sessionList;


}
