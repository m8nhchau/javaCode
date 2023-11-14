//package demo.demo1.controller;
//
//import demo.demo1.dto.responseDTO.CustomerDto;
//import demo.demo1.entity.Customer;
//import demo.demo1.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@RestController
//@RequestMapping("/api/customer")
//public class CustomerController {
//
//    @Autowired
//    private CustomerService customerService;
//    @GetMapping("/get-all")
//    public ResponseEntity<List<Customer>> getAllCustomers() {
//        List<Customer> customers = customerService.getAllCustomers();
//            return ResponseEntity.ok(customers);
//    }
//
//    @GetMapping("/count")
//    public ResponseEntity<List<CustomerDto>> getCountByAccount() {
//        List<CustomerDto> count = customerService.getCountByAccount();
//        return ResponseEntity.ok(count);
//    }
//
//}
//
//
