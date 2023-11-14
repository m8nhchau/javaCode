package demo.demo1.dto.responseDTO;


import lombok.Data;


@Data
public class CustomerDto {
    private Integer custId;
    private String fullName;
    private Integer countAccount;
    private String address;
    private String city;
    private String custTypeCd;
    private String fedId;
    private String postalCode;
    private String status;
    private Double availBalance;
    private Double pendingBalance;

}
