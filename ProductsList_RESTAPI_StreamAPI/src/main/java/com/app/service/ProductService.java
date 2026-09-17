package com.app.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Product;
import com.app.repository.ProductRepositoryI;

@Service
public class ProductService implements ProductServiceI {

	@Autowired
	private ProductRepositoryI pr;

	@Override
	public List<Product> addProduct(List<Product> p) {
		List<Product> pr1 = (List<Product>) pr.saveAll(p);
		return pr1;
	}

	@Override
	public List<Product> getProduct() {
		List<Product> p = (List<Product>) pr.findAll();
		return p;
	}

	@Override
	public Product updateProduct(Product p) {
		Product pr2 = pr.save(p);
		return pr2;
	}

	@Override
	public List<Product> expensiveProduct(double price) {
		List<Product> pro = (List<Product>) pr.findAll();
		List<Product> result = pro.stream().filter(p -> p.getPrice() > 50000).collect(Collectors.toList());
		return result;
	}

	@Override
	public List<Product> ratingProduct() {
		List<Product> p = (List<Product>) pr.findAll();
		List<Product> pr = p.stream().filter(p1 -> p1.getRating() >= 4).collect(Collectors.toList());
		return pr;
	}

	@Override
	public List<Product> sortByPrice() {
		List<Product> p = (List<Product>) pr.findAll();
		List<Product> pro = p.stream().sorted(Comparator.comparing(Product::getPrice)).toList();
		return pro;
	}

	@Override
	public Product expensiveProduct() {
		List<Product> p = (List<Product>) pr.findAll();
		Product pro = p.stream().sorted(Comparator.comparing((Product pr) -> pr.getPrice()).reversed()).limit(1)
				.findFirst().orElse(null);
		return pro;
	}

	@Override
	public Product cheapestProduct() {
		List<Product> p = (List<Product>) pr.findAll();
		Product pro = p.stream().sorted(Comparator.comparing((Product pr) -> pr.getPrice())).limit(1).findFirst()
				.orElse(null);
		return pro;

	}

	@Override
	public long countProduct() {
		List<Product> p = (List<Product>) pr.findAll();
		long c = p.stream().count();
		return c;
	}

	@Override
	public List<Product> puneproduct() {
		List<Product> p = (List<Product>) pr.findAll();
		List<Product> res = p.stream().filter(pr -> pr.getCity().equalsIgnoreCase("pune")).toList();
		return res;
	}

	@Override
	public List<String> uniqueBrand() {

		List<Product> p = (List<Product>) pr.findAll();

		List<String> res = p.stream().map(Product::getBrand).distinct().toList();

		return res;
	}

	@Override
	public boolean priceCheck() {
		List<Product> p = (List<Product>) pr.findAll();
		boolean b = p.stream().anyMatch(pr->pr.getPrice()>100000);
		return b;
	}

}
