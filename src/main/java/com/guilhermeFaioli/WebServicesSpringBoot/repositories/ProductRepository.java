package com.guilhermeFaioli.WebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermeFaioli.WebServicesSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
