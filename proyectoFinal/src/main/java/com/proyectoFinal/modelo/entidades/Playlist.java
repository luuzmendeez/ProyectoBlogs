package com.proyectoFinal.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "Playlist")
public class Playlist implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlaylist;
	
	@NotBlank(message="El nombre es obligatoria")
	@Size(min=5,max=20,message="Debe de estar entre 5 y 20 caracteres")
	@Column(name="nombrePlaylist", length =50, nullable=false)
	private String nombrePlaylist;
	
	@JsonIgnoreProperties(value = {"idPlaylist","hibernateLazyInitializer","handler"},
			allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idPlaylist", cascade= CascadeType.ALL)
	//@JsonManagedReference
	private List<Cancion> canciones;
	
	@ManyToOne
	@JoinColumn(name= "idBlog")
	@JsonBackReference
	private Blog idBlog;

	public Long getIdPlaylist() {
		return idPlaylist;
	}

	public void setIdPlaylist(Long idPlaylist) {
		this.idPlaylist = idPlaylist;
	}

	public String getNombrePlaylist() {
		return nombrePlaylist;
	}

	public void setNombrePlaylist(String nombrePlaylist) {
		this.nombrePlaylist = nombrePlaylist;
	}

	public List<Cancion> getCanciones() {
		return canciones;
		
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
		for(Cancion lista_canciones: canciones) {
			lista_canciones.setIdPlaylist(null);
		}
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

	public Playlist(Long idPlaylist,
			@NotBlank(message = "El nombre es obligatoria") @Size(min = 5, max = 20, message = "Debe de estar entre 5 y 20 caracteres") String nombrePlaylist,
			List<Cancion> canciones, Blog idBlog) {
		super();
		this.idPlaylist = idPlaylist;
		this.nombrePlaylist = nombrePlaylist;
		this.canciones = canciones;
		this.idBlog = idBlog;
	}

	public Playlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
