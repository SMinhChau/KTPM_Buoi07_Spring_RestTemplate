package com.example.demojwt.repository;

import com.example.demojwt.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long > {
}
