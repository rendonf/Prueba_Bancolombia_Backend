package com.example.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "USUARIO_MONEDA_PAIS_GESTOR")
public class UsuarioDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUsuarioMoneda;
	
	@ManyToOne
	@JoinColumn (name = "ID_USUARIO")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn (name = "ID_MONEDA_PAIS")
	private MonedaPais moneda;
	
	private float cantidadMoneda;
	
	@ManyToOne
	@JoinColumn (name = "ID_GESTOR_PAIS")
	private GestorPais gestor;
	
	public UsuarioDetalle() {
		
	}
	
	public UsuarioDetalle(Usuario usuario, MonedaPais moneda, float cantidadMoneda, GestorPais gestor) {
		super();
		this.usuario = usuario;
		this.moneda = moneda;
		this.cantidadMoneda = cantidadMoneda;
		this.gestor = gestor;
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

	public float getCantidadMoneda() {
		return cantidadMoneda;
	}

	public void setCantidadMoneda(float cantidadMoneda) {
		this.cantidadMoneda = cantidadMoneda;
	}

	public GestorPais getGestor() {
		return gestor;
	}

	public void setGestor(GestorPais gestor) {
		this.gestor = gestor;
	}
	
	

}
