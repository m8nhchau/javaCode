//package demo.demo1.service;
//
//import demo.demo1.dto.responseDTO.CustomerDto;
//import demo.demo1.entity.Account;
//import demo.demo1.entity.Customer;
//import demo.demo1.mapper.CustomerMapper;
//import demo.demo1.repository.CustomerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicReference;
//
//@Service
//public class CustomerServiceIpml implements CustomerService {
//    @Autowired
//    private CustomerRepository customerRepository;
//    @Autowired
//    private CustomerMapper customerMapper;
//
//
//    //Truy vấn mỗi khách hàng (customer) có bao nhiêu tài khoản (account)
//    @Override
//    public List<Customer> getAllCustomers() {
//         return customerRepository.findAll();
//    }
//
//    @Override
//    public List<CustomerDto> getCountByAccount() {
//        List<Customer> customers = customerRepository.findAll();
//        List<CustomerDto> customerDtos = new ArrayList<>();
//        customers.forEach(x -> {
//            CustomerDto customerDto = customerMapper.toDto(x);
//            customerDto.setCountAccount(x.getAccounts().size());
//
//
//            Double pendingBalance = x.getAccounts().stream().mapToDouble(Account::getPendingBalance).sum();
//            customerDto.setPendingBalance(pendingBalance);
//
//            AtomicReference<Double> availBalances = new AtomicReference<>(0d);
//            x.getAccounts().forEach(account -> {
//                if("ACTIVE".equalsIgnoreCase(account.getStatus())) {
//                    availBalances.updateAndGet(v -> v + account.getAvailBlance());
//
//                }
//            });
//            customerDto.setAvailBalance(pendingBalance);
//
//            customerDtos.add(customerDto);
//        });
//
//        return  customerDtos;
//    }
//
//
//
//}
//
