package com.example.demospringboot.demomisc;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
}
