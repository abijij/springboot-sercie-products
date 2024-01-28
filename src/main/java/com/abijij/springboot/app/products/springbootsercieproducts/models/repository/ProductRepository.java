package com.abijij.springboot.app.products.springbootsercieproducts.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.abijij.springboot.app.products.springbootsercieproducts.models.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Long>{

}
