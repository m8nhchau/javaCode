package demo.demo1.mapper;


import demo.demo1.dto.responseDTO.ProductResponseDTO;
import demo.demo1.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "productType.productTypeCd", target = "productTypeCd")
    @Mapping(ignore = true, target = "productType")
    ProductResponseDTO toResponses(Product product);

    List<ProductResponseDTO> toResponses(List<Product> productLists);


}
