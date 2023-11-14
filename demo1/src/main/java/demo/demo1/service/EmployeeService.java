package demo.demo1.service;

import demo.demo1.dto.requestDTO.EmployRequestNameDTO;
import demo.demo1.dto.requestDTO.EmployeeRequestDTO;
import demo.demo1.dto.responseDTO.EmployResponseNameDTO;
import demo.demo1.dto.responseDTO.EmployeeResponseDto;
import demo.demo1.entity.Employee;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public interface EmployeeService {

    List<EmployeeResponseDto> getEmployeesStartedAfter2001() throws ParseException;

    EmployeeResponseDto addEmployee(EmployeeRequestDTO employee);

    EmployResponseNameDTO createEmployee(EmployRequestNameDTO employeeName);

    List<EmployeeResponseDto> findEmployee(EmployeeRequestDTO employeeRequestDTO);

    Employee updateEmployee(EmployeeRequestDTO employeeRequestDTO);
}
