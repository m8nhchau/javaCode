package demo.demo1.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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

}
