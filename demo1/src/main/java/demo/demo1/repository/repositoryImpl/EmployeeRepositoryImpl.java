package demo.demo1.repository.repositoryImpl;

import demo.demo1.dto.requestDTO.EmployeeRequestDTO;
import demo.demo1.dto.responseDTO.EmployeeResponseDto;
import demo.demo1.entity.Branch;
import demo.demo1.entity.Department;
import demo.demo1.entity.Employee;
import demo.demo1.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


//@Repository
//@RequiredArgsConstructor
//public class EmployeeRepositoryImpl  {
//
//    private final EntityManager entityManager;
//    private final EmployeeMapper employeeMapper;
//
//    public List<EmployeeResponseDto> findByCondition(EmployeeRequestDTO employeeRequestDTO) {
//        List<Employee> employees;
//
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//
//        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
//        Root<Employee> root = cq.from(Employee.class);
//
//        List<Predicate> predicates = new ArrayList<>();
//
//        if (employeeRequestDTO.getBranchName() != null) {
//            Join<Employee, Branch> branch = root.join("branch",JoinType.LEFT);
//            predicates.add(cb.like(branch.get("branchName"), "%" + employeeRequestDTO.getBranchName() + "%"));
//        }
//
//        if (employeeRequestDTO.getStartDate() != null) {
//            //predicates.add(cb.greaterThanOrEqualTo(root.get("startDate"), employeeRequestDTO.getStartDate()));
//            predicates.add(cb.like(cb.lower(root.get("startDate").as(String.class)), "%"+ new SimpleDateFormat("yyyy-MM-dd").format( employeeRequestDTO.getStartDate()) +"%"));
//        }
//
//        if (employeeRequestDTO.getDepartmentName() != null) {
//            Join<Employee, Department> department = root.join("department",JoinType.LEFT);
//            predicates.add(cb.like(department.get("departmentName"), "%" + employeeRequestDTO.getDepartmentName() + "%"));
//        }
//
//        if (StringUtils.isNotBlank(employeeRequestDTO.getFirstName())) {
//            predicates.add(cb.or(cb.like(cb.upper(root.get("firstName")), "%" + employeeRequestDTO.getFirstName().toUpperCase() + "%"),
//                    cb.like(cb.upper(root.get("lastName")), "%" + employeeRequestDTO.getFirstName().toUpperCase() + "%")));
//        }
//
//        cq.orderBy(cb.asc(root.get("firstName")));
//
//        TypedQuery<Employee> query = entityManager.createQuery(cq.select(root).distinct(true)
//                .where(cb.and(predicates.toArray(new Predicate[]{}))));
//
//        employees = query.getResultList();
//
//        return employeeMapper.toResponse(employees);
//    }
//}
