package demo.demo1.service;


import demo.demo1.dto.EmployeeIdDto;

import java.util.List;

public interface EmployeeIdServices {
    List<EmployeeIdDto> getAllSuperEmployee();
    List<EmployeeIdDto> getfindBySuperiorEmpId(Integer id);
}
