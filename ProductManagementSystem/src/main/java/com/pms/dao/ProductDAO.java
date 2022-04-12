package com.pms.dao;

import java.util.List;

import com.pms.model.Product;

public interface ProductDAO {
	
	public void addProduct();
	public Product viewProduct(int productId);
	public List<Product> viewAllProducts();
	public void updateProduct(int productId);
	public void deleteProduct(int productId);
	public void bill();
	public void back();
}

