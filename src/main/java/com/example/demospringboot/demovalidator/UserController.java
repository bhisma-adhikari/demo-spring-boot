package com.example.demospringboot.demovalidator;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/demo-validator/user")
@Validated
public class UserController {

    // if validation fails for path variables, Spring, by default, triggers ConstraintViolationException and throws 500 error.
    // but, we want to throw 400 error, so we define handleConstrintViolationException() method
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException e) {
        return new ResponseEntity<>("not valid due to validation error: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    // if validation fails, Spring, by default, triggers ConstraintViolationException and throws 500 error.
    // but, we want to throw 400 error, so we define handleConstrintViolationException() method
    @GetMapping("/{userId}")
    public ResponseEntity<User> findUserById(@PathVariable @Size(min=3, max=3) String userId) { // to activate this validation, this class must be '@Validated'
        Address address = new Address("325 foxfire dr", "Oxford", "45056");
        User user = new User(userId, "John Doe", 55, address);
        return ResponseEntity.ok(user);
    }


    @PostMapping()
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) { // no class-level @Validated required (having one doesn't hurt either)
        return ResponseEntity.ok(user);
    }
}
