package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//add
import org.springframework.cloud.config.server.EnableConfigServer;

//add
@EnableConfigServer
@SpringBootApplication
public class ConfserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfserverApplication.class, args);
    }
}
