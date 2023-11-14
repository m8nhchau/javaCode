package demo.demo1.controller;

import demo.demo1.dto.requestDTO.ProductRequestDTO;
import demo.demo1.dto.responseDTO.ProductResponseDTO;
import demo.demo1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/create-product")
    public ResponseEntity<ProductResponseDTO> getCreateProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        ProductResponseDTO product = productService.getCreateProduct(productRequestDTO);
        return ResponseEntity.ok(product);

    }
}
