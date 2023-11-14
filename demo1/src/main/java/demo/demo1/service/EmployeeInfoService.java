package demo.demo1.service;

import demo.demo1.dto.responseDTO.EmployeeInfoDto;

import java.util.List;

public interface EmployeeInfoService {
    List<EmployeeInfoDto> getEmployee(Integer empId);

}

