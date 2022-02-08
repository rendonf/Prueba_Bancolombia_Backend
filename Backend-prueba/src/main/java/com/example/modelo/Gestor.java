package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "GESTOR")
public class Gestor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGestor;
	private String nombreGestor;
	
	public Gestor() {
		
	}
	
	public Gestor(String nombreGestor) {
		super();
		this.nombreGestor = nombreGestor;
	}
	
	public Long getIdGestor() {
		return idGestor;
	}
	public void setIdGestor(Long idGestor) {
		this.idGestor = idGestor;
	}
	public String getNombreGestor() {
		return nombreGestor;
	}
	public void setNombreGestor(String nombreGestor) {
		this.nombreGestor = nombreGestor;
	}
	
}
