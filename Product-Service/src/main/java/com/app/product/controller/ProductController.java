package com.app.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.product.entity.Product;
import com.app.product.exception.ProductOfferNotValidException;
import com.app.product.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1")
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
	public ResponseEntity<?> addProduct(@RequestBody @Valid Product product) {

		try {

			Product prod = productService.saveProduct(product);
			if (prod != null) {

				logger.info("product added status - {}", prod);
				return ResponseEntity.status(HttpStatus.CREATED).body(prod);
				
			} else {

				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("could not create new resource..");
			}

		} catch (Exception e) {

			logger.info(e.getMessage());
			throw new ProductOfferNotValidException("Offer not valid exception..");
		}

		
	}

	@GetMapping("/productList")
	public ResponseEntity<List<Product>> productList() {

		List<Product> listOfProduct = productService.listAllProducts();
		logger.info("product fetch list status - {}", listOfProduct);

		return ResponseEntity.status(HttpStatus.OK).body(listOfProduct);
	}

	@GetMapping("/productList/{category}")
	public ResponseEntity<List<Product>> productCategoryList(@PathVariable String category) {

		List<Product> listOfProduct = productService.productCategoryList(category);
		logger.info("product fetching list by category status - {}", listOfProduct);

		return ResponseEntity.status(HttpStatus.OK).body(listOfProduct);
	}

	@GetMapping("/product/{id}")
	public ResponseEntity<Product> productById(@PathVariable Integer id) {

		Product listOfProduct = productService.productById(id);
		logger.info("product fetching by id status - {}", listOfProduct);

		return ResponseEntity.status(HttpStatus.OK).body(listOfProduct);
	}

	@PutMapping("/updateProduct")
	public ResponseEntity<String> updateProduct(@RequestBody Product product) {

		String updateObj = productService.updateProduct(product);
		logger.info("product updateProduct status - {}", updateObj);

		return ResponseEntity.status(HttpStatus.OK).body(updateObj);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable Integer id) {

		String response = productService.deleteProductById(id);
		logger.info("product deleteProduct by id status - {}", response);

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}
