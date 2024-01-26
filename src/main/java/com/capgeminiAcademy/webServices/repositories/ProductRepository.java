package com.capgeminiAcademy.webServices.repositories;

import com.capgeminiAcademy.webServices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
