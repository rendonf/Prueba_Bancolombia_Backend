package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "GESTOR_MONEDA")
public class GestorMoneda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGestorMoneda;
	
	@ManyToOne
	@JoinColumn (name = "ID_GESTOR")
	private Gestor gestor;
	
	@ManyToOne
	@JoinColumn (name = "ID_MONEDA_PAIS")
	private Moneda moneda;

	public GestorMoneda() {
		
	}
		
	public GestorMoneda(Gestor gestor, Moneda moneda) {
		super();
		this.gestor = gestor;
		this.moneda = moneda;
	}

	public Long getId() {
		return idGestorMoneda;
	}

	public void setId(Long id) {
		this.idGestorMoneda = id;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	
	

}
