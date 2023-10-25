package demo.demo1.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Data
@Getter
@Setter
@Table(name = "individual")
public class Individual {
    @Id
    @Column(name = "CUST_ID")
    private Integer custId;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "customer_cust_id")
    private Customer customer;

}
