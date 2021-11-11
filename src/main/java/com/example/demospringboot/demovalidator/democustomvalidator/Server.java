package com.example.demospringboot.demovalidator.democustomvalidator;

import lombok.Data;

@Data
public class Server {
    String domainName;

    @IpAddress  // custom validator
    String ipAddress;
}
