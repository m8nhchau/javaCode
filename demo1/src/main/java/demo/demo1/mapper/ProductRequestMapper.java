package demo.demo1.mapper;

import demo.demo1.dto.requestDTO.ProductRequestDTO;
import demo.demo1.dto.requestDTO.ProductTypeRequestDTO;
import demo.demo1.entity.Product;
import demo.demo1.entity.ProductType;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductRequestMapper {
    Product toEntityProduct(ProductRequestDTO productRequestDTO);

    List<Product> toEntityProducts(List<ProductRequestDTO> productRequestDTOList);

//    ProductType toEntityProductType(ProductTypeRequestDTO productTypeRequestDTO);
//    List<ProductType> toEntityProductTypes(List<ProductTypeRequestDTO> productTypeRequestDTO);

}
