package demo.demo1.dto.responseDTO;

import lombok.Data;

import java.util.Date;

@Data
public class ProductTypeResponseDTO {
    private String productTypeCd;
    private String productCd;
    private Date dataOffered;
    private Date dateRetired;
    private String productName;
}
