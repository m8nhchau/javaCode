package demo.demo1.dto.responseDTO;

import demo.demo1.entity.ProductType;
import lombok.Data;

import java.util.Date;

@Data
public class ProductResponseDTO {
    private String productTypeCd;
    private String productCd;
    private Date dataOffered;
    private Date dateRetired;
    private String productName;
    private ProductType productType;

}
