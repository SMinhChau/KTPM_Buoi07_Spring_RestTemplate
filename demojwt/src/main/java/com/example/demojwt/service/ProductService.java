package com.example.demojwt.service;


import com.example.demojwt.model.Product;
import com.example.demojwt.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public Product create(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getListProduct(){
        return productRepository.findAll();
    }


    public Optional<Product> find(Long productId){
        return productRepository.findById(productId);
    }
}
