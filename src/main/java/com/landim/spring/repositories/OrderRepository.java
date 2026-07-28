package com.landim.spring.repositories;

import com.landim.spring.entities.Order;
import com.landim.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
