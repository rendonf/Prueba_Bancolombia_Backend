package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.modelo.UsuarioMoneda;
import com.example.service.UsuarioMonedaService;

@RestController
@RequestMapping ("/usuarioMoneda/")
public class UsuarioMonedaRest {
	
	@Autowired
	private UsuarioMonedaService usuarioMonedaService;
	
	@GetMapping
	private ResponseEntity<List<UsuarioMoneda>> getAllUsuarioDetalle(){
		return ResponseEntity.ok(usuarioMonedaService.findAll());
	}
	
	@GetMapping ("/moneda/{id}")
	private ResponseEntity<List<UsuarioMoneda>> getAllUsuarioDetalleByMoneda(@PathVariable("id") Long idMoneda){
		return ResponseEntity.ok(usuarioMonedaService.findAllByMoneda(idMoneda));
	}
	
	@PostMapping ("/usuario")
	private ResponseEntity<List<UsuarioMoneda>> findAllByUsuario(@RequestParam(value="usuario", defaultValue="1") Long nombreUsuario){
		return ResponseEntity.ok(usuarioMonedaService.findAllByUsuario(nombreUsuario));
	}

}
