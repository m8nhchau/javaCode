package demo.demo1.dto.requestDTO;

import lombok.Data;

import java.util.Date;

@Data
public class AccountRequestDTO {
    private Integer accountID;
    private Double minAvailBalance;
    private Double maxAvailBalance;
    private Date minOpenDate;
    private Date maxOpenDate;
    private String firstName;
    private String lastName;
    private Integer empId;
    private Integer branchId;
    private String productCd;
}
