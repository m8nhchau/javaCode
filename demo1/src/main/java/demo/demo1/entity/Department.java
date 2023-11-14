package demo.demo1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
//@Data
@Getter
@Setter
@Table
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPT_ID")
    private Integer deptId;
    @Column(name = "NAME")
    private String departmentName;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    List<Employee> employee;

}
