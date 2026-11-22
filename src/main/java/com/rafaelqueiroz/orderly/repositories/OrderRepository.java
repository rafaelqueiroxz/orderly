package com.rafaelqueiroz.orderly.repositories;

import com.rafaelqueiroz.orderly.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
