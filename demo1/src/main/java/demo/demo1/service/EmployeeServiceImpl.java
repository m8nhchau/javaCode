package demo.demo1.service;

import demo.demo1.dto.requestDTO.EmployRequestNameDTO;
import demo.demo1.dto.requestDTO.EmployeeRequestDTO;
import demo.demo1.dto.responseDTO.EmployResponseNameDTO;
import demo.demo1.dto.responseDTO.EmployeeResponseDto;
import demo.demo1.entity.*;
import demo.demo1.exception.EmployeeNotFoundException;
import demo.demo1.mapper.EmployeeMapper;
import demo.demo1.mapper.EmployeeRequestMapper;
import demo.demo1.repository.AccountRepository;
import demo.demo1.repository.BranchRepository;
import demo.demo1.repository.DepartmentRepository;
import demo.demo1.repository.EmployeeRepository;
//import demo.demo1.repository.repositoryImpl.EmployeeHtRepository;

//import demo.demo1.repository.repositoryImpl.EmployeeRepositoryImpl;
import demo.demo1.utils.BeanUtil;
import javassist.NotFoundException;
import javassist.tools.rmi.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Supplier;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeRequestMapper employeeRequestMapper;
    private final BranchRepository branchRepository;
    private final AccountRepository accountRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeMapper employeeMapper;
    private final EntityManager entityManager;

    //    private final EmployeeHtRepository employeeHtRepository;
//    private final EmployeeRepositoryImpl employeeRepositoryImpl;
    @Override
    public List<EmployeeResponseDto> getEmployeesStartedAfter2001() throws ParseException {
        Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2001");
        List<Employee> employees = employeeRepository.findByStartDateAfter(startDate);
        List<EmployeeResponseDto> listEmployeeResponseDtos = new ArrayList<>();

//        for (Employee empl : employees) {
//            EmployeeResponseDto dto = new EmployeeResponseDto();
//            dto.setEmpId(empl.getEmpId());
//            dto.setLastName(empl.getLastName());
//            dto.setFirstName(empl.getFirstName());
//            dto.setTitle(empl.getTitle());
//            dto.setStartDate(empl.getStartDate());
//            listEmployeeResponseDtos.add(dto);
//        }
        return listEmployeeResponseDtos;
    }

    @Override
    public EmployeeResponseDto addEmployee(EmployeeRequestDTO employeeRequestDTO) {

        Employee employeeNew = employeeRequestMapper.toEntity(employeeRequestDTO);

        Optional<Branch> branchs = branchRepository.findById(employeeRequestDTO.getBranchId());
        if (!branchs.isPresent()) {
            throw new RuntimeException("Chi nhánh ko tồn tại");
        }
        employeeNew.setBranch(branchs.get());

        Optional<Account> accounts = accountRepository.findById(employeeRequestDTO.getAccountID());
        if (!accounts.isPresent()) {
            throw new RuntimeException("Không có account hợp lệ");
        }
        employeeNew.setAccounts(Collections.singletonList(accounts.get()));

//        Account accounts = accountRepository.findById(employeeRequestDTO.getAccountID()).orElse(null);
//        if(accounts == null){
//            throw new RuntimeException("Không có account hợp lệ");
//        }


//        try {
//            if(accounts.get().equals(new Account())){
//                log.info("ok");
//            }
//        }catch (Exception e){
//            log.info("Có lỗi");
//        }


        Optional<Department> departments = departmentRepository.findById(employeeRequestDTO.getDeptId());
        if (!departments.isPresent()) {
            throw new RuntimeException("Phòng ban không tồn tại");
        }
        employeeNew.setDepartment(departments.get());

        employeeNew = employeeRepository.save(employeeNew);

        return employeeMapper.toResponse(employeeNew);
    }

    @Override
    public EmployResponseNameDTO createEmployee(EmployRequestNameDTO employRequestNameDTO) {

        Employee employNewName = employeeRequestMapper.toEntitys(employRequestNameDTO);

        Optional<Branch> bran = branchRepository.findByBranchName(employRequestNameDTO.getBranchName());
        if (!bran.isPresent()) {
            throw new RuntimeException("Chi nhánh ko tồn tại");
        }
        employNewName.setBranch(bran.get());

        Optional<Department> dept = departmentRepository.findByDepartmentName(employRequestNameDTO.getDepartmentName());
        if (!bran.isPresent()) {
            throw new RuntimeException("Phòng ban ko tồn tại");
        }
        employNewName.setDepartment(dept.get());

        employNewName = employeeRepository.save(employNewName);

        return employeeMapper.toResponseName(employNewName);
    }

    @Override
    public List<EmployeeResponseDto> findEmployee(EmployeeRequestDTO employeeRequestDTO) {
        return null;
    }

//    @Override
//    public List<EmployeeResponseDto> findEmployee(EmployeeRequestDTO employeeRequestDTO) {
//        List<EmployeeResponseDto> employeeResponseDtoList =  employeeRepositoryImpl.findByCondition(employeeRequestDTO);
//        return employeeResponseDtoList;
//    }

    @Override
    public Employee updateEmployee(EmployeeRequestDTO employeeRequestDTO) {
        Employee employees = new Employee();
        //BeanUtils.copyProperties(employeeRequestDTO, employees, BeanUtil.getNullPropertyNames(employeeRequestDTO));
//        employees.setStartDate(employeeRequestDTO.getStartDate());

        Employee employee = employeeRepository.findById(employeeRequestDTO.getEmpId()).orElse(null);

        if (employee == null) {
            throw new EmployeeNotFoundException("Không tìm thấy nhân viên");
        }

        if (employeeRequestDTO.getFirstName() != null) {
            employees.setFirstName(employeeRequestDTO.getFirstName());
        }

        if (employeeRequestDTO.getLastName() != null) {
            employees.setLastName(employeeRequestDTO.getLastName());
        }

        if (employeeRequestDTO.getStartDate() != null) {
            employees.setStartDate(employeeRequestDTO.getStartDate());
        }

        Department department = departmentRepository.findById(employeeRequestDTO.getDeptId()).orElse(null);
        if (department == null) {
            throw new RuntimeException("Chi nhánh ko tồn tại");
        }

        employees.setDepartment(department);

        Branch branch = branchRepository.findById(employeeRequestDTO.getBranchId()).orElse(null);
        if (branch == null) {
            throw new RuntimeException("phòng ban ko tồn tại");
        }
        employees.setBranch(branch);

        employees = employeeRepository.save(employees);

        return employees;
    }
}





