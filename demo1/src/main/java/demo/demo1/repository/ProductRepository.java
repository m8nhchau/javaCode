package demo.demo1.repository;

import demo.demo1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByProductName(String productName);

    List<Product> findByProductCd(String productCd);

    @Query(value = "SELECT * FROM product  WHERE product_Type_Cd = :productTypeCd;", nativeQuery = true)
    List<Product> findByProductTypeCd(@Param("productTypeCd") String productTypeCd);

}
