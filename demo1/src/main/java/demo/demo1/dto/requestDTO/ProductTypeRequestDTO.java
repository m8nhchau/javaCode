package demo.demo1.dto.requestDTO;

import lombok.Data;

import java.util.Date;

@Data
public class ProductTypeRequestDTO {
    private String productTypeCd;
    private String productCd;
    private Date dataOffered;
    private Date dateRetired;
    private String productName;
}
