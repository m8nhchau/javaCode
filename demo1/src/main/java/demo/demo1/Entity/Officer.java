package demo.demo1.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
//@Data
@Getter
@Setter
@Table(name="officer")
public class Officer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="OFFICER_ID")
    private Integer officerId;

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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "CUST_ID")
    private Customer customer;

}
