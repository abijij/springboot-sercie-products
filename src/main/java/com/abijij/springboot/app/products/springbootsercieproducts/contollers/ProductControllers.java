package com.abijij.springboot.app.products.springbootsercieproducts.contollers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abijij.springboot.app.products.springbootsercieproducts.models.entity.Product;
import com.abijij.springboot.app.products.springbootsercieproducts.models.repository.service.IProductService;



@RestController
public class ProductControllers {

    @Value("${server.port}")
	private Integer port;

    @Autowired
    private IProductService productService;

    @GetMapping("/toList")
    public List<Product> toList(){

            return productService.findAll().stream().map(product ->{
                product.setPort(port);
                return product;
            }).collect(Collectors.toList());
    }   

    @GetMapping("/detal/{id}")
    public Product detail(@PathVariable Long id) {
        Product product = productService.findById(id);
        product.setPort(port);
        return product;
    }
    



}
