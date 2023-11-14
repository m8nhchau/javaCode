package demo.demo1.dto.responseDTO;

import lombok.Data;

@Data
public class BranchDTO {
    private Integer branchId;
    private String address;
    private String city;
    private String branchName;
    private String state;
    private String zipCode;
}
