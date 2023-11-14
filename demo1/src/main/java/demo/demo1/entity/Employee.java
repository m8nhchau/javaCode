package demo.demo1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import demo.demo1.dto.responseDTO.EmployeeResponseDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
//@Data
@Getter
@Setter
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_ID")
    private Integer empId;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "TITLE")
    private String title;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    List<Account> accounts;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "DEPT_ID")
    private Department department;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "ASSIGNED_BRANCH_ID")
    private Branch branch;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    List<AccTransaction> accTrans;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "SUPERIOR_EMP_ID", referencedColumnName = "EMP_ID")
    private Employee superiorEmp;

}
