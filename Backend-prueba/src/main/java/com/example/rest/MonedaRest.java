package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelo.Moneda;
import com.example.service.MonedaService;

@RestController
@RequestMapping ("/moneda/")
public class MonedaRest {
	
	@Autowired
	private MonedaService monedaService;
	
	@GetMapping
	private ResponseEntity<List<Moneda>> getAllMoneda(){
		return ResponseEntity.ok(monedaService.findAll());
	}
}
