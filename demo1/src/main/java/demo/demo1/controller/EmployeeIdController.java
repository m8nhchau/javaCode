//package demo.demo1.controller;
//
//import demo.demo1.dto.responseDTO.EmployeeIdDto;
//import demo.demo1.entity.Employee;
//
//import demo.demo1.service.EmployeeIdServices;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/employeeId")
//@Slf4j
//public class EmployeeIdController {
//    @Autowired
//    private EmployeeIdServices employeeIdServices;
//
//    @GetMapping("/employeeIds")
////@GetMapping("/employeeIds/{id}")
//    public ResponseEntity<List<EmployeeIdDto>> getEmployees(@RequestParam(value = "empid", required = false) Integer id){
//        //log.info("id = {}, id2 = {}", id, id2);
//        List<EmployeeIdDto> employ = employeeIdServices.getfindBySuperiorEmpId(id);
//        return ResponseEntity.ok(employ);
//    }
//}