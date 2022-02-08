package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "PAIS")
public class Pais {
	
	@Id
	private Long idPais;
	private String nombrePais;
	
	public Pais() {
		
	}
			
	public Pais(Long idPais, String nombrePais) {
		super();
		this.idPais = idPais;
		this.nombrePais = nombrePais;
	}

	public Long getIdPais() {
		return idPais;
	}
	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	
}
