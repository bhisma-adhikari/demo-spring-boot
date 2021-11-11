package com.example.demospringboot.demointerceptor.controller;

import com.example.demospringboot.demointerceptor.model.Person;
import com.example.demospringboot.demointerceptor.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="demointerceptor")  // need to provide a unique value because this 'PersonController' conflicts with 'PersonController' from other package(s)
@RequestMapping("/demo-interceptor/person")
public class PersonController {
    @Autowired
    PersonService personService;


    @GetMapping("/{personId}")
    public Person findPersonById(@PathVariable String personId) {
        System.out.println("----------------- person controller --------------");
        return personService.findPersonById(personId);
    }


}
