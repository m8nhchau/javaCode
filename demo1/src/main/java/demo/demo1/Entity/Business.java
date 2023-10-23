package demo.demo1.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
//@Data
@Getter
@Setter
@Table(name = "business")
public class Business {
    @Id
    @Column(name="CUST_ID")
    private Integer custId;

    @Column(name="INCORP_DATE")
    private Date incorpDate;

    @Column(name="NAME")
    private String name;

    @Column(name="STATE_ID")
    private String stateId;


}