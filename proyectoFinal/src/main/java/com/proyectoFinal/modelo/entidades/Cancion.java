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
@Table(name= "Cancion")
public class Cancion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCancion;
	@NotBlank(message="El nombre es obligatorio")
	@Size(min=5,max=20,message="Debe de estar entre 5 y 20 caracteres")
	@Column(name="nombreCancion", length =50, nullable=false)
	private String nombreCancion;
	
	@Size(min=5,max=255,message="Debe de estar entre 5 y 255 caracteres")
	@Column(name="linkCancion", length =255, nullable=false)
	private String linkCancion;
	
	@ManyToOne
	@JoinColumn(name= "idPlaylist")
	@JsonBackReference
	private Playlist idPlaylist;

	public Long getIdCancion() {
		return idCancion;
	}

	public void setIdCancion(Long idCancion) {
		this.idCancion = idCancion;
	}

	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public String getLinkCancion() {
		return linkCancion;
	}

	public void setLinkCancion(String linkCancion) {
		this.linkCancion = linkCancion;
	}

	public Playlist getIdPlaylist() {
		return idPlaylist;
	}

	public void setIdPlaylist(Playlist idPlaylist) {
		this.idPlaylist = idPlaylist;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Cancion(Long idCancion,
			@NotBlank(message = "El nombre es obligatorio") @Size(min = 5, max = 20, message = "Debe de estar entre 5 y 20 caracteres") String nombreCancion,
			@Size(min = 5, max = 255, message = "Debe de estar entre 5 y 255 caracteres") String linkCancion,
			Playlist idPlaylist) {
		super();
		this.idCancion = idCancion;
		this.nombreCancion = nombreCancion;
		this.linkCancion = linkCancion;
		this.idPlaylist = idPlaylist;
	}

	public Cancion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
