package demo.demo1.dto;

import lombok.Data;

@Data
public class EmployeeIdDto  {
    private Integer empId;
    private Integer superiorEmpId;
    private String lastName;
    private String firstName;
}
