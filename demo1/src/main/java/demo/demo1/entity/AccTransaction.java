package demo.demo1.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Data
@Getter
@Setter
@Table(name = "acc_transaction")
@Slf4j
public class AccTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TXN_ID")
    private Long txnId;

    @Column(name ="AMOUNT")
    private Double amount;

    @Column(name=" FUNDS_AVAIL_DATE")
    private Date fundsAvailDate;

    @Column(name="TXN_DATE")
    private Date txnDate;

    @Column(name="TXN_TYPE_CD")
    private String txnTypeCd;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "EXECUTION_BRANCH_ID")
    private Branch branch;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "TELLER_EMP_ID")
    private Employee employee;
}
