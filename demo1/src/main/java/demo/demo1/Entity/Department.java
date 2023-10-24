package demo.demo1.Entity;

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
    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    List<Employee> employees;

}
