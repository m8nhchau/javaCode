package demo.demo1.dto.requestDTO;

import lombok.Data;

import java.util.Date;

@Data
public class EmployRequestNameDTO {
    private Date endDate;
    private String firstName;
    private String lastName;
    private String title;
    private Date startDate;
    private String branchName;
    private String departmentName;

}
