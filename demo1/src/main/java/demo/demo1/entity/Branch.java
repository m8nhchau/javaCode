package demo.demo1.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
//@Data
@Getter
@Setter
@Table(name = " branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BRANCH_ID")
    private Integer branchId;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    @Column(name = "NAME")
    private String name;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY)
    List<Account> accounts;

    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY)
    List<Employee> employees;

    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY)
    List<AccTransaction> accTrans;
}
