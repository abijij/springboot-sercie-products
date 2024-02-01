package com.abijij.springboot.app.products.springbootsercieproducts.models.repository.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abijij.springboot.app.products.springbootsercieproducts.models.entity.Product;
import com.abijij.springboot.app.products.springbootsercieproducts.models.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {

        return (List<Product>)productRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(Long id) {
    
        return productRepository.findById(id).orElse(null);
    }

     





}
