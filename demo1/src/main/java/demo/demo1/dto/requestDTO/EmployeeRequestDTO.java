package demo.demo1.dto.requestDTO;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeRequestDTO {
    private Date endDate;
    private String firstName;
    private String lastName;
    private String title;
    private Date startDate;
    private String branchName;
    private String departmentName;
    private Integer accountID;
    private Integer branchId;
    private Integer deptId;
    private Integer empId;

}
