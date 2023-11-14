package demo.demo1.repository.repositoryImpl;

import demo.demo1.dto.requestDTO.EmployeeRequestDTO;
import demo.demo1.dto.responseDTO.EmployeeResponseDto;
import demo.demo1.entity.Department;
import demo.demo1.entity.Employee;
import demo.demo1.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//@Repository
//@RequiredArgsConstructor
//public class EmployeeHtRepository {
//
//    private final EntityManager entityManager;
//
//    private final EmployeeMapper employeeMapper;
//
//    public List<EmployeeResponseDto> findByCondition(EmployeeRequestDTO dto) {
//
//        List<Employee> employees;
//
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//
//        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
//        Root<Employee> root = cq.from(Employee.class);
//        Join<Employee, Department> department = root.join("department", JoinType.LEFT);
//
//        List<Predicate> predicates = new ArrayList<>();
//
//        if (dto.getBranchId() != null) {
//            predicates.add(cb.equal(root.get("branch").get("branchId"), dto.getBranchId()));
//        }
//
//        if (dto.getDeptId() != null) {
//            Predicate predicate = cb.equal(root.get("department").get("deptId"), dto.getDeptId());
//            predicates.add(predicate);
//        }
//
////
////        if (StringUtils.isNotBlank(dto.getFirstName())) {
////            predicates.add(cb.or(cb.like(cb.upper(root.get("firstName")), "%" + dto.getFirstName().toUpperCase() + "%"),
////                    cb.like(cb.upper(root.get("lastName")), "%" + dto.getFirstName().toUpperCase() + "%")));
////        }
//
//        cq.orderBy(cb.asc(root.get("firstName")));
//
//        TypedQuery<Employee> query = entityManager.createQuery(cq.select(root).distinct(true)
//                .where(cb.and(predicates.toArray(new Predicate[]{}))));
//
//        int total = query.getResultList().size();
//
////        if (Objects.nonNull(dto.getPageNumber()) && Objects.nonNull(dto.getPageSize())) {
////            query.setFirstResult((dto.getPageNumber()) * dto.getPageSize());
////            query.setMaxResults(dto.getPageSize());
////
////        }
//        employees = query.getResultList();
//
//        return employeeMapper.toResponse(employees);
//    }
//}
