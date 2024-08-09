package com.app.product.reo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.product.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	 @Query(value = "SELECT * FROM product p WHERE p.category = :category", nativeQuery = true)
	List<Product> findByCategory(@Param("category")String category);

}
