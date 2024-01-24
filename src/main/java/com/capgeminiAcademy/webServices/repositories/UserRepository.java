package com.capgeminiAcademy.webServices.repositories;

import com.capgeminiAcademy.webServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
