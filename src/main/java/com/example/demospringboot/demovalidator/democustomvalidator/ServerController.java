package com.example.demospringboot.demovalidator.democustomvalidator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/demo-custom-validator/server")
public class ServerController {

    @PostMapping()
    public ResponseEntity<Server> addServer(@Valid @RequestBody Server server) {
        return ResponseEntity.ok(server);
    }
}
