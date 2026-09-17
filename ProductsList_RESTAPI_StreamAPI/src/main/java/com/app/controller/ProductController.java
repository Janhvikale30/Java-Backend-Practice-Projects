package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Product;
import com.app.service.ProductServiceI;

@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceI psi;
	
	@PostMapping("/product")
	public List<Product> addProducts(@RequestBody List<Product> p) {
		List<Product> pr = psi.addProduct(p);
		return pr;
	}
	
	@GetMapping("/get")
	public List<Product> retriveProduct(){
	List<Product> pr =	psi.getProduct();
	return pr;
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product p) {
		Product pr = psi.updateProduct(p);
		return pr;
	}
	
	//products with price greater than 50000
	
	@GetMapping("/products/expensive")
	public List<Product> expensiveProduct(@RequestParam double price){
	List<Product> p =	psi.expensiveProduct(price);
	return p;
	}
	
	//products with rating >=4
	
	@GetMapping("/rating/highrated")
	public List<Product> rating(){
	List<Product> p = 	 psi.ratingProduct();
	return p;
	}
	
	//priceSorting
	
	@GetMapping("/sorting/byprice")
	public List<Product> priceSorting(){
		List<Product> p = psi.sortByPrice();
		return p;
	}
	
	//most expensive product
	
	@GetMapping("/product/mostexpensive")
	public Product expensiveProduct() {
		Product p =psi.expensiveProduct();
		return p;
	}
	
	//cheapest product
	
	@GetMapping("/product/cheapestproduct")
	public Product cheapestProduct() {
		Product p = psi.cheapestProduct();
		return p;
	}
	
	//count products
	
	@GetMapping("/product/count")
	public long productCount() {
	long c =	psi.countProduct();
	return c;
	}
	
	// products from pune
	
	@GetMapping("/product/pune")
	public List<Product> puneProduct(){
	List<Product> p = 	psi.puneproduct();
	return p;
	}
	
	//unique brands
	
	@GetMapping("/product/uniquebrand")
	public List<String> uniqueBrand(){
	List<String> p =	psi.uniqueBrand();
	return p;
	}
	
	//any match for price > 1L
	
	@GetMapping("/product/price")
	public boolean checkprice() {
		boolean b = psi.priceCheck();
		return b;
	}

}
