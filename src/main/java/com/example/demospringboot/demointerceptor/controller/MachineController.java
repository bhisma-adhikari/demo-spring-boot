package com.example.demospringboot.demointerceptor.controller;

import com.example.demospringboot.demointerceptor.model.Machine;
import com.example.demospringboot.demointerceptor.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MachineController {
    @Autowired
    MachineService machineService;

    @GetMapping("/machine/{machineId}")
    public Machine findMachineById(@PathVariable String machineId) {
        System.out.println("-----------------machine controller --------------");
        return machineService.findMachineById(machineId);
    }


}
