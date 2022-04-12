package com.example.demojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demojpa.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
