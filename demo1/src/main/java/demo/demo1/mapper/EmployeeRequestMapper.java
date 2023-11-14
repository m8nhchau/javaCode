package demo.demo1.mapper;

import demo.demo1.dto.requestDTO.EmployRequestNameDTO;
import demo.demo1.dto.requestDTO.EmployeeRequestDTO;
import demo.demo1.entity.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeRequestMapper {
    Employee toEntity(EmployeeRequestDTO employ);

    List<Employee> toEntity(List<EmployeeRequestDTO> employList);

    Employee toEntitys(EmployRequestNameDTO employs);

    List<Employee> toEntitys(List<EmployRequestNameDTO> employLists);
}
