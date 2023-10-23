package demo.demo1.Controller;

import demo.demo1.Entity.Customer;
import demo.demo1.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/get-all")
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
