package demo.demo1.service;

import demo.demo1.dto.responseDTO.CustomerDto;
import demo.demo1.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    List<CustomerDto> getCountByAccount();

}
