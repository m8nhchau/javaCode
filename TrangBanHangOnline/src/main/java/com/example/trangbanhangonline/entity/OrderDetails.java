package com.example.trangbanhangonline.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name ="order_details")
public class OrderDetails {
    @Id
    @Column(name = "READY_ORDER_ID")
    private Integer readyOrderId;

    @Column(name = "AMOUNT")
    private Integer amount;

    @Column(name = "TOTAL_PRICE")
    private Double totalPrice;

    @Column(name = "PRODUCT_ID")
    private String productId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    List<Order> orders;

}
