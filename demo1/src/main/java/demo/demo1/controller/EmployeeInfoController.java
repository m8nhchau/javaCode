package demo.demo1.controller;


import demo.demo1.dto.responseDTO.EmployeeInfoDto;
import demo.demo1.service.EmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeInfoController {

    @Autowired
    private EmployeeInfoService employeeInfoService;

    @GetMapping("/{empId}")
    public ResponseEntity<List<EmployeeInfoDto>> getEmployeeDetails(@PathVariable Integer empId) {
        List<EmployeeInfoDto> employees = employeeInfoService.getEmployee(empId);
        return ResponseEntity.ok(employees);
    }
}

