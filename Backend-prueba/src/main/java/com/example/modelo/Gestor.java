package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "GESTOR")
public class Gestor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGestor;
	private String nombreGestor;
	
	@ManyToOne
	@JoinColumn (name = "ID_PAIS")
	private Pais pais;
	
	public Gestor() {
		
	}
	
	public Gestor(String nombreGestor, Pais pais) {
		super();
		this.nombreGestor = nombreGestor;
		this.pais = pais;
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

		
}
