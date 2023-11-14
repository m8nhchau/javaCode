package demo.demo1.service;

import demo.demo1.dto.responseDTO.EmployeeInfoDto;
import demo.demo1.entity.Employee;
import demo.demo1.mapper.EmployeeMapper;
import demo.demo1.repository.EmployeeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService {
    @Autowired
    private EmployeeInfoRepository employeeInfoRepository;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeInfoDto> getEmployee(Integer empId) {
        List<Employee> employees = employeeInfoRepository.getEmployee();
        List<EmployeeInfoDto> employeeInfoDtos = employeeMapper.toDtos(employees);
        return employeeInfoDtos;
    }
}

