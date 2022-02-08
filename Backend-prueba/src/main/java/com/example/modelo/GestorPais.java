package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "GESTOR_PAIS")
public class GestorPais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGestorPais;
	
	@ManyToOne
	@JoinColumn (name = "ID_GESTOR")
	private Gestor gestor;
	
	@ManyToOne
	@JoinColumn (name = "ID_PAIS")
	private Pais pais;

	public GestorPais() {
		
	}
		
	public GestorPais(Gestor gestor, Pais pais) {
		super();
		this.gestor = gestor;
		this.pais = pais;
	}

	public Long getId() {
		return idGestorPais;
	}

	public void setId(Long id) {
		this.idGestorPais = id;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
