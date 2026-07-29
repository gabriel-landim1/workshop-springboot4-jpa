package com.landim.spring.repositories;

import com.landim.spring.entities.OrderItem;
import com.landim.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
