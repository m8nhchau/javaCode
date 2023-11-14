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
    @Column(name = "ID")
    private Integer id;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "CUST_ID")
    private Customer customer;

}
