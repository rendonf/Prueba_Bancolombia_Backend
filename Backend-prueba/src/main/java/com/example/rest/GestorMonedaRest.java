package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelo.GestorMoneda;
import com.example.service.GestorMonedaService;

@RestController
@RequestMapping ("/gestorMoneda/")
public class GestorMonedaRest {
	
	@Autowired
	private GestorMonedaService gestorMonedaService;
	
	@GetMapping
	private ResponseEntity<List<GestorMoneda>> getAllGestorMoneda(){
		return ResponseEntity.ok(gestorMonedaService.findAll());
	}
	
	/*@GetMapping ("/gestor/{id}")
	private ResponseEntity<List<GestorMoneda>> getAllGestorMonedaByGestor(@PathVariable("id") Long idGestor){
		return ResponseEntity.ok(gestorMonedaService.findAllByGestor(idGestor));
	}
	
	@GetMapping ("/moneda/{id}")
	private ResponseEntity<List<GestorMoneda>> getAllGestorMonedaByMoneda(@PathVariable("id") Long idMoneda){
		return ResponseEntity.ok(gestorMonedaService.findAllByMoneda(idMoneda));
	}*/

}
