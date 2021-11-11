package com.example.demospringboot.demointerceptor.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Machine {
    private String id;
    private String name;
    private double price;
}
