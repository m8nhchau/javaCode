package demo.demo1.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
//@Data
@Getter
@Setter
@Table(name ="product_type")
public class ProductType {
    @Id
    @Column(name="PRODUCT_TYPE_CD")
    private String productTypeCd;

    @Column(name="NAME")
    private String name;

    @OneToMany(mappedBy = "productType", fetch = FetchType.LAZY)
    List<Product> products;
}
