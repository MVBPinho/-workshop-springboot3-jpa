package com.educandoweb.workshopspringboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshopspringboot3jpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}