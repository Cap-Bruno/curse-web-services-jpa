package com.capgeminiAcademy.webServices.repositories;

import com.capgeminiAcademy.webServices.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
