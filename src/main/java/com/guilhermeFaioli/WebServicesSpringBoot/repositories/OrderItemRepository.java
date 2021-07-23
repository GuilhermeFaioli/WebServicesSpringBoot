package com.guilhermeFaioli.WebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermeFaioli.WebServicesSpringBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
