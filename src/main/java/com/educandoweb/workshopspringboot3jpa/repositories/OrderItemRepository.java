package com.educandoweb.workshopspringboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshopspringboot3jpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}