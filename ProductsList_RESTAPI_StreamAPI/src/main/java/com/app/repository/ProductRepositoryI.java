package com.app.repository;


import org.springframework.data.repository.CrudRepository;

import com.app.model.Product;

public interface ProductRepositoryI extends CrudRepository<Product, Integer> {

}
