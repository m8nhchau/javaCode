package demo.demo1.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Date;

@Entity
//@Data
@Getter
@Setter
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EMP_ID")
    private Integer empId;

    @Column(name="END_DATE")
    private Date endDate;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="START_DATE")
    private Date startDate;

    @Column(name="TITLE")
    private String title;

    @Column(name="SUPERIOR_EMP_ID")
    private Integer superiorEmpId;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    List<Account> accounts;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "DEPT_ID")
    private Department department;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ASSIGNED_BRANCH_ID")
    private Branch branch;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    List<AccTransaction> accTrans;
}
