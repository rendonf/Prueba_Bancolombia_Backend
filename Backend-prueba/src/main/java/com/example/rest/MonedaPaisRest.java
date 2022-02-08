package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelo.MonedaPais;
import com.example.service.MonedaPaisService;

@RestController
@RequestMapping ("/monedaPais/")
public class MonedaPaisRest {
	
	@Autowired
	private MonedaPaisService monedaPaisService;
	
	@GetMapping ("{id}")
	private ResponseEntity<List<MonedaPais>> getAllMonedaPaisByPais (@PathVariable("id") Long idPais){
		return ResponseEntity.ok(monedaPaisService.findAllByPais(idPais));
	}

}
