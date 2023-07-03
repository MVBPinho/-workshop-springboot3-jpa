package com.educandoweb.workshopspringboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshopspringboot3jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}