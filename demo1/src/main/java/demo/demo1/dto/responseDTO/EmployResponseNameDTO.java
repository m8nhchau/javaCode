package demo.demo1.dto.responseDTO;

import lombok.Data;

import java.util.Date;

@Data
public class EmployResponseNameDTO {
    private Date endDate;
    private String firstName;
    private String lastName;
    private String title;
    private Date startDate;
    private String branchName;
    private String departmentName;

}
