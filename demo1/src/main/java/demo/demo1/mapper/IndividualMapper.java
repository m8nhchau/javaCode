package demo.demo1.mapper;

import demo.demo1.dto.responseDTO.IndividualDto;
import demo.demo1.entity.Individual;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IndividualMapper {
    IndividualDto toDto(Individual fullName);

    List<IndividualDto> toDtoS(List<Individual> fullNameList);
}
