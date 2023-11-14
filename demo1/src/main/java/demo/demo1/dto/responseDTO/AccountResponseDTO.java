package demo.demo1.dto.responseDTO;


import lombok.Data;

import java.util.Date;

@Data
public class AccountResponseDTO {
    private Integer accountID;
    private Double availBalance;
    private Date openDate;
    private String firstName;
    private String lastName;
    private Integer empId;
    private Integer branchId;
    private String productCd;
}
