package demo.demo1.mapper;

import demo.demo1.dto.responseDTO.AccountDTO;
import demo.demo1.dto.responseDTO.AccountResponseDTO;
import demo.demo1.dto.responseDTO.EmployeeResponseDto;
import demo.demo1.entity.Account;
import demo.demo1.entity.Employee;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountDTO toDto(Account name);

    List<AccountDTO> toDtos(List<Account> nameList);

    @Named("toResponse")
    @Mapping(source = "customer.individual.firstName", target = "firstName")
    @Mapping(source = "customer.individual.lastName", target = "lastName")
    @Mapping(source = "branch.branchId", target = "branchId")
    @Mapping(source = "employee.empId", target = "empId")
    @Mapping(source = "product.productCd", target = "productCd")
    AccountResponseDTO toResponse(Account account);

    @IterableMapping(qualifiedByName = "toResponse")
    List<AccountResponseDTO> toResponses(List<Account> accountList);
}
