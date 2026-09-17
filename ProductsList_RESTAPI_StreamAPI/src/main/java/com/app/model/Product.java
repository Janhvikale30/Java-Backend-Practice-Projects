package com.app.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String category;
	private String brand;
	private double price;
	private int quantity;
	private double rating;
	private String city;

	
	public Product(Integer id, String name, String category, String brand, double price, int quantity, double rating,
			String city) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.rating = rating;
		this.city = city;
		
	}
	public Product() {          //If Product doesn't have a no-argument constructor, Hibernate can't create the object, resulting in No default constructor for entity 'com.app.model.Product'
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getRating() {
		return rating;
	}

	public String getCity() {
		return city;
	}

	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", brand=" + brand + ", price="
				+ price + ", quantity=" + quantity + ", rating=" + rating + ", city=" + city + "]";
	}

}
