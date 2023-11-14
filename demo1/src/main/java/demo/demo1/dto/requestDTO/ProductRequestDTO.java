package demo.demo1.dto.requestDTO;

import demo.demo1.entity.Product;
import demo.demo1.entity.ProductType;
import lombok.Data;

import java.util.Date;


@Data
public class ProductRequestDTO {
    private String productCd;
    private Date dataOffered;
    private Date dateRetired;
    private String productName;
    private String productTypeCd;

}
