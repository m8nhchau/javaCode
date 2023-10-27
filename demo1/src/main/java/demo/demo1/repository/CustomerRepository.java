package demo.demo1.repository;
import demo.demo1.entity.Customer;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
//@Data
//public class CustomerRepository {
//    public Customer findByCustId(Integer custId) {
//
//        return null;
//    }
