package com.example.demojwt.controller;


import com.example.demojwt.model.Product;
import com.example.demojwt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService orderService;

    @PostMapping("/create")
    public ResponseEntity createOrder(@RequestBody Product product) {
        return ResponseEntity.ok(orderService.create(product));
    }

    @GetMapping("/get-list")
    public ResponseEntity getListOrder() {
        return ResponseEntity.ok(orderService.getListProduct());
    }

}
