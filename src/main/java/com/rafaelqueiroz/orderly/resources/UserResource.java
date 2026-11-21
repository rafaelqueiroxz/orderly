package com.rafaelqueiroz.orderly.resources;

import com.rafaelqueiroz.orderly.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Beatriz", "bia@gmail.com","11 99999-9999", "12345");
        return ResponseEntity.ok().body(user);
    }

}
