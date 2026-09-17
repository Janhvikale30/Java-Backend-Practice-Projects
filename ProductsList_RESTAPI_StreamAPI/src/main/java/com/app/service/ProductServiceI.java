package com.app.service;

import java.util.List;

import com.app.model.Product;

public interface ProductServiceI {
	public List<Product> addProduct(List<Product> p);
	public List<Product> getProduct();
	public Product updateProduct(Product p);
	public List<Product> expensiveProduct(double price);
	public List<Product> ratingProduct();
    public List<Product> sortByPrice();
	public Product expensiveProduct();
	public Product cheapestProduct();
	public long countProduct();
	public List<Product> puneproduct();
	public List<String> uniqueBrand();
	public boolean priceCheck();
}
