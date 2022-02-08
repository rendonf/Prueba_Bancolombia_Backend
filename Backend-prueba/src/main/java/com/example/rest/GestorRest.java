package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelo.Gestor;
import com.example.service.GestorService;

@RestController
@RequestMapping ("/gestor/")
public class GestorRest {
	
	@Autowired
	private GestorService gestorService;
	
	@GetMapping
	private ResponseEntity<List<Gestor>> getAllGestor(){
		return ResponseEntity.ok(gestorService.findAll());
	}

}
