package com.demersonreis.testes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demersonreis.testes.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
