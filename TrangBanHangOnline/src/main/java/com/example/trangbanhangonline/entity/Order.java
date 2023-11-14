package com.example.trangbanhangonline.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name ="order")
public class Order {
    @Id
    @Column(name = "ORDER_ID")
    private Integer orderId;

    @Column(name = "ORDER_DATE")
    private Date orderDate;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "STATUS")
    private String status;

//    @ManyToOne
//    @JsonBackReference
//    @JoinColumn(name = "PRODUCT_CD")
//    private Products products;

//    @ManyToOne
//    @JoinColumn(name = "READY_ORDER_ID")
//    private OrderDetails orderDetailsList;
}
