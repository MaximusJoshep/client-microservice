package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Client;
import com.bank.servis.IServiceClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ClientController {
	@Autowired
	IServiceClient service;
	
	@GetMapping("/clients")
	public Flux<Client> getClient(){
		return service.findAll();
	}
	
	@PostMapping("/postclient")
	Mono<Client> postClient(@RequestBody Client client)
	{
		return service.save(client);
	}
	

}
