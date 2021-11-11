package com.example.demospringboot.demomisc;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController(value="demomisc")  // need to provide a unique value because this 'PersonController' conflicts (exact name) with 'PersonController' from other package(s)
@RequestMapping("/demo-misc/person")
public class PersonController {
    @GetMapping(value = "/{personId}", headers = "myheadername=myheadervalue")
    public Person findPersonById(@PathVariable String personId) {
        return new com.example.demospringboot.demomisc.Person(personId, "John", "Doe", 22);
    }

    @PostMapping(value="", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person addPerson(@Validated  @RequestBody Person person) {
        person.setId("111");
        return person;
    }

}
