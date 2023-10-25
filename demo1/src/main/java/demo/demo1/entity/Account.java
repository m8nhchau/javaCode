package demo.demo1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
//@Data
@Getter
@Setter
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_ID")
    private Integer accountID;

    @Column(name = "AVAIL_BALANCE")
    private Double availBlance;

    @Column(name = "CLOSE_DATE")
    private Date closeDate;

    @Column(name = "LAST_ACTIVITY_DATE ")
    private Date lastActivityDate;

    @Column(name = "OPEN_DATE")
    private Date openDate;

    @Column(name = "PENDING_BALANCE")
    private Float pendingBalance;

    @Column(name = "STATUS")
    private String status;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "PRODUCT_CD")
    private Product product;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "CUST_ID")
    private Customer customer;

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    List<AccTransaction> accTran;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "OPEN_BRANCH_ID")
    private Branch branch;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "OPEN_EMP_ID")
    private Employee employee;


}
