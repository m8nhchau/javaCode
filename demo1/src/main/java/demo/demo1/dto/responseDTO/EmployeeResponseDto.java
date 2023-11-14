package demo.demo1.dto.responseDTO;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeResponseDto {
    private String firstName;
    private String lastName;
    private Date startDate;
    private String branchName;
    private String departmentName;
    private Integer accountID;
    private Integer branchId;
    private Integer deptId;
    private Integer empId;
}
