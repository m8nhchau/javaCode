package demo.demo1.mapper;

import demo.demo1.dto.EmployeeIdDto;
import demo.demo1.entity.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeIdDto toDto(Employee employee);

    List<EmployeeIdDto> toDtos(List<Employee> employeeList);
}
