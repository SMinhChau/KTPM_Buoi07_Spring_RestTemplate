package com.example.demojwt.service;

import com.example.demojwt.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    private RestTemplate restTemplate = new RestTemplate();

    private String url = "localhost:8080/api/";

    public List<Product> getListProduct(){
        ResponseEntity<Product[]> response =  restTemplate.getForEntity(url+"get-all",Product[].class);
        return Arrays.asList(response.getBody());
    }

    public Product create(Product student) {
        return restTemplate.postForObject(url+"create",student,Product.class);
    }

}
