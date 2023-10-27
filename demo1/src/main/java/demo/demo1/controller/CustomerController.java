package demo.demo1.controller;

import demo.demo1.dto.FindCustomerDto;
import demo.demo1.entity.Customer;
import demo.demo1.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
@Slf4j
public class CustomerController {
    private List<Customer> customers = new ArrayList<>();
    @Autowired
    private CustomerRepository customerRepository ;


//    @PostMapping(value = "/find-by-id")
//    public ResponseEntity<Customer> findByCustomer(@RequestBody FindCustomerDto dto) {
//
//       Optional<Customer> customer = customerRepository.findById(dto.getCustId());
//        log.info("CustId ={}", dto.getCustId().toString());
//        return ResponseEntity.ok(customer.get());
//    }
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


