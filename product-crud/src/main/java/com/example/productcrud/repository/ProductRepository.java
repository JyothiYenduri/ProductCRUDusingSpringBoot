package com.example.productcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productcrud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

