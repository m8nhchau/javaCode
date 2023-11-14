package demo.demo1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
//@Data
@Getter
@Setter
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "CUST_ID")
    private Integer custId;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    @Column(name = "CUST_TYPE_CD")
    private String custTypeCd;

    @Column(name = "FED_ID")
    private String fedId;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "STATE")
    private String state;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    List<Account> accounts;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    List<Officer> officers;

    @OneToOne
    @JoinColumn(name = "CUST_ID")
    Individual individual;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    List<Business> businesses;

    @ManyToMany
    @JoinTable(
            name = "customer_product",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> product;
}
