//package demo.demo1.repository;
//
//
//import demo.demo1.dto.EmployeeDto;
//import demo.demo1.entity.Employee;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDate;
//import java.util.Date;
//import java.util.List;
//
//@Repository
//public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//    List<Employee> findByStartDateAfter(Date startDate);
//}