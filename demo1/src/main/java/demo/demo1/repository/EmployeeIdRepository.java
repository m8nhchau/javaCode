//package demo.demo1.repository;
//
//import demo.demo1.entity.Employee;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface EmployeeIdRepository extends JpaRepository<Employee, Integer> {
//    @Query(value = "SELECT  * From employee where EMP_ID in ( select  distinct SUPERIOR_EMP_ID AS EMP_ID from employee where SUPERIOR_EMP_ID is not NULL) ", nativeQuery = true)
//    List<Employee> getAllSuperEmployee();
//    List<Employee> findBySuperiorEmp_EmpId(Integer id);
//}
//
