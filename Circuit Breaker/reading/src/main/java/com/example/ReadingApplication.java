package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@RestController
@SpringBootApplication
public class ReadingApplication {

    @RequestMapping("/to-read")
    public String readingList() {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = URI.create("http://localhost:8090/recommended");

        return restTemplate.getForObject(uri, String.class);
    }

    @Autowired
    private BookService bookService;

    @RequestMapping("/to-read2")
    public String toRead() {
        return bookService.readingList();
    }



    public static void main(String[] args) {
        SpringApplication.run(ReadingApplication.class, args);
    }
}
