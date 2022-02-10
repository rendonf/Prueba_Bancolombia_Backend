package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "USUARIO_MONEDA")
public class UsuarioMoneda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUsuarioMoneda;
	
	@ManyToOne
	@JoinColumn (name = "ID_USUARIO")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn (name = "ID_MONEDA_PAIS")
	private MonedaPais moneda;
	
	public UsuarioMoneda() {
		
	}
	
	public UsuarioMoneda(Usuario usuario, MonedaPais moneda) {
		super();
		this.usuario = usuario;
		this.moneda = moneda;
	}

	public Long getId() {
		return idUsuarioMoneda;
	}

	public void setId(Long id) {
		this.idUsuarioMoneda = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public MonedaPais getMoneda() {
		return moneda;
	}

	public void setMoneda(MonedaPais moneda) {
		this.moneda = moneda;
	}

}
