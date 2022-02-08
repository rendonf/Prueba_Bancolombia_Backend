package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelo.Usuario;
import com.example.service.UsuarioService;

@RestController
@RequestMapping ("/usuario/")
public class UsuarioRest {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	private ResponseEntity<List<Usuario>> getAllUsuario(){
		return ResponseEntity.ok(usuarioService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Usuario>> getAllUsuarioByPais (@PathVariable("id") Long idPais){
		return ResponseEntity.ok(usuarioService.findAllByPais(idPais));
	}
}
