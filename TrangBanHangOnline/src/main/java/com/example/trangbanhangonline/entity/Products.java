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

}