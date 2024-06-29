package com.proyectoFinal.modelo.entidades;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "Videojuego")
public class Videojuego implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVideojuego;
	@NotBlank(message="El nombre es obligatorio")
	@Size(min=5,max=20,message="Debe de estar entre 5 y 20 caracteres")
	@Column(name="nombreVideojuego", length =50, nullable=false)
	private String nombreVideojuego;
	
	@Size(min=5,max=255,message="Debe de estar entre 5 y 255 caracteres")
	@Column(name="descripcionVideojuego", length =255, nullable=false)
	private String descripcionVideojuego;
	
	@Lob
    @Column(name = "imagenVideojuego", nullable = true)
    private byte[] imagenVideojuego;
	
	@ManyToOne
	@JoinColumn(name= "idColeccion")
	@JsonBackReference
	private Coleccion idColeccion;

	public Long getIdVideojuego() {
		return idVideojuego;
	}

	public void setIdVideojuego(Long idVideojuego) {
		this.idVideojuego = idVideojuego;
	}

	public String getNombreVideojuego() {
		return nombreVideojuego;
	}

	public void setNombreVideojuego(String nombreVideojuego) {
		this.nombreVideojuego = nombreVideojuego;
	}

	public String getDescripcionVideojuego() {
		return descripcionVideojuego;
	}

	public void setDescripcionVideojuego(String descripcionVideojuego) {
		this.descripcionVideojuego = descripcionVideojuego;
	}

	public byte[] getImagenVideojuego() {
		return imagenVideojuego;
	}

	public void setImagenVideojuego(byte[] imagenVideojuego) {
		this.imagenVideojuego = imagenVideojuego;
	}

	public Coleccion getIdColeccion() {
		return idColeccion;
	}

	public void setIdColeccion(Coleccion idColeccion) {
		this.idColeccion = idColeccion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Videojuego(Long idVideojuego,
			@NotBlank(message = "El nombre es obligatorio") @Size(min = 5, max = 20, message = "Debe de estar entre 5 y 20 caracteres") String nombreVideojuego,
			@Size(min = 5, max = 255, message = "Debe de estar entre 5 y 255 caracteres") String descripcionVideojuego,
			byte[] imagenVideojuego, Coleccion idColeccion) {
		super();
		this.idVideojuego = idVideojuego;
		this.nombreVideojuego = nombreVideojuego;
		this.descripcionVideojuego = descripcionVideojuego;
		this.imagenVideojuego = imagenVideojuego;
		this.idColeccion = idColeccion;
	}

	public Videojuego() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
