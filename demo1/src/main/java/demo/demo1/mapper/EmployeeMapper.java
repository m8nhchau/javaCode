package demo.demo1.mapper;

import demo.demo1.dto.responseDTO.EmployResponseNameDTO;
import demo.demo1.dto.responseDTO.EmployeeInfoDto;
import demo.demo1.dto.responseDTO.EmployeeResponseDto;
import demo.demo1.entity.Employee;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeInfoDto toDto(Employee employee);

    List<EmployeeInfoDto> toDtos(List<Employee> employeeList);

    @Named("toResponse")
    @Mapping(source = "department.departmentName", target = "departmentName")
    @Mapping(source = "branch.branchName", target = "branchName")
    EmployeeResponseDto toResponse(Employee employ);

    @IterableMapping(qualifiedByName = "toResponse")
    List<EmployeeResponseDto> toResponses(List<Employee> employList);


    EmployResponseNameDTO toResponseName(Employee employees);

    List<EmployResponseNameDTO> toResponseNames(List<Employee> employeeLists);


}
