package com.abijij.springboot.app.products.springbootsercieproducts.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abijij.springboot.app.products.springbootsercieproducts.models.entity.Product;
import com.abijij.springboot.app.products.springbootsercieproducts.models.repository.service.IProductService;



@RestController
public class ProductControllers {

    @Autowired
    private IProductService productService;

    @GetMapping("/toList")
    public List<Product> toList(){
            return productService.findAll();
    }   

    @GetMapping("/detal/{id}")
    public Product detail(@PathVariable Long id) {
        return productService.findById(id);
    }
    



}
