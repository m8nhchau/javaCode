package demo.demo1.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Data
@Getter
@Setter
@Table(name = "officer")
public class Officer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OFFICER_ID")
    private Integer officerId;

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

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "CUST_ID")
    private Customer customer;

}
