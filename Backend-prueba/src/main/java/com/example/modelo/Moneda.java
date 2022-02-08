package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "MONEDA")
public class Moneda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMoneda;
	private String simboloMoneda;
	private String nombreMoneda;
	private float valorDolar;
	
	public Moneda() {
		
	}
		
	public Moneda(String simboloMoneda, String nombreMoneda, float valorDolar) {
		super();
		this.simboloMoneda = simboloMoneda;
		this.nombreMoneda = nombreMoneda;
		this.valorDolar = valorDolar;
	}
	
	public Long getIdMoneda() {
		return idMoneda;
	}
	public void setIdMoneda(Long idMoneda) {
		this.idMoneda = idMoneda;
	}
	public String getSimboloMoneda() {
		return simboloMoneda;
	}
	public void setSimboloMoneda(String simboloMoneda) {
		this.simboloMoneda = simboloMoneda;
	}
	public String getNombreMoneda() {
		return nombreMoneda;
	}
	public void setNombreMoneda(String nombreMoneda) {
		this.nombreMoneda = nombreMoneda;
	}
	public float getValorDolar() {
		return valorDolar;
	}
	public void setValorDolar(float valorDolar) {
		this.valorDolar = valorDolar;
	}
	
	
}
