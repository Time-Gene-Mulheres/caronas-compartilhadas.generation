package com.github.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.model.Motorista;
import com.github.repository.MotoristaRepository;

import jakarta.validation.Valid;

@RestController

@RequestMapping("/motoristas")

@CrossOrigin (allowedHeaders = "*", origins = "*")

public class MotoristaController {
	
	@Autowired
	private MotoristaRepository motoristaRepository;

	@GetMapping
	public ResponseEntity<List<Motorista>> getAll(){
		return ResponseEntity.ok(motoristaRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Motorista>getById(@PathVariable Long id) {
		return motoristaRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@PostMapping
	public ResponseEntity<Motorista> post(@Valid @RequestBody Motorista motorista){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(motoristaRepository.save(motorista));
	}

}
