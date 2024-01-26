package com.capgeminiAcademy.webServices.repositories;

import com.capgeminiAcademy.webServices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
