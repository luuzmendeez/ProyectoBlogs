package com.proyectoFinal.modelo.entidades;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "Nota")
public class Nota implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idNota;
	@NotBlank(message="El nombre es obligatorio")
	@Size(min=5,max=20,message="Debe de estar entre 5 y 20 caracteres")
	@Column(name="nombreNota", length =50, nullable=false)
	private String nombreNota;
	
	@Size(min=5,max=255,message="Debe de estar entre 5 y 255 caracteres")
	@Column(name="descripcionNota", length =255, nullable=false)
	private String descripcionNota;
	
	@ManyToOne
	@JoinColumn(name= "idBlog")
	@JsonBackReference
	private Blog idBlog;

	public Long getIdNota() {
		return idNota;
	}

	public void setIdNota(Long idNota) {
		this.idNota = idNota;
	}

	public String getNombreNota() {
		return nombreNota;
	}

	public void setNombreNota(String nombreNota) {
		this.nombreNota = nombreNota;
	}

	public String getDescripcionNota() {
		return descripcionNota;
	}

	public void setDescripcionNota(String descripcionNota) {
		this.descripcionNota = descripcionNota;
	}

	public Blog getIdBlog() {
		return idBlog;
	}

	public void setIdBlog(Blog idBlog) {
		this.idBlog = idBlog;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Nota(Long idNota,
			@NotBlank(message = "El nombre es obligatorio") @Size(min = 5, max = 20, message = "Debe de estar entre 5 y 20 caracteres") String nombreNota,
			@Size(min = 5, max = 255, message = "Debe de estar entre 5 y 255 caracteres") String descripcionNota,
			Blog idBlog) {
		super();
		this.idNota = idNota;
		this.nombreNota = nombreNota;
		this.descripcionNota = descripcionNota;
		this.idBlog = idBlog;
	}

	public Nota() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
