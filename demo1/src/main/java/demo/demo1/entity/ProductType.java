package demo.demo1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
//@Data
@Getter
@Setter
@Table(name = "product_type")
public class ProductType {
    @Id
    @Column(name = "PRODUCT_TYPE_CD")
    private String productTypeCd;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "productType", fetch = FetchType.LAZY)
    List<Product> products;
}
