package com.example.demospringboot.demovalidator;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor
public class User {

    private String id;

    @NotEmpty
    private String name;

    @Min(1)
    @Max(150)
    int age;

    @Valid
    private Address address;
}