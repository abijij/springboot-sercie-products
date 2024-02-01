package com.abijij.springboot.app.products.springbootsercieproducts.models.repository.service;

import java.util.List;

import com.abijij.springboot.app.products.springbootsercieproducts.models.entity.Product;

public interface IProductService {

    public List<Product> findAll();
    public Product findById(Long id);

}
