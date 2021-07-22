package com.guilhermeFaioli.WebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermeFaioli.WebServicesSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
