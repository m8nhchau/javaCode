//package demo.demo1.controller;
//
//import demo.demo1.dto.EmployeeDto;
//import demo.demo1.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.text.ParseException;
//import java.util.List;
//
//
//@RestController
//@RequestMapping("/api/employee")
//public class EmployeeController {
//    @Autowired
//    private EmployeeService employeeService;
//
//    @GetMapping("/employees")
//    public ResponseEntity<List<EmployeeDto>> getEmployees(EmployeeDto dto) throws ParseException {
//        List<EmployeeDto> employees = employeeService.getEmployeesStartedAfter2001();
//        return ResponseEntity.ok(employees);
//    }
//}
//
//
//
//
