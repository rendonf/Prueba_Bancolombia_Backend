package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelo.Pais;
import com.example.service.PaisService;


@RestController
@RequestMapping ("/pais/")
public class PaisRest {

	@Autowired
	private PaisService paisService;
	
	@GetMapping
	private ResponseEntity<List<Pais>> getAllPais(){
		return ResponseEntity.ok(paisService.findAll());
	}
}
