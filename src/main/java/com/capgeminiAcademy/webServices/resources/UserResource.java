package com.capgeminiAcademy.webServices.resources;

import com.capgeminiAcademy.webServices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Bruno", "bruno@email.com", "999999", "1234");
        return ResponseEntity.ok().body(user);
    }
}
