package com.educandoweb.workshopspringboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshopspringboot3jpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}