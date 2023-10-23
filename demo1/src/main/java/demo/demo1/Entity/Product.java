package demo.demo1.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
//@Data
@Getter
@Setter
@Table(name= "product")
public class Product {
    @Id
    @Column(name="PRODUCT_CD")
    private String productCd;

    @Column(name="DATE_OFFERED")
    private Date dataOffered;
    @Column(name="DATE_RETIRED")
    private Date dateRetired;
    @Column(name="NAME")
    private String name;


    @OneToMany(mappedBy="product", fetch = FetchType.LAZY)
    List<Account> accounts;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "PRODUCT_TYPE_CD")
    private ProductType productType;
}
