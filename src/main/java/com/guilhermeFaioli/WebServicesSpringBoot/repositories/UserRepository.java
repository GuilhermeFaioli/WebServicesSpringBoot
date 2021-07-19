package com.guilhermeFaioli.WebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermeFaioli.WebServicesSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
