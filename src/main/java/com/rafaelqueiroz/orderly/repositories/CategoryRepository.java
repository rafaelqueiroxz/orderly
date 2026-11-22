package com.rafaelqueiroz.orderly.repositories;

import com.rafaelqueiroz.orderly.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
