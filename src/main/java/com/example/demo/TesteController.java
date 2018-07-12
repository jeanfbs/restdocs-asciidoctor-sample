package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController("app/")
public class TesteController {


    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity json() {

        User user = new User(UUID.randomUUID(), "Jean Santos", 26, "teste@teste.com");
        return ResponseEntity.ok(user);

    }
}
