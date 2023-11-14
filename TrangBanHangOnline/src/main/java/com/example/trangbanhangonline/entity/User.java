package com.example.trangbanhangonline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
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

}
