package demo.demo1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
//@Data
@Getter
@Setter
@Table(name = "business")
public class Business implements Serializable {
    @Id
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "CUST_ID", referencedColumnName = "CUST_ID")
    private Customer customer;

    @Column(name = "INCORP_DATE")
    private Date incorpDate;

    @Column(name = "NAME")
    private String name;

    @Column(name = "STATE_ID")
    private String stateId;

}