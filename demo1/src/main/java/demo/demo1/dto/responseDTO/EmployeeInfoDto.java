package demo.demo1.dto.responseDTO;

import lombok.Data;

@Data
public class EmployeeInfoDto {
    private Integer empId;
    private String lastName;
    private String firstName;
    private BranchDTO branch;
    private DepartmentDTO department;
}
