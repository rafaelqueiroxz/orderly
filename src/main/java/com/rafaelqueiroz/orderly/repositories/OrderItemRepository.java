package com.rafaelqueiroz.orderly.repositories;

import com.rafaelqueiroz.orderly.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
