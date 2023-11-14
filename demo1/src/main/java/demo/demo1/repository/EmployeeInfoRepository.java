package demo.demo1.repository;


import demo.demo1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeInfoRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "SELECT e.* FROM employee e JOIN department d ON e.DEPT_ID = d.DEPT_ID JOIN branch b ON b.BRANCH_ID = e.ASSIGNED_BRANCH_ID ", nativeQuery = true)
    List<Employee> getEmployee();
}

