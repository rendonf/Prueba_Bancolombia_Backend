package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelo.GestorPais;
import com.example.service.GestorPaisService;

@RestController
@RequestMapping ("/gestorPais/")
public class GestorPaisRest {
	
	@Autowired
	private GestorPaisService gestorPaisService;
	
	@GetMapping ("{id}")
	private ResponseEntity<List<GestorPais>> getAllGestorPaisByPais(@PathVariable("id") Long idPais){
		return ResponseEntity.ok(gestorPaisService.findAllByPais(idPais));
	}

}
