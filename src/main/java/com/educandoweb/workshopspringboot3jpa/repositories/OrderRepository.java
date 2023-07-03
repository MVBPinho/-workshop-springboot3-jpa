package com.educandoweb.workshopspringboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshopspringboot3jpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}