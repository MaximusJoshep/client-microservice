package com.bank.servis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.Client;
import com.bank.repository.ClientRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServisClientImpl implements IServiceClient {
	@Autowired
	ClientRepository repository;

	@Override
	public Flux<Client> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Mono<Client> save(Client client) {
		// TODO Auto-generated method stub
		return repository.save(client);
	}

}
