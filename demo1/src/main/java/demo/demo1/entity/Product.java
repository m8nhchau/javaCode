package demo.demo1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
//@Data
@Getter
@Setter
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "PRODUCT_CD")
    private String productCd;

    @Column(name = "DATE_OFFERED")
    private Date dataOffered;
    @Column(name = "DATE_RETIRED")
    private Date dateRetired;
    @Column(name = "NAME")
    private String productName;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    List<Account> accounts;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "PRODUCT_TYPE_CD")
    private ProductType productType;
}
