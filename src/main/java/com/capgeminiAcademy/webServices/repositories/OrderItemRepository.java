package com.capgeminiAcademy.webServices.repositories;

import com.capgeminiAcademy.webServices.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
