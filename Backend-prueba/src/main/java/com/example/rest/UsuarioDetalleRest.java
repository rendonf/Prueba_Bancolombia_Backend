package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelo.UsuarioDetalle;
import com.example.service.UsuarioDetalleService;

@RestController
@RequestMapping ("/usuarioDetalle/")
public class UsuarioDetalleRest {
	
	@Autowired
	private UsuarioDetalleService usuarioDetalleService;
	
	@GetMapping
	private ResponseEntity<List<UsuarioDetalle>> getAllUsuarioDetalle(){
		return ResponseEntity.ok(usuarioDetalleService.findAll());
	}
	
	@GetMapping ("/moneda/{id}")
	private ResponseEntity<List<UsuarioDetalle>> getAllUsuarioDetalleByMoneda(@PathVariable("id") Long idMoneda){
		return ResponseEntity.ok(usuarioDetalleService.findAllByMoneda(idMoneda));
	}
	
	@GetMapping ("/gestor/{id}")
	private ResponseEntity<List<UsuarioDetalle>> getAllUsuarioDetalleByGestor(@PathVariable("id") Long idGestor){
		return ResponseEntity.ok(usuarioDetalleService.findAllByGestor(idGestor));
	}
	
	@GetMapping ("/usuario/{id}")
	private ResponseEntity<List<UsuarioDetalle>> getAllUsuarioDetalleByUsuario(@PathVariable("id") Long idUsuario){
		return ResponseEntity.ok(usuarioDetalleService.findAllByUsuario(idUsuario));
	}

}
