package com.example.demospringboot.demointerceptor.service;

import com.example.demospringboot.demointerceptor.model.Machine;
import com.example.demospringboot.demointerceptor.model.Person;
import org.springframework.stereotype.Service;

@Service
public class MachineService {
    public Machine findMachineById(String id) {
        return new Machine(id, "Computer", 1000);
    }
}
