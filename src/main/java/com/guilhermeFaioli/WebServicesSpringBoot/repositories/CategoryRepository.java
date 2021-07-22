package com.guilhermeFaioli.WebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermeFaioli.WebServicesSpringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
