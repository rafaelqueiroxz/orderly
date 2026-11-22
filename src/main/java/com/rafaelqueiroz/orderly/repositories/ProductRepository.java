package com.rafaelqueiroz.orderly.repositories;

import com.rafaelqueiroz.orderly.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
