package com.example.demospringboot;


import com.example.demospringboot.demovalidator.Address;

import javax.xml.validation.Validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("5401 e parmer ln", "Austi", "33223");
        System.out.println(address);


    }




}
