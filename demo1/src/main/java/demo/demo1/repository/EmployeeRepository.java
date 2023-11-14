package demo.demo1.repository;


import demo.demo1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByStartDateAfter(Date startDate);


}