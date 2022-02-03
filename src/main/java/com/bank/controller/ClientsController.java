package com.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
@RequestMapping("clients")
@RestController
public class ClientsController {
    @GetMapping
    public Flux<String> getAll()
    {
        return Flux.empty();
    }

    
}
