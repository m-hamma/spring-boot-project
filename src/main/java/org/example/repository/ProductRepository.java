package org.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
