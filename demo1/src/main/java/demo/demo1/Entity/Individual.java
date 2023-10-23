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
@Table(name = "individual")
public class Individual {
    @Id
    @Column(name="CUST_ID")
    private Integer custId;

    @Column(name="BIRTH_DATE")
    private Date birthDate;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

}
