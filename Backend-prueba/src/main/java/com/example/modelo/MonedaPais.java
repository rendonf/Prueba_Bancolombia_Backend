package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "MONEDA_PAIS")
public class MonedaPais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMonedaPais;
	
	@ManyToOne
	@JoinColumn (name = "ID_MONEDA")
	private Moneda moneda;
	
	@ManyToOne
	@JoinColumn (name = "ID_PAIS")
	private Pais pais;

	public MonedaPais() {
		
	}
	
	public MonedaPais(Moneda moneda, Pais pais) {
		super();
		this.moneda = moneda;
		this.pais = pais;
	}

	public Long getId() {
		return idMonedaPais;
	}

	public void setId(Long id) {
		this.idMonedaPais = id;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
