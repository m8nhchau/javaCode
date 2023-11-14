package demo.demo1.service;

import demo.demo1.dto.requestDTO.ProductRequestDTO;
import demo.demo1.dto.responseDTO.ProductResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    ProductResponseDTO getCreateProduct(ProductRequestDTO productDTO);
}
