package com.example.demojpa.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojpa.model.Product;
import com.example.demojpa.repository.ProductRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/getProducts")
	public ResponseEntity<List<Product>> getProducts(){
		
		List<Product> products = new ArrayList<Product>();
		productRepository.findAll().forEach(products::add);
		
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	@PostMapping("/product")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		Product _product = productRepository.save(new Product(product.getProdId(),product.getProdName(),product.getProdDesc(),product.getPrice()));
		
		return new ResponseEntity<>(_product, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") String id){
		
		Optional<Product> productData = productRepository.findById(id);
		
		if(productData.isPresent()) {
			 return new ResponseEntity<>(productData.get(),HttpStatus.OK);
		} 
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/product/{id}")
	public ResponseEntity<Product> updateProductById(@PathVariable("id") String id,@RequestBody Product product ){
		
		Optional<Product> productData = productRepository.findById(id);
		
		if(productData.isPresent()) {
			Product prod = productData.get();
			prod.setPrice(product.getPrice());
			prod.setProdName(product.getProdName());
			prod.setProdDesc(product.getProdDesc());
			
			return new ResponseEntity<>(productRepository.save(prod),HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<Product> deleteProductById(@PathVariable("id") String id){
		
		try {
		productRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
			catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	}

