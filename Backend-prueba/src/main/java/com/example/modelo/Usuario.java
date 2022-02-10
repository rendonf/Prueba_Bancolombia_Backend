package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "USUARIO")
public class Usuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUsuario;
	private String nombreUsuario;
	
	@ManyToOne
	@JoinColumn (name = "idPais")
	private Pais pais;

	public Usuario() {
		
	}
	
	public Usuario(String nombreUsuario,Pais pais) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.pais = pais;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}