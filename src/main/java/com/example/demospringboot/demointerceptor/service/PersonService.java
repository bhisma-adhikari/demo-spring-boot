package com.example.demospringboot.demointerceptor.service;

import com.example.demospringboot.demointerceptor.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public Person findPersonById(String id) {
        return new Person(id, "John", "Doe", 23);
    }
}
