package demo.demo1.controller;

import demo.demo1.dto.FindCustomerDto;
import demo.demo1.entity.Customer;
import demo.demo1.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
@Slf4j
public class CustomerController {
    private List<Customer> customers = new ArrayList<>();
    @PostMapping(value = "/find-by-id")
    public ResponseEntity<Customer> findByCustomer(@RequestBody FindCustomerDto dto) {

        log.info("CustId ={}", dto.getCustId().toString());
        return ResponseEntity.ok(new Customer());
    }
    public List<Customer> getCustomers() {
        return customers;
    }
}
//@RestController
//@RequestMapping("/api/customers")
//@Slf4j
//public class CustomerController {
//
//    private final CustomerRepository customerRepository;
//
//    private List<Customer> customers = new ArrayList<>();
//
//    public CustomerController(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//
//    @PostMapping("/find-by-customer-id/{id}")
//    public ResponseEntity<Customer> getCustomerByCustId(@PathVariable("id") Integer id) {
//
//        Customer customers = customerRepository.findByCustId(id);
//        log.info("CustId ={}", id);
//
//        return ResponseEntity.ok(customers);
//
//        //new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    public List<Customer> getCustomers() {
//        return customers;
//    }
//}


