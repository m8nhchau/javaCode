package demo.demo1.controller;

import demo.demo1.dto.requestDTO.EmployRequestNameDTO;
import demo.demo1.dto.requestDTO.EmployeeRequestDTO;
import demo.demo1.dto.responseDTO.EmployResponseNameDTO;
import demo.demo1.dto.responseDTO.EmployeeResponseDto;
import demo.demo1.entity.Employee;
import demo.demo1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get-employees")
    public ResponseEntity<List<EmployeeResponseDto>> getEmployees(EmployeeResponseDto dto) throws ParseException {
        List<EmployeeResponseDto> employees = employeeService.getEmployeesStartedAfter2001();
        return ResponseEntity.ok(employees);
    }

    @PostMapping("/create-employees")
    public ResponseEntity<EmployeeResponseDto> addEmployee(@RequestBody EmployeeRequestDTO employee) {
        EmployeeResponseDto addedEmployee = employeeService.addEmployee(employee);
        return ResponseEntity.ok(addedEmployee);
    }

    @PostMapping("/create-employee-with-name")
    public ResponseEntity<EmployResponseNameDTO> createEmployee(@RequestBody EmployRequestNameDTO employName) {
        EmployResponseNameDTO createEmployee = employeeService.createEmployee(employName);
        return ResponseEntity.ok(createEmployee);
    }

    @PostMapping("/find-employees")
    public ResponseEntity<List<EmployeeResponseDto>> findEmployee(@RequestBody EmployeeRequestDTO employeeRequestDTO) {
        List<EmployeeResponseDto> findEmployee = employeeService.findEmployee(employeeRequestDTO);
        return ResponseEntity.ok(findEmployee);
    }

    @PutMapping("/update-employee")
    public ResponseEntity<Employee> updateEmpoyee(@RequestBody EmployeeRequestDTO employeeRequestDTO) {
        Employee employeeDTO = employeeService.updateEmployee(employeeRequestDTO);
        return ResponseEntity.ok(employeeDTO);
    }
}

