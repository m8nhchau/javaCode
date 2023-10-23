package demo.demo1.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
//@Data
@Getter
@Setter
@Table
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="DEPT_ID")
    private Integer deptId;
    @Column(name="NAME")
    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    List<Employee> employees;

}
