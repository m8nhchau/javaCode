package demo.demo1.repository;

import demo.demo1.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductTypeRepository extends JpaRepository<ProductType, String> {

    @Query("SELECT p FROM ProductType p WHERE p.productTypeCd = :productTypeCd")
    ProductType findByProductTypeCd(@Param("productTypeCd") String productTypeCd);
}
