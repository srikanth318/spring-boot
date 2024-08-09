package com.app.product.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.product.entity.Product;
import com.app.product.reo.ProductRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

	public Product saveProduct(Product product) {

		return productRepo.save(product);
	}

	public List<Product> listAllProducts() {
		List<Product> productList = productRepo.findAll();
		return productList;
	}

	public List<Product> productCategoryList(String category) {

		return productRepo.findByCategory(category);
	}

	public Product productById(Integer id) {

		return productRepo.findById(id).get();
	}

	public String updateProduct(Product product) {
		
		productRepo.save(product);
		return "succefully updated..";
	}

	public String deleteProductById(Integer id) {

		Optional<Product> product = productRepo.findById(id);
		
		if(product.isPresent()) 
		{
			productRepo.deleteById(id);
			return "product deleted.."+id;
		}
		
		return "product delete failed..";
	}

}
