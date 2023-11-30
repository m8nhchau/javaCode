package demo.demo1.service;

import demo.demo1.dto.requestDTO.ProductRequestDTO;
import demo.demo1.dto.responseDTO.ProductResponseDTO;
import demo.demo1.entity.Product;
import demo.demo1.entity.ProductType;
import demo.demo1.mapper.ProductMapper;
import demo.demo1.mapper.ProductRequestMapper;
import demo.demo1.repository.ProductRepository;
import demo.demo1.repository.ProductTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    private final ProductRequestMapper productRequestMapper;

    private final ProductTypeRepository productTypeRepository;


    @Override
    public ProductResponseDTO getCreateProduct(ProductRequestDTO productRequestDTO) {

        Product productNew = productRequestMapper.toEntityProduct(productRequestDTO);

        List<Product> listProduct = productRepository.findByProductName(productRequestDTO.getProductName());
        if (!listProduct.isEmpty()) {
            throw new RuntimeException("Tên sản phẩm đã tồn tại!");
        }

        List<Product> productCd = productRepository.findByProductCd(productRequestDTO.getProductCd());
        if (!productCd.isEmpty()) {
            throw new RuntimeException("Tên ProductCD đa tồn tại!");
        }

        ProductType productTypeCd = productTypeRepository.findByProductTypeCd(productRequestDTO.getProductTypeCd());
        if (!productCd.isEmpty()) {
            throw new RuntimeException("Tên ProductTypeCd chưa tồn tại!");
        }
        productNew.setProductType(productTypeCd);

        productNew = productRepository.save(productNew);
        ProductResponseDTO productResponseDTO = productMapper.toResponses(productNew);
//        productResponseDTO.setProductTypeCd(productNew.getProductType().getProductTypeCd());
//        productResponseDTO.setProductType(null);
        return productResponseDTO;
    }

}





