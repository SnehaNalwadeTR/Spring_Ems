package com.sneha.sprintboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneha.sprintboot.model.Products;

public interface ProductsRepository extends JpaRepository<Products,Integer>{

}
