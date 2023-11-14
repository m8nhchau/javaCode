package demo.demo1.mapper;

import demo.demo1.dto.responseDTO.CustomerDto;

import demo.demo1.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto toDto(Customer account);

    List<CustomerDto> toDtoS(List<Customer> accountList);
}
