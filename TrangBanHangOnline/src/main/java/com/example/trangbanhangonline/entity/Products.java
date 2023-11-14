package com.example.trangbanhangonline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "product")
public class Products {
    @Id
    @Column(name = "PRODUCT_CD")
    private String productCd;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "ADMIN_ID")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;
}